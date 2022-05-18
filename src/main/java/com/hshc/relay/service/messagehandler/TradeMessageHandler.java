package com.hshc.relay.service.messagehandler;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.hshc.relay.dao.TradeDao;
import com.hshc.relay.entity.taobaomessage.TradeBuyerPayMessage;
import com.hshc.relay.service.AuthorizedSessionService;
import com.hshc.relay.service.BaseService;
import com.hshc.relay.service.SynPlansService;
import com.hshc.relay.service.TradeFullinfoGetService;
import com.qimencloud.api.response.HshcRiskcontolOrdersReturnResponse;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.internal.tmc.Message;
import com.taobao.api.request.TradeFullinfoGetRequest;
import com.taobao.api.response.TradeFullinfoGetResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationAdapter;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 钟林俊
 * @version V1.0 2017-05-09 14:54
 */
@Service
public class TradeMessageHandler extends BaseService<TradeFullinfoGetResponse> implements HshcMessageHandler {

    @Autowired
    private AuthorizedSessionService authorizedSessionService;

    private  TradeFullinfoGetResponse fullinfoGetResponse;

    @Autowired
    private TradeFullinfoGetService tradeFullinfoGetService;

    @Autowired
    private TradeDao tradeDao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void handle(Message message) throws ApiException {
        if("花生好车旗舰店".equals(message.getUserNick())){

            TradeBuyerPayMessage tradeBuyerPayMessage = JSON.parseObject(message.getContent(), TradeBuyerPayMessage.class, Feature.UseBigDecimal);

            TaobaoClient client = new DefaultTaobaoClient(getTopApi(), getAppKey(), getAppSecret());

            TradeFullinfoGetRequest req = new TradeFullinfoGetRequest();
//            seller_nick,buyer_nick,title,type,created,sid,tid,seller_rate,buyer_rate,status,payment,discount_fee,adjust_fee,post_fee,
//            total_fee,pay_time,end_time,modified,consign_time,buyer_obtain_point_fee,point_fee,real_point_fee,received_payment,commission_fee,
//            pic_path,num_iid,num,price,cod_fee,cod_status,shipping_type,receiver_name,receiver_state,receiver_city,receiver_district,
//            receiver_address,receiver_zip,receiver_mobile,receiver_phone,orders
            // 订单字段，看需要调整 
            //"tid,title,type,status,payment,est_con_time,receiver_name,receiver_state,receiver_address,receiver_mobile,receiver_phone,orders,buyer_nick"
            req.setFields("tid,title,type,status,payment,est_con_time,receiver_name,receiver_state,receiver_address,receiver_mobile,receiver_phone,orders,buyer_nick,buyer_message");
            // 订单号
            req.setTid(tradeBuyerPayMessage.getTid());
            final String tid=tradeBuyerPayMessage.getTid().toString();

            fullinfoGetResponse = client.execute(req, authorizedSessionService.getAuthorizedSession("花生好车旗舰店").getAccessToken());
            //消息可能会是同一条订单的多次发送, 所以先update,如果没有更新，再插入;怎么避免同一条订单被插入多次？
            if(tradeFullinfoGetService.modify(fullinfoGetResponse) == 0){
                tradeFullinfoGetService.add(fullinfoGetResponse);
            }

            // 通信可能会失败，需要标记这个订单信息到底传成功没有，如果没有，需要换时间再次发送
            TransactionSynchronizationManager.registerSynchronization(new TransactionSynchronizationAdapter() {
                @Override
                public void afterCommit(){
                    try {
                        // 事务提交后再执行（跟租赁系统通信）
                        HshcRiskcontolOrdersReturnResponse hshcRiskcontolOrdersReturnResponse=tradeFullinfoGetService.toErp(fullinfoGetResponse.getTrade());
                        // 发送成功后更新成功发送的标记
                        Map<String,String> resultMap=new HashMap<String, String>();
                        resultMap.put("tid",tid);
                        resultMap.put("isSend","false");
                        if(hshcRiskcontolOrdersReturnResponse.getSuccess() != null && hshcRiskcontolOrdersReturnResponse.getSuccess()){
                            resultMap.put("isSend","true");
                        }
                        resultMap.put("log",JSON.toJSONString(hshcRiskcontolOrdersReturnResponse));
                        tradeDao.updateSendStatu(resultMap);
                    }catch (ApiException e){
                        e.printStackTrace();
                    }
                }
            });

        }
    }

}

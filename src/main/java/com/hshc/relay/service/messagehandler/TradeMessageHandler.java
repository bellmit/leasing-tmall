package com.hshc.relay.service.messagehandler;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.hshc.relay.dao.TradeFullinfoGetResponseDao;
import com.hshc.relay.entity.taobaomessage.TradeBuyerPayMessage;
import com.hshc.relay.service.AuthorizedSessionService;
import com.hshc.relay.service.BaseService;
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

/**
 * @author 钟林俊
 * @version V1.0 2017-05-09 14:54
 */
@Service
public class TradeMessageHandler extends BaseService<TradeFullinfoGetResponse> implements HshcMessageHandler {

    @Autowired
    private AuthorizedSessionService authorizedSessionService;

    @Autowired
    private TradeFullinfoGetResponseDao tradeInfoDao;

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
            req.setFields("tid,type,status,payment,orders");
            req.setTid(tradeBuyerPayMessage.getTid());

            TradeFullinfoGetResponse fullinfoGetResponse = client.execute(req, authorizedSessionService.getAuthorizedSession("花生好车旗舰店").getAccessToken());

            tradeInfoDao.insert(fullinfoGetResponse);

            // 事务提交后再执行（跟租赁系统通信）
            // 通信可能会失败，需要标记这个订单信息到底传成功没有，如果没有，需要换时间再次发送
            TransactionSynchronizationManager.registerSynchronization(new TransactionSynchronizationAdapter() {
                @Override
                public void afterCommit() {
                }
            });

        }
    }

}

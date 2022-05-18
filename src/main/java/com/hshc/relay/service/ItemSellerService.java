package com.hshc.relay.service;

import com.alibaba.fastjson.JSON;
import com.hshc.relay.dao.ItemSellerGetRequestDao;
import com.hshc.relay.entity.ISGetResponse;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.ItemSellerGetRequest;
import com.taobao.api.response.ItemSellerGetResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationAdapter;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import java.util.HashMap;
import java.util.Map;

/**
 * 获取商品信息.
 * @author 王华英
 * @version  v1.0 2017年5月17日16:12:04
 */
@Service
public class ItemSellerService extends BaseService<ItemSellerGetRequest> {
    @Autowired
    private AuthorizedSessionService authorizedSessionService;

    @Autowired
    private ItemSellerGetRequestDao itemSellerGetRequestDao;

    //获取单个商品详细信息
    @Transactional(rollbackFor = Exception.class)
    public ISGetResponse getItemSeller(final ItemSellerGetRequest reqSc) throws ApiException {
        final  ISGetResponse rep=new ISGetResponse();
        //持久化请求商品的信息
        if(modify(reqSc)==0){
            add(reqSc);
        }

        TransactionSynchronizationManager.registerSynchronization(new TransactionSynchronizationAdapter() {
            @Override
            public void afterCommit() {
                try {
                    TaobaoClient client = new DefaultTaobaoClient("https://eco.taobao.com/router/rest", authorizedSessionService.getAppKey(), authorizedSessionService.getAppSecret());
                    ItemSellerGetResponse repSc=client.execute(reqSc, authorizedSessionService.getAuthorizedSession("花生好车旗舰店").getAccessToken());
                    rep.setItem(repSc.getItem());
                    rep.setRepCode("一级错误码:"+repSc.getErrorCode()+";二级错误码:"+repSc.getSubCode());
                    rep.setRepMsg("一级错误提示语：:"+repSc.getMsg()+";二级错误提示语："+repSc.getSubMsg());

                    // 发送成功后更新成功发送的标记
                    Map<String,String> param=new HashMap<String, String>();
                    //Map<String,String> param=new HashMap<String, String>();
                    param.put("numIid",reqSc.getNumIid().toString());
                    param.put("isSend","false");
                    if(repSc.getItem()!=null && repSc.getItem().getOuterId()!= null){
                        param.put("isSend","true");
                    }
                    param.put("log",JSON.toJSONString(repSc));
                    itemSellerGetRequestDao.updateSendStatu(param);

                    // 回调日志记录
                    logger.info("item seller get callback : request=" + JSON.toJSONString(reqSc) + ", resposne=" + JSON.toJSONString(rep));
                }catch (Exception e){
                   logger.error(""+e);
                }
            }
        });
        return rep;
    }

}

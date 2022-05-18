package com.hshc.relay.service;

import com.alibaba.fastjson.JSON;
import com.hshc.relay.dao.*;
import com.hshc.relay.entity.ISGetResponse;
import com.hshc.relay.entity.ScAddResponse;
import com.hshc.relay.entity.ScMapAddResponse;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.*;
import com.taobao.api.response.*;
import org.omg.CORBA.Object;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationAdapter;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import java.util.HashMap;
import java.util.Map;

/**
 *  商品信息
 *  @version V1.0 2017年5月7日16:36:36
 *  @author  王华英
 */
@Service
public class ScitemService extends BaseService<ScitemAddRequest>{
    @Autowired
    private AuthorizedSessionService authorizedSessionService;
    @Autowired
    private ScitemAddRequestDao scitemAddRequestDao;
    @Autowired
    private AddScitemResponseDao addScitemResponseDao;
    @Autowired
    private ScitemGetRequestDao scitemGetRequestDao;
    @Autowired
    private  ScitemGetResponseDao scitemGetResponseDao;


    //发布后端商品
    @Transactional(rollbackFor = Exception.class)
    public ScAddResponse addScitem(final ScitemAddRequest reqSc) throws ApiException {
        final ScAddResponse rep=new ScAddResponse();
        if(modify(reqSc)==0){
            add(reqSc);
        }

        TransactionSynchronizationManager.registerSynchronization(new TransactionSynchronizationAdapter() {
            @Override
            public void afterCommit() {
                try {
                    //请求后端商品
                    TaobaoClient client = new DefaultTaobaoClient("https://eco.taobao.com/router/rest", authorizedSessionService.getAppKey(), authorizedSessionService.getAppSecret());
                    ScitemAddResponse repSc=client.execute(reqSc, authorizedSessionService.getAuthorizedSession("花生好车旗舰店").getAccessToken());
                    rep.setScItem(repSc.getScItem());
                    rep.setRepCode("一级错误码:"+repSc.getErrorCode()+";二级错误码:"+repSc.getSubCode());
                    rep.setRepMsg("一级错误提示语：:"+repSc.getMsg()+";二级错误提示语："+repSc.getSubMsg());

                    // 发送成功后更新成功发送的标记
                    Map<String,String> param=new HashMap<String, String>();
                    //Map<String,String> param=new HashMap<String, String>();
                    param.put("outerCode",repSc.getScItem().getOuterCode());
                    param.put("isSend","false");
                    if(repSc.getScItem()!=null && repSc.getScItem().getItemId()!= null){
                        param.put("isSend","true");
                    }
                    param.put("log",JSON.toJSONString(repSc));
                    scitemAddRequestDao.updateSendStatu(param);

                    logger.info("scitem Add callback : request=" + JSON.toJSONString(reqSc) + ", resposne=" + JSON.toJSONString(repSc));
                }catch (Exception e){
                    logger.error(""+e);
                }
            }
        });

        return rep;
    }

    //查询根据后端商品id查询后端商品信息
    public ScitemGetResponse getScitem(ScitemGetRequest reqSc) throws ApiException{
        TaobaoClient client = new DefaultTaobaoClient("https://eco.taobao.com/router/rest", authorizedSessionService.getAppKey(), authorizedSessionService.getAppSecret());
        ScitemGetResponse repSc=client.execute(reqSc, authorizedSessionService.getAuthorizedSession("花生好车旗舰店").getAccessToken());
        //持久化后端商品
        //scitemGetResponseDao.insert(repSc);
        System.out.print("查询后端商品:"+repSc.getBody());
        return repSc;
    }

    //查询后端所有商品信息
    public ScitemQueryResponse queryScitem(ScitemQueryRequest reqSc) throws ApiException{
        TaobaoClient client = new DefaultTaobaoClient("https://eco.taobao.com/router/rest", authorizedSessionService.getAppKey(), authorizedSessionService.getAppSecret());
        ScitemQueryResponse repSc=client.execute(reqSc, authorizedSessionService.getAuthorizedSession("花生好车旗舰店").getAccessToken());
        //持久化后端商品
        //scitemGetResponseDao.insert(repSc);
        System.out.print("查询后端商品:"+repSc.getBody());
        return repSc;
    }

}

package com.hshc.relay.service;

import com.alibaba.fastjson.JSON;
import com.hshc.relay.dao.TmallCarLeaseSynchronizeplansRequestDao;
import com.hshc.relay.dao.TmallCarLeaseSynchronizeplansResponseDao;
import com.hshc.relay.entity.CLSynPlansResponse;
import com.qimencloud.api.response.HshcRiskcontolOrdersReturnResponse;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.TmallCarLeaseSynchronizeplansRequest;
import com.taobao.api.response.TmallCarLeaseSynchronizeplansResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationAdapter;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 方案同步
 * @version  2017年5月19日09:43:14
 * @author  王华英
 */
@Service
public class SynPlansService extends BaseService<TmallCarLeaseSynchronizeplansRequest>{

    @Autowired
    private AuthorizedSessionService authorizedSessionService;

    @Autowired
    private TmallCarLeaseSynchronizeplansRequestDao tmallCarLeaseSynchronizeplansRequestDao;

    @Transactional(rollbackFor = Exception.class)
    public CLSynPlansResponse sysPlans(final TmallCarLeaseSynchronizeplansRequest tmallCarLeaseSynchronizeplansRequest) throws ApiException{
        final  CLSynPlansResponse rep=new CLSynPlansResponse();
        //方案可能是同一个方案多次发送, 所以先update，再add
        if(modify(tmallCarLeaseSynchronizeplansRequest)==0){
            //持久化租赁方案
            add(tmallCarLeaseSynchronizeplansRequest);
        }

        TransactionSynchronizationManager.registerSynchronization(new TransactionSynchronizationAdapter() {
            @Override
            public void afterCommit(){
                try {
                    // 事务提交后再执行（跟租赁系统通信）
                    TaobaoClient client = new DefaultTaobaoClient("https://eco.taobao.com/router/rest", authorizedSessionService.getAppKey(), authorizedSessionService.getAppSecret());
                    TmallCarLeaseSynchronizeplansResponse tmallCarLeaseSynchronizeplansResponse=client.execute(tmallCarLeaseSynchronizeplansRequest, authorizedSessionService.getAuthorizedSession("花生好车旗舰店").getAccessToken());
                    rep.setResult(tmallCarLeaseSynchronizeplansResponse.getResult());
                    rep.setRepCode("一级错误码:"+tmallCarLeaseSynchronizeplansResponse.getErrorCode()+";二级错误码:"+tmallCarLeaseSynchronizeplansResponse.getSubCode());
                    rep.setRepMsg("一级错误提示语:"+tmallCarLeaseSynchronizeplansResponse.getMsg()+";二级错误提示语："+tmallCarLeaseSynchronizeplansResponse.getSubMsg());

                    // 发送成功后更新成功发送的标记
                    Map<String,String> param=new HashMap<String, String>();
                    param.put("itemId",tmallCarLeaseSynchronizeplansRequest.getItemId().toString());
                    param.put("isSend","false");
                    if(tmallCarLeaseSynchronizeplansResponse.getResult()!=null && tmallCarLeaseSynchronizeplansResponse.getResult().getSuccess()==true){
                        param.put("isSend","true");
                    }
                    param.put("log",JSON.toJSONString(tmallCarLeaseSynchronizeplansResponse));
                    tmallCarLeaseSynchronizeplansRequestDao.updateSendStatu(param);

                    // 回调日志记录
                    logger.info("syn plans  callback : request=" + JSON.toJSONString(tmallCarLeaseSynchronizeplansRequest) + ", resposne=" + JSON.toJSONString(tmallCarLeaseSynchronizeplansResponse));
                }catch (ApiException e){
                    logger.error(""+e);
                }
            }
        });
        return  rep;
    }
}

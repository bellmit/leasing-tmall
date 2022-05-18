package com.hshc.relay.service;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.hshc.relay.dao.ScitemMapAddRequestDao;
import com.hshc.relay.entity.ScMapAddResponse;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.ScitemMapAddRequest;
import com.taobao.api.request.ScitemMapQueryRequest;
import com.taobao.api.response.ScitemMapAddResponse;
import com.taobao.api.response.ScitemMapQueryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationAdapter;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import java.lang.Exception;
import java.util.HashMap;
import java.util.Map;

/**
 * IC商品与后端货品映射
 * @author 王华英
 * @version v1.0 2017年5月17日15:52:08
 */
@Service
public class ScitemMapService extends BaseService<ScitemMapAddRequest> {
    @Autowired
    private AuthorizedSessionService authorizedSessionService;

    @Autowired
    private ScitemMapAddRequestDao scitemMapAddRequestDao;

    //创建IC商品与后端商品的映射关系
    @Transactional(rollbackFor = Exception.class)
    public ScMapAddResponse addScitemMap(final ScitemMapAddRequest reqSc) throws ApiException {
       final ScMapAddResponse rep=new ScMapAddResponse();
        //Preconditions.checkArgument(!Strings.isNullOrEmpty(uuid), "the given uuid is null");

        //持久化商品映射请求信息
        if(modify(reqSc)==0){
            add(reqSc);
        }

        TransactionSynchronizationManager.registerSynchronization(new TransactionSynchronizationAdapter() {
            @Override
            public void afterCommit() {
                try {
                    //发送天猫
                    TaobaoClient client = new DefaultTaobaoClient("https://eco.taobao.com/router/rest", authorizedSessionService.getAppKey(), authorizedSessionService.getAppSecret());
                    ScitemMapAddResponse repSc=client.execute(reqSc, authorizedSessionService.getAuthorizedSession("花生好车旗舰店").getAccessToken());

                    rep.setOuterCode(repSc.getOuterCode());
                    rep.setRepCode("一级错误码:"+repSc.getErrorCode()+";二级错误码:"+repSc.getSubCode());
                    rep.setRepMsg("一级错误提示语：:"+repSc.getMsg()+";二级错误提示语："+repSc.getSubMsg());

                    // 发送成功后更新成功发送的标记
                    Map<String,String> param=new HashMap<String, String>();
                    //Map<String,String> param=new HashMap<String, String>();
                    param.put("icItemId",reqSc.getItemId().toString());
                    param.put("isSend","false");
                    if(repSc.getBody()!=null && repSc.getOuterCode()!= null){
                        param.put("isSend","true");
                    }
                    param.put("log",JSON.toJSONString(repSc));
                    scitemMapAddRequestDao.updateSendStatu(param);

                    // 回调日志记录
                    logger.info("add scitem map callback : request=" + JSON.toJSONString(reqSc) + ", resposne=" + JSON.toJSONString(repSc));
                }catch (Exception e){
                    logger.error(""+e);
                }

            }
        });
        return rep;
    }


    //查询IC商品与后端商品的映射关系
    public ScitemMapQueryResponse queryScitemMap(ScitemMapQueryRequest reqSc) throws ApiException{
        TaobaoClient client = new DefaultTaobaoClient("https://eco.taobao.com/router/rest", authorizedSessionService.getAppKey(), authorizedSessionService.getAppSecret());
        ScitemMapQueryResponse repSc=client.execute(reqSc, authorizedSessionService.getAuthorizedSession("花生好车旗舰店").getAccessToken());
        //持久化IC商品与后端商品的映射关系
        //scitemMapAddResponseDao.insert(repSc);
        System.out.print("查询IC商品与后端商品的映射关系:"+repSc.getBody());
        return repSc;
    }

}

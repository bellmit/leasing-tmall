package com.hshc.relay.service;

import com.hshc.relay.dao.BaseDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
public class BaseService<T>{

    protected static final Logger logger = LoggerFactory.getLogger(BaseService.class);

    @Autowired
    protected BaseDao<T> baseDao;

    @Value("${top.appKey}")
    private String appKey;

    @Value("${top.appSecret}")
    private String appSecret;

    @Value("${qimen.redirectUri}")
    private String redirectUri;

    @Value("${qimen.authUrl}")
    private String authUrl;

    @Value("${qimen.tokenUrl}")
    private String tokenUrl;

    /**
     * top接口地址
     */
    @Value("${top.httpsApi}")
    private String topApi;

    /**
     * 淘宝消息服务地址
     */
    @Value("${taobao.messageService}")
    private String messageServiceUrl;

    /**
     * 回传erp地址
     */
    @Value("${qimen.returnUrl}")
    private String returnUrl;

    public String getAppKey() {
        return appKey;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public String getRedirectUri() {
        return redirectUri;
    }

    public String getAuthUrl() {
        return authUrl;
    }

    public String getTokenUrl() {
        return tokenUrl;
    }

    public String getTopApi() {
        return topApi;
    }

    public String getMessageServiceUrl() {
        return messageServiceUrl;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
    public T getOne(T t){
        return baseDao.selectOne(t);
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
    public List<T> getList(T t){
        return baseDao.selectList(t);
    }

    @Transactional(rollbackFor = Exception.class)
    public int add(T t){
        return baseDao.insert(t);
    }

    @Transactional(rollbackFor = Exception.class)
    public int batchAdd(List<T> tList){
        return baseDao.batchInsert(tList);
    }

    @Transactional(rollbackFor = Exception.class)
    public int modify(T t){
        return baseDao.update(t);
    }

    @Transactional(rollbackFor = Exception.class)
    public int remove(Integer id){
        return baseDao.delete(id);
    }
}

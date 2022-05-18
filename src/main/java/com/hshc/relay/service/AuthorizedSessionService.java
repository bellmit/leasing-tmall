package com.hshc.relay.service;

import com.hshc.relay.entity.AuthorizedSession;
import com.hshc.relay.exception.NoAuthorizedSessionAcquiredException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author 钟林俊
 * @version V1.0 2017-05-06 16:33
 */
@Service
public class AuthorizedSessionService extends BaseService<AuthorizedSession> {

    /**
     * 根据用户名获取相应的授权
     *
     * @param taobaoUserNick 淘宝用户名
     * @return 授权对象
     */
    public AuthorizedSession getAuthorizedSession(String taobaoUserNick){
        AuthorizedSession queryAuthorizedSession = new AuthorizedSession();
        queryAuthorizedSession.setTaobaoUserNick(taobaoUserNick);
        AuthorizedSession authorizedSession = baseDao.selectOne(queryAuthorizedSession);

        // 当前没有可用的授权或者授权过期,抛出异常需要用户重新授权
        if(authorizedSession == null || authorizedSession.getExpireTime().compareTo(new Date()) <= 0){
            throw new NoAuthorizedSessionAcquiredException(getAuthUrl() + "?response_type=code&client_id=" + getAppKey()
                    + "&redirect_uri=" + getRedirectUri() + "/session-auth" + "&view=web");
        }
        return authorizedSession;
    }

}

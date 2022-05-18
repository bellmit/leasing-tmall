package com.hshc.relay.service;

import com.hshc.relay.BaseTest;
import com.hshc.relay.entity.AuthorizedSession;
import com.hshc.relay.exception.NoAuthorizedSessionAcquiredException;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 钟林俊
 * @version V1.0 2017-05-07 10:13
 */
public class AuthorizedSessionServiceTest extends BaseTest{

    @Autowired
    private AuthorizedSessionService authorizedSessionService;

    @Test
    public void testGetAuthorizedSession(){
        String userName = "sandbox_taobao1234";

        AuthorizedSession authorizedSession = authorizedSessionService.getAuthorizedSession(userName);

        Assert.assertNotNull(authorizedSession);
    }

    @Test(expected = NoAuthorizedSessionAcquiredException.class)
    public void testGetAuthorizedSessionException(){
        String userName = "xx";

        AuthorizedSession authorizedSession = authorizedSessionService.getAuthorizedSession(userName);

        Assert.assertNotNull(authorizedSession);
    }

}

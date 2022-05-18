package com.hshc.relay.exception;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 钟林俊
 * @version V1.0 2017-05-07 10:17
 */
public class NoAuthorizedSessionAcquiredException extends BaseException {

    public NoAuthorizedSessionAcquiredException(String url){
        this("102", url);
    }

    private NoAuthorizedSessionAcquiredException(String code, String message) {
        super(code, message);
    }

}

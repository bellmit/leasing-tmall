package com.hshc.relay.exception;

/**
 * @author 钟林俊
 * @version V1.0 2017-05-07 11:56
 */
public class InvalidQimenSignException extends BaseException {

    public InvalidQimenSignException(){
        this("sign-check-failure", "Illegal request");
    }

    private InvalidQimenSignException(String code, String message) {
        super(code, message);
    }
}

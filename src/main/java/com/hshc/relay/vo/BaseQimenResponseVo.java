package com.hshc.relay.vo;

import com.qimencloud.api.QimenCloudResponse;

/**
 * @author 钟林俊
 * @version V1.0 2017-05-06 11:05
 */
public class BaseQimenResponseVo extends QimenCloudResponse{

    private boolean success;

    public BaseQimenResponseVo(){}

    public BaseQimenResponseVo(String message){
        this(true, message);
    }

    public BaseQimenResponseVo(boolean success, String message){
        this.success = success;
        setMessage(message);
    }

    public static BaseQimenResponseVo success(){
        return success("");
    }

    public static BaseQimenResponseVo success(String message){
        return new BaseQimenResponseVo(true, message);
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

}

package com.hshc.relay.entity.riskcontrol;

import com.alibaba.fastjson.annotation.JSONField;
import com.hshc.relay.entity.BaseEntity;

import java.sql.Timestamp;

/**
 * 风控回调记录
 *
 * @author 钟林俊
 * @version V1.0 2017-05-02 11:09
 */
public class CallbackLog extends BaseEntity {

    private Customer customer;

    private Timestamp requestTime;

    private Timestamp responseTime;

    @JSONField(name = "ret_flag")
    private boolean retFlag;

    @JSONField(name = "cost_time")
    private Timestamp costTime;

    @JSONField(name = "err_code")
    private String errCode;

    @JSONField(name = "err_message")
    private String errMessage;

    @JSONField(name = "gmt_current_time")
    private Timestamp gmtCurrentTime;

    @JSONField(name = "msg_code")
    private String msgCode;

    @JSONField(name = "msg_info")
    private String msgInfo;

    private String object;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Timestamp getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Timestamp requestTime) {
        this.requestTime = requestTime;
    }

    public Timestamp getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(Timestamp responseTime) {
        this.responseTime = responseTime;
    }

    public boolean isRetFlag() {
        return retFlag;
    }

    public void setRetFlag(boolean retFlag) {
        this.retFlag = retFlag;
    }

    public Timestamp getCostTime() {
        return costTime;
    }

    public void setCostTime(Timestamp costTime) {
        this.costTime = costTime;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }

    public Timestamp getGmtCurrentTime() {
        return gmtCurrentTime;
    }

    public void setGmtCurrentTime(Timestamp gmtCurrentTime) {
        this.gmtCurrentTime = gmtCurrentTime;
    }

    public String getMsgCode() {
        return msgCode;
    }

    public void setMsgCode(String msgCode) {
        this.msgCode = msgCode;
    }

    public String getMsgInfo() {
        return msgInfo;
    }

    public void setMsgInfo(String msgInfo) {
        this.msgInfo = msgInfo;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }
}

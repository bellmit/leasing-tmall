package com.hshc.relay.entity.riskcontrol;

import com.alibaba.fastjson.annotation.JSONField;
import com.hshc.relay.entity.BaseEntity;

/**
 * 风控客户信息
 *
 * @author 钟林俊
 * @version V1.0 2017-05-02 11:07
 */
public class Customer extends BaseEntity {

    private String name;

    private String identityNo;

    private String mobile;

    private String uuid;

    private String addr;

    private long itemId;

    private Boolean pass;

    @JSONField(name = "reject_msg")
    private String rejectMsg;

    /**
     * 是否已回传的标记
     */
    private boolean returned;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Boolean getPass() {
        return pass;
    }

    public void setPass(Boolean pass) {
        this.pass = pass;
    }

    public String getRejectMsg() {
        return rejectMsg;
    }

    public void setRejectMsg(String rejectMsg) {
        this.rejectMsg = rejectMsg;
    }

    public boolean isReturned() {
        return returned;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }
}

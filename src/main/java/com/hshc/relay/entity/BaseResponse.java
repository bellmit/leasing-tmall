package com.hshc.relay.entity;

import com.taobao.api.internal.mapping.ApiField;

/**
 * Created by wanghuaying on 2017/5/11.
 */
public class BaseResponse {
    private static final long serialVersionUID = -1624206726332133105L;
    @ApiField("rep_code")
    private String repCode;

    @ApiField("rep_msg")
    private String repMsg;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getRepCode() {
        return repCode;
    }

    public void setRepCode(String repCode) {
        this.repCode = repCode;
    }

    public String getRepMsg() {
        return repMsg;
    }

    public void setRepMsg(String repMsg) {
        this.repMsg = repMsg;
    }
}

package com.hshc.relay.entity;

import com.taobao.api.domain.ScItem;
import com.taobao.api.internal.mapping.ApiField;

/**
 * Created by wanghuaying on 2017/5/11.
 */
public class ScAddResponse extends BaseResponse{
    private static final long serialVersionUID = 5335177923875197526L;
    /**
     * 后台商品信息
     */
    @ApiField("sc_item")
    private ScItem scItem;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public ScItem getScItem() {
        return scItem;
    }

    public void setScItem(ScItem scItem) {
        this.scItem = scItem;
    }
}

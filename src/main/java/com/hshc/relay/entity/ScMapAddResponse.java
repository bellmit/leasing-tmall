package com.hshc.relay.entity;

import com.taobao.api.internal.mapping.ApiField;

/**
 * Created by wanghuaying on 2017/5/12.
 */
public class ScMapAddResponse extends BaseResponse{
    private static final long serialVersionUID = 7638551477177968744L;
    /**
     * 接口调用返回结果信息：商家编码
     */
    @ApiField("outer_code")
    private String outerCode;


    public void setOuterCode(String outerCode) {
        this.outerCode = outerCode;
    }
    public String getOuterCode( ) {
        return this.outerCode;
    }
}

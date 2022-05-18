package com.hshc.relay.entity;

import com.taobao.api.domain.Item;
import com.taobao.api.internal.mapping.ApiField;

/**
 * Created by wanghuaying on 2017/5/11.
 */
public class ISGetResponse extends BaseResponse{
    private static final long serialVersionUID = 7419213741397299486L;
    /**
     * 商品详细信息
     */
    @ApiField("item")
    private Item item;


    public void setItem(Item item) {
        this.item = item;
    }
    public Item getItem( ) {
        return this.item;
    }
}

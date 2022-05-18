package com.hshc.relay.entity.taobaomessage;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 商品更新消息
 *
 * @author 钟林俊
 * @version V1.0 2017-05-10 13:45
 */
public class ItemUpdateMessage {

    /**
     * 商品修改字段
     */
    @JSONField(name = "changed_fields")
    private String changedFields;

    /**
     * 商品库存变化量
     */
    @JSONField(name = "increment")
    private Long increment;

    /**
     * 卖家昵称
     */
    @JSONField(name = "nick")
    private String nick;

    /**
     * 商品数量
     */
    @JSONField(name = "num")
    private Long num;

    /**
     * 商品id
     */
    @JSONField(name = "num_iid")
    private Long numIid ;

    /**
     * 商品价格
     */
    @JSONField(name = "price")
    private String price;

    /**
     * sku id
     */
    @JSONField(name = "sku_id")
    private Long skuId;

    /**
     * sku数量
     */
    @JSONField(name = "sku_num")
    private Long skuNum;

    /**
     * 商品状态
     */
    @JSONField(name = "status")
    private String status;

    /**
     * 商品标题
     */
    @JSONField(name = "title")
    private String title;

    public String getChangedFields() {
        return changedFields;
    }

    public void setChangedFields(String changedFields) {
        this.changedFields = changedFields;
    }

    public Long getIncrement() {
        return increment;
    }

    public void setIncrement(Long increment) {
        this.increment = increment;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public Long getNumIid() {
        return numIid;
    }

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSkuNum() {
        return skuNum;
    }

    public void setSkuNum(Long skuNum) {
        this.skuNum = skuNum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

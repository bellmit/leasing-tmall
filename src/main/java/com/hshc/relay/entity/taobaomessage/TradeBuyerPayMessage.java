package com.hshc.relay.entity.taobaomessage;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;

/**
 * 买家付完款的订单消息
 *
 * @author 钟林俊
 * @version V1.0 2017-05-09 15:06
 */
public class TradeBuyerPayMessage {

    /**
     * 分销订单调整金额
     */
    @JSONField(name = "adjust_fee")
    private BigDecimal adjustFee;

    /**
     * 支付宝账号
     */
    @JSONField(name = "alipay_no")
    private String alipayNo;

    /**
     * 买家昵称
     */
    @JSONField(name = "buyer_nick")
    private String buyerNick;

    /**
     * 分销商付款金额
     */
    @JSONField(name = "distributor_payment ")
    private String distributorPayment;

    /**
     * 分销商账号
     */
    @JSONField(name = "distributor_username ")
    private String distributorUsername;

    /**
     * 分销订单ID
     */
    @JSONField(name = "fenxiao_id")
    private Long fenxiaoId;

    /**
     * 物流公司
     */
    @JSONField(name = "logistics_company_name")
    private String logisticsCompanyName;

    /**
     * 物流运单号
     */
    @JSONField(name = "logistics_id")
    private String logisticsId;

    /**
     * 子订单ID
     */
    @JSONField(name = "oid")
    private Long oid;

    /**
     * 订单实付金额
     */
    @JSONField(name = "payment")
    private String payment;

    /**
     * 物流邮费
     */
    @JSONField(name = "post_fee")
    private String postFee;

    /**
     * 卖家昵称
     */
    @JSONField(name = "seller_nick")
    private String sellerNick;

    /**
     * 物流方式
     */
    @JSONField(name = "shipping")
    private Long shipping;

    /**
     * 交易状态
     */
    @JSONField(name = "status")
    private String status;

    /**
     * 分销子订单ID
     */
    @JSONField(name = "sub_order_id")
    private Long subOrderId;

    /**
     * 供应商账号
     */
    @JSONField(name = "supplier_username")
    private String supplierUsername;

    /**
     * 主订单ID
     */
    @JSONField(name = "tid")
    private Long tid;

    /**
     * 分销订单类型
     */
    @JSONField(name = "trade_type")
    private String tradeType;

    /**
     * 交易类型列表
     * 同时查询多种交易类型可用逗号分隔。默认同时查询guarantee_trade, auto_delivery, ec, cod的4种交易类型的数据
     * 可选值 fixed(一口价) auction(拍卖) guarantee_trade(一口价、拍卖) auto_delivery(自动发货)
     *       independent_simple_trade(旺店入门版交易) independent_shop_trade(旺店标准版交易) ec(直冲)
     *       cod(货到付款) fenxiao(分销) game_equipment(游戏装备) shopex_trade(ShopEX交易) netcn_trade(万网交易)
     *       external_trade(统一外部交易)o2o_offlinetrade（O2O交易）step (万人团)nopaid(无付款订单)pre_auth_type(预授权0元购机交易)
     */
    @JSONField(name = "type")
    private String type;

    public BigDecimal getAdjustFee() {
        return adjustFee;
    }

    public void setAdjustFee(BigDecimal adjustFee) {
        this.adjustFee = adjustFee;
    }

    public String getAlipayNo() {
        return alipayNo;
    }

    public void setAlipayNo(String alipayNo) {
        this.alipayNo = alipayNo;
    }

    public String getBuyerNick() {
        return buyerNick;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public String getDistributorPayment() {
        return distributorPayment;
    }

    public void setDistributorPayment(String distributorPayment) {
        this.distributorPayment = distributorPayment;
    }

    public String getDistributorUsername() {
        return distributorUsername;
    }

    public void setDistributorUsername(String distributorUsername) {
        this.distributorUsername = distributorUsername;
    }

    public Long getFenxiaoId() {
        return fenxiaoId;
    }

    public void setFenxiaoId(Long fenxiaoId) {
        this.fenxiaoId = fenxiaoId;
    }

    public String getLogisticsCompanyName() {
        return logisticsCompanyName;
    }

    public void setLogisticsCompanyName(String logisticsCompanyName) {
        this.logisticsCompanyName = logisticsCompanyName;
    }

    public String getLogisticsId() {
        return logisticsId;
    }

    public void setLogisticsId(String logisticsId) {
        this.logisticsId = logisticsId;
    }

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getPostFee() {
        return postFee;
    }

    public void setPostFee(String postFee) {
        this.postFee = postFee;
    }

    public String getSellerNick() {
        return sellerNick;
    }

    public void setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
    }

    public Long getShipping() {
        return shipping;
    }

    public void setShipping(Long shipping) {
        this.shipping = shipping;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getSubOrderId() {
        return subOrderId;
    }

    public void setSubOrderId(Long subOrderId) {
        this.subOrderId = subOrderId;
    }

    public String getSupplierUsername() {
        return supplierUsername;
    }

    public void setSupplierUsername(String supplierUsername) {
        this.supplierUsername = supplierUsername;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

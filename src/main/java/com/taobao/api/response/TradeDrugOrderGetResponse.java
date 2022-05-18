package com.taobao.api.response;

import com.taobao.api.TaobaoObject;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: taobao.trade.drug.order.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TradeDrugOrderGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7377271921596276275L;

	/** 
	 * 返回结果
	 */
	@ApiField("result")
	private ResultSet result;


	public void setResult(ResultSet result) {
		this.result = result;
	}
	public ResultSet getResult( ) {
		return this.result;
	}
	
	/**
 * 订单商品
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class GoodsList extends TaobaoObject {

	private static final long serialVersionUID = 8781492358698773768L;

	/**
		 * 商品数量
		 */
		@ApiField("count")
		private Long count;
		/**
		 * 商品外部编码
		 */
		@ApiField("goods_code")
		private String goodsCode;
		/**
		 * 商品ID
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 是否是优惠商品
		 */
		@ApiField("is_promotion")
		private Boolean isPromotion;
		/**
		 * 商品名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 是否是优惠商品
		 */
		@ApiField("promotion")
		private Boolean promotion;
		/**
		 * 优惠名称
		 */
		@ApiField("promotion_name")
		private String promotionName;
		/**
		 * 0 未优惠 1 已优惠
		 */
		@ApiField("promotion_status")
		private Long promotionStatus;
		/**
		 * 优惠类型
		 */
		@ApiField("promotion_type")
		private Long promotionType;
		/**
		 * 实际价格
		 */
		@ApiField("real_price")
		private String realPrice;
	

	public Long getCount() {
			return this.count;
		}
		public void setCount(Long count) {
			this.count = count;
		}
		public String getGoodsCode() {
			return this.goodsCode;
		}
		public void setGoodsCode(String goodsCode) {
			this.goodsCode = goodsCode;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Boolean getIsPromotion() {
			return this.isPromotion;
		}
		public void setIsPromotion(Boolean isPromotion) {
			this.isPromotion = isPromotion;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Boolean getPromotion() {
			return this.promotion;
		}
		public void setPromotion(Boolean promotion) {
			this.promotion = promotion;
		}
		public String getPromotionName() {
			return this.promotionName;
		}
		public void setPromotionName(String promotionName) {
			this.promotionName = promotionName;
		}
		public Long getPromotionStatus() {
			return this.promotionStatus;
		}
		public void setPromotionStatus(Long promotionStatus) {
			this.promotionStatus = promotionStatus;
		}
		public Long getPromotionType() {
			return this.promotionType;
		}
		public void setPromotionType(Long promotionType) {
			this.promotionType = promotionType;
		}
		public String getRealPrice() {
			return this.realPrice;
		}
		public void setRealPrice(String realPrice) {
			this.realPrice = realPrice;
		}

}

	/**
 * TakeoutThirdOrder订单数据
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class TakeoutThirdOrder extends TaobaoObject {

	private static final long serialVersionUID = 3181334639918838774L;

	/**
		 * 实际支付金额
		 */
		@ApiField("actual_pay_fee")
		private Long actualPayFee;
		/**
		 * 订单失败原因
		 */
		@ApiField("faild_reason")
		private String faildReason;
		/**
		 * 订单商品
		 */
		@ApiListField("goods_list")
		@ApiField("goods_list")
		private List<GoodsList> goodsList;
		/**
		 * 支付时间
		 */
		@ApiField("pay_time")
		private String payTime;
		/**
		 * 店铺id
		 */
		@ApiField("store_id")
		private Long storeId;
	

	public Long getActualPayFee() {
			return this.actualPayFee;
		}
		public void setActualPayFee(Long actualPayFee) {
			this.actualPayFee = actualPayFee;
		}
		public String getFaildReason() {
			return this.faildReason;
		}
		public void setFaildReason(String faildReason) {
			this.faildReason = faildReason;
		}
		public List<GoodsList> getGoodsList() {
			return this.goodsList;
		}
		public void setGoodsList(List<GoodsList> goodsList) {
			this.goodsList = goodsList;
		}
		public String getPayTime() {
			return this.payTime;
		}
		public void setPayTime(String payTime) {
			this.payTime = payTime;
		}
		public Long getStoreId() {
			return this.storeId;
		}
		public void setStoreId(Long storeId) {
			this.storeId = storeId;
		}

}

	/**
 * 返回结果
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class ResultSet extends TaobaoObject {

	private static final long serialVersionUID = 2224597911498522549L;

	/**
		 * errorCode
		 */
		@ApiField("error_code")
		private String errorCode;
		/**
		 * errorMsg
		 */
		@ApiField("error_msg")
		private String errorMsg;
		/**
		 * 异常信息
		 */
		@ApiField("exception")
		private String exception;
		/**
		 * TakeoutThirdOrder订单数据
		 */
		@ApiField("result")
		private TakeoutThirdOrder result;
	

	public String getErrorCode() {
			return this.errorCode;
		}
		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}
		public String getErrorMsg() {
			return this.errorMsg;
		}
		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}
		public String getException() {
			return this.exception;
		}
		public void setException(String exception) {
			this.exception = exception;
		}
		public void setExceptionString(String exception) {
			this.exception = exception;
		}
		
		public TakeoutThirdOrder getResult() {
			return this.result;
		}
		public void setResult(TakeoutThirdOrder result) {
			this.result = result;
		}

}



}

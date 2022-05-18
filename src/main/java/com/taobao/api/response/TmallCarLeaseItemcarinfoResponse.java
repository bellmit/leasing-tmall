package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: tmall.car.lease.itemcarinfo response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallCarLeaseItemcarinfoResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7243239138321194493L;

	/** 
	 * result
	 */
	@ApiField("result")
	private Result result;


	public void setResult(Result result) {
		this.result = result;
	}
	public Result getResult( ) {
		return this.result;
	}
	
	/**
 * 返回的对象
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class CarItemInfoDto extends TaobaoObject {

	private static final long serialVersionUID = 8864599327877298512L;

	/**
		 * 品牌
		 */
		@ApiField("brand")
		private String brand;
		/**
		 * 商品id
		 */
		@ApiField("item_id")
		private Long itemId;
		/**
		 * 车系
		 */
		@ApiField("line")
		private String line;
		/**
		 * 型号
		 */
		@ApiField("model")
		private String model;
		/**
		 * 不会返回
		 */
		@ApiField("seller_id")
		private Long sellerId;
		/**
		 * 不会返回
		 */
		@ApiField("seller_nick")
		private String sellerNick;
		/**
		 * skuId不会返回
		 */
		@ApiField("sku_id")
		private Long skuId;
		/**
		 * 年款
		 */
		@ApiField("year")
		private String year;
	

	public String getBrand() {
			return this.brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public Long getItemId() {
			return this.itemId;
		}
		public void setItemId(Long itemId) {
			this.itemId = itemId;
		}
		public String getLine() {
			return this.line;
		}
		public void setLine(String line) {
			this.line = line;
		}
		public String getModel() {
			return this.model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public Long getSellerId() {
			return this.sellerId;
		}
		public void setSellerId(Long sellerId) {
			this.sellerId = sellerId;
		}
		public String getSellerNick() {
			return this.sellerNick;
		}
		public void setSellerNick(String sellerNick) {
			this.sellerNick = sellerNick;
		}
		public Long getSkuId() {
			return this.skuId;
		}
		public void setSkuId(Long skuId) {
			this.skuId = skuId;
		}
		public String getYear() {
			return this.year;
		}
		public void setYear(String year) {
			this.year = year;
		}

}

	/**
 * result
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Result extends TaobaoObject {

	private static final long serialVersionUID = 4812939992282335262L;

	/**
		 * 耗时
		 */
		@ApiField("cost_time")
		private Long costTime;
		/**
		 * 错误码
		 */
		@ApiField("error_code")
		private String errorCode;
		/**
		 * 错误提示
		 */
		@ApiField("error_message")
		private String errorMessage;
		/**
		 * 当前时间
		 */
		@ApiField("gmt_current_time")
		private Long gmtCurrentTime;
		/**
		 * 错误码
		 */
		@ApiField("msg_code")
		private String msgCode;
		/**
		 * 错误提示
		 */
		@ApiField("msg_info")
		private String msgInfo;
		/**
		 * 返回的对象
		 */
		@ApiField("object")
		private CarItemInfoDto object;
		/**
		 * 成功与否
		 */
		@ApiField("success")
		private Boolean success;
	

	public Long getCostTime() {
			return this.costTime;
		}
		public void setCostTime(Long costTime) {
			this.costTime = costTime;
		}
		public String getErrorCode() {
			return this.errorCode;
		}
		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}
		public String getErrorMessage() {
			return this.errorMessage;
		}
		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}
		public Long getGmtCurrentTime() {
			return this.gmtCurrentTime;
		}
		public void setGmtCurrentTime(Long gmtCurrentTime) {
			this.gmtCurrentTime = gmtCurrentTime;
		}
		public String getMsgCode() {
			return this.msgCode;
		}
		public void setMsgCode(String msgCode) {
			this.msgCode = msgCode;
		}
		public String getMsgInfo() {
			return this.msgInfo;
		}
		public void setMsgInfo(String msgInfo) {
			this.msgInfo = msgInfo;
		}
		public CarItemInfoDto getObject() {
			return this.object;
		}
		public void setObject(CarItemInfoDto object) {
			this.object = object;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}

}



}

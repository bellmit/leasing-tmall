package com.taobao.api.response;

import com.taobao.api.TaobaoObject;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: alibaba.wt.verify.fetchdata response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlibabaWtVerifyFetchdataResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8142174246766122842L;

	/** 
	 * result
	 */
	@ApiField("result")
	private CommonResult result;


	public void setResult(CommonResult result) {
		this.result = result;
	}
	public CommonResult getResult( ) {
		return this.result;
	}
	
	/**
 * model
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class VerifyInfo extends TaobaoObject {

	private static final long serialVersionUID = 1584116157436735521L;

	/**
		 * 地址信息，可为空
		 */
		@ApiField("address")
		private String address;
		/**
		 * 认证时间，可空
		 */
		@ApiField("auth_time")
		private String authTime;
		/**
		 * 背面照url
		 */
		@ApiField("card_back_path")
		private String cardBackPath;
		/**
		 * 正面照url
		 */
		@ApiField("card_front_path")
		private String cardFrontPath;
		/**
		 * 手持照url
		 */
		@ApiField("card_in_hand_path")
		private String cardInHandPath;
		/**
		 * 证件姓名
		 */
		@ApiField("card_name")
		private String cardName;
		/**
		 * 证件号码
		 */
		@ApiField("card_num")
		private String cardNum;
		/**
		 * 证件类型
		 */
		@ApiField("card_type")
		private String cardType;
		/**
		 * 扩展属性,可空
		 */
		@ApiField("ext")
		private String ext;
		/**
		 * 订单id
		 */
		@ApiField("order_id")
		private String orderId;
		/**
		 * 实人认证状态0-初始化,1-审核中,2-审核失败,3-审核成功
		 */
		@ApiField("verify_status")
		private String verifyStatus;
	

	public String getAddress() {
			return this.address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getAuthTime() {
			return this.authTime;
		}
		public void setAuthTime(String authTime) {
			this.authTime = authTime;
		}
		public String getCardBackPath() {
			return this.cardBackPath;
		}
		public void setCardBackPath(String cardBackPath) {
			this.cardBackPath = cardBackPath;
		}
		public String getCardFrontPath() {
			return this.cardFrontPath;
		}
		public void setCardFrontPath(String cardFrontPath) {
			this.cardFrontPath = cardFrontPath;
		}
		public String getCardInHandPath() {
			return this.cardInHandPath;
		}
		public void setCardInHandPath(String cardInHandPath) {
			this.cardInHandPath = cardInHandPath;
		}
		public String getCardName() {
			return this.cardName;
		}
		public void setCardName(String cardName) {
			this.cardName = cardName;
		}
		public String getCardNum() {
			return this.cardNum;
		}
		public void setCardNum(String cardNum) {
			this.cardNum = cardNum;
		}
		public String getCardType() {
			return this.cardType;
		}
		public void setCardType(String cardType) {
			this.cardType = cardType;
		}
		public String getExt() {
			return this.ext;
		}
		public void setExt(String ext) {
			this.ext = ext;
		}
		public void setExtString(String ext) {
			this.ext = ext;
		}
		
		public String getOrderId() {
			return this.orderId;
		}
		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}
		public String getVerifyStatus() {
			return this.verifyStatus;
		}
		public void setVerifyStatus(String verifyStatus) {
			this.verifyStatus = verifyStatus;
		}

}

	/**
 * result
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class CommonResult extends TaobaoObject {

	private static final long serialVersionUID = 3161335529385742825L;

	/**
		 * 结果码
		 */
		@ApiField("code")
		private String code;
		/**
		 * 结果描述
		 */
		@ApiField("desc")
		private String desc;
		/**
		 * model
		 */
		@ApiField("model")
		private VerifyInfo model;
		/**
		 * 是否成功的标识
		 */
		@ApiField("success")
		private Boolean success;
	

	public String getCode() {
			return this.code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getDesc() {
			return this.desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		public VerifyInfo getModel() {
			return this.model;
		}
		public void setModel(VerifyInfo model) {
			this.model = model;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}

}



}

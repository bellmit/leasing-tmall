package com.taobao.api.response;

import com.taobao.api.TaobaoObject;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.delivery.drug.pickup response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class DeliveryDrugPickupResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4216846488988858558L;

	/** 
	 * 11
	 */
	@ApiField("result")
	private DdDeliveryResult result;


	public void setResult(DdDeliveryResult result) {
		this.result = result;
	}
	public DdDeliveryResult getResult( ) {
		return this.result;
	}
	
	/**
 * 11
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class DdDeliveryResult extends TaobaoObject {

	private static final long serialVersionUID = 2813759664862897838L;

	/**
		 * 错误码
		 */
		@ApiField("msg_code")
		private String msgCode;
		/**
		 * 错误信息
		 */
		@ApiField("msg_info")
		private String msgInfo;
		/**
		 * 是否成功！
		 */
		@ApiField("success")
		private Boolean success;
	

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
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}

}



}

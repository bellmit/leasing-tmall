package com.taobao.api.response;

import com.taobao.api.TaobaoObject;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: taobao.inventory.merchant.adjust response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class InventoryMerchantAdjustResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5863836397512522136L;

	/** 
	 * result
	 */
	@ApiField("result")
	private SingleResult result;


	public void setResult(SingleResult result) {
		this.result = result;
	}
	public SingleResult getResult( ) {
		return this.result;
	}
	
	/**
 * data
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class InventoryCheckResultDto extends TaobaoObject {

	private static final long serialVersionUID = 4795134866411731771L;

	/**
		 * 错误码
		 */
		@ApiField("error_code")
		private String errorCode;
		/**
		 * 错误信息
		 */
		@ApiField("error_msg")
		private String errorMsg;
		/**
		 * 每个货品的调整子单据号，作为业务调整依据，处理时会幂等
		 */
		@ApiField("sub_order_id")
		private String subOrderId;
		/**
		 * 每个子调整单据是否成功
		 */
		@ApiField("success")
		private Boolean success;
	

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
		public String getSubOrderId() {
			return this.subOrderId;
		}
		public void setSubOrderId(String subOrderId) {
			this.subOrderId = subOrderId;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}

}

	/**
 * result
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class SingleResult extends TaobaoObject {

	private static final long serialVersionUID = 2362868583184876163L;

	/**
		 * data
		 */
		@ApiListField("adjust_results")
		@ApiField("inventory_check_result_dto")
		private List<InventoryCheckResultDto> adjustResults;
		/**
		 * 错误码
		 */
		@ApiField("error_code")
		private String errorCode;
		/**
		 * 错误信息
		 */
		@ApiField("error_message")
		private String errorMessage;
		/**
		 * 如果是失败，可能是部分失败。如果是成功，则全部成功
		 */
		@ApiField("success")
		private Boolean success;
	

	public List<InventoryCheckResultDto> getAdjustResults() {
			return this.adjustResults;
		}
		public void setAdjustResults(List<InventoryCheckResultDto> adjustResults) {
			this.adjustResults = adjustResults;
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
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}

}



}

package com.taobao.api.response;

import com.taobao.api.TaobaoObject;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.region.sale.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class RegionSaleQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2669323455967628263L;

	/** 
	 * result
	 */
	@ApiField("result")
	private BaseResult result;


	public void setResult(BaseResult result) {
		this.result = result;
	}
	public BaseResult getResult( ) {
		return this.result;
	}
	
	/**
 * result
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class BaseResult extends TaobaoObject {

	private static final long serialVersionUID = 5867262976781652579L;

	/**
		 * data
		 */
		@ApiField("data")
		private String data;
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
		 * success
		 */
		@ApiField("success")
		private Boolean success;
	

	public String getData() {
			return this.data;
		}
		public void setData(String data) {
			this.data = data;
		}
		public void setDataString(String data) {
			this.data = data;
		}
		
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
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}

}



}

package com.taobao.api.response;

import com.taobao.api.TaobaoObject;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.region.warehouse.manage response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class RegionWarehouseManageResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3762462774586826529L;

	/** 
	 * 返回结果
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
 * 返回结果
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class BaseResult extends TaobaoObject {

	private static final long serialVersionUID = 5132741948945542129L;

	/**
		 * true/false
		 */
		@ApiField("data")
		private Boolean data;
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
	

	public Boolean getData() {
			return this.data;
		}
		public void setData(Boolean data) {
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

package com.taobao.api.response;

import com.taobao.api.TaobaoObject;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.trade.drug.confirmorder response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TradeDrugConfirmorderResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5118615583839918879L;

	/** 
	 * life的返回值
	 */
	@ApiField("result")
	private LifeResultDo result;


	public void setResult(LifeResultDo result) {
		this.result = result;
	}
	public LifeResultDo getResult( ) {
		return this.result;
	}
	
	/**
 * life的返回值
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class LifeResultDo extends TaobaoObject {

	private static final long serialVersionUID = 8316516716266865724L;

	/**
		 * errorCode
		 */
		@ApiField("error_code")
		private String errorCode;
		/**
		 * RT
		 */
		@ApiField("error_msg")
		private String errorMsg;
		/**
		 * 描述信息
		 */
		@ApiField("info")
		private String info;
		/**
		 * 1代表成功！
		 */
		@ApiField("ret_code")
		private String retCode;
		/**
		 * 是不是成功！
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
		public String getInfo() {
			return this.info;
		}
		public void setInfo(String info) {
			this.info = info;
		}
		public String getRetCode() {
			return this.retCode;
		}
		public void setRetCode(String retCode) {
			this.retCode = retCode;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}

}



}

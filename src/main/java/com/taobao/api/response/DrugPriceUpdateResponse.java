package com.taobao.api.response;

import com.taobao.api.TaobaoObject;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.drug.price.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class DrugPriceUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6866666563916294918L;

	/** 
	 * 接口返回model
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
 * 接口返回model
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Result extends TaobaoObject {

	private static final long serialVersionUID = 8526441377832734583L;

	/**
		 * 异常代码
		 */
		@ApiField("msg_code")
		private String msgCode;
		/**
		 * 异常信息
		 */
		@ApiField("msg_info")
		private String msgInfo;
		/**
		 * 请求是否成功
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

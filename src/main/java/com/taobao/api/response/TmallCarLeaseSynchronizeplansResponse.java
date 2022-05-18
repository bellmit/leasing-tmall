package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: tmall.car.lease.synchronizeplans response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallCarLeaseSynchronizeplansResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2557774663954917178L;

	/** 
	 * 如果success为true,表示成功，如果success为false,需要获取msg_code,msg_info,具体的错误码文档提供
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
 * 如果success为true,表示成功，如果success为false,需要获取msg_code,msg_info,具体的错误码文档提供
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Result extends TaobaoObject {

	private static final long serialVersionUID = 4393193349655593328L;

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
		 * 成功或者失败
		 */
		@ApiField("object")
		private Boolean object;
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
		public Boolean getObject() {
			return this.object;
		}
		public void setObject(Boolean object) {
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

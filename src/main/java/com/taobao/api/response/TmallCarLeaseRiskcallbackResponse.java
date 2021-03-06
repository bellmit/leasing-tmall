package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: tmall.car.lease.riskcallback response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallCarLeaseRiskcallbackResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4559919916894515932L;

	/** 
	 * 结果集合
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
 * 结果集合
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Result extends TaobaoObject {

	private static final long serialVersionUID = 4692495876684722551L;

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
		 * 错误消息
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
		 * 错误消息
		 */
		@ApiField("msg_info")
		private String msgInfo;
		/**
		 * true
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

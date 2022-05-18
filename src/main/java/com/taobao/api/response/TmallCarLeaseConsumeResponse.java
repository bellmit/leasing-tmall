package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: tmall.car.lease.consume response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallCarLeaseConsumeResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4782952654521964735L;

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

	private static final long serialVersionUID = 3428627499341326498L;

	/**
		 * 耗时
		 */
		@ApiField("cost_time")
		private Long costTime;
		/**
		 * 错误吗
		 */
		@ApiField("error_code")
		private Long errorCode;
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
		 * 无需关心了
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
		public Long getErrorCode() {
			return this.errorCode;
		}
		public void setErrorCode(Long errorCode) {
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

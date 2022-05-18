package com.taobao.api.response;

import com.taobao.api.TaobaoObject;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: tmall.item.dapei.template.delete response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallItemDapeiTemplateDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7864925224691445734L;

	/** 
	 * result
	 */
	@ApiField("result")
	private ResultSet result;


	public void setResult(ResultSet result) {
		this.result = result;
	}
	public ResultSet getResult( ) {
		return this.result;
	}
	
	/**
 * result
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class ResultSet extends TaobaoObject {

	private static final long serialVersionUID = 3362834361423797824L;

	/**
		 * error
		 */
		@ApiField("error")
		private Boolean error;
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
		 * firstResult
		 */
		@ApiField("first_result")
		private Long firstResult;
	

	public Boolean getError() {
			return this.error;
		}
		public void setError(Boolean error) {
			this.error = error;
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
		public Long getFirstResult() {
			return this.firstResult;
		}
		public void setFirstResult(Long firstResult) {
			this.firstResult = firstResult;
		}

}



}

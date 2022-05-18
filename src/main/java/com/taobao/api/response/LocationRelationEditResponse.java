package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.location.relation.edit response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class LocationRelationEditResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5795163781494777799L;

	/** 
	 * 错误信息
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 错误码
	 */
	@ApiField("errorcode")
	private String errorcode;

	/** 
	 * 是否成功
	 */
	@ApiField("is_success")
	private Boolean isSuccess;


	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorMsg( ) {
		return this.errorMsg;
	}

	public void setErrorcode(String errorcode) {
		this.errorcode = errorcode;
	}
	public String getErrorcode( ) {
		return this.errorcode;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}
	


}

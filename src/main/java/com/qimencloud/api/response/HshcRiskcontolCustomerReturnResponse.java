package com.qimencloud.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.qimencloud.api.AbstractQimenCloudResponse;

/**
 * TOP API(QimenCloud): hshc.riskcontol.customer.return response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class HshcRiskcontolCustomerReturnResponse extends AbstractQimenCloudResponse {

	private static final long serialVersionUID = 3328288856596438159L;

	/** 
	 * 信息
	 */
	@ApiField("message")
	private String message;

	/** 
	 * 成功
	 */
	@ApiField("success")
	private Boolean success;


	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}
	


}

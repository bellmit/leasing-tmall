package com.qimencloud.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.qimencloud.api.AbstractQimenCloudResponse;

/**
 * TOP API(QimenCloud): hshc.riskcontol.orders.return response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class HshcRiskcontolOrdersReturnResponse extends AbstractQimenCloudResponse {

	private static final long serialVersionUID = 1192136346679898354L;

	/** 
	 * 一级响应参数
	 */
	@ApiField("message")
	private String message;

	/** 
	 * 一级响应消息
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

package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: alipay.xiaodai.user.permit response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlipayXiaodaiUserPermitResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5827649232749476217L;

	/** 
	 * 是否成功
	 */
	@ApiField("is_success")
	private Boolean isSuccess;


	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}
	


}

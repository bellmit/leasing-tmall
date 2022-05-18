package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.jushita.jms.group.delete response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class JushitaJmsGroupDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5125965491128333861L;

	/** 
	 * 操作结果
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

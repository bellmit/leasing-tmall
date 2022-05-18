package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.tmc.user.cancel response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmcUserCancelResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2244956928391461693L;

	/** 
	 * 是否成功,如果为false并且没有错误码，表示删除的用户不存在。
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

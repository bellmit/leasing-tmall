package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.picture.delete response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class PictureDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5466915398397595951L;

	/** 
	 * 是否删除
	 */
	@ApiField("success")
	private Boolean success;


	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}
	


}

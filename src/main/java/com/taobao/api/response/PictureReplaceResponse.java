package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.picture.replace response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class PictureReplaceResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8499752355574628478L;

	/** 
	 * 图片替换是否成功
	 */
	@ApiField("done")
	private Boolean done;


	public void setDone(Boolean done) {
		this.done = done;
	}
	public Boolean getDone( ) {
		return this.done;
	}
	


}

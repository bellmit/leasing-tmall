package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.picture.category.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class PictureCategoryUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6221987748753338565L;

	/** 
	 * 更新图片分类是否成功
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

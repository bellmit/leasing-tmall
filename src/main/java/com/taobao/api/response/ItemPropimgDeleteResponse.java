package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.PropImg;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.item.propimg.delete response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ItemPropimgDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5761513464769682132L;

	/** 
	 * 属性图片结构
	 */
	@ApiField("prop_img")
	private PropImg propImg;


	public void setPropImg(PropImg propImg) {
		this.propImg = propImg;
	}
	public PropImg getPropImg( ) {
		return this.propImg;
	}
	


}

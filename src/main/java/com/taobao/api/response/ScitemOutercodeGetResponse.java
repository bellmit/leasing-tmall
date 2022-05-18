package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ScItem;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.scitem.outercode.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ScitemOutercodeGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4155248759496254225L;

	/** 
	 * 后台商品
	 */
	@ApiField("sc_item")
	private ScItem scItem;


	public void setScItem(ScItem scItem) {
		this.scItem = scItem;
	}
	public ScItem getScItem( ) {
		return this.scItem;
	}
	


}

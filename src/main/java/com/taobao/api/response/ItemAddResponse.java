package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Item;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.item.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ItemAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4376321629364493786L;

	/** 
	 * 商品结构,仅有numIid和created返回
	 */
	@ApiField("item")
	private Item item;


	public void setItem(Item item) {
		this.item = item;
	}
	public Item getItem( ) {
		return this.item;
	}
	


}

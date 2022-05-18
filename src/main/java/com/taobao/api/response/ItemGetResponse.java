package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Item;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.item.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ItemGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1854371536536861859L;

	/** 
	 * 获取的商品 具体字段根据权限和设定的fields决定
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

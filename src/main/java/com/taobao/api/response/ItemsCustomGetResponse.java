package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Item;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: taobao.items.custom.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ItemsCustomGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7584595262141951937L;

	/** 
	 * 商品列表，具体返回字段以fields决定
	 */
	@ApiListField("items")
	@ApiField("item")
	private List<Item> items;


	public void setItems(List<Item> items) {
		this.items = items;
	}
	public List<Item> getItems( ) {
		return this.items;
	}
	


}

package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Item;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.item.recommend.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ItemRecommendAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7254649886881647946L;

	/** 
	 * 被推荐的商品的信息
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

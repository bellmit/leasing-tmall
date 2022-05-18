package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Item;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.item.seller.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ItemSellerGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7419213741397299486L;

	/** 
	 * 商品详细信息
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

package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Item;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.item.update.delisting response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ItemUpdateDelistingResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7785614546872551944L;

	/** 
	 * 返回商品更新信息：返回的结果是:num_iid和modified
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

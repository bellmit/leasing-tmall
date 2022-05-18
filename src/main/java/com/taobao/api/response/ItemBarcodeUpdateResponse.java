package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Item;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.item.barcode.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ItemBarcodeUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2338253677182356987L;

	/** 
	 * 商品结构里的num_iid，modified
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

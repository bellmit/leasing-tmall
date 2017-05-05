package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.item.schema.increment.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ItemSchemaIncrementUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3231454978726342675L;

	/** 
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;


	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId( ) {
		return this.itemId;
	}
	


}

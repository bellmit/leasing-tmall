package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Sku;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.item.sku.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ItemSkuUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5627375649536719672L;

	/** 
	 * 商品Sku
	 */
	@ApiField("sku")
	private Sku sku;


	public void setSku(Sku sku) {
		this.sku = sku;
	}
	public Sku getSku( ) {
		return this.sku;
	}
	


}

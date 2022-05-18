package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Sku;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.item.sku.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ItemSkuGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3215728741639491964L;

	/** 
	 * Sku
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

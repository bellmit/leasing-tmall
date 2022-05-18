package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: tmall.item.quantity.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallItemQuantityUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5879329584766218361L;

	/** 
	 * 库存更新结果，商品id
	 */
	@ApiField("quantity_update_result")
	private String quantityUpdateResult;


	public void setQuantityUpdateResult(String quantityUpdateResult) {
		this.quantityUpdateResult = quantityUpdateResult;
	}
	public String getQuantityUpdateResult( ) {
		return this.quantityUpdateResult;
	}
	


}

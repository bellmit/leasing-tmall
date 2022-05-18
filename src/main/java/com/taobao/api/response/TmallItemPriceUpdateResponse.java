package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: tmall.item.price.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallItemPriceUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4181559392337286528L;

	/** 
	 * 价格更新结果
	 */
	@ApiField("price_update_result")
	private String priceUpdateResult;


	public void setPriceUpdateResult(String priceUpdateResult) {
		this.priceUpdateResult = priceUpdateResult;
	}
	public String getPriceUpdateResult( ) {
		return this.priceUpdateResult;
	}
	


}

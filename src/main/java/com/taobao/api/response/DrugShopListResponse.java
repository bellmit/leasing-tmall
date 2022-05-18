package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TakeoutShopPage;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.drug.shop.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class DrugShopListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8435292673739644994L;

	/** 
	 * 数据结果集
	 */
	@ApiField("result")
	private TakeoutShopPage result;


	public void setResult(TakeoutShopPage result) {
		this.result = result;
	}
	public TakeoutShopPage getResult( ) {
		return this.result;
	}
	


}

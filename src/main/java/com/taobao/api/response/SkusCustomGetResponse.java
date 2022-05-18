package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Sku;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: taobao.skus.custom.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class SkusCustomGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4521246196327357217L;

	/** 
	 * Sku对象，具体字段以fields决定
	 */
	@ApiListField("skus")
	@ApiField("sku")
	private List<Sku> skus;


	public void setSkus(List<Sku> skus) {
		this.skus = skus;
	}
	public List<Sku> getSkus( ) {
		return this.skus;
	}
	


}

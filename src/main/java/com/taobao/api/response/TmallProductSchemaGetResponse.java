package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: tmall.product.schema.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallProductSchemaGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5681228154929886425L;

	/** 
	 * 产品信息数据。schema形式
	 */
	@ApiField("get_product_result")
	private String getProductResult;


	public void setGetProductResult(String getProductResult) {
		this.getProductResult = getProductResult;
	}
	public String getGetProductResult( ) {
		return this.getProductResult;
	}
	


}

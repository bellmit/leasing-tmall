package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: tmall.product.schema.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallProductSchemaAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6482619937473492226L;

	/** 
	 * 新发产品结果
	 */
	@ApiField("add_product_result")
	private String addProductResult;


	public void setAddProductResult(String addProductResult) {
		this.addProductResult = addProductResult;
	}
	public String getAddProductResult( ) {
		return this.addProductResult;
	}
	


}

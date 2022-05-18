package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Product;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.product.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ProductUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7639718533354332286L;

	/** 
	 * 返回product数据结构中的：product_id,modified
	 */
	@ApiField("product")
	private Product product;


	public void setProduct(Product product) {
		this.product = product;
	}
	public Product getProduct( ) {
		return this.product;
	}
	


}

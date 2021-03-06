package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: tmall.product.update.schema.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallProductUpdateSchemaGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2224416594355856982L;

	/** 
	 * 参数产品ID对产品的更新规则
	 */
	@ApiField("update_product_schema")
	private String updateProductSchema;


	public void setUpdateProductSchema(String updateProductSchema) {
		this.updateProductSchema = updateProductSchema;
	}
	public String getUpdateProductSchema( ) {
		return this.updateProductSchema;
	}
	


}

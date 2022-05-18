package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: tmall.item.increment.update.schema.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallItemIncrementUpdateSchemaGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2225955149699577161L;

	/** 
	 * 返回增量更新商品的规则文档
	 */
	@ApiField("update_item_result")
	private String updateItemResult;


	public void setUpdateItemResult(String updateItemResult) {
		this.updateItemResult = updateItemResult;
	}
	public String getUpdateItemResult( ) {
		return this.updateItemResult;
	}
	


}

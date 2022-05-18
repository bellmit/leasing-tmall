package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.item.increment.update.schema.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ItemIncrementUpdateSchemaGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6152355952932376433L;

	/** 
	 * 返回的结果集
	 */
	@ApiField("update_rules")
	private String updateRules;


	public void setUpdateRules(String updateRules) {
		this.updateRules = updateRules;
	}
	public String getUpdateRules( ) {
		return this.updateRules;
	}
	


}

package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.delivery.template.delete response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class DeliveryTemplateDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4818253193626667294L;

	/** 
	 * 表示删除成功还是失败
	 */
	@ApiField("complete")
	private Boolean complete;


	public void setComplete(Boolean complete) {
		this.complete = complete;
	}
	public Boolean getComplete( ) {
		return this.complete;
	}
	


}

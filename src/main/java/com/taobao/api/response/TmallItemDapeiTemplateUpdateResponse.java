package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: tmall.item.dapei.template.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallItemDapeiTemplateUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6674626327587734796L;

	/** 
	 * 被更新模板ID
	 */
	@ApiField("id")
	private Long id;


	public void setId(Long id) {
		this.id = id;
	}
	public Long getId( ) {
		return this.id;
	}
	


}

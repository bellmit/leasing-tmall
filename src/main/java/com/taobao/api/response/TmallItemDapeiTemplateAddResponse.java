package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: tmall.item.dapei.template.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallItemDapeiTemplateAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2259315579161444822L;

	/** 
	 * 新创建搭配模板的ID
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

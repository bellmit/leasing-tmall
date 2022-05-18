package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.scitem.map.delete response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ScitemMapDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2559296392165512514L;

	/** 
	 * 失效条数
	 */
	@ApiField("module")
	private Long module;


	public void setModule(Long module) {
		this.module = module;
	}
	public Long getModule( ) {
		return this.module;
	}
	


}

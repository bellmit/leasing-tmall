package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.oc.eservice.appoint.save response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OcEserviceAppointSaveResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2718483948622293489L;

	/** 
	 * 服务约定卡的唯一标识
	 */
	@ApiField("model")
	private Long model;


	public void setModel(Long model) {
		this.model = model;
	}
	public Long getModel( ) {
		return this.model;
	}
	


}

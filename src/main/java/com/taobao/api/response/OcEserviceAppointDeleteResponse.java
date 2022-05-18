package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.oc.eservice.appoint.delete response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OcEserviceAppointDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5397342735638795449L;

	/** 
	 * 删除的记录的数目
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

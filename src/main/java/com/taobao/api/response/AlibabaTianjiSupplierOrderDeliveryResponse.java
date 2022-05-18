package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: alibaba.tianji.supplier.order.delivery response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlibabaTianjiSupplierOrderDeliveryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6474469799915567575L;

	/** 
	 * 发货是否成功
	 */
	@ApiField("model")
	private Boolean model;


	public void setModel(Boolean model) {
		this.model = model;
	}
	public Boolean getModel( ) {
		return this.model;
	}
	


}

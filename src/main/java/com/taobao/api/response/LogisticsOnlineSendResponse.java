package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Shipping;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.logistics.online.send response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class LogisticsOnlineSendResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3425687219451751838L;

	/** 
	 * de
	 */
	@ApiField("shipping")
	private Shipping shipping;


	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}
	public Shipping getShipping( ) {
		return this.shipping;
	}
	


}

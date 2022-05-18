package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Shipping;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.logistics.dummy.send response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class LogisticsDummySendResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6835123613288413948L;

	/** 
	 * 返回发货是否成功is_success
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

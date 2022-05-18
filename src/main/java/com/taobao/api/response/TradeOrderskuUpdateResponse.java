package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Order;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.trade.ordersku.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TradeOrderskuUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4826253674191411671L;

	/** 
	 * 只返回oid和modified
	 */
	@ApiField("order")
	private Order order;


	public void setOrder(Order order) {
		this.order = order;
	}
	public Order getOrder( ) {
		return this.order;
	}
	


}

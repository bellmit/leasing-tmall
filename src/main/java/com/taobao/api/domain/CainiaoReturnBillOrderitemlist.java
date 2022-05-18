package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;


/**
 * 订单商品信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoReturnBillOrderitemlist extends TaobaoObject {

	private static final long serialVersionUID = 4326549279913183713L;

	/**
	 * 订单商品信息
	 */
	@ApiField("order_item")
	private CainiaoReturnBillOrderitem orderItem;


	public CainiaoReturnBillOrderitem getOrderItem() {
		return this.orderItem;
	}
	public void setOrderItem(CainiaoReturnBillOrderitem orderItem) {
		this.orderItem = orderItem;
	}

}

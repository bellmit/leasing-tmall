package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;


/**
 * 订单商品信息列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Orderitemlistwlbwmsstockoutordernotify extends TaobaoObject {

	private static final long serialVersionUID = 3399694412898153831L;

	/**
	 * 订单商品信息
	 */
	@ApiField("order_item")
	private Orderitemwlbwmsstockoutordernotify orderItem;


	public Orderitemwlbwmsstockoutordernotify getOrderItem() {
		return this.orderItem;
	}
	public void setOrderItem(Orderitemwlbwmsstockoutordernotify orderItem) {
		this.orderItem = orderItem;
	}

}

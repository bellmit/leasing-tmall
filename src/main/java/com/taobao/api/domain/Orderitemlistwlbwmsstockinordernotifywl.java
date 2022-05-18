package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;


/**
 * 系统自动生成
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Orderitemlistwlbwmsstockinordernotifywl extends TaobaoObject {

	private static final long serialVersionUID = 7298539724831242983L;

	/**
	 * 订单商品
	 */
	@ApiField("order_item")
	private Orderitemwlbwmsstockinordernotifywl orderItem;


	public Orderitemwlbwmsstockinordernotifywl getOrderItem() {
		return this.orderItem;
	}
	public void setOrderItem(Orderitemwlbwmsstockinordernotifywl orderItem) {
		this.orderItem = orderItem;
	}

}

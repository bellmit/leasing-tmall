package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;


/**
 * 订单商品信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoStockOutBillOrderitemlist extends TaobaoObject {

	private static final long serialVersionUID = 4567118693653577411L;

	/**
	 * 订单商品信息
	 */
	@ApiField("order_item")
	private CainiaoStockOutBillOrderitem orderItem;


	public CainiaoStockOutBillOrderitem getOrderItem() {
		return this.orderItem;
	}
	public void setOrderItem(CainiaoStockOutBillOrderitem orderItem) {
		this.orderItem = orderItem;
	}

}

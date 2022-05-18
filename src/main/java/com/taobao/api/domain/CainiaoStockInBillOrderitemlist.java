package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;


/**
 * 入库单信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoStockInBillOrderitemlist extends TaobaoObject {

	private static final long serialVersionUID = 2793559145849817198L;

	/**
	 * 入库单信息
	 */
	@ApiField("order_item")
	private CainiaoStockInBillOrderitem orderItem;


	public CainiaoStockInBillOrderitem getOrderItem() {
		return this.orderItem;
	}
	public void setOrderItem(CainiaoStockInBillOrderitem orderItem) {
		this.orderItem = orderItem;
	}

}

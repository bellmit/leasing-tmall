package com.qimen.api.response;

import com.qimen.api.QimenResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: taobao.qimen.deliveryorder.batchcreate response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class DeliveryorderBatchcreateResponse extends QimenResponse {

	private static final long serialVersionUID = 4824193387689716175L;

	/** 
	 * 订单详情
	 */
	@ApiListField("orders")
	@ApiField("order")
	private List<Order> orders;


	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	public List<Order> getOrders( ) {
		return this.orders;
	}
	
	/**
 * 订单详情
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Order {

	/**
		 * 出错的出库单号
		 */
		@ApiField("deliveryOrderCode")
		private String deliveryOrderCode;
		/**
		 * 出错信息
		 */
		@ApiField("message")
		private String message;
	

	public String getDeliveryOrderCode() {
			return this.deliveryOrderCode;
		}
		public void setDeliveryOrderCode(String deliveryOrderCode) {
			this.deliveryOrderCode = deliveryOrderCode;
		}
		public String getMessage() {
			return this.message;
		}
		public void setMessage(String message) {
			this.message = message;
		}

}



}

package com.qimen.api.response;

import com.qimen.api.QimenResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: taobao.qimen.deliveryorder.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class DeliveryorderCreateResponse extends QimenResponse {

	private static final long serialVersionUID = 2166263223834538492L;

	/** 
	 * 订单创建时间(YYYY-MM-DD HH:MM:SS)
	 */
	@ApiField("createTime")
	private String createTime;

	/** 
	 * 出库单仓储系统编码
	 */
	@ApiField("deliveryOrderId")
	private String deliveryOrderId;

	/** 
	 * 发货单信息
	 */
	@ApiListField("deliveryOrders")
	@ApiField("deliveryOrder")
	private List<DeliveryOrder> deliveryOrders;

	/** 
	 * 物流公司编码(统仓统配使用)
	 */
	@ApiField("logisticsCode")
	private String logisticsCode;

	/** 
	 * 仓库编码(统仓统配使用)
	 */
	@ApiField("warehouseCode")
	private String warehouseCode;


	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getCreateTime( ) {
		return this.createTime;
	}

	public void setDeliveryOrderId(String deliveryOrderId) {
		this.deliveryOrderId = deliveryOrderId;
	}
	public String getDeliveryOrderId( ) {
		return this.deliveryOrderId;
	}

	public void setDeliveryOrders(List<DeliveryOrder> deliveryOrders) {
		this.deliveryOrders = deliveryOrders;
	}
	public List<DeliveryOrder> getDeliveryOrders( ) {
		return this.deliveryOrders;
	}

	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}
	public String getLogisticsCode( ) {
		return this.logisticsCode;
	}

	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}
	public String getWarehouseCode( ) {
		return this.warehouseCode;
	}
	
	/**
 * 订单信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class OrderLine {

	/**
		 * ERP商品编码
		 */
		@ApiField("itemCode")
		private String itemCode;
		/**
		 * WMS商品编码
		 */
		@ApiField("itemId")
		private String itemId;
		/**
		 * 行号
		 */
		@ApiField("orderLineNo")
		private String orderLineNo;
		/**
		 * 数量
		 */
		@ApiField("quantity")
		private String quantity;
	

	public String getItemCode() {
			return this.itemCode;
		}
		public void setItemCode(String itemCode) {
			this.itemCode = itemCode;
		}
		public String getItemId() {
			return this.itemId;
		}
		public void setItemId(String itemId) {
			this.itemId = itemId;
		}
		public String getOrderLineNo() {
			return this.orderLineNo;
		}
		public void setOrderLineNo(String orderLineNo) {
			this.orderLineNo = orderLineNo;
		}
		public String getQuantity() {
			return this.quantity;
		}
		public void setQuantity(String quantity) {
			this.quantity = quantity;
		}

}

	/**
 * 发货单信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class DeliveryOrder {

	/**
		 * 订单创建时间(YYYY-MM-DD HH:MM:SS)
		 */
		@ApiField("createTime")
		private String createTime;
		/**
		 * 出库单仓储系统编码
		 */
		@ApiField("deliveryOrderId")
		private String deliveryOrderId;
		/**
		 * 物流公司编码(统仓统配使用)
		 */
		@ApiField("logisticsCode")
		private String logisticsCode;
		/**
		 * 订单信息
		 */
		@ApiListField("orderLines")
		@ApiField("orderLine")
		private List<OrderLine> orderLines;
		/**
		 * 仓库编码(统仓统配使用)
		 */
		@ApiField("warehouseCode")
		private String warehouseCode;
	

	public String getCreateTime() {
			return this.createTime;
		}
		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}
		public String getDeliveryOrderId() {
			return this.deliveryOrderId;
		}
		public void setDeliveryOrderId(String deliveryOrderId) {
			this.deliveryOrderId = deliveryOrderId;
		}
		public String getLogisticsCode() {
			return this.logisticsCode;
		}
		public void setLogisticsCode(String logisticsCode) {
			this.logisticsCode = logisticsCode;
		}
		public List<OrderLine> getOrderLines() {
			return this.orderLines;
		}
		public void setOrderLines(List<OrderLine> orderLines) {
			this.orderLines = orderLines;
		}
		public String getWarehouseCode() {
			return this.warehouseCode;
		}
		public void setWarehouseCode(String warehouseCode) {
			this.warehouseCode = warehouseCode;
		}

}



}

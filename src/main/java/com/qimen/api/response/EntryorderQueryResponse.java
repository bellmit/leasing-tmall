package com.qimen.api.response;

import com.qimen.api.QimenResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: taobao.qimen.entryorder.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class EntryorderQueryResponse extends QimenResponse {

	private static final long serialVersionUID = 4816535323851514464L;

	/** 
	 * 入库单信息
	 */
	@ApiField("entryOrder")
	private EntryOrder entryOrder;

	/** 
	 * 入库单单据信息
	 */
	@ApiListField("orderLines")
	@ApiField("orderLine")
	private List<OrderLine> orderLines;

	/** 
	 * orderLines总条数
	 */
	@ApiField("totalLines")
	private Long totalLines;


	public void setEntryOrder(EntryOrder entryOrder) {
		this.entryOrder = entryOrder;
	}
	public EntryOrder getEntryOrder( ) {
		return this.entryOrder;
	}

	public void setOrderLines(List<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}
	public List<OrderLine> getOrderLines( ) {
		return this.orderLines;
	}

	public void setTotalLines(Long totalLines) {
		this.totalLines = totalLines;
	}
	public Long getTotalLines( ) {
		return this.totalLines;
	}
	
	/**
 * 入库单信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class EntryOrder {

	/**
		 * 入库单号
		 */
		@ApiField("entryOrderCode")
		private String entryOrderCode;
		/**
		 * 仓储系统入库单ID
		 */
		@ApiField("entryOrderId")
		private String entryOrderId;
		/**
		 * 入库单类型(SCRK=生产入库;LYRK=领用入库;CCRK=残次品入库;CGRK=采购入库;DBRK=调拨入库;QTRK=其他入 库;B2BRK=B2B入库)
		 */
		@ApiField("entryOrderType")
		private String entryOrderType;
		/**
		 * 操作时间(YYYY-MM-DD HH:MM:SS;当status=FULFILLED;operateTime为入库时间)
		 */
		@ApiField("operateTime")
		private String operateTime;
		/**
		 * 货主编码
		 */
		@ApiField("ownerCode")
		private String ownerCode;
		/**
		 * 入库单状态(NEW-未开始处理;ACCEPT-仓库接单;PARTFULFILLED-部分收货完成;FULFILLED-收货完成;EXCEPTION-异 常;CANCELED-取消;CLOSED-关闭;REJECT-拒单;CANCELEDFAIL-取消失败;只传英文编码)
		 */
		@ApiField("status")
		private String status;
		/**
		 * 仓库编码(统仓统配等无需ERP指定仓储编码的情况填OTHER)
		 */
		@ApiField("warehouseCode")
		private String warehouseCode;
	

	public String getEntryOrderCode() {
			return this.entryOrderCode;
		}
		public void setEntryOrderCode(String entryOrderCode) {
			this.entryOrderCode = entryOrderCode;
		}
		public String getEntryOrderId() {
			return this.entryOrderId;
		}
		public void setEntryOrderId(String entryOrderId) {
			this.entryOrderId = entryOrderId;
		}
		public String getEntryOrderType() {
			return this.entryOrderType;
		}
		public void setEntryOrderType(String entryOrderType) {
			this.entryOrderType = entryOrderType;
		}
		public String getOperateTime() {
			return this.operateTime;
		}
		public void setOperateTime(String operateTime) {
			this.operateTime = operateTime;
		}
		public String getOwnerCode() {
			return this.ownerCode;
		}
		public void setOwnerCode(String ownerCode) {
			this.ownerCode = ownerCode;
		}
		public String getStatus() {
			return this.status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getWarehouseCode() {
			return this.warehouseCode;
		}
		public void setWarehouseCode(String warehouseCode) {
			this.warehouseCode = warehouseCode;
		}

}

	/**
 * 入库单单据信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class OrderLine {

	/**
		 * 实收数量
		 */
		@ApiField("actualQty")
		private Long actualQty;
		/**
		 * 批次编码
		 */
		@ApiField("batchCode")
		private String batchCode;
		/**
		 * 商品过期日期(YYYY-MM-DD)
		 */
		@ApiField("expireDate")
		private String expireDate;
		/**
		 * 库存类型(ZP=正品;CC=残次;JS=机损;XS=箱损;默认为ZP)
		 */
		@ApiField("inventoryType")
		private String inventoryType;
		/**
		 * 商品编码
		 */
		@ApiField("itemCode")
		private String itemCode;
		/**
		 * 仓储系统商品ID
		 */
		@ApiField("itemId")
		private String itemId;
		/**
		 * 商品名称
		 */
		@ApiField("itemName")
		private String itemName;
		/**
		 * 入库单的行号
		 */
		@ApiField("orderLineNo")
		private String orderLineNo;
		/**
		 * 应收商品数量
		 */
		@ApiField("planQty")
		private Long planQty;
		/**
		 * 生产批号
		 */
		@ApiField("produceCode")
		private String produceCode;
		/**
		 * 商品生产日期(YYYY-MM-DD)
		 */
		@ApiField("productDate")
		private String productDate;
		/**
		 * 备注
		 */
		@ApiField("remark")
		private String remark;
	

	public Long getActualQty() {
			return this.actualQty;
		}
		public void setActualQty(Long actualQty) {
			this.actualQty = actualQty;
		}
		public String getBatchCode() {
			return this.batchCode;
		}
		public void setBatchCode(String batchCode) {
			this.batchCode = batchCode;
		}
		public String getExpireDate() {
			return this.expireDate;
		}
		public void setExpireDate(String expireDate) {
			this.expireDate = expireDate;
		}
		public String getInventoryType() {
			return this.inventoryType;
		}
		public void setInventoryType(String inventoryType) {
			this.inventoryType = inventoryType;
		}
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
		public String getItemName() {
			return this.itemName;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		public String getOrderLineNo() {
			return this.orderLineNo;
		}
		public void setOrderLineNo(String orderLineNo) {
			this.orderLineNo = orderLineNo;
		}
		public Long getPlanQty() {
			return this.planQty;
		}
		public void setPlanQty(Long planQty) {
			this.planQty = planQty;
		}
		public String getProduceCode() {
			return this.produceCode;
		}
		public void setProduceCode(String produceCode) {
			this.produceCode = produceCode;
		}
		public String getProductDate() {
			return this.productDate;
		}
		public void setProductDate(String productDate) {
			this.productDate = productDate;
		}
		public String getRemark() {
			return this.remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}

}



}

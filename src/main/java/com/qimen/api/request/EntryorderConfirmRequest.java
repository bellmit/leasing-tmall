package com.qimen.api.request;

import com.qimen.api.QimenRequest;
import com.qimen.api.response.EntryorderConfirmResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;
import java.util.Map;

/**
 * TOP API: taobao.qimen.entryorder.confirm request
 * 
 * @author top auto create
 * @since 1.0, 2016.11.25
 */
public class EntryorderConfirmRequest extends QimenRequest<EntryorderConfirmResponse> {
	
	

	/** 
	* 入库单信息
	 */
	private EntryOrder entryOrder;

	/** 
	* 扩展属性
	 */
	private Map extendProps;

	/**
	* 订单信息
	 */
	private List<OrderLine> orderLines;

	public void setEntryOrder(EntryOrder entryOrder) {
		this.entryOrder = entryOrder;
	}

	public EntryOrder getEntryOrder() {
		return this.entryOrder;
	}

	public void setExtendProps(Map extendProps) {
		this.extendProps = extendProps;
	}

	public Map getExtendProps() {
		return this.extendProps;
	}

	public void setOrderLines(List<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}

	public List<OrderLine> getOrderLines() {
		return this.orderLines;
	}

	public String getApiMethodName() {
		return "taobao.qimen.entryorder.confirm";
	}

	public Class<EntryorderConfirmResponse> getResponseClass() {
		return EntryorderConfirmResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
 * 入库单信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class EntryOrder {

	/**
		 * 支持出入库单多次收货(多次收货后确认时:0:表示入库单最终状态确认;1:表示入库单中间状态确认;每次入库传入的数量为增 量;特殊情况;同一入库单;如果先收到0;后又收到1;允许修改收货的数量)
		 */
		@ApiField("confirmType")
		private Long confirmType;
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
		 * 外部业务编码(消息ID;用于去重;ISV对于同一请求;分配一个唯一性的编码。用来保证因为网络等原因导致重复传输;请求 不会被重复处理)
		 */
		@ApiField("outBizCode")
		private String outBizCode;
		/**
		 * 货主编码
		 */
		@ApiField("ownerCode")
		private String ownerCode;
		/**
		 * 采购单号(当orderType=CGRK时使用)
		 */
		@ApiField("purchaseOrderCode")
		private String purchaseOrderCode;
		/**
		 * 备注
		 */
		@ApiField("remark")
		private String remark;
		/**
		 * 入库单状态(NEW-未开始处理;ACCEPT-仓库接单;PARTFULFILLED-部分收货完成;FULFILLED-收货完成;EXCEPTION-异 常;CANCELED-取消;CLOSED-关闭;REJECT-拒单;CANCELEDFAIL-取消失败;只传英文编码)
		 */
		@ApiField("status")
		private String status;
		/**
		 * 单据总行数(当单据需要分多个请求发送时;发送方需要将totalOrderLines填入;接收方收到后;根据实际接收到的 条数和 totalOrderLines进行比对;如果小于;则继续等待接收请求。如果等于;则表示该单据的所有请求发送完 成)
		 */
		@ApiField("totalOrderLines")
		private Long totalOrderLines;
		/**
		 * 仓库编码(统仓统配等无需ERP指定仓储编码的情况填OTHER)
		 */
		@ApiField("warehouseCode")
		private String warehouseCode;
	

	public Long getConfirmType() {
			return this.confirmType;
		}
		public void setConfirmType(Long confirmType) {
			this.confirmType = confirmType;
		}
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
		public String getOutBizCode() {
			return this.outBizCode;
		}
		public void setOutBizCode(String outBizCode) {
			this.outBizCode = outBizCode;
		}
		public String getOwnerCode() {
			return this.ownerCode;
		}
		public void setOwnerCode(String ownerCode) {
			this.ownerCode = ownerCode;
		}
		public String getPurchaseOrderCode() {
			return this.purchaseOrderCode;
		}
		public void setPurchaseOrderCode(String purchaseOrderCode) {
			this.purchaseOrderCode = purchaseOrderCode;
		}
		public String getRemark() {
			return this.remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}
		public String getStatus() {
			return this.status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public Long getTotalOrderLines() {
			return this.totalOrderLines;
		}
		public void setTotalOrderLines(Long totalOrderLines) {
			this.totalOrderLines = totalOrderLines;
		}
		public String getWarehouseCode() {
			return this.warehouseCode;
		}
		public void setWarehouseCode(String warehouseCode) {
			this.warehouseCode = warehouseCode;
		}

}

	/**
 * 批次信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Batch {

	/**
		 * 实收数量(要求batchs节点下所有的实收数量之和等于orderline中的实收数量)
		 */
		@ApiField("actualQty")
		private Long actualQty;
		/**
		 * 批次编号
		 */
		@ApiField("batchCode")
		private String batchCode;
		/**
		 * 过期日期(YYYY-MM-DD)
		 */
		@ApiField("expireDate")
		private String expireDate;
		/**
		 * 库存类型(ZP=正品;CC=残次;JS=机损;XS= 箱损;默认为ZP;)
		 */
		@ApiField("inventoryType")
		private String inventoryType;
		/**
		 * 生产批号
		 */
		@ApiField("produceCode")
		private String produceCode;
		/**
		 * 生产日期(YYYY-MM-DD)
		 */
		@ApiField("productDate")
		private String productDate;
	

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

}

	/**
 * 订单信息
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
		 * 批次信息
		 */
		@ApiListField("batchs")
		@ApiField("batch")
		private List<Batch> batchs;
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
		 * 外部业务编码(消息ID;用于去重;当单据需要分批次发送时使用)
		 */
		@ApiField("outBizCode")
		private String outBizCode;
		/**
		 * 货主编码
		 */
		@ApiField("ownerCode")
		private String ownerCode;
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
		public List<Batch> getBatchs() {
			return this.batchs;
		}
		public void setBatchs(List<Batch> batchs) {
			this.batchs = batchs;
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
		public String getOutBizCode() {
			return this.outBizCode;
		}
		public void setOutBizCode(String outBizCode) {
			this.outBizCode = outBizCode;
		}
		public String getOwnerCode() {
			return this.ownerCode;
		}
		public void setOwnerCode(String ownerCode) {
			this.ownerCode = ownerCode;
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

}


}
package com.qimen.api.response;

import com.qimen.api.QimenResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: taobao.qimen.deliveryorder.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class DeliveryorderQueryResponse extends QimenResponse {

	private static final long serialVersionUID = 5458122598829636923L;

	/** 
	 * 发货单信息
	 */
	@ApiField("deliveryOrder")
	private DeliveryOrder deliveryOrder;

	/** 
	 * 单据列表
	 */
	@ApiListField("orderLines")
	@ApiField("orderLine")
	private List<OrderLine> orderLines;

	/** 
	 * 包裹信息
	 */
	@ApiListField("packages")
	@ApiField("package")
	private List<Package> packages;

	/** 
	 * orderLines总条数
	 */
	@ApiField("totalLines")
	private Long totalLines;


	public void setDeliveryOrder(DeliveryOrder deliveryOrder) {
		this.deliveryOrder = deliveryOrder;
	}
	public DeliveryOrder getDeliveryOrder( ) {
		return this.deliveryOrder;
	}

	public void setOrderLines(List<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}
	public List<OrderLine> getOrderLines( ) {
		return this.orderLines;
	}

	public void setPackages(List<Package> packages) {
		this.packages = packages;
	}
	public List<Package> getPackages( ) {
		return this.packages;
	}

	public void setTotalLines(Long totalLines) {
		this.totalLines = totalLines;
	}
	public Long getTotalLines( ) {
		return this.totalLines;
	}
	
	/**
 * 商品列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Item {

	/**
		 * 金额
		 */
		@ApiField("amount")
		private String amount;
		/**
		 * 商品名称
		 */
		@ApiField("itemName")
		private String itemName;
		/**
		 * 商品单价
		 */
		@ApiField("price")
		private String price;
		/**
		 * 数量
		 */
		@ApiField("quantity")
		private Long quantity;
		/**
		 * 商品单位
		 */
		@ApiField("unit")
		private String unit;
	

	public String getAmount() {
			return this.amount;
		}
		public void setAmount(String amount) {
			this.amount = amount;
		}
		public String getItemName() {
			return this.itemName;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		public String getPrice() {
			return this.price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		public Long getQuantity() {
			return this.quantity;
		}
		public void setQuantity(Long quantity) {
			this.quantity = quantity;
		}
		public String getUnit() {
			return this.unit;
		}
		public void setUnit(String unit) {
			this.unit = unit;
		}

}

	/**
 * 发货详情
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Detail {

	/**
		 * 商品列表
		 */
		@ApiListField("items")
		@ApiField("item")
		private List<Item> items;
	

	public List<Item> getItems() {
			return this.items;
		}
		public void setItems(List<Item> items) {
			this.items = items;
		}

}

	/**
 * 发票信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Invoice {

	/**
		 * 发票金额
		 */
		@ApiField("amount")
		private String amount;
		/**
		 * 发票代码(纳税企业的标识)
		 */
		@ApiField("code")
		private String code;
		/**
		 * 发票内容
		 */
		@ApiField("content")
		private String content;
		/**
		 * 发货详情
		 */
		@ApiField("detail")
		private Detail detail;
		/**
		 * 发票抬头
		 */
		@ApiField("header")
		private String header;
		/**
		 * 发票号码(纳税企业内部的发票号)
		 */
		@ApiField("number")
		private String number;
	

	public String getAmount() {
			return this.amount;
		}
		public void setAmount(String amount) {
			this.amount = amount;
		}
		public String getCode() {
			return this.code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getContent() {
			return this.content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public Detail getDetail() {
			return this.detail;
		}
		public void setDetail(Detail detail) {
			this.detail = detail;
		}
		public String getHeader() {
			return this.header;
		}
		public void setHeader(String header) {
			this.header = header;
		}
		public String getNumber() {
			return this.number;
		}
		public void setNumber(String number) {
			this.number = number;
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
		 * 支持出库单多次发货(多次发货后确认时;0表示发货单最终状态确认;1表示发货单中间状态确 认)
		 */
		@ApiField("confirmType")
		private Long confirmType;
		/**
		 * 出库单号
		 */
		@ApiField("deliveryOrderCode")
		private String deliveryOrderCode;
		/**
		 * 仓储系统出库单号
		 */
		@ApiField("deliveryOrderId")
		private String deliveryOrderId;
		/**
		 * 发票信息
		 */
		@ApiListField("invoices")
		@ApiField("invoice")
		private List<Invoice> invoices;
		/**
		 * 当前状态操作时间(YYYY-MM-DD HH:MM:SS)
		 */
		@ApiField("operateTime")
		private String operateTime;
		/**
		 * 当前状态操作员编码
		 */
		@ApiField("operatorCode")
		private String operatorCode;
		/**
		 * 当前状态操作员姓名
		 */
		@ApiField("operatorName")
		private String operatorName;
		/**
		 * 订单完成时间(YYYY-MM-DD HH:MM:SS)
		 */
		@ApiField("orderConfirmTime")
		private String orderConfirmTime;
		/**
		 * 出库单类型(JYCK=一般交易出库;HHCK=换货出库;BFCK=补发出库;QTCK=其他出库单)
		 */
		@ApiField("orderType")
		private String orderType;
		/**
		 * 外部业务编码(消息ID;用于去重;ISV对于同一请求;分配一个唯一性的编码。用来保证因为网络等原因导致重复传输;请 求 不会被重复处理;条件必填;条件为一单需要多次确认时)
		 */
		@ApiField("outBizCode")
		private String outBizCode;
		/**
		 * 出库单状态(NEW-未开始处理;ACCEPT-仓库接单;PARTDELIVERED-部分发货完成;DELIVERED-发货完成;EXCEPTION-异 常;CANCELED-取消;CLOSED-关闭;REJECT-拒单;CANCELEDFAIL-取消失败;只传英文编码)
		 */
		@ApiField("status")
		private String status;
		/**
		 * 仓储费用
		 */
		@ApiField("storageFee")
		private String storageFee;
		/**
		 * 仓库编码
		 */
		@ApiField("warehouseCode")
		private String warehouseCode;
	

	public Long getConfirmType() {
			return this.confirmType;
		}
		public void setConfirmType(Long confirmType) {
			this.confirmType = confirmType;
		}
		public String getDeliveryOrderCode() {
			return this.deliveryOrderCode;
		}
		public void setDeliveryOrderCode(String deliveryOrderCode) {
			this.deliveryOrderCode = deliveryOrderCode;
		}
		public String getDeliveryOrderId() {
			return this.deliveryOrderId;
		}
		public void setDeliveryOrderId(String deliveryOrderId) {
			this.deliveryOrderId = deliveryOrderId;
		}
		public List<Invoice> getInvoices() {
			return this.invoices;
		}
		public void setInvoices(List<Invoice> invoices) {
			this.invoices = invoices;
		}
		public String getOperateTime() {
			return this.operateTime;
		}
		public void setOperateTime(String operateTime) {
			this.operateTime = operateTime;
		}
		public String getOperatorCode() {
			return this.operatorCode;
		}
		public void setOperatorCode(String operatorCode) {
			this.operatorCode = operatorCode;
		}
		public String getOperatorName() {
			return this.operatorName;
		}
		public void setOperatorName(String operatorName) {
			this.operatorName = operatorName;
		}
		public String getOrderConfirmTime() {
			return this.orderConfirmTime;
		}
		public void setOrderConfirmTime(String orderConfirmTime) {
			this.orderConfirmTime = orderConfirmTime;
		}
		public String getOrderType() {
			return this.orderType;
		}
		public void setOrderType(String orderType) {
			this.orderType = orderType;
		}
		public String getOutBizCode() {
			return this.outBizCode;
		}
		public void setOutBizCode(String outBizCode) {
			this.outBizCode = outBizCode;
		}
		public String getStatus() {
			return this.status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getStorageFee() {
			return this.storageFee;
		}
		public void setStorageFee(String storageFee) {
			this.storageFee = storageFee;
		}
		public String getWarehouseCode() {
			return this.warehouseCode;
		}
		public void setWarehouseCode(String warehouseCode) {
			this.warehouseCode = warehouseCode;
		}

}

	/**
 * 包材信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class PackageMaterial {

	/**
		 * 包材的数量
		 */
		@ApiField("quantity")
		private Long quantity;
		/**
		 * 包材型号
		 */
		@ApiField("type")
		private String type;
	

	public Long getQuantity() {
			return this.quantity;
		}
		public void setQuantity(Long quantity) {
			this.quantity = quantity;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}

}

	/**
 * 包裹信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Package {

	/**
		 * 运单号
		 */
		@ApiField("expressCode")
		private String expressCode;
		/**
		 * 包裹高度(单位：厘米)
		 */
		@ApiField("height")
		private String height;
		/**
		 * 发票号
		 */
		@ApiField("invoiceNo")
		private String invoiceNo;
		/**
		 * 商品列表
		 */
		@ApiListField("items")
		@ApiField("item")
		private List<Item> items;
		/**
		 * 包裹长度(单位：厘米)
		 */
		@ApiField("length")
		private String length;
		/**
		 * 物流公司编码(SF=顺丰、EMS=标准快递、EYB=经济快件、ZJS=宅急送、YTO=圆通、ZTO=中通 (ZTO)、HTKY=百世汇 通、 UC=优速、STO=申通、TTKDEX=天天快递、QFKD=全峰、FAST=快捷、POSTB=邮政小包、GTO=国通、YUNDA=韵达、JD=京东配送、DD=当当宅 配、 AMAZON=亚马逊物流、OTHER=其他;只传英文编码)
		 */
		@ApiField("logisticsCode")
		private String logisticsCode;
		/**
		 * 物流公司名称
		 */
		@ApiField("logisticsName")
		private String logisticsName;
		/**
		 * 包裹编号
		 */
		@ApiField("packageCode")
		private String packageCode;
		/**
		 * 包材信息
		 */
		@ApiListField("packageMaterialList")
		@ApiField("packageMaterial")
		private List<PackageMaterial> packageMaterialList;
		/**
		 * 包裹理论重量(单位：千克)
		 */
		@ApiField("theoreticalWeight")
		private String theoreticalWeight;
		/**
		 * 包裹体积(单位：升)
		 */
		@ApiField("volume")
		private String volume;
		/**
		 * 包裹重量(单位：千克)
		 */
		@ApiField("weight")
		private String weight;
		/**
		 * 包裹宽度(单位：厘米)
		 */
		@ApiField("width")
		private String width;
	

	public String getExpressCode() {
			return this.expressCode;
		}
		public void setExpressCode(String expressCode) {
			this.expressCode = expressCode;
		}
		public String getHeight() {
			return this.height;
		}
		public void setHeight(String height) {
			this.height = height;
		}
		public String getInvoiceNo() {
			return this.invoiceNo;
		}
		public void setInvoiceNo(String invoiceNo) {
			this.invoiceNo = invoiceNo;
		}
		public List<Item> getItems() {
			return this.items;
		}
		public void setItems(List<Item> items) {
			this.items = items;
		}
		public String getLength() {
			return this.length;
		}
		public void setLength(String length) {
			this.length = length;
		}
		public String getLogisticsCode() {
			return this.logisticsCode;
		}
		public void setLogisticsCode(String logisticsCode) {
			this.logisticsCode = logisticsCode;
		}
		public String getLogisticsName() {
			return this.logisticsName;
		}
		public void setLogisticsName(String logisticsName) {
			this.logisticsName = logisticsName;
		}
		public String getPackageCode() {
			return this.packageCode;
		}
		public void setPackageCode(String packageCode) {
			this.packageCode = packageCode;
		}
		public List<PackageMaterial> getPackageMaterialList() {
			return this.packageMaterialList;
		}
		public void setPackageMaterialList(List<PackageMaterial> packageMaterialList) {
			this.packageMaterialList = packageMaterialList;
		}
		public String getTheoreticalWeight() {
			return this.theoreticalWeight;
		}
		public void setTheoreticalWeight(String theoreticalWeight) {
			this.theoreticalWeight = theoreticalWeight;
		}
		public String getVolume() {
			return this.volume;
		}
		public void setVolume(String volume) {
			this.volume = volume;
		}
		public String getWeight() {
			return this.weight;
		}
		public void setWeight(String weight) {
			this.weight = weight;
		}
		public String getWidth() {
			return this.width;
		}
		public void setWidth(String width) {
			this.width = width;
		}

}

	/**
 * 批次列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Batch {

	/**
		 * 实发数量(要求batchs节点下所有的实发数量之和等于orderline中的实发数量)
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
		 * 库存类型(ZP=正品;CC=残次;JS=机损;XS=箱损;ZT=在途库存;默认为查所有类型的库存)
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
 * 单据列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class OrderLine {

	/**
		 * 实发商品数量
		 */
		@ApiField("actualQty")
		private Long actualQty;
		/**
		 * 批次编号
		 */
		@ApiField("batchCode")
		private String batchCode;
		/**
		 * 批次列表
		 */
		@ApiListField("batchs")
		@ApiField("batch")
		private List<Batch> batchs;
		/**
		 * 过期日期(YYYY-MM-DD)
		 */
		@ApiField("expireDate")
		private String expireDate;
		/**
		 * 交易平台商品编码
		 */
		@ApiField("extCode")
		private String extCode;
		/**
		 * 库存类型(ZP=正品;CC=残次;JS=机损;XS=箱损;ZT=在途库存;默认为查所有类型的库存)
		 */
		@ApiField("inventoryType")
		private String inventoryType;
		/**
		 * 商品编码
		 */
		@ApiField("itemCode")
		private String itemCode;
		/**
		 * 商品仓储系统编码
		 */
		@ApiField("itemId")
		private String itemId;
		/**
		 * 商品名称
		 */
		@ApiField("itemName")
		private String itemName;
		/**
		 * 单据行号
		 */
		@ApiField("orderLineNo")
		private String orderLineNo;
		/**
		 * 平台交易订单编码
		 */
		@ApiField("orderSourceCode")
		private String orderSourceCode;
		/**
		 * 货主编码
		 */
		@ApiField("ownerCode")
		private String ownerCode;
		/**
		 * 应发商品数量
		 */
		@ApiField("planQty")
		private Long planQty;
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
		/**
		 * 商品的二维码(类似电子产品的SN码;用来进行商品的溯源;多个二维码之间用分号;隔开)
		 */
		@ApiField("qrCode")
		private String qrCode;
		/**
		 * 平台交易子订单编码
		 */
		@ApiField("subSourceCode")
		private String subSourceCode;
	

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
		public String getExtCode() {
			return this.extCode;
		}
		public void setExtCode(String extCode) {
			this.extCode = extCode;
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
		public String getOrderSourceCode() {
			return this.orderSourceCode;
		}
		public void setOrderSourceCode(String orderSourceCode) {
			this.orderSourceCode = orderSourceCode;
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
		public String getQrCode() {
			return this.qrCode;
		}
		public void setQrCode(String qrCode) {
			this.qrCode = qrCode;
		}
		public String getSubSourceCode() {
			return this.subSourceCode;
		}
		public void setSubSourceCode(String subSourceCode) {
			this.subSourceCode = subSourceCode;
		}

}



}

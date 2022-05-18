package com.qimen.api.request;

import com.qimen.api.QimenRequest;
import com.qimen.api.response.ReturnorderConfirmResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;
import java.util.Map;

/**
 * TOP API: taobao.qimen.returnorder.confirm request
 * 
 * @author top auto create
 * @since 1.0, 2017.04.27
 */
public class ReturnorderConfirmRequest extends QimenRequest<ReturnorderConfirmResponse> {
	
	

	/** 
	* 扩展属性
	 */
	private Map extendProps;

	/**
	* 订单信息
	 */
	private List<OrderLine> orderLines;

	/**
	* 退货单信息
	 */
	private ReturnOrder returnOrder;

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

	public void setReturnOrder(ReturnOrder returnOrder) {
		this.returnOrder = returnOrder;
	}

	public ReturnOrder getReturnOrder() {
		return this.returnOrder;
	}

	public String getApiMethodName() {
		return "taobao.qimen.returnorder.confirm";
	}

	public Class<ReturnorderConfirmResponse> getResponseClass() {
		return ReturnorderConfirmResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
 * 发件人信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class SenderInfo {

	/**
		 * 区域
		 */
		@ApiField("area")
		private String area;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("birthDate")
		private String birthDate;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("carNo")
		private String carNo;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("career")
		private String career;
		/**
		 * 城市
		 */
		@ApiField("city")
		private String city;
		/**
		 * 公司名称
		 */
		@ApiField("company")
		private String company;
		/**
		 * 国家二字码
		 */
		@ApiField("countryCode")
		private String countryCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("countryCodeCiq")
		private String countryCodeCiq;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("countryCodeCus")
		private String countryCodeCus;
		/**
		 * 详细地址
		 */
		@ApiField("detailAddress")
		private String detailAddress;
		/**
		 * 电子邮箱
		 */
		@ApiField("email")
		private String email;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("fax")
		private String fax;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("gender")
		private String gender;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("id")
		private String id;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("idNumber")
		private String idNumber;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("idType")
		private String idType;
		/**
		 * 移动电话
		 */
		@ApiField("mobile")
		private String mobile;
		/**
		 * 姓名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("nick")
		private String nick;
		/**
		 * 省份
		 */
		@ApiField("province")
		private String province;
		/**
		 * 固定电话
		 */
		@ApiField("tel")
		private String tel;
		/**
		 * 村镇
		 */
		@ApiField("town")
		private String town;
		/**
		 * 邮编
		 */
		@ApiField("zipCode")
		private String zipCode;
	

	public String getArea() {
			return this.area;
		}
		public void setArea(String area) {
			this.area = area;
		}
		public String getBirthDate() {
			return this.birthDate;
		}
		public void setBirthDate(String birthDate) {
			this.birthDate = birthDate;
		}
		public String getCarNo() {
			return this.carNo;
		}
		public void setCarNo(String carNo) {
			this.carNo = carNo;
		}
		public String getCareer() {
			return this.career;
		}
		public void setCareer(String career) {
			this.career = career;
		}
		public String getCity() {
			return this.city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getCompany() {
			return this.company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		public String getCountryCode() {
			return this.countryCode;
		}
		public void setCountryCode(String countryCode) {
			this.countryCode = countryCode;
		}
		public String getCountryCodeCiq() {
			return this.countryCodeCiq;
		}
		public void setCountryCodeCiq(String countryCodeCiq) {
			this.countryCodeCiq = countryCodeCiq;
		}
		public String getCountryCodeCus() {
			return this.countryCodeCus;
		}
		public void setCountryCodeCus(String countryCodeCus) {
			this.countryCodeCus = countryCodeCus;
		}
		public String getDetailAddress() {
			return this.detailAddress;
		}
		public void setDetailAddress(String detailAddress) {
			this.detailAddress = detailAddress;
		}
		public String getEmail() {
			return this.email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getFax() {
			return this.fax;
		}
		public void setFax(String fax) {
			this.fax = fax;
		}
		public String getGender() {
			return this.gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getId() {
			return this.id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getIdNumber() {
			return this.idNumber;
		}
		public void setIdNumber(String idNumber) {
			this.idNumber = idNumber;
		}
		public String getIdType() {
			return this.idType;
		}
		public void setIdType(String idType) {
			this.idType = idType;
		}
		public String getMobile() {
			return this.mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getNick() {
			return this.nick;
		}
		public void setNick(String nick) {
			this.nick = nick;
		}
		public String getProvince() {
			return this.province;
		}
		public void setProvince(String province) {
			this.province = province;
		}
		public String getTel() {
			return this.tel;
		}
		public void setTel(String tel) {
			this.tel = tel;
		}
		public String getTown() {
			return this.town;
		}
		public void setTown(String town) {
			this.town = town;
		}
		public String getZipCode() {
			return this.zipCode;
		}
		public void setZipCode(String zipCode) {
			this.zipCode = zipCode;
		}

}

	/**
 * 退货单信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class ReturnOrder {

	/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("actionType")
		private String actionType;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("buyerNick")
		private String buyerNick;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("earliestArrivalTime")
		private String earliestArrivalTime;
		/**
		 * 运单号
		 */
		@ApiField("expressCode")
		private String expressCode;
		/**
		 * 物流公司编码(SF=顺丰、EMS=标准快递、EYB=经济快件、ZJS=宅急送、YTO=圆通、ZTO=中通(ZTO)、HTKY=百世汇通、 UC=优速、STO=申通、TTKDEX=天天快递、QFKD=全峰、FAST=快捷、POSTB=邮政小包、GTO=国通、YUNDA=韵达、JD=京东配送、DD=当当宅配、 AMAZON=亚马逊物流、OTHER=其他;只传英文编码)
		 */
		@ApiField("logisticsCode")
		private String logisticsCode;
		/**
		 * 物流公司名称
		 */
		@ApiField("logisticsName")
		private String logisticsName;
		/**
		 * 确认入库时间(YYYY-MM-DD HH:MM:SS)
		 */
		@ApiField("orderConfirmTime")
		private String orderConfirmTime;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("orderFlag")
		private String orderFlag;
		/**
		 * 单据类型(THRK=退货入库;HHRK=换货入库;只传英文编码)
		 */
		@ApiField("orderType")
		private String orderType;
		/**
		 * 外部业务编码(消息ID;用于去重;ISV对于同一请求;分配一个唯一性的编码。用来保证因为网络等原因导致重复传输;请求不会 被重复处理)
		 */
		@ApiField("outBizCode")
		private String outBizCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("ownerCode")
		private String ownerCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("planArrivalTime")
		private String planArrivalTime;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("preDeliveryOrderCode")
		private String preDeliveryOrderCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("preDeliveryOrderId")
		private String preDeliveryOrderId;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("refOrderCode")
		private String refOrderCode;
		/**
		 * 备注
		 */
		@ApiField("remark")
		private String remark;
		/**
		 * ERP的退货入库单编码
		 */
		@ApiField("returnOrderCode")
		private String returnOrderCode;
		/**
		 * 仓库系统订单编码
		 */
		@ApiField("returnOrderId")
		private String returnOrderId;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("returnOrderStatus")
		private String returnOrderStatus;
		/**
		 * 退货原因
		 */
		@ApiField("returnReason")
		private String returnReason;
		/**
		 * 发件人信息
		 */
		@ApiField("senderInfo")
		private SenderInfo senderInfo;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("sourceOrderCode")
		private String sourceOrderCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("supplierCode")
		private String supplierCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("supplierName")
		private String supplierName;
		/**
		 * 仓库编码(统仓统配等无需ERP指定仓储编码的情况填OTHER)
		 */
		@ApiField("warehouseCode")
		private String warehouseCode;
	

	public String getActionType() {
			return this.actionType;
		}
		public void setActionType(String actionType) {
			this.actionType = actionType;
		}
		public String getBuyerNick() {
			return this.buyerNick;
		}
		public void setBuyerNick(String buyerNick) {
			this.buyerNick = buyerNick;
		}
		public String getEarliestArrivalTime() {
			return this.earliestArrivalTime;
		}
		public void setEarliestArrivalTime(String earliestArrivalTime) {
			this.earliestArrivalTime = earliestArrivalTime;
		}
		public String getExpressCode() {
			return this.expressCode;
		}
		public void setExpressCode(String expressCode) {
			this.expressCode = expressCode;
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
		public String getOrderConfirmTime() {
			return this.orderConfirmTime;
		}
		public void setOrderConfirmTime(String orderConfirmTime) {
			this.orderConfirmTime = orderConfirmTime;
		}
		public String getOrderFlag() {
			return this.orderFlag;
		}
		public void setOrderFlag(String orderFlag) {
			this.orderFlag = orderFlag;
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
		public String getOwnerCode() {
			return this.ownerCode;
		}
		public void setOwnerCode(String ownerCode) {
			this.ownerCode = ownerCode;
		}
		public String getPlanArrivalTime() {
			return this.planArrivalTime;
		}
		public void setPlanArrivalTime(String planArrivalTime) {
			this.planArrivalTime = planArrivalTime;
		}
		public String getPreDeliveryOrderCode() {
			return this.preDeliveryOrderCode;
		}
		public void setPreDeliveryOrderCode(String preDeliveryOrderCode) {
			this.preDeliveryOrderCode = preDeliveryOrderCode;
		}
		public String getPreDeliveryOrderId() {
			return this.preDeliveryOrderId;
		}
		public void setPreDeliveryOrderId(String preDeliveryOrderId) {
			this.preDeliveryOrderId = preDeliveryOrderId;
		}
		public String getRefOrderCode() {
			return this.refOrderCode;
		}
		public void setRefOrderCode(String refOrderCode) {
			this.refOrderCode = refOrderCode;
		}
		public String getRemark() {
			return this.remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}
		public String getReturnOrderCode() {
			return this.returnOrderCode;
		}
		public void setReturnOrderCode(String returnOrderCode) {
			this.returnOrderCode = returnOrderCode;
		}
		public String getReturnOrderId() {
			return this.returnOrderId;
		}
		public void setReturnOrderId(String returnOrderId) {
			this.returnOrderId = returnOrderId;
		}
		public String getReturnOrderStatus() {
			return this.returnOrderStatus;
		}
		public void setReturnOrderStatus(String returnOrderStatus) {
			this.returnOrderStatus = returnOrderStatus;
		}
		public String getReturnReason() {
			return this.returnReason;
		}
		public void setReturnReason(String returnReason) {
			this.returnReason = returnReason;
		}
		public SenderInfo getSenderInfo() {
			return this.senderInfo;
		}
		public void setSenderInfo(SenderInfo senderInfo) {
			this.senderInfo = senderInfo;
		}
		public String getSourceOrderCode() {
			return this.sourceOrderCode;
		}
		public void setSourceOrderCode(String sourceOrderCode) {
			this.sourceOrderCode = sourceOrderCode;
		}
		public String getSupplierCode() {
			return this.supplierCode;
		}
		public void setSupplierCode(String supplierCode) {
			this.supplierCode = supplierCode;
		}
		public String getSupplierName() {
			return this.supplierName;
		}
		public void setSupplierName(String supplierName) {
			this.supplierName = supplierName;
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
		 * 库存类型(ZP=正品;CC=残次;JS=机损;XS=箱损;默认为ZP)
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
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("quantity")
		private String quantity;
	

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
		public String getQuantity() {
			return this.quantity;
		}
		public void setQuantity(String quantity) {
			this.quantity = quantity;
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
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("actualPrice")
		private String actualPrice;
		/**
		 * 实收商品数量
		 */
		@ApiField("actualQty")
		private String actualQty;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("amount")
		private String amount;
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
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("color")
		private String color;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("deliveryOrderId")
		private String deliveryOrderId;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("discount")
		private String discount;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("discountAmount")
		private String discountAmount;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("discountPrice")
		private String discountPrice;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("exceptionQty")
		private String exceptionQty;
		/**
		 * 过期日期(YYYY-MM-DD)
		 */
		@ApiField("expireDate")
		private String expireDate;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("extCode")
		private String extCode;
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
		 * 仓储系统商品编码(条件为提供后端（仓储系统）商品编码的仓储系统)
		 */
		@ApiField("itemId")
		private String itemId;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("itemName")
		private String itemName;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("locationCode")
		private String locationCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("moveInLocation")
		private String moveInLocation;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("moveOutLocation")
		private String moveOutLocation;
		/**
		 * 单据行号
		 */
		@ApiField("orderLineNo")
		private String orderLineNo;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("orderSourceCode")
		private String orderSourceCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("outBizCode")
		private String outBizCode;
		/**
		 * 货主编码
		 */
		@ApiField("ownerCode")
		private String ownerCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("payNo")
		private String payNo;
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
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("productCode")
		private String productCode;
		/**
		 * 生产日期(YYYY-MM-DD)
		 */
		@ApiField("productDate")
		private String productDate;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("purchasePrice")
		private String purchasePrice;
		/**
		 * 商品的二维码(类似电子产品的SN码;用来进行商品的溯源;多个二维码之间用分号;隔开)
		 */
		@ApiField("qrCode")
		private String qrCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("quantity")
		private String quantity;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("referencePrice")
		private String referencePrice;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("retailPrice")
		private String retailPrice;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("settlementAmount")
		private String settlementAmount;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("size")
		private String size;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("skuProperty")
		private String skuProperty;
		/**
		 * 交易平台订单
		 */
		@ApiField("sourceOrderCode")
		private String sourceOrderCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("standardAmount")
		private String standardAmount;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("standardPrice")
		private String standardPrice;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("status")
		private String status;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("stockInQty")
		private String stockInQty;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("stockOutQty")
		private String stockOutQty;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("subDeliveryOrderId")
		private String subDeliveryOrderId;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("subSourceCode")
		private String subSourceCode;
		/**
		 * 交易平台子订单编码
		 */
		@ApiField("subSourceOrderCode")
		private String subSourceOrderCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("taobaoItemCode")
		private String taobaoItemCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("warehouseCode")
		private String warehouseCode;
	

	public String getActualPrice() {
			return this.actualPrice;
		}
		public void setActualPrice(String actualPrice) {
			this.actualPrice = actualPrice;
		}
		public String getActualQty() {
			return this.actualQty;
		}
		public void setActualQty(String actualQty) {
			this.actualQty = actualQty;
		}
		public String getAmount() {
			return this.amount;
		}
		public void setAmount(String amount) {
			this.amount = amount;
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
		public String getColor() {
			return this.color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getDeliveryOrderId() {
			return this.deliveryOrderId;
		}
		public void setDeliveryOrderId(String deliveryOrderId) {
			this.deliveryOrderId = deliveryOrderId;
		}
		public String getDiscount() {
			return this.discount;
		}
		public void setDiscount(String discount) {
			this.discount = discount;
		}
		public String getDiscountAmount() {
			return this.discountAmount;
		}
		public void setDiscountAmount(String discountAmount) {
			this.discountAmount = discountAmount;
		}
		public String getDiscountPrice() {
			return this.discountPrice;
		}
		public void setDiscountPrice(String discountPrice) {
			this.discountPrice = discountPrice;
		}
		public String getExceptionQty() {
			return this.exceptionQty;
		}
		public void setExceptionQty(String exceptionQty) {
			this.exceptionQty = exceptionQty;
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
		public String getLocationCode() {
			return this.locationCode;
		}
		public void setLocationCode(String locationCode) {
			this.locationCode = locationCode;
		}
		public String getMoveInLocation() {
			return this.moveInLocation;
		}
		public void setMoveInLocation(String moveInLocation) {
			this.moveInLocation = moveInLocation;
		}
		public String getMoveOutLocation() {
			return this.moveOutLocation;
		}
		public void setMoveOutLocation(String moveOutLocation) {
			this.moveOutLocation = moveOutLocation;
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
		public String getPayNo() {
			return this.payNo;
		}
		public void setPayNo(String payNo) {
			this.payNo = payNo;
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
		public String getProductCode() {
			return this.productCode;
		}
		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}
		public String getProductDate() {
			return this.productDate;
		}
		public void setProductDate(String productDate) {
			this.productDate = productDate;
		}
		public String getPurchasePrice() {
			return this.purchasePrice;
		}
		public void setPurchasePrice(String purchasePrice) {
			this.purchasePrice = purchasePrice;
		}
		public String getQrCode() {
			return this.qrCode;
		}
		public void setQrCode(String qrCode) {
			this.qrCode = qrCode;
		}
		public String getQuantity() {
			return this.quantity;
		}
		public void setQuantity(String quantity) {
			this.quantity = quantity;
		}
		public String getReferencePrice() {
			return this.referencePrice;
		}
		public void setReferencePrice(String referencePrice) {
			this.referencePrice = referencePrice;
		}
		public String getRetailPrice() {
			return this.retailPrice;
		}
		public void setRetailPrice(String retailPrice) {
			this.retailPrice = retailPrice;
		}
		public String getSettlementAmount() {
			return this.settlementAmount;
		}
		public void setSettlementAmount(String settlementAmount) {
			this.settlementAmount = settlementAmount;
		}
		public String getSize() {
			return this.size;
		}
		public void setSize(String size) {
			this.size = size;
		}
		public String getSkuProperty() {
			return this.skuProperty;
		}
		public void setSkuProperty(String skuProperty) {
			this.skuProperty = skuProperty;
		}
		public String getSourceOrderCode() {
			return this.sourceOrderCode;
		}
		public void setSourceOrderCode(String sourceOrderCode) {
			this.sourceOrderCode = sourceOrderCode;
		}
		public String getStandardAmount() {
			return this.standardAmount;
		}
		public void setStandardAmount(String standardAmount) {
			this.standardAmount = standardAmount;
		}
		public String getStandardPrice() {
			return this.standardPrice;
		}
		public void setStandardPrice(String standardPrice) {
			this.standardPrice = standardPrice;
		}
		public String getStatus() {
			return this.status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getStockInQty() {
			return this.stockInQty;
		}
		public void setStockInQty(String stockInQty) {
			this.stockInQty = stockInQty;
		}
		public String getStockOutQty() {
			return this.stockOutQty;
		}
		public void setStockOutQty(String stockOutQty) {
			this.stockOutQty = stockOutQty;
		}
		public String getSubDeliveryOrderId() {
			return this.subDeliveryOrderId;
		}
		public void setSubDeliveryOrderId(String subDeliveryOrderId) {
			this.subDeliveryOrderId = subDeliveryOrderId;
		}
		public String getSubSourceCode() {
			return this.subSourceCode;
		}
		public void setSubSourceCode(String subSourceCode) {
			this.subSourceCode = subSourceCode;
		}
		public String getSubSourceOrderCode() {
			return this.subSourceOrderCode;
		}
		public void setSubSourceOrderCode(String subSourceOrderCode) {
			this.subSourceOrderCode = subSourceOrderCode;
		}
		public String getTaobaoItemCode() {
			return this.taobaoItemCode;
		}
		public void setTaobaoItemCode(String taobaoItemCode) {
			this.taobaoItemCode = taobaoItemCode;
		}
		public String getWarehouseCode() {
			return this.warehouseCode;
		}
		public void setWarehouseCode(String warehouseCode) {
			this.warehouseCode = warehouseCode;
		}

}


}
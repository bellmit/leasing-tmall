package com.qimen.api.request;

import com.qimen.api.QimenRequest;
import com.qimen.api.response.DeliveryorderBatchcreateResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;
import java.util.Map;

/**
 * TOP API: taobao.qimen.deliveryorder.batchcreate request
 * 
 * @author top auto create
 * @since 1.0, 2017.04.28
 */
public class DeliveryorderBatchcreateRequest extends QimenRequest<DeliveryorderBatchcreateResponse> {
	
	

	/** 
	* 扩展属性
	 */
	private Map extendProps;

	/**
	* 订单信息
	 */
	private List<Order> orders;

	public void setExtendProps(Map extendProps) {
		this.extendProps = extendProps;
	}

	public Map getExtendProps() {
		return this.extendProps;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public List<Order> getOrders() {
		return this.orders;
	}

	public String getApiMethodName() {
		return "taobao.qimen.deliveryorder.batchcreate";
	}

	public Class<DeliveryorderBatchcreateResponse> getResponseClass() {
		return DeliveryorderBatchcreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
 * 发货要求
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class DeliveryRequirements {

	/**
		 * 发货服务类型(PTPS:普通配送;LLPS:冷链配送;HBP:环保配)
		 */
		@ApiField("deliveryType")
		private String deliveryType;
		/**
		 * 要求送达日期(YYYY-MM-DD)
		 */
		@ApiField("scheduleDay")
		private String scheduleDay;
		/**
		 * 投递时间范围要求(结束时间;格式：HH:MM:SS)
		 */
		@ApiField("scheduleEndTime")
		private String scheduleEndTime;
		/**
		 * 投递时间范围要求(开始时间;格式：HH:MM:SS)
		 */
		@ApiField("scheduleStartTime")
		private String scheduleStartTime;
		/**
		 * 投递时延要求(1=工作日;2=节假日;101=当日达;102=次晨达;103=次日达;104= 预约 达)
		 */
		@ApiField("scheduleType")
		private Long scheduleType;
	

	public String getDeliveryType() {
			return this.deliveryType;
		}
		public void setDeliveryType(String deliveryType) {
			this.deliveryType = deliveryType;
		}
		public String getScheduleDay() {
			return this.scheduleDay;
		}
		public void setScheduleDay(String scheduleDay) {
			this.scheduleDay = scheduleDay;
		}
		public String getScheduleEndTime() {
			return this.scheduleEndTime;
		}
		public void setScheduleEndTime(String scheduleEndTime) {
			this.scheduleEndTime = scheduleEndTime;
		}
		public String getScheduleStartTime() {
			return this.scheduleStartTime;
		}
		public void setScheduleStartTime(String scheduleStartTime) {
			this.scheduleStartTime = scheduleStartTime;
		}
		public Long getScheduleType() {
			return this.scheduleType;
		}
		public void setScheduleType(Long scheduleType) {
			this.scheduleType = scheduleType;
		}

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
 * 收件人信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class ReceiverInfo {

	/**
		 * 区域
		 */
		@ApiField("area")
		private String area;
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
		 * 收件人证件号码
		 */
		@ApiField("idNumber")
		private String idNumber;
		/**
		 * 收件人证件类型(1-身份证、2-军官证、3-护照、4-其他)
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
 * 订单详情
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
		 * 发票总金额(填写的条件是:invoiceFlag为Y)
		 */
		@ApiField("amount")
		private String amount;
		/**
		 * 发票内容(不推荐使用)
		 */
		@ApiField("content")
		private String content;
		/**
		 * 订单详情
		 */
		@ApiField("detail")
		private Detail detail;
		/**
		 * 发票抬头(填写的条件是:invoiceFlag为Y)
		 */
		@ApiField("header")
		private String header;
		/**
		 * 发票类型(INVOICE=普通发票;VINVOICE=增值税普通发票;EVINVOICE=电子增票;填写的 条件 是:invoiceFlag为Y)
		 */
		@ApiField("type")
		private String type;
	

	public String getAmount() {
			return this.amount;
		}
		public void setAmount(String amount) {
			this.amount = amount;
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
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}

}

	/**
 * 保险信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Insurance {

	/**
		 * 保险金额
		 */
		@ApiField("amount")
		private String amount;
		/**
		 * 保险类型
		 */
		@ApiField("type")
		private String type;
	

	public String getAmount() {
			return this.amount;
		}
		public void setAmount(String amount) {
			this.amount = amount;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
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
		 * 应收金额(消费者还需要支付多少--货到付款时消费者还需要支付多少约定使用这个字 段;单位元 )
		 */
		@ApiField("arAmount")
		private String arAmount;
		/**
		 * 买家留言
		 */
		@ApiField("buyerMessage")
		private String buyerMessage;
		/**
		 * 买家昵称
		 */
		@ApiField("buyerNick")
		private String buyerNick;
		/**
		 * 发货单创建时间(YYYY-MM-DD HH:MM:SS)
		 */
		@ApiField("createTime")
		private String createTime;
		/**
		 * 出库单号
		 */
		@ApiField("deliveryOrderCode")
		private String deliveryOrderCode;
		/**
		 * 发货要求
		 */
		@ApiField("deliveryRequirements")
		private DeliveryRequirements deliveryRequirements;
		/**
		 * 订单折扣金额(元)
		 */
		@ApiField("discountAmount")
		private String discountAmount;
		/**
		 * 运单号
		 */
		@ApiField("expressCode")
		private String expressCode;
		/**
		 * 快递费用(元)
		 */
		@ApiField("freight")
		private String freight;
		/**
		 * 已收金额(消费者已经支付多少;单位元)
		 */
		@ApiField("gotAmount")
		private String gotAmount;
		/**
		 * 保险信息
		 */
		@ApiField("insurance")
		private Insurance insurance;
		/**
		 * 是否需要保险(Y/N;默认为N)
		 */
		@ApiField("insuranceFlag")
		private String insuranceFlag;
		/**
		 * 是否需要发票(Y/N;默认为N)
		 */
		@ApiField("invoiceFlag")
		private String invoiceFlag;
		/**
		 * 发票信息
		 */
		@ApiListField("invoices")
		@ApiField("invoice")
		private List<Invoice> invoices;
		/**
		 * 是否紧急(Y/N;默认为N)
		 */
		@ApiField("isUrgency")
		private String isUrgency;
		/**
		 * 商品总金额(元)
		 */
		@ApiField("itemAmount")
		private String itemAmount;
		/**
		 * 快递区域编码
		 */
		@ApiField("logisticsAreaCode")
		private String logisticsAreaCode;
		/**
		 * 物流公司编码(SF=顺丰、EMS=标准快递、EYB=经济快件、ZJS=宅急送、YTO=圆通 、ZTO=中 通(ZTO)、HTKY=百世汇通、UC=优速、STO=申通、TTKDEX=天天快递、QFKD=全 峰、FAST=快捷 、POSTB=邮政小包、 GTO=国通、YUNDA=韵达、JD=京东配送、DD=当当宅配、AMAZON=亚马逊物流、 OTHER=其他)
		 */
		@ApiField("logisticsCode")
		private String logisticsCode;
		/**
		 * 物流公司名称
		 */
		@ApiField("logisticsName")
		private String logisticsName;
		/**
		 * 操作(审核)时间(YYYY-MM-DD HH:MM:SS)
		 */
		@ApiField("operateTime")
		private String operateTime;
		/**
		 * 操作员(审核员)编码
		 */
		@ApiField("operatorCode")
		private String operatorCode;
		/**
		 * 操作员(审核员)名称
		 */
		@ApiField("operatorName")
		private String operatorName;
		/**
		 * 订单标记(用字符串格式来表示订单标记列表:例如COD=货到付款;LIMIT=限时配 送;PRESELL=预 售;COMPLAIN=已投诉;SPLIT=拆单;EXCHANGE=换货;VISIT=上 门;MODIFYTRANSPORT=是否 可改配送方式;CONSIGN = 物流宝代理发货;SELLER_AFFORD=是否卖家承担运费;FENXIAO=分销订 单)
		 */
		@ApiField("orderFlag")
		private String orderFlag;
		/**
		 * 出库单类型(JYCK=一般交易出库单;HHCK=换货出库单;BFCK=补发出库单;QTCK=其他出库单)
		 */
		@ApiField("orderType")
		private String orderType;
		/**
		 * 支付平台交易号
		 */
		@ApiField("payNo")
		private String payNo;
		/**
		 * 订单支付时间(YYYY-MM-DD HH:MM:SS)
		 */
		@ApiField("payTime")
		private String payTime;
		/**
		 * 前台订单/店铺订单的创建时间/下单时间
		 */
		@ApiField("placeOrderTime")
		private String placeOrderTime;
		/**
		 * 原出库单号(ERP分配)
		 */
		@ApiField("preDeliveryOrderCode")
		private String preDeliveryOrderCode;
		/**
		 * 原出库单号(WMS分配)
		 */
		@ApiField("preDeliveryOrderId")
		private String preDeliveryOrderId;
		/**
		 * 收件人信息
		 */
		@ApiField("receiverInfo")
		private ReceiverInfo receiverInfo;
		/**
		 * 备注
		 */
		@ApiField("remark")
		private String remark;
		/**
		 * 卖家留言
		 */
		@ApiField("sellerMessage")
		private String sellerMessage;
		/**
		 * 卖家名称
		 */
		@ApiField("sellerNick")
		private String sellerNick;
		/**
		 * 发件人信息
		 */
		@ApiField("senderInfo")
		private SenderInfo senderInfo;
		/**
		 * 服务编码
		 */
		@ApiField("serviceCode")
		private String serviceCode;
		/**
		 * COD服务费
		 */
		@ApiField("serviceFee")
		private String serviceFee;
		/**
		 * 店铺名称
		 */
		@ApiField("shopNick")
		private String shopNick;
		/**
		 * 订单来源平台编码(TB=淘宝、TM=天猫、JD=京东、DD=当当、PP=拍拍、YX= 易讯、 EBAY=ebay、QQ=QQ网购、AMAZON=亚马逊、SN=苏宁、GM=国美、WPH=唯品会、 JM=聚美、LF=乐蜂 、MGJ=蘑菇街、 JS=聚尚、PX=拍鞋、YT=银泰、YHD=1号店、VANCL=凡客、YL=邮乐、YG=优购、1688=阿 里巴巴、POS=POS门店、 MIA=蜜芽、OTHER=其他(只传英文编 码))
		 */
		@ApiField("sourcePlatformCode")
		private String sourcePlatformCode;
		/**
		 * 订单来源平台名称
		 */
		@ApiField("sourcePlatformName")
		private String sourcePlatformName;
		/**
		 * 订单总金额(订单总金额=应收金额+已收金额=商品总金额-订单折扣金额+快递费用 ;单位 元)
		 */
		@ApiField("totalAmount")
		private String totalAmount;
		/**
		 * 仓库编码(统仓统配等无需ERP指定仓储编码的情况填OTHER)
		 */
		@ApiField("warehouseCode")
		private String warehouseCode;
	

	public String getArAmount() {
			return this.arAmount;
		}
		public void setArAmount(String arAmount) {
			this.arAmount = arAmount;
		}
		public String getBuyerMessage() {
			return this.buyerMessage;
		}
		public void setBuyerMessage(String buyerMessage) {
			this.buyerMessage = buyerMessage;
		}
		public String getBuyerNick() {
			return this.buyerNick;
		}
		public void setBuyerNick(String buyerNick) {
			this.buyerNick = buyerNick;
		}
		public String getCreateTime() {
			return this.createTime;
		}
		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}
		public String getDeliveryOrderCode() {
			return this.deliveryOrderCode;
		}
		public void setDeliveryOrderCode(String deliveryOrderCode) {
			this.deliveryOrderCode = deliveryOrderCode;
		}
		public DeliveryRequirements getDeliveryRequirements() {
			return this.deliveryRequirements;
		}
		public void setDeliveryRequirements(DeliveryRequirements deliveryRequirements) {
			this.deliveryRequirements = deliveryRequirements;
		}
		public String getDiscountAmount() {
			return this.discountAmount;
		}
		public void setDiscountAmount(String discountAmount) {
			this.discountAmount = discountAmount;
		}
		public String getExpressCode() {
			return this.expressCode;
		}
		public void setExpressCode(String expressCode) {
			this.expressCode = expressCode;
		}
		public String getFreight() {
			return this.freight;
		}
		public void setFreight(String freight) {
			this.freight = freight;
		}
		public String getGotAmount() {
			return this.gotAmount;
		}
		public void setGotAmount(String gotAmount) {
			this.gotAmount = gotAmount;
		}
		public Insurance getInsurance() {
			return this.insurance;
		}
		public void setInsurance(Insurance insurance) {
			this.insurance = insurance;
		}
		public String getInsuranceFlag() {
			return this.insuranceFlag;
		}
		public void setInsuranceFlag(String insuranceFlag) {
			this.insuranceFlag = insuranceFlag;
		}
		public String getInvoiceFlag() {
			return this.invoiceFlag;
		}
		public void setInvoiceFlag(String invoiceFlag) {
			this.invoiceFlag = invoiceFlag;
		}
		public List<Invoice> getInvoices() {
			return this.invoices;
		}
		public void setInvoices(List<Invoice> invoices) {
			this.invoices = invoices;
		}
		public String getIsUrgency() {
			return this.isUrgency;
		}
		public void setIsUrgency(String isUrgency) {
			this.isUrgency = isUrgency;
		}
		public String getItemAmount() {
			return this.itemAmount;
		}
		public void setItemAmount(String itemAmount) {
			this.itemAmount = itemAmount;
		}
		public String getLogisticsAreaCode() {
			return this.logisticsAreaCode;
		}
		public void setLogisticsAreaCode(String logisticsAreaCode) {
			this.logisticsAreaCode = logisticsAreaCode;
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
		public String getPayNo() {
			return this.payNo;
		}
		public void setPayNo(String payNo) {
			this.payNo = payNo;
		}
		public String getPayTime() {
			return this.payTime;
		}
		public void setPayTime(String payTime) {
			this.payTime = payTime;
		}
		public String getPlaceOrderTime() {
			return this.placeOrderTime;
		}
		public void setPlaceOrderTime(String placeOrderTime) {
			this.placeOrderTime = placeOrderTime;
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
		public ReceiverInfo getReceiverInfo() {
			return this.receiverInfo;
		}
		public void setReceiverInfo(ReceiverInfo receiverInfo) {
			this.receiverInfo = receiverInfo;
		}
		public String getRemark() {
			return this.remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}
		public String getSellerMessage() {
			return this.sellerMessage;
		}
		public void setSellerMessage(String sellerMessage) {
			this.sellerMessage = sellerMessage;
		}
		public String getSellerNick() {
			return this.sellerNick;
		}
		public void setSellerNick(String sellerNick) {
			this.sellerNick = sellerNick;
		}
		public SenderInfo getSenderInfo() {
			return this.senderInfo;
		}
		public void setSenderInfo(SenderInfo senderInfo) {
			this.senderInfo = senderInfo;
		}
		public String getServiceCode() {
			return this.serviceCode;
		}
		public void setServiceCode(String serviceCode) {
			this.serviceCode = serviceCode;
		}
		public String getServiceFee() {
			return this.serviceFee;
		}
		public void setServiceFee(String serviceFee) {
			this.serviceFee = serviceFee;
		}
		public String getShopNick() {
			return this.shopNick;
		}
		public void setShopNick(String shopNick) {
			this.shopNick = shopNick;
		}
		public String getSourcePlatformCode() {
			return this.sourcePlatformCode;
		}
		public void setSourcePlatformCode(String sourcePlatformCode) {
			this.sourcePlatformCode = sourcePlatformCode;
		}
		public String getSourcePlatformName() {
			return this.sourcePlatformName;
		}
		public void setSourcePlatformName(String sourcePlatformName) {
			this.sourcePlatformName = sourcePlatformName;
		}
		public String getTotalAmount() {
			return this.totalAmount;
		}
		public void setTotalAmount(String totalAmount) {
			this.totalAmount = totalAmount;
		}
		public String getWarehouseCode() {
			return this.warehouseCode;
		}
		public void setWarehouseCode(String warehouseCode) {
			this.warehouseCode = warehouseCode;
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
		 * 实际成交价
		 */
		@ApiField("actualPrice")
		private String actualPrice;
		/**
		 * 批次编码
		 */
		@ApiField("batchCode")
		private String batchCode;
		/**
		 * 单件商品折扣金额
		 */
		@ApiField("discountAmount")
		private String discountAmount;
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
		 * 库存类型(ZP=正品;CC=残次;JS=机损;XS= 箱损;ZT=在途库存;默认为查所有类型的库存)
		 */
		@ApiField("inventoryType")
		private String inventoryType;
		/**
		 * 商品编码
		 */
		@ApiField("itemCode")
		private String itemCode;
		/**
		 * 仓储系统商品编码
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
		 * 货主编码
		 */
		@ApiField("ownerCode")
		private String ownerCode;
		/**
		 * 支付平台交易号(淘系订单传支付宝交易号)
		 */
		@ApiField("payNo")
		private String payNo;
		/**
		 * 应发商品数量
		 */
		@ApiField("planQty")
		private Long planQty;
		/**
		 * 生产日期(YYYY-MM-DD)
		 */
		@ApiField("productDate")
		private String productDate;
		/**
		 * 零售价(零售价=实际成交价+单件商品折扣金额)
		 */
		@ApiField("retailPrice")
		private String retailPrice;
		/**
		 * 交易平台订单
		 */
		@ApiField("sourceOrderCode")
		private String sourceOrderCode;
		/**
		 * 交易平台子订单编码
		 */
		@ApiField("subSourceOrderCode")
		private String subSourceOrderCode;
	

	public String getActualPrice() {
			return this.actualPrice;
		}
		public void setActualPrice(String actualPrice) {
			this.actualPrice = actualPrice;
		}
		public String getBatchCode() {
			return this.batchCode;
		}
		public void setBatchCode(String batchCode) {
			this.batchCode = batchCode;
		}
		public String getDiscountAmount() {
			return this.discountAmount;
		}
		public void setDiscountAmount(String discountAmount) {
			this.discountAmount = discountAmount;
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
		public String getProductDate() {
			return this.productDate;
		}
		public void setProductDate(String productDate) {
			this.productDate = productDate;
		}
		public String getRetailPrice() {
			return this.retailPrice;
		}
		public void setRetailPrice(String retailPrice) {
			this.retailPrice = retailPrice;
		}
		public String getSourceOrderCode() {
			return this.sourceOrderCode;
		}
		public void setSourceOrderCode(String sourceOrderCode) {
			this.sourceOrderCode = sourceOrderCode;
		}
		public String getSubSourceOrderCode() {
			return this.subSourceOrderCode;
		}
		public void setSubSourceOrderCode(String subSourceOrderCode) {
			this.subSourceOrderCode = subSourceOrderCode;
		}

}

	/**
 * null
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Batch {

	/**
		 * null
		 */
		@ApiField("actualQty")
		private String actualQty;
		/**
		 * null
		 */
		@ApiField("batchCode")
		private String batchCode;
		/**
		 * null
		 */
		@ApiField("expireDate")
		private String expireDate;
		/**
		 * null
		 */
		@ApiField("inventoryType")
		private String inventoryType;
		/**
		 * null
		 */
		@ApiField("produceCode")
		private String produceCode;
		/**
		 * null
		 */
		@ApiField("productDate")
		private String productDate;
		/**
		 * null
		 */
		@ApiField("quantity")
		private String quantity;
	

	public String getActualQty() {
			return this.actualQty;
		}
		public void setActualQty(String actualQty) {
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
 * null
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class PriceAdjustment {

	/**
		 * null
		 */
		@ApiField("discount")
		private String discount;
		/**
		 * null
		 */
		@ApiField("endDate")
		private String endDate;
		/**
		 * null
		 */
		@ApiField("standardPrice")
		private String standardPrice;
		/**
		 * null
		 */
		@ApiField("startDate")
		private String startDate;
		/**
		 * null
		 */
		@ApiField("type")
		private String type;
	

	public String getDiscount() {
			return this.discount;
		}
		public void setDiscount(String discount) {
			this.discount = discount;
		}
		public String getEndDate() {
			return this.endDate;
		}
		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}
		public String getStandardPrice() {
			return this.standardPrice;
		}
		public void setStandardPrice(String standardPrice) {
			this.standardPrice = standardPrice;
		}
		public String getStartDate() {
			return this.startDate;
		}
		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}

}

	/**
 * null
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class PickerInfo {

	/**
		 * null
		 */
		@ApiField("area")
		private String area;
		/**
		 * null
		 */
		@ApiField("birthDate")
		private String birthDate;
		/**
		 * null
		 */
		@ApiField("carNo")
		private String carNo;
		/**
		 * null
		 */
		@ApiField("career")
		private String career;
		/**
		 * null
		 */
		@ApiField("city")
		private String city;
		/**
		 * null
		 */
		@ApiField("company")
		private String company;
		/**
		 * null
		 */
		@ApiField("countryCode")
		private String countryCode;
		/**
		 * null
		 */
		@ApiField("countryCodeCiq")
		private String countryCodeCiq;
		/**
		 * null
		 */
		@ApiField("countryCodeCus")
		private String countryCodeCus;
		/**
		 * null
		 */
		@ApiField("detailAddress")
		private String detailAddress;
		/**
		 * null
		 */
		@ApiField("email")
		private String email;
		/**
		 * null
		 */
		@ApiField("fax")
		private String fax;
		/**
		 * null
		 */
		@ApiField("gender")
		private String gender;
		/**
		 * null
		 */
		@ApiField("id")
		private String id;
		/**
		 * null
		 */
		@ApiField("idNumber")
		private String idNumber;
		/**
		 * null
		 */
		@ApiField("idType")
		private String idType;
		/**
		 * null
		 */
		@ApiField("nick")
		private String nick;
		/**
		 * null
		 */
		@ApiField("province")
		private String province;
		/**
		 * null
		 */
		@ApiField("receiverMobile")
		private String receiverMobile;
		/**
		 * null
		 */
		@ApiField("receiverName")
		private String receiverName;
		/**
		 * null
		 */
		@ApiField("receiverTel")
		private String receiverTel;
		/**
		 * null
		 */
		@ApiField("receiverZipCode")
		private String receiverZipCode;
		/**
		 * null
		 */
		@ApiField("town")
		private String town;
	

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
		public String getReceiverMobile() {
			return this.receiverMobile;
		}
		public void setReceiverMobile(String receiverMobile) {
			this.receiverMobile = receiverMobile;
		}
		public String getReceiverName() {
			return this.receiverName;
		}
		public void setReceiverName(String receiverName) {
			this.receiverName = receiverName;
		}
		public String getReceiverTel() {
			return this.receiverTel;
		}
		public void setReceiverTel(String receiverTel) {
			this.receiverTel = receiverTel;
		}
		public String getReceiverZipCode() {
			return this.receiverZipCode;
		}
		public void setReceiverZipCode(String receiverZipCode) {
			this.receiverZipCode = receiverZipCode;
		}
		public String getTown() {
			return this.town;
		}
		public void setTown(String town) {
			this.town = town;
		}

}

	/**
 * null
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class PackageMaterial {

	/**
		 * null
		 */
		@ApiField("quantity")
		private String quantity;
		/**
		 * null
		 */
		@ApiField("type")
		private String type;
	

	public String getQuantity() {
			return this.quantity;
		}
		public void setQuantity(String quantity) {
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
 * null
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Package {

	/**
		 * null
		 */
		@ApiField("expressCode")
		private String expressCode;
		/**
		 * null
		 */
		@ApiField("height")
		private String height;
		/**
		 * null
		 */
		@ApiField("invoiceNo")
		private String invoiceNo;
		/**
		 * null
		 */
		@ApiListField("items")
		@ApiField("item")
		private List<Item> items;
		/**
		 * null
		 */
		@ApiField("length")
		private String length;
		/**
		 * null
		 */
		@ApiField("logisticsCode")
		private String logisticsCode;
		/**
		 * null
		 */
		@ApiField("logisticsName")
		private String logisticsName;
		/**
		 * null
		 */
		@ApiField("packageCode")
		private String packageCode;
		/**
		 * null
		 */
		@ApiListField("packageMaterialList")
		@ApiField("packageMaterial")
		private List<PackageMaterial> packageMaterialList;
		/**
		 * null
		 */
		@ApiField("theoreticalWeight")
		private String theoreticalWeight;
		/**
		 * null
		 */
		@ApiField("volume")
		private String volume;
		/**
		 * null
		 */
		@ApiField("weight")
		private String weight;
		/**
		 * null
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
 * null
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class RelatedOrder {

	/**
		 * null
		 */
		@ApiField("orderCode")
		private String orderCode;
		/**
		 * null
		 */
		@ApiField("orderType")
		private String orderType;
	

	public String getOrderCode() {
			return this.orderCode;
		}
		public void setOrderCode(String orderCode) {
			this.orderCode = orderCode;
		}
		public String getOrderType() {
			return this.orderType;
		}
		public void setOrderType(String orderType) {
			this.orderType = orderType;
		}

}

	/**
 * null
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Order {

	/**
		 * null
		 */
		@ApiField("deliveryOrder")
		private DeliveryOrder deliveryOrder;
		/**
		 * null
		 */
		@ApiField("deliveryOrderCode")
		private String deliveryOrderCode;
		/**
		 * null
		 */
		@ApiListField("itemList")
		@ApiField("item")
		private List<Item> itemList;
		/**
		 * null
		 */
		@ApiField("message")
		private String message;
		/**
		 * null
		 */
		@ApiListField("orderLines")
		@ApiField("orderLine")
		private List<OrderLine> orderLines;
		/**
		 * null
		 */
		@ApiListField("packages")
		@ApiField("package")
		private List<Package> packages;
	

	public DeliveryOrder getDeliveryOrder() {
			return this.deliveryOrder;
		}
		public void setDeliveryOrder(DeliveryOrder deliveryOrder) {
			this.deliveryOrder = deliveryOrder;
		}
		public String getDeliveryOrderCode() {
			return this.deliveryOrderCode;
		}
		public void setDeliveryOrderCode(String deliveryOrderCode) {
			this.deliveryOrderCode = deliveryOrderCode;
		}
		public List<Item> getItemList() {
			return this.itemList;
		}
		public void setItemList(List<Item> itemList) {
			this.itemList = itemList;
		}
		public String getMessage() {
			return this.message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public List<OrderLine> getOrderLines() {
			return this.orderLines;
		}
		public void setOrderLines(List<OrderLine> orderLines) {
			this.orderLines = orderLines;
		}
		public List<Package> getPackages() {
			return this.packages;
		}
		public void setPackages(List<Package> packages) {
			this.packages = packages;
		}

}


}
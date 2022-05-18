package com.qimen.api.request;

import com.qimen.api.QimenRequest;
import com.qimen.api.response.DeliveryorderBatchcreateAnswerResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;
import java.util.Map;

/**
 * TOP API: taobao.qimen.deliveryorder.batchcreate.answer request
 * 
 * @author top auto create
 * @since 1.0, 2017.04.28
 */
public class DeliveryorderBatchcreateAnswerRequest extends QimenRequest<DeliveryorderBatchcreateAnswerResponse> {
	
	

	/** 
	* 扩展属性
	 */
	private Map extendProps;

	/**
	* 发货单列表
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
		return "taobao.qimen.deliveryorder.batchcreate.answer";
	}

	public Class<DeliveryorderBatchcreateAnswerResponse> getResponseClass() {
		return DeliveryorderBatchcreateAnswerResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
 * 单据详情
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class OrderInfo {

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
 * 拆单情况
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
		 * 单据列表
		 */
		@ApiListField("orderLines")
		@ApiField("order_line")
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

	/**
 * null
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class DeliveryRequirements {

	/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("deliveryType")
		private String deliveryType;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("scheduleDay")
		private String scheduleDay;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("scheduleEndTime")
		private String scheduleEndTime;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("scheduleStartTime")
		private String scheduleStartTime;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("scheduleType")
		private String scheduleType;
	

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
		public String getScheduleType() {
			return this.scheduleType;
		}
		public void setScheduleType(String scheduleType) {
			this.scheduleType = scheduleType;
		}

}

	/**
 * null
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class SenderInfo {

	/**
		 * 奇门仓储字段,说明,string(50),,
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
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("city")
		private String city;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("company")
		private String company;
		/**
		 * 奇门仓储字段,说明,string(50),,
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
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("detailAddress")
		private String detailAddress;
		/**
		 * 奇门仓储字段,说明,string(50),,
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
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("mobile")
		private String mobile;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("name")
		private String name;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("nick")
		private String nick;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("province")
		private String province;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("tel")
		private String tel;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("town")
		private String town;
		/**
		 * 奇门仓储字段,说明,string(50),,
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
 * null
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class ReceiverInfo {

	/**
		 * 奇门仓储字段,说明,string(50),,
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
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("city")
		private String city;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("company")
		private String company;
		/**
		 * 奇门仓储字段,说明,string(50),,
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
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("detailAddress")
		private String detailAddress;
		/**
		 * 奇门仓储字段,说明,string(50),,
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
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("mobile")
		private String mobile;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("name")
		private String name;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("nick")
		private String nick;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("province")
		private String province;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("tel")
		private String tel;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("town")
		private String town;
		/**
		 * 奇门仓储字段,说明,string(50),,
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
 * null
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Batch {

	/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("actualQty")
		private String actualQty;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("batchCode")
		private String batchCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("expireDate")
		private String expireDate;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("inventoryType")
		private String inventoryType;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("produceCode")
		private String produceCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("productDate")
		private String productDate;
		/**
		 * 奇门仓储字段,说明,string(50),,
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
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("discount")
		private String discount;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("endDate")
		private String endDate;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("standardPrice")
		private String standardPrice;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("startDate")
		private String startDate;
		/**
		 * 奇门仓储字段,说明,string(50),,
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
public static class Item {

	/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("actualAmount")
		private String actualAmount;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("actualQty")
		private String actualQty;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("adventLifecycle")
		private String adventLifecycle;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("amount")
		private String amount;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("approvalNumber")
		private String approvalNumber;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("barCode")
		private String barCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("batchCode")
		private String batchCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("batchRemark")
		private String batchRemark;
		/**
		 * null
		 */
		@ApiListField("batchs")
		@ApiField("batch")
		private List<Batch> batchs;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("brandCode")
		private String brandCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("brandName")
		private String brandName;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("categoryId")
		private String categoryId;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("categoryName")
		private String categoryName;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("changeTime")
		private String changeTime;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("channelCode")
		private String channelCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("color")
		private String color;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("costPrice")
		private String costPrice;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("defectiveQty")
		private String defectiveQty;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("diffQuantity")
		private String diffQuantity;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("discount")
		private String discount;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("discountPrice")
		private String discountPrice;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("englishName")
		private String englishName;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("exCode")
		private String exCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("expireDate")
		private String expireDate;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("extCode")
		private String extCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("goodsCode")
		private String goodsCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("grossWeight")
		private String grossWeight;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("height")
		private String height;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("inventoryType")
		private String inventoryType;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("isAreaSale")
		private String isAreaSale;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("isBatchMgmt")
		private String isBatchMgmt;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("isFragile")
		private String isFragile;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("isHazardous")
		private String isHazardous;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("isSNMgmt")
		private String isSNMgmt;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("isShelfLifeMgmt")
		private String isShelfLifeMgmt;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("isSku")
		private String isSku;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("itemCode")
		private String itemCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
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
		@ApiField("itemType")
		private String itemType;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("lackQty")
		private String lackQty;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("latestUpdateTime")
		private String latestUpdateTime;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("length")
		private String length;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("lockQuantity")
		private String lockQuantity;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("lockupLifecycle")
		private String lockupLifecycle;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("netWeight")
		private String netWeight;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("normalQty")
		private String normalQty;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("orderCode")
		private String orderCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("orderLineNo")
		private String orderLineNo;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("orderType")
		private String orderType;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("originAddress")
		private String originAddress;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("originCode")
		private String originCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
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
		@ApiField("packCode")
		private String packCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("packageMaterial")
		private String packageMaterial;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("paperQty")
		private String paperQty;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("pcs")
		private String pcs;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("planQty")
		private String planQty;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("price")
		private String price;
		/**
		 * null
		 */
		@ApiField("priceAdjustment")
		private PriceAdjustment priceAdjustment;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("pricingCategory")
		private String pricingCategory;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("produceCode")
		private String produceCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("productCode")
		private String productCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("productDate")
		private String productDate;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("purchasePrice")
		private String purchasePrice;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("quantity")
		private String quantity;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("reason")
		private String reason;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("receiveQty")
		private String receiveQty;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("referencePrice")
		private String referencePrice;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("rejectLifecycle")
		private String rejectLifecycle;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("retailPrice")
		private String retailPrice;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("safetyStock")
		private String safetyStock;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("seasonCode")
		private String seasonCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("seasonName")
		private String seasonName;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("shelfLife")
		private String shelfLife;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("shortName")
		private String shortName;
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
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("sn")
		private String sn;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("snCode")
		private String snCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("sourceOrderCode")
		private String sourceOrderCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("standardPrice")
		private String standardPrice;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("stockStatus")
		private String stockStatus;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("stockUnit")
		private String stockUnit;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("subSourceOrderCode")
		private String subSourceOrderCode;
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
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("tagPrice")
		private String tagPrice;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("tareWeight")
		private String tareWeight;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("tempRequirement")
		private String tempRequirement;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("title")
		private String title;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("unit")
		private String unit;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("volume")
		private String volume;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("warehouseCode")
		private String warehouseCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("width")
		private String width;
	

	public String getActualAmount() {
			return this.actualAmount;
		}
		public void setActualAmount(String actualAmount) {
			this.actualAmount = actualAmount;
		}
		public String getActualQty() {
			return this.actualQty;
		}
		public void setActualQty(String actualQty) {
			this.actualQty = actualQty;
		}
		public String getAdventLifecycle() {
			return this.adventLifecycle;
		}
		public void setAdventLifecycle(String adventLifecycle) {
			this.adventLifecycle = adventLifecycle;
		}
		public String getAmount() {
			return this.amount;
		}
		public void setAmount(String amount) {
			this.amount = amount;
		}
		public String getApprovalNumber() {
			return this.approvalNumber;
		}
		public void setApprovalNumber(String approvalNumber) {
			this.approvalNumber = approvalNumber;
		}
		public String getBarCode() {
			return this.barCode;
		}
		public void setBarCode(String barCode) {
			this.barCode = barCode;
		}
		public String getBatchCode() {
			return this.batchCode;
		}
		public void setBatchCode(String batchCode) {
			this.batchCode = batchCode;
		}
		public String getBatchRemark() {
			return this.batchRemark;
		}
		public void setBatchRemark(String batchRemark) {
			this.batchRemark = batchRemark;
		}
		public List<Batch> getBatchs() {
			return this.batchs;
		}
		public void setBatchs(List<Batch> batchs) {
			this.batchs = batchs;
		}
		public String getBrandCode() {
			return this.brandCode;
		}
		public void setBrandCode(String brandCode) {
			this.brandCode = brandCode;
		}
		public String getBrandName() {
			return this.brandName;
		}
		public void setBrandName(String brandName) {
			this.brandName = brandName;
		}
		public String getCategoryId() {
			return this.categoryId;
		}
		public void setCategoryId(String categoryId) {
			this.categoryId = categoryId;
		}
		public String getCategoryName() {
			return this.categoryName;
		}
		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}
		public String getChangeTime() {
			return this.changeTime;
		}
		public void setChangeTime(String changeTime) {
			this.changeTime = changeTime;
		}
		public String getChannelCode() {
			return this.channelCode;
		}
		public void setChannelCode(String channelCode) {
			this.channelCode = channelCode;
		}
		public String getColor() {
			return this.color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getCostPrice() {
			return this.costPrice;
		}
		public void setCostPrice(String costPrice) {
			this.costPrice = costPrice;
		}
		public String getDefectiveQty() {
			return this.defectiveQty;
		}
		public void setDefectiveQty(String defectiveQty) {
			this.defectiveQty = defectiveQty;
		}
		public String getDiffQuantity() {
			return this.diffQuantity;
		}
		public void setDiffQuantity(String diffQuantity) {
			this.diffQuantity = diffQuantity;
		}
		public String getDiscount() {
			return this.discount;
		}
		public void setDiscount(String discount) {
			this.discount = discount;
		}
		public String getDiscountPrice() {
			return this.discountPrice;
		}
		public void setDiscountPrice(String discountPrice) {
			this.discountPrice = discountPrice;
		}
		public String getEnglishName() {
			return this.englishName;
		}
		public void setEnglishName(String englishName) {
			this.englishName = englishName;
		}
		public String getExCode() {
			return this.exCode;
		}
		public void setExCode(String exCode) {
			this.exCode = exCode;
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
		public String getGoodsCode() {
			return this.goodsCode;
		}
		public void setGoodsCode(String goodsCode) {
			this.goodsCode = goodsCode;
		}
		public String getGrossWeight() {
			return this.grossWeight;
		}
		public void setGrossWeight(String grossWeight) {
			this.grossWeight = grossWeight;
		}
		public String getHeight() {
			return this.height;
		}
		public void setHeight(String height) {
			this.height = height;
		}
		public String getInventoryType() {
			return this.inventoryType;
		}
		public void setInventoryType(String inventoryType) {
			this.inventoryType = inventoryType;
		}
		public String getIsAreaSale() {
			return this.isAreaSale;
		}
		public void setIsAreaSale(String isAreaSale) {
			this.isAreaSale = isAreaSale;
		}
		public String getIsBatchMgmt() {
			return this.isBatchMgmt;
		}
		public void setIsBatchMgmt(String isBatchMgmt) {
			this.isBatchMgmt = isBatchMgmt;
		}
		public String getIsFragile() {
			return this.isFragile;
		}
		public void setIsFragile(String isFragile) {
			this.isFragile = isFragile;
		}
		public String getIsHazardous() {
			return this.isHazardous;
		}
		public void setIsHazardous(String isHazardous) {
			this.isHazardous = isHazardous;
		}
		public String getIsSNMgmt() {
			return this.isSNMgmt;
		}
		public void setIsSNMgmt(String isSNMgmt) {
			this.isSNMgmt = isSNMgmt;
		}
		public String getIsShelfLifeMgmt() {
			return this.isShelfLifeMgmt;
		}
		public void setIsShelfLifeMgmt(String isShelfLifeMgmt) {
			this.isShelfLifeMgmt = isShelfLifeMgmt;
		}
		public String getIsSku() {
			return this.isSku;
		}
		public void setIsSku(String isSku) {
			this.isSku = isSku;
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
		public String getItemType() {
			return this.itemType;
		}
		public void setItemType(String itemType) {
			this.itemType = itemType;
		}
		public String getLackQty() {
			return this.lackQty;
		}
		public void setLackQty(String lackQty) {
			this.lackQty = lackQty;
		}
		public String getLatestUpdateTime() {
			return this.latestUpdateTime;
		}
		public void setLatestUpdateTime(String latestUpdateTime) {
			this.latestUpdateTime = latestUpdateTime;
		}
		public String getLength() {
			return this.length;
		}
		public void setLength(String length) {
			this.length = length;
		}
		public String getLockQuantity() {
			return this.lockQuantity;
		}
		public void setLockQuantity(String lockQuantity) {
			this.lockQuantity = lockQuantity;
		}
		public String getLockupLifecycle() {
			return this.lockupLifecycle;
		}
		public void setLockupLifecycle(String lockupLifecycle) {
			this.lockupLifecycle = lockupLifecycle;
		}
		public String getNetWeight() {
			return this.netWeight;
		}
		public void setNetWeight(String netWeight) {
			this.netWeight = netWeight;
		}
		public String getNormalQty() {
			return this.normalQty;
		}
		public void setNormalQty(String normalQty) {
			this.normalQty = normalQty;
		}
		public String getOrderCode() {
			return this.orderCode;
		}
		public void setOrderCode(String orderCode) {
			this.orderCode = orderCode;
		}
		public String getOrderLineNo() {
			return this.orderLineNo;
		}
		public void setOrderLineNo(String orderLineNo) {
			this.orderLineNo = orderLineNo;
		}
		public String getOrderType() {
			return this.orderType;
		}
		public void setOrderType(String orderType) {
			this.orderType = orderType;
		}
		public String getOriginAddress() {
			return this.originAddress;
		}
		public void setOriginAddress(String originAddress) {
			this.originAddress = originAddress;
		}
		public String getOriginCode() {
			return this.originCode;
		}
		public void setOriginCode(String originCode) {
			this.originCode = originCode;
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
		public String getPackCode() {
			return this.packCode;
		}
		public void setPackCode(String packCode) {
			this.packCode = packCode;
		}
		public String getPackageMaterial() {
			return this.packageMaterial;
		}
		public void setPackageMaterial(String packageMaterial) {
			this.packageMaterial = packageMaterial;
		}
		public String getPaperQty() {
			return this.paperQty;
		}
		public void setPaperQty(String paperQty) {
			this.paperQty = paperQty;
		}
		public String getPcs() {
			return this.pcs;
		}
		public void setPcs(String pcs) {
			this.pcs = pcs;
		}
		public String getPlanQty() {
			return this.planQty;
		}
		public void setPlanQty(String planQty) {
			this.planQty = planQty;
		}
		public String getPrice() {
			return this.price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		public PriceAdjustment getPriceAdjustment() {
			return this.priceAdjustment;
		}
		public void setPriceAdjustment(PriceAdjustment priceAdjustment) {
			this.priceAdjustment = priceAdjustment;
		}
		public String getPricingCategory() {
			return this.pricingCategory;
		}
		public void setPricingCategory(String pricingCategory) {
			this.pricingCategory = pricingCategory;
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
		public String getQuantity() {
			return this.quantity;
		}
		public void setQuantity(String quantity) {
			this.quantity = quantity;
		}
		public String getReason() {
			return this.reason;
		}
		public void setReason(String reason) {
			this.reason = reason;
		}
		public String getReceiveQty() {
			return this.receiveQty;
		}
		public void setReceiveQty(String receiveQty) {
			this.receiveQty = receiveQty;
		}
		public String getReferencePrice() {
			return this.referencePrice;
		}
		public void setReferencePrice(String referencePrice) {
			this.referencePrice = referencePrice;
		}
		public String getRejectLifecycle() {
			return this.rejectLifecycle;
		}
		public void setRejectLifecycle(String rejectLifecycle) {
			this.rejectLifecycle = rejectLifecycle;
		}
		public String getRetailPrice() {
			return this.retailPrice;
		}
		public void setRetailPrice(String retailPrice) {
			this.retailPrice = retailPrice;
		}
		public String getSafetyStock() {
			return this.safetyStock;
		}
		public void setSafetyStock(String safetyStock) {
			this.safetyStock = safetyStock;
		}
		public String getSeasonCode() {
			return this.seasonCode;
		}
		public void setSeasonCode(String seasonCode) {
			this.seasonCode = seasonCode;
		}
		public String getSeasonName() {
			return this.seasonName;
		}
		public void setSeasonName(String seasonName) {
			this.seasonName = seasonName;
		}
		public String getShelfLife() {
			return this.shelfLife;
		}
		public void setShelfLife(String shelfLife) {
			this.shelfLife = shelfLife;
		}
		public String getShortName() {
			return this.shortName;
		}
		public void setShortName(String shortName) {
			this.shortName = shortName;
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
		public String getSn() {
			return this.sn;
		}
		public void setSn(String sn) {
			this.sn = sn;
		}
		public String getSnCode() {
			return this.snCode;
		}
		public void setSnCode(String snCode) {
			this.snCode = snCode;
		}
		public String getSourceOrderCode() {
			return this.sourceOrderCode;
		}
		public void setSourceOrderCode(String sourceOrderCode) {
			this.sourceOrderCode = sourceOrderCode;
		}
		public String getStandardPrice() {
			return this.standardPrice;
		}
		public void setStandardPrice(String standardPrice) {
			this.standardPrice = standardPrice;
		}
		public String getStockStatus() {
			return this.stockStatus;
		}
		public void setStockStatus(String stockStatus) {
			this.stockStatus = stockStatus;
		}
		public String getStockUnit() {
			return this.stockUnit;
		}
		public void setStockUnit(String stockUnit) {
			this.stockUnit = stockUnit;
		}
		public String getSubSourceOrderCode() {
			return this.subSourceOrderCode;
		}
		public void setSubSourceOrderCode(String subSourceOrderCode) {
			this.subSourceOrderCode = subSourceOrderCode;
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
		public String getTagPrice() {
			return this.tagPrice;
		}
		public void setTagPrice(String tagPrice) {
			this.tagPrice = tagPrice;
		}
		public String getTareWeight() {
			return this.tareWeight;
		}
		public void setTareWeight(String tareWeight) {
			this.tareWeight = tareWeight;
		}
		public String getTempRequirement() {
			return this.tempRequirement;
		}
		public void setTempRequirement(String tempRequirement) {
			this.tempRequirement = tempRequirement;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getUnit() {
			return this.unit;
		}
		public void setUnit(String unit) {
			this.unit = unit;
		}
		public String getVolume() {
			return this.volume;
		}
		public void setVolume(String volume) {
			this.volume = volume;
		}
		public String getWarehouseCode() {
			return this.warehouseCode;
		}
		public void setWarehouseCode(String warehouseCode) {
			this.warehouseCode = warehouseCode;
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
public static class Detail {

	/**
		 * null
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
 * null
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Invoice {

	/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("amount")
		private String amount;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("code")
		private String code;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("content")
		private String content;
		/**
		 * null
		 */
		@ApiField("detail")
		private Detail detail;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("header")
		private String header;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("number")
		private String number;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("type")
		private String type;
	

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
		 * 奇门仓储字段,说明,string(50),,
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
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("city")
		private String city;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("company")
		private String company;
		/**
		 * 奇门仓储字段,说明,string(50),,
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
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("detailAddress")
		private String detailAddress;
		/**
		 * 奇门仓储字段,说明,string(50),,
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
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("mobile")
		private String mobile;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("name")
		private String name;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("nick")
		private String nick;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("province")
		private String province;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("tel")
		private String tel;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("town")
		private String town;
		/**
		 * 奇门仓储字段,说明,string(50),,
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
 * null
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class PackageMaterial {

	/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("quantity")
		private String quantity;
		/**
		 * 奇门仓储字段,说明,string(50),,
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
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("expressCode")
		private String expressCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("height")
		private String height;
		/**
		 * 奇门仓储字段,说明,string(50),,
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
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("length")
		private String length;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("logisticsCode")
		private String logisticsCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("logisticsName")
		private String logisticsName;
		/**
		 * 奇门仓储字段,说明,string(50),,
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
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("theoreticalWeight")
		private String theoreticalWeight;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("volume")
		private String volume;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("weight")
		private String weight;
		/**
		 * 奇门仓储字段,说明,string(50),,
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
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("orderCode")
		private String orderCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
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
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("code")
		private String code;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("deliveryOrderCode")
		private String deliveryOrderCode;
		/**
		 * null
		 */
		@ApiListField("deliveryOrders")
		@ApiField("deliveryOrder")
		private List<DeliveryOrder> deliveryOrders;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("flag")
		private String flag;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("message")
		private String message;
		/**
		 * null
		 */
		@ApiField("orderInfo")
		private OrderInfo orderInfo;
	

	public String getCode() {
			return this.code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getDeliveryOrderCode() {
			return this.deliveryOrderCode;
		}
		public void setDeliveryOrderCode(String deliveryOrderCode) {
			this.deliveryOrderCode = deliveryOrderCode;
		}
		public List<DeliveryOrder> getDeliveryOrders() {
			return this.deliveryOrders;
		}
		public void setDeliveryOrders(List<DeliveryOrder> deliveryOrders) {
			this.deliveryOrders = deliveryOrders;
		}
		public String getFlag() {
			return this.flag;
		}
		public void setFlag(String flag) {
			this.flag = flag;
		}
		public String getMessage() {
			return this.message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public OrderInfo getOrderInfo() {
			return this.orderInfo;
		}
		public void setOrderInfo(OrderInfo orderInfo) {
			this.orderInfo = orderInfo;
		}

}


}
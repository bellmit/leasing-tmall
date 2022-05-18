package com.qimen.api.request;

import com.qimen.api.QimenRequest;
import com.qimen.api.response.StockoutConfirmResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;
import java.util.Map;

/**
 * TOP API: taobao.qimen.stockout.confirm request
 * 
 * @author top auto create
 * @since 1.0, 2017.04.28
 */
public class StockoutConfirmRequest extends QimenRequest<StockoutConfirmResponse> {
	
	

	/** 
	* deliveryOrder
	 */
	private DeliveryOrder deliveryOrder;

	/** 
	* 扩展属性
	 */
	private Map extendProps;

	/**
	* orderLines
	 */
	private List<OrderLine> orderLines;

	/**
	* packages
	 */
	private List<Package> packages;

	public void setDeliveryOrder(DeliveryOrder deliveryOrder) {
		this.deliveryOrder = deliveryOrder;
	}

	public DeliveryOrder getDeliveryOrder() {
		return this.deliveryOrder;
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

	public void setPackages(List<Package> packages) {
		this.packages = packages;
	}

	public List<Package> getPackages() {
		return this.packages;
	}

	public String getApiMethodName() {
		return "taobao.qimen.stockout.confirm";
	}

	public Class<StockoutConfirmResponse> getResponseClass() {
		return StockoutConfirmResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
 * deliveryRequirements
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
 * senderInfo
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
 * receiverInfo
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
 * batchs
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
 * priceAdjustment
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
 * items
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
		 * batchs
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
		 * priceAdjustment
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
 * detail
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Detail {

	/**
		 * items
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
 * invoices
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
		 * detail
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
 * pickerInfo
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
 * orderLines
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
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("actualQty")
		private String actualQty;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("amount")
		private String amount;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("batchCode")
		private String batchCode;
		/**
		 * batchs
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
		@ApiField("inventoryType")
		private String inventoryType;
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
		 * 奇门仓储字段,说明,string(50),,
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
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("ownerCode")
		private String ownerCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("payNo")
		private String payNo;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("planQty")
		private String planQty;
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
		 * 奇门仓储字段,说明,string(50),,
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
		 * 奇门仓储字段,说明,string(50),,
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
		public String getPlanQty() {
			return this.planQty;
		}
		public void setPlanQty(String planQty) {
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

	/**
 * packageMaterialList
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
 * packages
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class PackageInfo {

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
		 * items
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
		 * packageMaterialList
		 */
		@ApiListField("packageMaterialList")
		@ApiField("package_material")
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
 * relatedOrders
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
 * deliveryOrder
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class DeliveryOrder {

	/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("actualAmount")
		private String actualAmount;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("arAmount")
		private String arAmount;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("batchCode")
		private String batchCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("businessMemo")
		private String businessMemo;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("buyerMessage")
		private String buyerMessage;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("buyerName")
		private String buyerName;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("buyerNick")
		private String buyerNick;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("buyerPhone")
		private String buyerPhone;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("collectedAmount")
		private String collectedAmount;
		/**
		 * 支持出库单多次发货的状态位
		 */
		@ApiField("confirmType")
		private Long confirmType;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("createTime")
		private String createTime;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("declaredAmount")
		private String declaredAmount;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("deliveryNote")
		private String deliveryNote;
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
		 * deliveryRequirements
		 */
		@ApiField("deliveryRequirements")
		private DeliveryRequirements deliveryRequirements;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("discountAmount")
		private String discountAmount;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("exceptionCode")
		private String exceptionCode;
		/**
		 * 运单号
		 */
		@ApiField("expressCode")
		private String expressCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("fetchItemLocation")
		private String fetchItemLocation;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("freight")
		private String freight;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("gotAmount")
		private String gotAmount;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("identifyCode")
		private String identifyCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("insuranceFlag")
		private String insuranceFlag;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("invoiceFlag")
		private String invoiceFlag;
		/**
		 * invoices
		 */
		@ApiListField("invoices")
		@ApiField("invoice")
		private List<Invoice> invoices;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("isCod")
		private String isCod;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("isPaymentCollected")
		private String isPaymentCollected;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("isUrgency")
		private String isUrgency;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("isValueDeclared")
		private String isValueDeclared;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("itemAmount")
		private String itemAmount;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("itemCode")
		private String itemCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("itemName")
		private String itemName;
		/**
		 * items
		 */
		@ApiListField("items")
		@ApiField("item")
		private List<Item> items;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("lineNumber")
		private String lineNumber;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("logisticsAreaCode")
		private String logisticsAreaCode;
		/**
		 * 物流公司编码
		 */
		@ApiField("logisticsCode")
		private String logisticsCode;
		/**
		 * 物流公司名称
		 */
		@ApiField("logisticsName")
		private String logisticsName;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("maxArrivalTime")
		private String maxArrivalTime;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("mergeOrderCodes")
		private String mergeOrderCodes;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("mergeOrderFlag")
		private String mergeOrderFlag;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("minArrivalTime")
		private String minArrivalTime;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("modifiedTime")
		private String modifiedTime;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("noStackTag")
		private String noStackTag;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("operateTime")
		private String operateTime;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("operatorCode")
		private String operatorCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("operatorName")
		private String operatorName;
		/**
		 * 订单完成时间
		 */
		@ApiField("orderConfirmTime")
		private String orderConfirmTime;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("orderFlag")
		private String orderFlag;
		/**
		 * orderLines
		 */
		@ApiListField("orderLines")
		@ApiField("order_line")
		private List<OrderLine> orderLines;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("orderNote")
		private String orderNote;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("orderSourceCode")
		private String orderSourceCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("orderStatus")
		private String orderStatus;
		/**
		 * 出库单类型
		 */
		@ApiField("orderType")
		private String orderType;
		/**
		 * 外部业务编码
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
		 * packages
		 */
		@ApiListField("packages")
		@ApiField("package_info")
		private List<PackageInfo> packages;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("payMethod")
		private String payMethod;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("payNo")
		private String payNo;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("payTime")
		private String payTime;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("personalOrderNote")
		private String personalOrderNote;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("personalPackageNote")
		private String personalPackageNote;
		/**
		 * pickerInfo
		 */
		@ApiField("pickerInfo")
		private PickerInfo pickerInfo;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("placeOrderTime")
		private String placeOrderTime;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("planArrivalTime")
		private String planArrivalTime;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("planDeliveryDate")
		private String planDeliveryDate;
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
		@ApiField("presaleOrderType")
		private String presaleOrderType;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("price")
		private String price;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("priorityCode")
		private String priorityCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("produceDate")
		private String produceDate;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("quantity")
		private String quantity;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("receiveOrderTime")
		private String receiveOrderTime;
		/**
		 * receiverInfo
		 */
		@ApiField("receiverInfo")
		private ReceiverInfo receiverInfo;
		/**
		 * relatedOrders
		 */
		@ApiListField("relatedOrders")
		@ApiField("related_order")
		private List<RelatedOrder> relatedOrders;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("remark")
		private String remark;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("salesModel")
		private String salesModel;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("scheduleDate")
		private String scheduleDate;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("sellerId")
		private String sellerId;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("sellerMessage")
		private String sellerMessage;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("sellerNick")
		private String sellerNick;
		/**
		 * senderInfo
		 */
		@ApiField("senderInfo")
		private SenderInfo senderInfo;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("serviceCode")
		private String serviceCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("serviceFee")
		private String serviceFee;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("shelfLife")
		private String shelfLife;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("shopCode")
		private String shopCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("shopNick")
		private String shopNick;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("sourceOrderCode")
		private String sourceOrderCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("sourcePlatformCode")
		private String sourcePlatformCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("sourcePlatformName")
		private String sourcePlatformName;
		/**
		 * 出库单状态
		 */
		@ApiField("status")
		private String status;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("storageFee")
		private String storageFee;
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
		@ApiField("totalAmount")
		private String totalAmount;
		/**
		 * 单据总行数
		 */
		@ApiField("totalOrderLines")
		private Long totalOrderLines;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("transportMode")
		private String transportMode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("transpostSum")
		private String transpostSum;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("uomCode")
		private String uomCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("warehouseAddressCode")
		private String warehouseAddressCode;
		/**
		 * 仓库编码
		 */
		@ApiField("warehouseCode")
		private String warehouseCode;
	

	public String getActualAmount() {
			return this.actualAmount;
		}
		public void setActualAmount(String actualAmount) {
			this.actualAmount = actualAmount;
		}
		public String getArAmount() {
			return this.arAmount;
		}
		public void setArAmount(String arAmount) {
			this.arAmount = arAmount;
		}
		public String getBatchCode() {
			return this.batchCode;
		}
		public void setBatchCode(String batchCode) {
			this.batchCode = batchCode;
		}
		public String getBusinessMemo() {
			return this.businessMemo;
		}
		public void setBusinessMemo(String businessMemo) {
			this.businessMemo = businessMemo;
		}
		public String getBuyerMessage() {
			return this.buyerMessage;
		}
		public void setBuyerMessage(String buyerMessage) {
			this.buyerMessage = buyerMessage;
		}
		public String getBuyerName() {
			return this.buyerName;
		}
		public void setBuyerName(String buyerName) {
			this.buyerName = buyerName;
		}
		public String getBuyerNick() {
			return this.buyerNick;
		}
		public void setBuyerNick(String buyerNick) {
			this.buyerNick = buyerNick;
		}
		public String getBuyerPhone() {
			return this.buyerPhone;
		}
		public void setBuyerPhone(String buyerPhone) {
			this.buyerPhone = buyerPhone;
		}
		public String getCollectedAmount() {
			return this.collectedAmount;
		}
		public void setCollectedAmount(String collectedAmount) {
			this.collectedAmount = collectedAmount;
		}
		public Long getConfirmType() {
			return this.confirmType;
		}
		public void setConfirmType(Long confirmType) {
			this.confirmType = confirmType;
		}
		public String getCreateTime() {
			return this.createTime;
		}
		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}
		public String getDeclaredAmount() {
			return this.declaredAmount;
		}
		public void setDeclaredAmount(String declaredAmount) {
			this.declaredAmount = declaredAmount;
		}
		public String getDeliveryNote() {
			return this.deliveryNote;
		}
		public void setDeliveryNote(String deliveryNote) {
			this.deliveryNote = deliveryNote;
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
		public String getExceptionCode() {
			return this.exceptionCode;
		}
		public void setExceptionCode(String exceptionCode) {
			this.exceptionCode = exceptionCode;
		}
		public String getExpressCode() {
			return this.expressCode;
		}
		public void setExpressCode(String expressCode) {
			this.expressCode = expressCode;
		}
		public String getFetchItemLocation() {
			return this.fetchItemLocation;
		}
		public void setFetchItemLocation(String fetchItemLocation) {
			this.fetchItemLocation = fetchItemLocation;
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
		public String getIdentifyCode() {
			return this.identifyCode;
		}
		public void setIdentifyCode(String identifyCode) {
			this.identifyCode = identifyCode;
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
		public String getIsCod() {
			return this.isCod;
		}
		public void setIsCod(String isCod) {
			this.isCod = isCod;
		}
		public String getIsPaymentCollected() {
			return this.isPaymentCollected;
		}
		public void setIsPaymentCollected(String isPaymentCollected) {
			this.isPaymentCollected = isPaymentCollected;
		}
		public String getIsUrgency() {
			return this.isUrgency;
		}
		public void setIsUrgency(String isUrgency) {
			this.isUrgency = isUrgency;
		}
		public String getIsValueDeclared() {
			return this.isValueDeclared;
		}
		public void setIsValueDeclared(String isValueDeclared) {
			this.isValueDeclared = isValueDeclared;
		}
		public String getItemAmount() {
			return this.itemAmount;
		}
		public void setItemAmount(String itemAmount) {
			this.itemAmount = itemAmount;
		}
		public String getItemCode() {
			return this.itemCode;
		}
		public void setItemCode(String itemCode) {
			this.itemCode = itemCode;
		}
		public String getItemName() {
			return this.itemName;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		public List<Item> getItems() {
			return this.items;
		}
		public void setItems(List<Item> items) {
			this.items = items;
		}
		public String getLineNumber() {
			return this.lineNumber;
		}
		public void setLineNumber(String lineNumber) {
			this.lineNumber = lineNumber;
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
		public String getMaxArrivalTime() {
			return this.maxArrivalTime;
		}
		public void setMaxArrivalTime(String maxArrivalTime) {
			this.maxArrivalTime = maxArrivalTime;
		}
		public String getMergeOrderCodes() {
			return this.mergeOrderCodes;
		}
		public void setMergeOrderCodes(String mergeOrderCodes) {
			this.mergeOrderCodes = mergeOrderCodes;
		}
		public String getMergeOrderFlag() {
			return this.mergeOrderFlag;
		}
		public void setMergeOrderFlag(String mergeOrderFlag) {
			this.mergeOrderFlag = mergeOrderFlag;
		}
		public String getMinArrivalTime() {
			return this.minArrivalTime;
		}
		public void setMinArrivalTime(String minArrivalTime) {
			this.minArrivalTime = minArrivalTime;
		}
		public String getModifiedTime() {
			return this.modifiedTime;
		}
		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}
		public String getNoStackTag() {
			return this.noStackTag;
		}
		public void setNoStackTag(String noStackTag) {
			this.noStackTag = noStackTag;
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
		public String getOrderFlag() {
			return this.orderFlag;
		}
		public void setOrderFlag(String orderFlag) {
			this.orderFlag = orderFlag;
		}
		public List<OrderLine> getOrderLines() {
			return this.orderLines;
		}
		public void setOrderLines(List<OrderLine> orderLines) {
			this.orderLines = orderLines;
		}
		public String getOrderNote() {
			return this.orderNote;
		}
		public void setOrderNote(String orderNote) {
			this.orderNote = orderNote;
		}
		public String getOrderSourceCode() {
			return this.orderSourceCode;
		}
		public void setOrderSourceCode(String orderSourceCode) {
			this.orderSourceCode = orderSourceCode;
		}
		public String getOrderStatus() {
			return this.orderStatus;
		}
		public void setOrderStatus(String orderStatus) {
			this.orderStatus = orderStatus;
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
		public String getPackCode() {
			return this.packCode;
		}
		public void setPackCode(String packCode) {
			this.packCode = packCode;
		}
		public List<PackageInfo> getPackages() {
			return this.packages;
		}
		public void setPackages(List<PackageInfo> packages) {
			this.packages = packages;
		}
		public String getPayMethod() {
			return this.payMethod;
		}
		public void setPayMethod(String payMethod) {
			this.payMethod = payMethod;
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
		public String getPersonalOrderNote() {
			return this.personalOrderNote;
		}
		public void setPersonalOrderNote(String personalOrderNote) {
			this.personalOrderNote = personalOrderNote;
		}
		public String getPersonalPackageNote() {
			return this.personalPackageNote;
		}
		public void setPersonalPackageNote(String personalPackageNote) {
			this.personalPackageNote = personalPackageNote;
		}
		public PickerInfo getPickerInfo() {
			return this.pickerInfo;
		}
		public void setPickerInfo(PickerInfo pickerInfo) {
			this.pickerInfo = pickerInfo;
		}
		public String getPlaceOrderTime() {
			return this.placeOrderTime;
		}
		public void setPlaceOrderTime(String placeOrderTime) {
			this.placeOrderTime = placeOrderTime;
		}
		public String getPlanArrivalTime() {
			return this.planArrivalTime;
		}
		public void setPlanArrivalTime(String planArrivalTime) {
			this.planArrivalTime = planArrivalTime;
		}
		public String getPlanDeliveryDate() {
			return this.planDeliveryDate;
		}
		public void setPlanDeliveryDate(String planDeliveryDate) {
			this.planDeliveryDate = planDeliveryDate;
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
		public String getPresaleOrderType() {
			return this.presaleOrderType;
		}
		public void setPresaleOrderType(String presaleOrderType) {
			this.presaleOrderType = presaleOrderType;
		}
		public String getPrice() {
			return this.price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		public String getPriorityCode() {
			return this.priorityCode;
		}
		public void setPriorityCode(String priorityCode) {
			this.priorityCode = priorityCode;
		}
		public String getProduceDate() {
			return this.produceDate;
		}
		public void setProduceDate(String produceDate) {
			this.produceDate = produceDate;
		}
		public String getQuantity() {
			return this.quantity;
		}
		public void setQuantity(String quantity) {
			this.quantity = quantity;
		}
		public String getReceiveOrderTime() {
			return this.receiveOrderTime;
		}
		public void setReceiveOrderTime(String receiveOrderTime) {
			this.receiveOrderTime = receiveOrderTime;
		}
		public ReceiverInfo getReceiverInfo() {
			return this.receiverInfo;
		}
		public void setReceiverInfo(ReceiverInfo receiverInfo) {
			this.receiverInfo = receiverInfo;
		}
		public List<RelatedOrder> getRelatedOrders() {
			return this.relatedOrders;
		}
		public void setRelatedOrders(List<RelatedOrder> relatedOrders) {
			this.relatedOrders = relatedOrders;
		}
		public String getRemark() {
			return this.remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}
		public String getSalesModel() {
			return this.salesModel;
		}
		public void setSalesModel(String salesModel) {
			this.salesModel = salesModel;
		}
		public String getScheduleDate() {
			return this.scheduleDate;
		}
		public void setScheduleDate(String scheduleDate) {
			this.scheduleDate = scheduleDate;
		}
		public String getSellerId() {
			return this.sellerId;
		}
		public void setSellerId(String sellerId) {
			this.sellerId = sellerId;
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
		public String getShelfLife() {
			return this.shelfLife;
		}
		public void setShelfLife(String shelfLife) {
			this.shelfLife = shelfLife;
		}
		public String getShopCode() {
			return this.shopCode;
		}
		public void setShopCode(String shopCode) {
			this.shopCode = shopCode;
		}
		public String getShopNick() {
			return this.shopNick;
		}
		public void setShopNick(String shopNick) {
			this.shopNick = shopNick;
		}
		public String getSourceOrderCode() {
			return this.sourceOrderCode;
		}
		public void setSourceOrderCode(String sourceOrderCode) {
			this.sourceOrderCode = sourceOrderCode;
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
		public String getTotalAmount() {
			return this.totalAmount;
		}
		public void setTotalAmount(String totalAmount) {
			this.totalAmount = totalAmount;
		}
		public Long getTotalOrderLines() {
			return this.totalOrderLines;
		}
		public void setTotalOrderLines(Long totalOrderLines) {
			this.totalOrderLines = totalOrderLines;
		}
		public String getTransportMode() {
			return this.transportMode;
		}
		public void setTransportMode(String transportMode) {
			this.transportMode = transportMode;
		}
		public String getTranspostSum() {
			return this.transpostSum;
		}
		public void setTranspostSum(String transpostSum) {
			this.transpostSum = transpostSum;
		}
		public String getUomCode() {
			return this.uomCode;
		}
		public void setUomCode(String uomCode) {
			this.uomCode = uomCode;
		}
		public String getWarehouseAddressCode() {
			return this.warehouseAddressCode;
		}
		public void setWarehouseAddressCode(String warehouseAddressCode) {
			this.warehouseAddressCode = warehouseAddressCode;
		}
		public String getWarehouseCode() {
			return this.warehouseCode;
		}
		public void setWarehouseCode(String warehouseCode) {
			this.warehouseCode = warehouseCode;
		}

}

	/**
 * packages
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
		 * 包裹高度(厘米)
		 */
		@ApiField("height")
		private String height;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("invoiceNo")
		private String invoiceNo;
		/**
		 * items
		 */
		@ApiListField("items")
		@ApiField("item")
		private List<Item> items;
		/**
		 * 包裹长度(厘米)
		 */
		@ApiField("length")
		private String length;
		/**
		 * 奇门仓储字段,说明,string(50),,
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
		 * packageMaterialList
		 */
		@ApiListField("packageMaterialList")
		@ApiField("package_material")
		private List<PackageMaterial> packageMaterialList;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("theoreticalWeight")
		private String theoreticalWeight;
		/**
		 * 包裹体积(升)
		 */
		@ApiField("volume")
		private String volume;
		/**
		 * 包裹重量(千克)
		 */
		@ApiField("weight")
		private String weight;
		/**
		 * 包裹宽度(厘米)
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


}
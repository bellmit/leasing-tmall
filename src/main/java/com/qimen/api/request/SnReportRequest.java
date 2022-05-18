package com.qimen.api.request;

import com.qimen.api.QimenRequest;
import com.qimen.api.response.SnReportResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.internal.util.RequestCheckUtils;

import java.util.List;
import java.util.Map;

/**
 * TOP API: taobao.qimen.sn.report request
 * 
 * @author top auto create
 * @since 1.0, 2017.04.28
 */
public class SnReportRequest extends QimenRequest<SnReportResponse> {
	
	

	/** 
	* 当前页(从1开始)
	 */
	private Long currentPage;

	/** 
	* 发货单信息
	 */
	private DeliveryOrder deliveryOrder;

	/** 
	* 扩展属性
	 */
	private Map extendProps;

	/**
	* 商品列表
	 */
	private List<Item> items;

	/**
	* 每页记录的条数
	 */
	private Long pageSize;

	/**
	* 总页数
	 */
	private Long totalPage;

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}

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

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public List<Item> getItems() {
		return this.items;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}

	public Long getTotalPage() {
		return this.totalPage;
	}

	public String getApiMethodName() {
		return "taobao.qimen.sn.report";
	}

	public Class<SnReportResponse> getResponseClass() {
		return SnReportResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(currentPage, "currentPage");
		RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
		RequestCheckUtils.checkNotEmpty(totalPage, "totalPage");
	}
	
	/**
 * null
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class DeliveryRequirements {

	/**
		 * null
		 */
		@ApiField("deliveryType")
		private String deliveryType;
		/**
		 * null
		 */
		@ApiField("scheduleDay")
		private String scheduleDay;
		/**
		 * null
		 */
		@ApiField("scheduleEndTime")
		private String scheduleEndTime;
		/**
		 * null
		 */
		@ApiField("scheduleStartTime")
		private String scheduleStartTime;
		/**
		 * null
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
		@ApiField("mobile")
		private String mobile;
		/**
		 * null
		 */
		@ApiField("name")
		private String name;
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
		@ApiField("tel")
		private String tel;
		/**
		 * null
		 */
		@ApiField("town")
		private String town;
		/**
		 * null
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
		@ApiField("mobile")
		private String mobile;
		/**
		 * null
		 */
		@ApiField("name")
		private String name;
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
		@ApiField("tel")
		private String tel;
		/**
		 * null
		 */
		@ApiField("town")
		private String town;
		/**
		 * null
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
public static class Item {

	/**
		 * null
		 */
		@ApiField("actualAmount")
		private String actualAmount;
		/**
		 * null
		 */
		@ApiField("actualQty")
		private String actualQty;
		/**
		 * null
		 */
		@ApiField("adventLifecycle")
		private String adventLifecycle;
		/**
		 * null
		 */
		@ApiField("amount")
		private String amount;
		/**
		 * null
		 */
		@ApiField("approvalNumber")
		private String approvalNumber;
		/**
		 * null
		 */
		@ApiField("barCode")
		private String barCode;
		/**
		 * null
		 */
		@ApiField("batchCode")
		private String batchCode;
		/**
		 * null
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
		 * null
		 */
		@ApiField("brandCode")
		private String brandCode;
		/**
		 * null
		 */
		@ApiField("brandName")
		private String brandName;
		/**
		 * null
		 */
		@ApiField("categoryId")
		private String categoryId;
		/**
		 * null
		 */
		@ApiField("categoryName")
		private String categoryName;
		/**
		 * null
		 */
		@ApiField("changeTime")
		private String changeTime;
		/**
		 * null
		 */
		@ApiField("channelCode")
		private String channelCode;
		/**
		 * null
		 */
		@ApiField("color")
		private String color;
		/**
		 * null
		 */
		@ApiField("costPrice")
		private String costPrice;
		/**
		 * null
		 */
		@ApiField("defectiveQty")
		private String defectiveQty;
		/**
		 * null
		 */
		@ApiField("diffQuantity")
		private String diffQuantity;
		/**
		 * null
		 */
		@ApiField("discount")
		private String discount;
		/**
		 * null
		 */
		@ApiField("discountPrice")
		private String discountPrice;
		/**
		 * null
		 */
		@ApiField("englishName")
		private String englishName;
		/**
		 * null
		 */
		@ApiField("exCode")
		private String exCode;
		/**
		 * null
		 */
		@ApiField("expireDate")
		private String expireDate;
		/**
		 * null
		 */
		@ApiField("extCode")
		private String extCode;
		/**
		 * null
		 */
		@ApiField("goodsCode")
		private String goodsCode;
		/**
		 * null
		 */
		@ApiField("grossWeight")
		private String grossWeight;
		/**
		 * null
		 */
		@ApiField("height")
		private String height;
		/**
		 * null
		 */
		@ApiField("inventoryType")
		private String inventoryType;
		/**
		 * null
		 */
		@ApiField("isAreaSale")
		private String isAreaSale;
		/**
		 * null
		 */
		@ApiField("isBatchMgmt")
		private String isBatchMgmt;
		/**
		 * null
		 */
		@ApiField("isFragile")
		private String isFragile;
		/**
		 * null
		 */
		@ApiField("isHazardous")
		private String isHazardous;
		/**
		 * null
		 */
		@ApiField("isSNMgmt")
		private String isSNMgmt;
		/**
		 * null
		 */
		@ApiField("isShelfLifeMgmt")
		private String isShelfLifeMgmt;
		/**
		 * null
		 */
		@ApiField("isSku")
		private String isSku;
		/**
		 * null
		 */
		@ApiField("itemCode")
		private String itemCode;
		/**
		 * null
		 */
		@ApiField("itemId")
		private String itemId;
		/**
		 * null
		 */
		@ApiField("itemName")
		private String itemName;
		/**
		 * null
		 */
		@ApiField("itemType")
		private String itemType;
		/**
		 * null
		 */
		@ApiField("lackQty")
		private String lackQty;
		/**
		 * null
		 */
		@ApiField("latestUpdateTime")
		private String latestUpdateTime;
		/**
		 * null
		 */
		@ApiField("length")
		private String length;
		/**
		 * null
		 */
		@ApiField("lockQuantity")
		private String lockQuantity;
		/**
		 * null
		 */
		@ApiField("lockupLifecycle")
		private String lockupLifecycle;
		/**
		 * null
		 */
		@ApiField("netWeight")
		private String netWeight;
		/**
		 * null
		 */
		@ApiField("normalQty")
		private String normalQty;
		/**
		 * null
		 */
		@ApiField("orderCode")
		private String orderCode;
		/**
		 * null
		 */
		@ApiField("orderLineNo")
		private String orderLineNo;
		/**
		 * null
		 */
		@ApiField("orderType")
		private String orderType;
		/**
		 * null
		 */
		@ApiField("originAddress")
		private String originAddress;
		/**
		 * null
		 */
		@ApiField("originCode")
		private String originCode;
		/**
		 * null
		 */
		@ApiField("outBizCode")
		private String outBizCode;
		/**
		 * null
		 */
		@ApiField("ownerCode")
		private String ownerCode;
		/**
		 * null
		 */
		@ApiField("packCode")
		private String packCode;
		/**
		 * null
		 */
		@ApiField("packageMaterial")
		private String packageMaterial;
		/**
		 * null
		 */
		@ApiField("paperQty")
		private String paperQty;
		/**
		 * null
		 */
		@ApiField("pcs")
		private String pcs;
		/**
		 * null
		 */
		@ApiField("planQty")
		private String planQty;
		/**
		 * null
		 */
		@ApiField("price")
		private String price;
		/**
		 * null
		 */
		@ApiField("priceAdjustment")
		private PriceAdjustment priceAdjustment;
		/**
		 * null
		 */
		@ApiField("pricingCategory")
		private String pricingCategory;
		/**
		 * null
		 */
		@ApiField("produceCode")
		private String produceCode;
		/**
		 * null
		 */
		@ApiField("productCode")
		private String productCode;
		/**
		 * null
		 */
		@ApiField("productDate")
		private String productDate;
		/**
		 * null
		 */
		@ApiField("purchasePrice")
		private String purchasePrice;
		/**
		 * null
		 */
		@ApiField("quantity")
		private String quantity;
		/**
		 * null
		 */
		@ApiField("reason")
		private String reason;
		/**
		 * null
		 */
		@ApiField("receiveQty")
		private String receiveQty;
		/**
		 * null
		 */
		@ApiField("referencePrice")
		private String referencePrice;
		/**
		 * null
		 */
		@ApiField("rejectLifecycle")
		private String rejectLifecycle;
		/**
		 * null
		 */
		@ApiField("retailPrice")
		private String retailPrice;
		/**
		 * null
		 */
		@ApiField("safetyStock")
		private String safetyStock;
		/**
		 * null
		 */
		@ApiField("seasonCode")
		private String seasonCode;
		/**
		 * null
		 */
		@ApiField("seasonName")
		private String seasonName;
		/**
		 * null
		 */
		@ApiField("shelfLife")
		private String shelfLife;
		/**
		 * null
		 */
		@ApiField("shortName")
		private String shortName;
		/**
		 * null
		 */
		@ApiField("size")
		private String size;
		/**
		 * null
		 */
		@ApiField("skuProperty")
		private String skuProperty;
		/**
		 * null
		 */
		@ApiField("sn")
		private String sn;
		/**
		 * null
		 */
		@ApiField("snCode")
		private String snCode;
		/**
		 * null
		 */
		@ApiField("sourceOrderCode")
		private String sourceOrderCode;
		/**
		 * null
		 */
		@ApiField("standardPrice")
		private String standardPrice;
		/**
		 * null
		 */
		@ApiField("stockStatus")
		private String stockStatus;
		/**
		 * null
		 */
		@ApiField("stockUnit")
		private String stockUnit;
		/**
		 * null
		 */
		@ApiField("subSourceOrderCode")
		private String subSourceOrderCode;
		/**
		 * null
		 */
		@ApiField("supplierCode")
		private String supplierCode;
		/**
		 * null
		 */
		@ApiField("supplierName")
		private String supplierName;
		/**
		 * null
		 */
		@ApiField("tagPrice")
		private String tagPrice;
		/**
		 * null
		 */
		@ApiField("tareWeight")
		private String tareWeight;
		/**
		 * null
		 */
		@ApiField("tempRequirement")
		private String tempRequirement;
		/**
		 * null
		 */
		@ApiField("title")
		private String title;
		/**
		 * null
		 */
		@ApiField("unit")
		private String unit;
		/**
		 * null
		 */
		@ApiField("volume")
		private String volume;
		/**
		 * null
		 */
		@ApiField("warehouseCode")
		private String warehouseCode;
		/**
		 * null
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
		 * null
		 */
		@ApiField("amount")
		private String amount;
		/**
		 * null
		 */
		@ApiField("code")
		private String code;
		/**
		 * null
		 */
		@ApiField("content")
		private String content;
		/**
		 * null
		 */
		@ApiField("detail")
		private Detail detail;
		/**
		 * null
		 */
		@ApiField("header")
		private String header;
		/**
		 * null
		 */
		@ApiField("number")
		private String number;
		/**
		 * null
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
		@ApiField("mobile")
		private String mobile;
		/**
		 * null
		 */
		@ApiField("name")
		private String name;
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
		@ApiField("tel")
		private String tel;
		/**
		 * null
		 */
		@ApiField("town")
		private String town;
		/**
		 * null
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
public static class OrderLine {

	/**
		 * null
		 */
		@ApiField("actualPrice")
		private String actualPrice;
		/**
		 * null
		 */
		@ApiField("actualQty")
		private String actualQty;
		/**
		 * null
		 */
		@ApiField("amount")
		private String amount;
		/**
		 * null
		 */
		@ApiField("batchCode")
		private String batchCode;
		/**
		 * null
		 */
		@ApiListField("batchs")
		@ApiField("batch")
		private List<Batch> batchs;
		/**
		 * null
		 */
		@ApiField("color")
		private String color;
		/**
		 * null
		 */
		@ApiField("deliveryOrderId")
		private String deliveryOrderId;
		/**
		 * null
		 */
		@ApiField("discount")
		private String discount;
		/**
		 * null
		 */
		@ApiField("discountAmount")
		private String discountAmount;
		/**
		 * null
		 */
		@ApiField("discountPrice")
		private String discountPrice;
		/**
		 * null
		 */
		@ApiField("exceptionQty")
		private String exceptionQty;
		/**
		 * null
		 */
		@ApiField("expireDate")
		private String expireDate;
		/**
		 * null
		 */
		@ApiField("extCode")
		private String extCode;
		/**
		 * null
		 */
		@ApiField("inventoryType")
		private String inventoryType;
		/**
		 * null
		 */
		@ApiField("itemCode")
		private String itemCode;
		/**
		 * null
		 */
		@ApiField("itemId")
		private String itemId;
		/**
		 * null
		 */
		@ApiField("itemName")
		private String itemName;
		/**
		 * null
		 */
		@ApiField("locationCode")
		private String locationCode;
		/**
		 * null
		 */
		@ApiField("moveInLocation")
		private String moveInLocation;
		/**
		 * null
		 */
		@ApiField("moveOutLocation")
		private String moveOutLocation;
		/**
		 * null
		 */
		@ApiField("orderLineNo")
		private String orderLineNo;
		/**
		 * null
		 */
		@ApiField("orderSourceCode")
		private String orderSourceCode;
		/**
		 * null
		 */
		@ApiField("outBizCode")
		private String outBizCode;
		/**
		 * null
		 */
		@ApiField("ownerCode")
		private String ownerCode;
		/**
		 * null
		 */
		@ApiField("payNo")
		private String payNo;
		/**
		 * null
		 */
		@ApiField("planQty")
		private String planQty;
		/**
		 * null
		 */
		@ApiField("produceCode")
		private String produceCode;
		/**
		 * null
		 */
		@ApiField("productCode")
		private String productCode;
		/**
		 * null
		 */
		@ApiField("productDate")
		private String productDate;
		/**
		 * null
		 */
		@ApiField("purchasePrice")
		private String purchasePrice;
		/**
		 * null
		 */
		@ApiField("qrCode")
		private String qrCode;
		/**
		 * null
		 */
		@ApiField("quantity")
		private String quantity;
		/**
		 * null
		 */
		@ApiField("referencePrice")
		private String referencePrice;
		/**
		 * null
		 */
		@ApiField("retailPrice")
		private String retailPrice;
		/**
		 * null
		 */
		@ApiField("settlementAmount")
		private String settlementAmount;
		/**
		 * null
		 */
		@ApiField("size")
		private String size;
		/**
		 * null
		 */
		@ApiField("skuProperty")
		private String skuProperty;
		/**
		 * null
		 */
		@ApiField("sourceOrderCode")
		private String sourceOrderCode;
		/**
		 * null
		 */
		@ApiField("standardAmount")
		private String standardAmount;
		/**
		 * null
		 */
		@ApiField("standardPrice")
		private String standardPrice;
		/**
		 * null
		 */
		@ApiField("status")
		private String status;
		/**
		 * null
		 */
		@ApiField("stockInQty")
		private String stockInQty;
		/**
		 * null
		 */
		@ApiField("stockOutQty")
		private String stockOutQty;
		/**
		 * null
		 */
		@ApiField("subDeliveryOrderId")
		private String subDeliveryOrderId;
		/**
		 * null
		 */
		@ApiField("subSourceCode")
		private String subSourceCode;
		/**
		 * null
		 */
		@ApiField("subSourceOrderCode")
		private String subSourceOrderCode;
		/**
		 * null
		 */
		@ApiField("taobaoItemCode")
		private String taobaoItemCode;
		/**
		 * null
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
 * 发货单信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class DeliveryOrder {

	/**
		 * null
		 */
		@ApiField("actualAmount")
		private String actualAmount;
		/**
		 * null
		 */
		@ApiField("arAmount")
		private String arAmount;
		/**
		 * null
		 */
		@ApiField("batchCode")
		private String batchCode;
		/**
		 * null
		 */
		@ApiField("businessMemo")
		private String businessMemo;
		/**
		 * null
		 */
		@ApiField("buyerMessage")
		private String buyerMessage;
		/**
		 * null
		 */
		@ApiField("buyerName")
		private String buyerName;
		/**
		 * null
		 */
		@ApiField("buyerNick")
		private String buyerNick;
		/**
		 * null
		 */
		@ApiField("buyerPhone")
		private String buyerPhone;
		/**
		 * null
		 */
		@ApiField("collectedAmount")
		private String collectedAmount;
		/**
		 * null
		 */
		@ApiField("confirmType")
		private String confirmType;
		/**
		 * null
		 */
		@ApiField("createTime")
		private String createTime;
		/**
		 * null
		 */
		@ApiField("declaredAmount")
		private String declaredAmount;
		/**
		 * null
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
		 * null
		 */
		@ApiField("deliveryRequirements")
		private DeliveryRequirements deliveryRequirements;
		/**
		 * null
		 */
		@ApiField("discountAmount")
		private String discountAmount;
		/**
		 * null
		 */
		@ApiField("exceptionCode")
		private String exceptionCode;
		/**
		 * null
		 */
		@ApiField("expressCode")
		private String expressCode;
		/**
		 * null
		 */
		@ApiField("fetchItemLocation")
		private String fetchItemLocation;
		/**
		 * null
		 */
		@ApiField("freight")
		private String freight;
		/**
		 * null
		 */
		@ApiField("gotAmount")
		private String gotAmount;
		/**
		 * null
		 */
		@ApiField("identifyCode")
		private String identifyCode;
		/**
		 * null
		 */
		@ApiField("insuranceFlag")
		private String insuranceFlag;
		/**
		 * null
		 */
		@ApiField("invoiceFlag")
		private String invoiceFlag;
		/**
		 * null
		 */
		@ApiListField("invoices")
		@ApiField("invoice")
		private List<Invoice> invoices;
		/**
		 * null
		 */
		@ApiField("isCod")
		private String isCod;
		/**
		 * null
		 */
		@ApiField("isPaymentCollected")
		private String isPaymentCollected;
		/**
		 * null
		 */
		@ApiField("isUrgency")
		private String isUrgency;
		/**
		 * null
		 */
		@ApiField("isValueDeclared")
		private String isValueDeclared;
		/**
		 * null
		 */
		@ApiField("itemAmount")
		private String itemAmount;
		/**
		 * null
		 */
		@ApiField("itemCode")
		private String itemCode;
		/**
		 * null
		 */
		@ApiField("itemName")
		private String itemName;
		/**
		 * null
		 */
		@ApiListField("items")
		@ApiField("item")
		private List<Item> items;
		/**
		 * null
		 */
		@ApiField("lineNumber")
		private String lineNumber;
		/**
		 * null
		 */
		@ApiField("logisticsAreaCode")
		private String logisticsAreaCode;
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
		@ApiField("maxArrivalTime")
		private String maxArrivalTime;
		/**
		 * null
		 */
		@ApiField("mergeOrderCodes")
		private String mergeOrderCodes;
		/**
		 * null
		 */
		@ApiField("mergeOrderFlag")
		private String mergeOrderFlag;
		/**
		 * null
		 */
		@ApiField("minArrivalTime")
		private String minArrivalTime;
		/**
		 * null
		 */
		@ApiField("modifiedTime")
		private String modifiedTime;
		/**
		 * null
		 */
		@ApiField("noStackTag")
		private String noStackTag;
		/**
		 * null
		 */
		@ApiField("operateTime")
		private String operateTime;
		/**
		 * null
		 */
		@ApiField("operatorCode")
		private String operatorCode;
		/**
		 * null
		 */
		@ApiField("operatorName")
		private String operatorName;
		/**
		 * null
		 */
		@ApiField("orderConfirmTime")
		private String orderConfirmTime;
		/**
		 * null
		 */
		@ApiField("orderFlag")
		private String orderFlag;
		/**
		 * null
		 */
		@ApiListField("orderLines")
		@ApiField("orderLine")
		private List<OrderLine> orderLines;
		/**
		 * null
		 */
		@ApiField("orderNote")
		private String orderNote;
		/**
		 * null
		 */
		@ApiField("orderSourceCode")
		private String orderSourceCode;
		/**
		 * null
		 */
		@ApiField("orderStatus")
		private String orderStatus;
		/**
		 * 出库单类型(JYCK=一般交易出库;HHCK=换货出库;BFCK=补发出库;PTCK=普通出库单;DBCK=调拨出库;QTCK=其他出 库;B2BCK=B2B出库)
		 */
		@ApiField("orderType")
		private String orderType;
		/**
		 * 外部业务编码(消息ID;用于去重;ISV对于同一请求;分配一个唯一性的编码。用来保证因为网络等原因导致重复传输;请求不会 被重复处理;条件必填;条件为一单需要多次确认时)
		 */
		@ApiField("outBizCode")
		private String outBizCode;
		/**
		 * 货主编码
		 */
		@ApiField("ownerCode")
		private String ownerCode;
		/**
		 * null
		 */
		@ApiField("packCode")
		private String packCode;
		/**
		 * null
		 */
		@ApiListField("packages")
		@ApiField("package")
		private List<Package> packages;
		/**
		 * null
		 */
		@ApiField("payMethod")
		private String payMethod;
		/**
		 * null
		 */
		@ApiField("payNo")
		private String payNo;
		/**
		 * null
		 */
		@ApiField("payTime")
		private String payTime;
		/**
		 * null
		 */
		@ApiField("personalOrderNote")
		private String personalOrderNote;
		/**
		 * null
		 */
		@ApiField("personalPackageNote")
		private String personalPackageNote;
		/**
		 * null
		 */
		@ApiField("pickerInfo")
		private PickerInfo pickerInfo;
		/**
		 * null
		 */
		@ApiField("placeOrderTime")
		private String placeOrderTime;
		/**
		 * null
		 */
		@ApiField("planArrivalTime")
		private String planArrivalTime;
		/**
		 * null
		 */
		@ApiField("planDeliveryDate")
		private String planDeliveryDate;
		/**
		 * null
		 */
		@ApiField("preDeliveryOrderCode")
		private String preDeliveryOrderCode;
		/**
		 * null
		 */
		@ApiField("preDeliveryOrderId")
		private String preDeliveryOrderId;
		/**
		 * null
		 */
		@ApiField("presaleOrderType")
		private String presaleOrderType;
		/**
		 * null
		 */
		@ApiField("price")
		private String price;
		/**
		 * null
		 */
		@ApiField("priorityCode")
		private String priorityCode;
		/**
		 * null
		 */
		@ApiField("produceDate")
		private String produceDate;
		/**
		 * null
		 */
		@ApiField("quantity")
		private String quantity;
		/**
		 * null
		 */
		@ApiField("receiveOrderTime")
		private String receiveOrderTime;
		/**
		 * null
		 */
		@ApiField("receiverInfo")
		private ReceiverInfo receiverInfo;
		/**
		 * null
		 */
		@ApiListField("relatedOrders")
		@ApiField("relatedOrder")
		private List<RelatedOrder> relatedOrders;
		/**
		 * null
		 */
		@ApiField("remark")
		private String remark;
		/**
		 * null
		 */
		@ApiField("salesModel")
		private String salesModel;
		/**
		 * null
		 */
		@ApiField("scheduleDate")
		private String scheduleDate;
		/**
		 * null
		 */
		@ApiField("sellerId")
		private String sellerId;
		/**
		 * null
		 */
		@ApiField("sellerMessage")
		private String sellerMessage;
		/**
		 * null
		 */
		@ApiField("sellerNick")
		private String sellerNick;
		/**
		 * null
		 */
		@ApiField("senderInfo")
		private SenderInfo senderInfo;
		/**
		 * null
		 */
		@ApiField("serviceCode")
		private String serviceCode;
		/**
		 * null
		 */
		@ApiField("serviceFee")
		private String serviceFee;
		/**
		 * null
		 */
		@ApiField("shelfLife")
		private String shelfLife;
		/**
		 * null
		 */
		@ApiField("shopCode")
		private String shopCode;
		/**
		 * null
		 */
		@ApiField("shopNick")
		private String shopNick;
		/**
		 * null
		 */
		@ApiField("sourceOrderCode")
		private String sourceOrderCode;
		/**
		 * null
		 */
		@ApiField("sourcePlatformCode")
		private String sourcePlatformCode;
		/**
		 * null
		 */
		@ApiField("sourcePlatformName")
		private String sourcePlatformName;
		/**
		 * null
		 */
		@ApiField("status")
		private String status;
		/**
		 * null
		 */
		@ApiField("storageFee")
		private String storageFee;
		/**
		 * null
		 */
		@ApiField("supplierCode")
		private String supplierCode;
		/**
		 * null
		 */
		@ApiField("supplierName")
		private String supplierName;
		/**
		 * null
		 */
		@ApiField("totalAmount")
		private String totalAmount;
		/**
		 * null
		 */
		@ApiField("totalOrderLines")
		private String totalOrderLines;
		/**
		 * null
		 */
		@ApiField("transportMode")
		private String transportMode;
		/**
		 * null
		 */
		@ApiField("transpostSum")
		private String transpostSum;
		/**
		 * null
		 */
		@ApiField("uomCode")
		private String uomCode;
		/**
		 * null
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
		public String getConfirmType() {
			return this.confirmType;
		}
		public void setConfirmType(String confirmType) {
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
		public List<Package> getPackages() {
			return this.packages;
		}
		public void setPackages(List<Package> packages) {
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
		public String getTotalOrderLines() {
			return this.totalOrderLines;
		}
		public void setTotalOrderLines(String totalOrderLines) {
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


}
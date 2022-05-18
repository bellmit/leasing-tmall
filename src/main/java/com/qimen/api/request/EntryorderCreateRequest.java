package com.qimen.api.request;

import com.qimen.api.QimenRequest;
import com.qimen.api.response.EntryorderCreateResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;
import java.util.Map;

/**
 * TOP API: taobao.qimen.entryorder.create request
 * 
 * @author top auto create
 * @since 1.0, 2017.04.27
 */
public class EntryorderCreateRequest extends QimenRequest<EntryorderCreateResponse> {
	
	

	/** 
	* 入库单信息
	 */
	private EntryOrder entryOrder;

	/** 
	* 扩展属性
	 */
	private Map extendProps;

	/**
	* 商品信息
	 */
	private List<Item> items;

	/**
	* 入库单详情
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

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public List<Item> getItems() {
		return this.items;
	}

	public void setOrderLines(List<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}

	public List<OrderLine> getOrderLines() {
		return this.orderLines;
	}

	public String getApiMethodName() {
		return "taobao.qimen.entryorder.create";
	}

	public Class<EntryorderCreateResponse> getResponseClass() {
		return EntryorderCreateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
 * 关联订单信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class RelatedOrder {

	/**
		 * 关联的订单编号
		 */
		@ApiField("orderCode")
		private String orderCode;
		/**
		 * 关联的订单类型(CG=采购单;DB=调拨单;CK=出库单;RK=入库单;只传英文编码)
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
		 * temp
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
		 * temp
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
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("birthDate")
		private String birthDate;
		/**
		 * temp
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
		 * temp
		 */
		@ApiField("id")
		private String id;
		/**
		 * 收件人证件号码
		 */
		@ApiField("idNumber")
		private String idNumber;
		/**
		 * 收件人证件类型(1-身份证;2-军官证;3-护照;4-其他)
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
 * 入库单信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class EntryOrder {

	/**
		 * temp
		 */
		@ApiField("businessId")
		private String businessId;
		/**
		 * temp
		 */
		@ApiField("confirmType")
		private String confirmType;
		/**
		 * temp
		 */
		@ApiField("consignId")
		private String consignId;
		/**
		 * temp
		 */
		@ApiField("contractCode")
		private String contractCode;
		/**
		 * 入库单号
		 */
		@ApiField("entryOrderCode")
		private String entryOrderCode;
		/**
		 * 最迟预期到货时间(YYYY-MM-DD HH:MM:SS)
		 */
		@ApiField("expectEndTime")
		private String expectEndTime;
		/**
		 * 预期到货时间(YYYY-MM-DD HH:MM:SS)
		 */
		@ApiField("expectStartTime")
		private String expectStartTime;
		/**
		 * 运单号
		 */
		@ApiField("expressCode")
		private String expressCode;
		/**
		 * temp
		 */
		@ApiField("extOrderCode")
		private String extOrderCode;
		/**
		 * temp
		 */
		@ApiField("isCheck")
		private String isCheck;
		/**
		 * temp
		 */
		@ApiField("isNudePackage")
		private String isNudePackage;
		/**
		 * 物流公司编码(SF=顺丰、EMS=标准快递、EYB=经济快件、ZJS=宅急送、YTO=圆通 、ZTO=中通(ZTO)、HTKY=百世汇通、 UC=优速、STO=申通、TTKDEX=天天快递、QFKD=全峰、FAST=快捷、POSTB=邮政小包、GTO=国通、YUNDA=韵达、JD=京东配送、DD=当当宅配、 AMAZON=亚马逊物流、OTHER=其他(只传英文编码))
		 */
		@ApiField("logisticsCode")
		private String logisticsCode;
		/**
		 * temp
		 */
		@ApiField("logisticsContactName")
		private String logisticsContactName;
		/**
		 * temp
		 */
		@ApiField("logisticsContactNo")
		private String logisticsContactNo;
		/**
		 * temp
		 */
		@ApiField("logisticsContactPhone")
		private String logisticsContactPhone;
		/**
		 * 物流公司名称
		 */
		@ApiField("logisticsName")
		private String logisticsName;
		/**
		 * 操作时间(YYYY-MM-DD HH:MM:SS)
		 */
		@ApiField("operateTime")
		private String operateTime;
		/**
		 * 操作员编码
		 */
		@ApiField("operatorCode")
		private String operatorCode;
		/**
		 * 操作员名称
		 */
		@ApiField("operatorName")
		private String operatorName;
		/**
		 * 订单创建时间(YYYY-MM-DD HH:MM:SS)
		 */
		@ApiField("orderCreateTime")
		private String orderCreateTime;
		/**
		 * temp
		 */
		@ApiField("orderSource")
		private String orderSource;
		/**
		 * 业务类型(SCRK=生产入库;LYRK=领用入库;CCRK=残次品入库;CGRK=采购入库;DBRK=调拨入库;QTRK=其他入库;B2BRK=B2B入 库;XNRK=虚拟入库;只传英文编码)
		 */
		@ApiField("orderType")
		private String orderType;
		/**
		 * temp
		 */
		@ApiField("outBizCode")
		private String outBizCode;
		/**
		 * 货主编码
		 */
		@ApiField("ownerCode")
		private String ownerCode;
		/**
		 * temp
		 */
		@ApiField("planArrivalTime")
		private String planArrivalTime;
		/**
		 * 采购单号(当orderType=CGRK时使用)
		 */
		@ApiField("purchaseOrderCode")
		private String purchaseOrderCode;
		/**
		 * 收件人信息
		 */
		@ApiField("receiverInfo")
		private ReceiverInfo receiverInfo;
		/**
		 * 关联订单信息
		 */
		@ApiListField("relatedOrders")
		@ApiField("related_order")
		private List<RelatedOrder> relatedOrders;
		/**
		 * 备注
		 */
		@ApiField("remark")
		private String remark;
		/**
		 * 发件人信息
		 */
		@ApiField("senderInfo")
		private SenderInfo senderInfo;
		/**
		 * temp
		 */
		@ApiField("sizeDetail")
		private String sizeDetail;
		/**
		 * temp
		 */
		@ApiField("status")
		private String status;
		/**
		 * temp
		 */
		@ApiField("supplierAddress")
		private String supplierAddress;
		/**
		 * temp
		 */
		@ApiField("supplierArea")
		private String supplierArea;
		/**
		 * temp
		 */
		@ApiField("supplierCity")
		private String supplierCity;
		/**
		 * 供应商编码
		 */
		@ApiField("supplierCode")
		private String supplierCode;
		/**
		 * temp
		 */
		@ApiField("supplierEmail")
		private String supplierEmail;
		/**
		 * 供应商名称
		 */
		@ApiField("supplierName")
		private String supplierName;
		/**
		 * temp
		 */
		@ApiField("supplierPhone")
		private String supplierPhone;
		/**
		 * temp
		 */
		@ApiField("supplierProvince")
		private String supplierProvince;
		/**
		 * temp
		 */
		@ApiField("supplierTel")
		private String supplierTel;
		/**
		 * temp
		 */
		@ApiField("supplierTown")
		private String supplierTown;
		/**
		 * temp
		 */
		@ApiField("supplierZipCode")
		private String supplierZipCode;
		/**
		 * 仓库编码(统仓统配等无需ERP指定仓储编码的情况填OTHER)
		 */
		@ApiField("warehouseCode")
		private String warehouseCode;
	

	public String getBusinessId() {
			return this.businessId;
		}
		public void setBusinessId(String businessId) {
			this.businessId = businessId;
		}
		public String getConfirmType() {
			return this.confirmType;
		}
		public void setConfirmType(String confirmType) {
			this.confirmType = confirmType;
		}
		public String getConsignId() {
			return this.consignId;
		}
		public void setConsignId(String consignId) {
			this.consignId = consignId;
		}
		public String getContractCode() {
			return this.contractCode;
		}
		public void setContractCode(String contractCode) {
			this.contractCode = contractCode;
		}
		public String getEntryOrderCode() {
			return this.entryOrderCode;
		}
		public void setEntryOrderCode(String entryOrderCode) {
			this.entryOrderCode = entryOrderCode;
		}
		public String getExpectEndTime() {
			return this.expectEndTime;
		}
		public void setExpectEndTime(String expectEndTime) {
			this.expectEndTime = expectEndTime;
		}
		public String getExpectStartTime() {
			return this.expectStartTime;
		}
		public void setExpectStartTime(String expectStartTime) {
			this.expectStartTime = expectStartTime;
		}
		public String getExpressCode() {
			return this.expressCode;
		}
		public void setExpressCode(String expressCode) {
			this.expressCode = expressCode;
		}
		public String getExtOrderCode() {
			return this.extOrderCode;
		}
		public void setExtOrderCode(String extOrderCode) {
			this.extOrderCode = extOrderCode;
		}
		public String getIsCheck() {
			return this.isCheck;
		}
		public void setIsCheck(String isCheck) {
			this.isCheck = isCheck;
		}
		public String getIsNudePackage() {
			return this.isNudePackage;
		}
		public void setIsNudePackage(String isNudePackage) {
			this.isNudePackage = isNudePackage;
		}
		public String getLogisticsCode() {
			return this.logisticsCode;
		}
		public void setLogisticsCode(String logisticsCode) {
			this.logisticsCode = logisticsCode;
		}
		public String getLogisticsContactName() {
			return this.logisticsContactName;
		}
		public void setLogisticsContactName(String logisticsContactName) {
			this.logisticsContactName = logisticsContactName;
		}
		public String getLogisticsContactNo() {
			return this.logisticsContactNo;
		}
		public void setLogisticsContactNo(String logisticsContactNo) {
			this.logisticsContactNo = logisticsContactNo;
		}
		public String getLogisticsContactPhone() {
			return this.logisticsContactPhone;
		}
		public void setLogisticsContactPhone(String logisticsContactPhone) {
			this.logisticsContactPhone = logisticsContactPhone;
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
		public String getOrderCreateTime() {
			return this.orderCreateTime;
		}
		public void setOrderCreateTime(String orderCreateTime) {
			this.orderCreateTime = orderCreateTime;
		}
		public String getOrderSource() {
			return this.orderSource;
		}
		public void setOrderSource(String orderSource) {
			this.orderSource = orderSource;
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
		public String getPurchaseOrderCode() {
			return this.purchaseOrderCode;
		}
		public void setPurchaseOrderCode(String purchaseOrderCode) {
			this.purchaseOrderCode = purchaseOrderCode;
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
		public SenderInfo getSenderInfo() {
			return this.senderInfo;
		}
		public void setSenderInfo(SenderInfo senderInfo) {
			this.senderInfo = senderInfo;
		}
		public String getSizeDetail() {
			return this.sizeDetail;
		}
		public void setSizeDetail(String sizeDetail) {
			this.sizeDetail = sizeDetail;
		}
		public String getStatus() {
			return this.status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getSupplierAddress() {
			return this.supplierAddress;
		}
		public void setSupplierAddress(String supplierAddress) {
			this.supplierAddress = supplierAddress;
		}
		public String getSupplierArea() {
			return this.supplierArea;
		}
		public void setSupplierArea(String supplierArea) {
			this.supplierArea = supplierArea;
		}
		public String getSupplierCity() {
			return this.supplierCity;
		}
		public void setSupplierCity(String supplierCity) {
			this.supplierCity = supplierCity;
		}
		public String getSupplierCode() {
			return this.supplierCode;
		}
		public void setSupplierCode(String supplierCode) {
			this.supplierCode = supplierCode;
		}
		public String getSupplierEmail() {
			return this.supplierEmail;
		}
		public void setSupplierEmail(String supplierEmail) {
			this.supplierEmail = supplierEmail;
		}
		public String getSupplierName() {
			return this.supplierName;
		}
		public void setSupplierName(String supplierName) {
			this.supplierName = supplierName;
		}
		public String getSupplierPhone() {
			return this.supplierPhone;
		}
		public void setSupplierPhone(String supplierPhone) {
			this.supplierPhone = supplierPhone;
		}
		public String getSupplierProvince() {
			return this.supplierProvince;
		}
		public void setSupplierProvince(String supplierProvince) {
			this.supplierProvince = supplierProvince;
		}
		public String getSupplierTel() {
			return this.supplierTel;
		}
		public void setSupplierTel(String supplierTel) {
			this.supplierTel = supplierTel;
		}
		public String getSupplierTown() {
			return this.supplierTown;
		}
		public void setSupplierTown(String supplierTown) {
			this.supplierTown = supplierTown;
		}
		public String getSupplierZipCode() {
			return this.supplierZipCode;
		}
		public void setSupplierZipCode(String supplierZipCode) {
			this.supplierZipCode = supplierZipCode;
		}
		public String getWarehouseCode() {
			return this.warehouseCode;
		}
		public void setWarehouseCode(String warehouseCode) {
			this.warehouseCode = warehouseCode;
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
 * 入库单详情
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class OrderLine {

	/**
		 * temp
		 */
		@ApiField("actualPrice")
		private String actualPrice;
		/**
		 * temp
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
		 * temp
		 */
		@ApiField("deliveryOrderId")
		private String deliveryOrderId;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("discount")
		private String discount;
		/**
		 * temp
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
		 * 商品过期日期(YYYY-MM-DD)
		 */
		@ApiField("expireDate")
		private String expireDate;
		/**
		 * temp
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
		 * 入库单的行号
		 */
		@ApiField("orderLineNo")
		private String orderLineNo;
		/**
		 * temp
		 */
		@ApiField("orderSourceCode")
		private String orderSourceCode;
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
		 * temp
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
		 * 商品生产日期(YYYY-MM-DD)
		 */
		@ApiField("productDate")
		private String productDate;
		/**
		 * 采购价
		 */
		@ApiField("purchasePrice")
		private String purchasePrice;
		/**
		 * temp
		 */
		@ApiField("qrCode")
		private String qrCode;
		/**
		 * temp
		 */
		@ApiField("quantity")
		private String quantity;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("referencePrice")
		private String referencePrice;
		/**
		 * 零售价
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
		 * 商品属性
		 */
		@ApiField("skuProperty")
		private String skuProperty;
		/**
		 * temp
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
		 * temp
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
		 * temp
		 */
		@ApiField("subDeliveryOrderId")
		private String subDeliveryOrderId;
		/**
		 * temp
		 */
		@ApiField("subSourceCode")
		private String subSourceCode;
		/**
		 * temp
		 */
		@ApiField("subSourceOrderCode")
		private String subSourceOrderCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("taobaoItemCode")
		private String taobaoItemCode;
		/**
		 * temp
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
 * 商品信息
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
		 * temp
		 */
		@ApiField("adventLifecycle")
		private String adventLifecycle;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("amount")
		private String amount;
		/**
		 * temp
		 */
		@ApiField("approvalNumber")
		private String approvalNumber;
		/**
		 * temp
		 */
		@ApiField("barCode")
		private String barCode;
		/**
		 * temp
		 */
		@ApiField("batchCode")
		private String batchCode;
		/**
		 * temp
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
		 * temp
		 */
		@ApiField("brandCode")
		private String brandCode;
		/**
		 * temp
		 */
		@ApiField("brandName")
		private String brandName;
		/**
		 * temp
		 */
		@ApiField("categoryId")
		private String categoryId;
		/**
		 * temp
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
		 * temp
		 */
		@ApiField("color")
		private String color;
		/**
		 * temp
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
		 * temp
		 */
		@ApiField("englishName")
		private String englishName;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("exCode")
		private String exCode;
		/**
		 * temp
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
		 * temp
		 */
		@ApiField("grossWeight")
		private String grossWeight;
		/**
		 * temp
		 */
		@ApiField("height")
		private String height;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("inventoryType")
		private String inventoryType;
		/**
		 * temp
		 */
		@ApiField("isAreaSale")
		private String isAreaSale;
		/**
		 * temp
		 */
		@ApiField("isBatchMgmt")
		private String isBatchMgmt;
		/**
		 * temp
		 */
		@ApiField("isFragile")
		private String isFragile;
		/**
		 * temp
		 */
		@ApiField("isHazardous")
		private String isHazardous;
		/**
		 * temp
		 */
		@ApiField("isSNMgmt")
		private String isSNMgmt;
		/**
		 * temp
		 */
		@ApiField("isShelfLifeMgmt")
		private String isShelfLifeMgmt;
		/**
		 * temp
		 */
		@ApiField("isSku")
		private String isSku;
		/**
		 * temp
		 */
		@ApiField("itemCode")
		private String itemCode;
		/**
		 * temp
		 */
		@ApiField("itemId")
		private String itemId;
		/**
		 * temp
		 */
		@ApiField("itemName")
		private String itemName;
		/**
		 * temp
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
		 * temp
		 */
		@ApiField("length")
		private String length;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("lockQuantity")
		private String lockQuantity;
		/**
		 * temp
		 */
		@ApiField("lockupLifecycle")
		private String lockupLifecycle;
		/**
		 * temp
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
		 * temp
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
		 * temp
		 */
		@ApiField("ownerCode")
		private String ownerCode;
		/**
		 * temp
		 */
		@ApiField("packCode")
		private String packCode;
		/**
		 * temp
		 */
		@ApiField("packageMaterial")
		private String packageMaterial;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("paperQty")
		private String paperQty;
		/**
		 * temp
		 */
		@ApiField("pcs")
		private String pcs;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("planQty")
		private String planQty;
		/**
		 * temp
		 */
		@ApiField("price")
		private String price;
		/**
		 * priceAdjustment
		 */
		@ApiField("priceAdjustment")
		private PriceAdjustment priceAdjustment;
		/**
		 * temp
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
		 * temp
		 */
		@ApiField("productDate")
		private String productDate;
		/**
		 * temp
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
		 * temp
		 */
		@ApiField("rejectLifecycle")
		private String rejectLifecycle;
		/**
		 * temp
		 */
		@ApiField("retailPrice")
		private String retailPrice;
		/**
		 * temp
		 */
		@ApiField("safetyStock")
		private String safetyStock;
		/**
		 * temp
		 */
		@ApiField("seasonCode")
		private String seasonCode;
		/**
		 * temp
		 */
		@ApiField("seasonName")
		private String seasonName;
		/**
		 * temp
		 */
		@ApiField("shelfLife")
		private String shelfLife;
		/**
		 * temp
		 */
		@ApiField("shortName")
		private String shortName;
		/**
		 * temp
		 */
		@ApiField("size")
		private String size;
		/**
		 * temp
		 */
		@ApiField("skuProperty")
		private String skuProperty;
		/**
		 * temp
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
		 * temp
		 */
		@ApiField("stockStatus")
		private String stockStatus;
		/**
		 * temp
		 */
		@ApiField("stockUnit")
		private String stockUnit;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("subSourceOrderCode")
		private String subSourceOrderCode;
		/**
		 * temp
		 */
		@ApiField("supplierCode")
		private String supplierCode;
		/**
		 * temp
		 */
		@ApiField("supplierName")
		private String supplierName;
		/**
		 * temp
		 */
		@ApiField("tagPrice")
		private String tagPrice;
		/**
		 * temp
		 */
		@ApiField("tareWeight")
		private String tareWeight;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("tempRequirement")
		private String tempRequirement;
		/**
		 * temp
		 */
		@ApiField("title")
		private String title;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("unit")
		private String unit;
		/**
		 * temp
		 */
		@ApiField("volume")
		private String volume;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("warehouseCode")
		private String warehouseCode;
		/**
		 * temp
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


}
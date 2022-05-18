package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.CainiaoCntmsLogisticsOrderConsignResponse;

import java.util.List;
import java.util.Map;

/**
 * TOP API: cainiao.cntms.logistics.order.consign request
 * 
 * @author top auto create
 * @since 1.0, 2017.02.14
 */
public class CainiaoCntmsLogisticsOrderConsignRequest extends BaseTaobaoRequest<CainiaoCntmsLogisticsOrderConsignResponse> {
	
	

	/** 
	* 配送发货信息
	 */
	private String content;

	public void setContent(String content) {
		this.content = content;
	}

	public void setContent(CnTmsLogisticsOrderConsignContent content) {
		this.content = new JSONWriter(false,true).write(content);
	}

	public String getContent() {
		return this.content;
	}

	public String getApiMethodName() {
		return "cainiao.cntms.logistics.order.consign";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("content", this.content);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoCntmsLogisticsOrderConsignResponse> getResponseClass() {
		return CainiaoCntmsLogisticsOrderConsignResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
 * 配送发货单收件人信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class CnTmsLogisticsOrderReceiverInfo extends TaobaoObject {

	private static final long serialVersionUID = 7727224281992247821L;

	/**
		 * 收件人区县
		 */
		@ApiField("receiver_address")
		private String receiverAddress;
		/**
		 * 收件人区县
		 */
		@ApiField("receiver_area")
		private String receiverArea;
		/**
		 * 收件人城市
		 */
		@ApiField("receiver_city")
		private String receiverCity;
		/**
		 * 收件人手机，手机与电话必须有一值不为空
		 */
		@ApiField("receiver_mobile")
		private String receiverMobile;
		/**
		 * 收件人姓名
		 */
		@ApiField("receiver_name")
		private String receiverName;
		/**
		 * 收件人昵称
		 */
		@ApiField("receiver_nick")
		private String receiverNick;
		/**
		 * 收件人电话，手机与电话必须有一值不为空
		 */
		@ApiField("receiver_phone")
		private String receiverPhone;
		/**
		 * 收件人省份
		 */
		@ApiField("receiver_province")
		private String receiverProvince;
		/**
		 * 收件方邮编
		 */
		@ApiField("receiver_zip_code")
		private String receiverZipCode;
	

	public String getReceiverAddress() {
			return this.receiverAddress;
		}
		public void setReceiverAddress(String receiverAddress) {
			this.receiverAddress = receiverAddress;
		}
		public String getReceiverArea() {
			return this.receiverArea;
		}
		public void setReceiverArea(String receiverArea) {
			this.receiverArea = receiverArea;
		}
		public String getReceiverCity() {
			return this.receiverCity;
		}
		public void setReceiverCity(String receiverCity) {
			this.receiverCity = receiverCity;
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
		public String getReceiverNick() {
			return this.receiverNick;
		}
		public void setReceiverNick(String receiverNick) {
			this.receiverNick = receiverNick;
		}
		public String getReceiverPhone() {
			return this.receiverPhone;
		}
		public void setReceiverPhone(String receiverPhone) {
			this.receiverPhone = receiverPhone;
		}
		public String getReceiverProvince() {
			return this.receiverProvince;
		}
		public void setReceiverProvince(String receiverProvince) {
			this.receiverProvince = receiverProvince;
		}
		public String getReceiverZipCode() {
			return this.receiverZipCode;
		}
		public void setReceiverZipCode(String receiverZipCode) {
			this.receiverZipCode = receiverZipCode;
		}

}

	/**
 * 配送发货单发件人信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class CnTmsLogisticsOrderSenderinfo extends TaobaoObject {

	private static final long serialVersionUID = 8883518512332417751L;

	/**
		 * 发件人地址
		 */
		@ApiField("sender_address")
		private String senderAddress;
		/**
		 * 发件人区县
		 */
		@ApiField("sender_area")
		private String senderArea;
		/**
		 * 发件人城市
		 */
		@ApiField("sender_city")
		private String senderCity;
		/**
		 * 发件人手机，手机与电话必须有一值不为空
		 */
		@ApiField("sender_mobile")
		private String senderMobile;
		/**
		 * 发件人姓名
		 */
		@ApiField("sender_name")
		private String senderName;
		/**
		 * 发件人电话，手机与电话必须有一值不为空
		 */
		@ApiField("sender_phone")
		private String senderPhone;
		/**
		 * 发件人省份
		 */
		@ApiField("sender_province")
		private String senderProvince;
		/**
		 * 发件人邮编
		 */
		@ApiField("sender_zip_code")
		private String senderZipCode;
	

	public String getSenderAddress() {
			return this.senderAddress;
		}
		public void setSenderAddress(String senderAddress) {
			this.senderAddress = senderAddress;
		}
		public String getSenderArea() {
			return this.senderArea;
		}
		public void setSenderArea(String senderArea) {
			this.senderArea = senderArea;
		}
		public String getSenderCity() {
			return this.senderCity;
		}
		public void setSenderCity(String senderCity) {
			this.senderCity = senderCity;
		}
		public String getSenderMobile() {
			return this.senderMobile;
		}
		public void setSenderMobile(String senderMobile) {
			this.senderMobile = senderMobile;
		}
		public String getSenderName() {
			return this.senderName;
		}
		public void setSenderName(String senderName) {
			this.senderName = senderName;
		}
		public String getSenderPhone() {
			return this.senderPhone;
		}
		public void setSenderPhone(String senderPhone) {
			this.senderPhone = senderPhone;
		}
		public String getSenderProvince() {
			return this.senderProvince;
		}
		public void setSenderProvince(String senderProvince) {
			this.senderProvince = senderProvince;
		}
		public String getSenderZipCode() {
			return this.senderZipCode;
		}
		public void setSenderZipCode(String senderZipCode) {
			this.senderZipCode = senderZipCode;
		}

}

	/**
 * 发货商品信息，最大50条记录
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class CnTmsLogisticsOrderItem extends TaobaoObject {

	private static final long serialVersionUID = 5371873664637826469L;

	/**
		 * 扩展字段 K:V;
		 */
		@ApiField("extend_fields")
		private String extendFields;
		/**
		 * 发货商品名称
		 */
		@ApiField("item_name")
		private String itemName;
		/**
		 * 商品单价，单位分
		 */
		@ApiField("item_price")
		private Long itemPrice;
		/**
		 * ERP订单明细编码
		 */
		@ApiField("order_item_id")
		private String orderItemId;
		/**
		 * 发货商品商品数量
		 */
		@ApiField("quantity")
		private Long quantity;
		/**
		 * 备注
		 */
		@ApiField("remark")
		private String remark;
		/**
		 * 子交易号
		 */
		@ApiField("sub_trade_id")
		private String subTradeId;
	

	public String getExtendFields() {
			return this.extendFields;
		}
		public void setExtendFields(String extendFields) {
			this.extendFields = extendFields;
		}
		public String getItemName() {
			return this.itemName;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		public Long getItemPrice() {
			return this.itemPrice;
		}
		public void setItemPrice(Long itemPrice) {
			this.itemPrice = itemPrice;
		}
		public String getOrderItemId() {
			return this.orderItemId;
		}
		public void setOrderItemId(String orderItemId) {
			this.orderItemId = orderItemId;
		}
		public Long getQuantity() {
			return this.quantity;
		}
		public void setQuantity(Long quantity) {
			this.quantity = quantity;
		}
		public String getRemark() {
			return this.remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}
		public String getSubTradeId() {
			return this.subTradeId;
		}
		public void setSubTradeId(String subTradeId) {
			this.subTradeId = subTradeId;
		}

}

	/**
 * 配送要求信息（当前业务暂不支持）
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class CnTmsLogisticsOrderDeliverRequirements extends TaobaoObject {

	private static final long serialVersionUID = 8571342482615537346L;

	/**
		 * 配送类型： PTPS-普通配送 LLPS-冷链配送
		 */
		@ApiField("delivery_type")
		private String deliveryType;
		/**
		 * 送达日期（格式为 yyyy-MM-dd)
		 */
		@ApiField("schedule_day")
		private String scheduleDay;
		/**
		 * 送达结束时间（格式为 hh:mm）
		 */
		@ApiField("schedule_end")
		private String scheduleEnd;
		/**
		 * 送达开始时间（格式为 hh:mm）
		 */
		@ApiField("schedule_start")
		private String scheduleStart;
		/**
		 * 投递时延要求(1 工作日 2 节假日 104 预约达 )
		 */
		@ApiField("schedule_type")
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
		public String getScheduleEnd() {
			return this.scheduleEnd;
		}
		public void setScheduleEnd(String scheduleEnd) {
			this.scheduleEnd = scheduleEnd;
		}
		public String getScheduleStart() {
			return this.scheduleStart;
		}
		public void setScheduleStart(String scheduleStart) {
			this.scheduleStart = scheduleStart;
		}
		public String getScheduleType() {
			return this.scheduleType;
		}
		public void setScheduleType(String scheduleType) {
			this.scheduleType = scheduleType;
		}

}

	/**
 * 要求菜鸟上门揽货服务，当pick_up_Type=2且需求指定时做揽收时，此字段需要传值（当前业务暂不支持）
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class CnTmsLogisticsOrderGotService extends TaobaoObject {

	private static final long serialVersionUID = 6855661986172719218L;

	/**
		 * 揽收日期yyyyMMdd
		 */
		@ApiField("got_date")
		private String gotDate;
		/**
		 * 揽收时间段 09:00-10:00
		 */
		@ApiField("got_range")
		private String gotRange;
	

	public String getGotDate() {
			return this.gotDate;
		}
		public void setGotDate(String gotDate) {
			this.gotDate = gotDate;
		}
		public String getGotRange() {
			return this.gotRange;
		}
		public void setGotRange(String gotRange) {
			this.gotRange = gotRange;
		}

}

	/**
 * 配送发货信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class CnTmsLogisticsOrderConsignContent extends TaobaoObject {

	private static final long serialVersionUID = 2368814285852685166L;

	/**
		 * 配送要求信息（当前业务暂不支持）
		 */
		@ApiField("deliver_requirements")
		private CnTmsLogisticsOrderDeliverRequirements deliverRequirements;
		/**
		 * 扩展字段 K:V;
		 */
		@ApiField("extend_fields")
		private String extendFields;
		/**
		 * 发货商品信息，最大50条记录
		 */
		@ApiListField("items")
		@ApiField("cn_tms_logistics_order_item")
		private List<CnTmsLogisticsOrderItem> items;
		/**
		 * 运单号
		 */
		@ApiField("mail_no")
		private String mailNo;
		/**
		 * ERP订单号
		 */
		@ApiField("order_code")
		private String orderCode;
		/**
		 * 来源渠道（TB 淘宝，JD 京东，TM 天猫，1688 1688（阿里中文站），YHD 1号店，DD 当当，VANCL 凡客，PP 拍拍，YX 易讯，EBAY 易贝ebay，AMAZON 亚马逊，SN 苏宁在线，GM 国美在线，WPH 唯品会，JM 聚美优品，LF 乐蜂网，MGJ 蘑菇街，JS 聚尚网，YG 优购，YT 银泰，YL 邮乐，PX 拍鞋网，POS POS门店，OTHERS 其他）
		 */
		@ApiField("order_source")
		private String orderSource;
		/**
		 * 此订单总的包裹数，如订单拆包裹时，传入此参数，配送时会将同一订单的包裹一配送
		 */
		@ApiField("package_count")
		private Long packageCount;
		/**
		 * 包裹高度（厘米）
		 */
		@ApiField("package_height")
		private Long packageHeight;
		/**
		 * 包裹长度（厘米）
		 */
		@ApiField("package_length")
		private Long packageLength;
		/**
		 * 此订单的第几个包裹，如订单拆包裹时，传入此参数，配送时会将同一订单的包裹一配送
		 */
		@ApiField("package_no")
		private Long packageNo;
		/**
		 * 包裹体积（立方厘米）
		 */
		@ApiField("package_volume")
		private Long packageVolume;
		/**
		 * 包裹重量（克）
		 */
		@ApiField("package_weight")
		private Long packageWeight;
		/**
		 * 包裹宽度（厘米）
		 */
		@ApiField("package_width")
		private Long packageWidth;
		/**
		 * 商家送货方式，1商家送货，2菜鸟揽货
		 */
		@ApiField("pick_up_type")
		private Long pickUpType;
		/**
		 * 配送发货单收件人信息
		 */
		@ApiField("receiver_info")
		private CnTmsLogisticsOrderReceiverInfo receiverInfo;
		/**
		 * 备注
		 */
		@ApiField("remark")
		private String remark;
		/**
		 * 配送发货单发件人信息
		 */
		@ApiField("sender_info")
		private CnTmsLogisticsOrderSenderinfo senderInfo;
		/**
		 * 店铺编码
		 */
		@ApiField("shop_code")
		private String shopCode;
		/**
		 * 物流服务解决方案Code，此字段由菜鸟提供
		 */
		@ApiField("solutions_code")
		private String solutionsCode;
		/**
		 * 物流公司编码
		 */
		@ApiField("tms_code")
		private String tmsCode;
		/**
		 * 要求菜鸟上门揽货服务，当pick_up_Type=2且需求指定时做揽收时，此字段需要传值（当前业务暂不支持）
		 */
		@ApiField("tms_got_service")
		private CnTmsLogisticsOrderGotService tmsGotService;
		/**
		 * 交易订单id或者商家订单号； 若阿里系订单，必须与阿里对应
		 */
		@ApiField("trade_id")
		private String tradeId;
	

	public CnTmsLogisticsOrderDeliverRequirements getDeliverRequirements() {
			return this.deliverRequirements;
		}
		public void setDeliverRequirements(CnTmsLogisticsOrderDeliverRequirements deliverRequirements) {
			this.deliverRequirements = deliverRequirements;
		}
		public String getExtendFields() {
			return this.extendFields;
		}
		public void setExtendFields(String extendFields) {
			this.extendFields = extendFields;
		}
		public List<CnTmsLogisticsOrderItem> getItems() {
			return this.items;
		}
		public void setItems(List<CnTmsLogisticsOrderItem> items) {
			this.items = items;
		}
		public String getMailNo() {
			return this.mailNo;
		}
		public void setMailNo(String mailNo) {
			this.mailNo = mailNo;
		}
		public String getOrderCode() {
			return this.orderCode;
		}
		public void setOrderCode(String orderCode) {
			this.orderCode = orderCode;
		}
		public String getOrderSource() {
			return this.orderSource;
		}
		public void setOrderSource(String orderSource) {
			this.orderSource = orderSource;
		}
		public Long getPackageCount() {
			return this.packageCount;
		}
		public void setPackageCount(Long packageCount) {
			this.packageCount = packageCount;
		}
		public Long getPackageHeight() {
			return this.packageHeight;
		}
		public void setPackageHeight(Long packageHeight) {
			this.packageHeight = packageHeight;
		}
		public Long getPackageLength() {
			return this.packageLength;
		}
		public void setPackageLength(Long packageLength) {
			this.packageLength = packageLength;
		}
		public Long getPackageNo() {
			return this.packageNo;
		}
		public void setPackageNo(Long packageNo) {
			this.packageNo = packageNo;
		}
		public Long getPackageVolume() {
			return this.packageVolume;
		}
		public void setPackageVolume(Long packageVolume) {
			this.packageVolume = packageVolume;
		}
		public Long getPackageWeight() {
			return this.packageWeight;
		}
		public void setPackageWeight(Long packageWeight) {
			this.packageWeight = packageWeight;
		}
		public Long getPackageWidth() {
			return this.packageWidth;
		}
		public void setPackageWidth(Long packageWidth) {
			this.packageWidth = packageWidth;
		}
		public Long getPickUpType() {
			return this.pickUpType;
		}
		public void setPickUpType(Long pickUpType) {
			this.pickUpType = pickUpType;
		}
		public CnTmsLogisticsOrderReceiverInfo getReceiverInfo() {
			return this.receiverInfo;
		}
		public void setReceiverInfo(CnTmsLogisticsOrderReceiverInfo receiverInfo) {
			this.receiverInfo = receiverInfo;
		}
		public String getRemark() {
			return this.remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}
		public CnTmsLogisticsOrderSenderinfo getSenderInfo() {
			return this.senderInfo;
		}
		public void setSenderInfo(CnTmsLogisticsOrderSenderinfo senderInfo) {
			this.senderInfo = senderInfo;
		}
		public String getShopCode() {
			return this.shopCode;
		}
		public void setShopCode(String shopCode) {
			this.shopCode = shopCode;
		}
		public String getSolutionsCode() {
			return this.solutionsCode;
		}
		public void setSolutionsCode(String solutionsCode) {
			this.solutionsCode = solutionsCode;
		}
		public String getTmsCode() {
			return this.tmsCode;
		}
		public void setTmsCode(String tmsCode) {
			this.tmsCode = tmsCode;
		}
		public CnTmsLogisticsOrderGotService getTmsGotService() {
			return this.tmsGotService;
		}
		public void setTmsGotService(CnTmsLogisticsOrderGotService tmsGotService) {
			this.tmsGotService = tmsGotService;
		}
		public String getTradeId() {
			return this.tradeId;
		}
		public void setTradeId(String tradeId) {
			this.tradeId = tradeId;
		}

}


}
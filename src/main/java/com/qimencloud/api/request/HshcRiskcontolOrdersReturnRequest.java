package com.qimencloud.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.TaobaoObject;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.qimencloud.api.BaseQimenCloudRequest;
import com.qimencloud.api.response.HshcRiskcontolOrdersReturnResponse;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;


/**
 * TOP API(QimenCloud): hshc.riskcontol.orders.return request
 * 
 * @author top auto create
 * @since 1.0, 2017.05.12
 */
public class HshcRiskcontolOrdersReturnRequest extends BaseQimenCloudRequest<HshcRiskcontolOrdersReturnResponse> {
     
     

	/** 
	* 买家昵称
	 */
	private String buyerNick;

	/** 
	* 商家的预计发货时间
	 */
	private String estConTime;

	/** 
	* 订单结构
	 */
	private String orders;

	/** 
	* 子订单实付金额。
	 */
	private String payment;

	/** 
	* 收货人的详细地址
	 */
	private String receiverAddress;

	/** 
	* 收货人的手机号码
	 */
	private String receiverMobile;

	/** 
	* 收货人的姓名
	 */
	private String receiverName;

	/** 
	* 收货人的所在省份
	 */
	private String receiverState;

	/** 
	* 交易状态
	 */
	private String status;

	/** 
	* 交易编号 (父订单的交易编号)
	 */
	private Long tid;

	/** 
	* 同tid
	 */
	private String tidStr;

	/** 
	* 交易标题，以店铺名作为此标题的值。
	 */
	private String title;

	/** 
	* 交易类型列表，同时查询多种交易类型可用逗号分隔。
	 */
	private String type;

	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public String getBuyerNick() {
		return this.buyerNick;
	}

	public void setEstConTime(String estConTime) {
		this.estConTime = estConTime;
	}

	public String getEstConTime() {
		return this.estConTime;
	}

	public void setOrders(String orders) {
		this.orders = orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = new JSONWriter(false,false,true).write(orders);
	}

	public String getOrders() {
		return this.orders;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getPayment() {
		return this.payment;
	}

	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}

	public String getReceiverAddress() {
		return this.receiverAddress;
	}

	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}

	public String getReceiverMobile() {
		return this.receiverMobile;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverName() {
		return this.receiverName;
	}

	public void setReceiverState(String receiverState) {
		this.receiverState = receiverState;
	}

	public String getReceiverState() {
		return this.receiverState;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return this.status;
	}

	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Long getTid() {
		return this.tid;
	}

	public void setTidStr(String tidStr) {
		this.tidStr = tidStr;
	}

	public String getTidStr() {
		return this.tidStr;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

     public String getApiMethodName() {
          return "hshc.riskcontol.orders.return";
     }
     
     public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("buyerNick", this.buyerNick);
		txtParams.put("estConTime", this.estConTime);
		txtParams.put("orders", this.orders);
		txtParams.put("payment", this.payment);
		txtParams.put("receiverAddress", this.receiverAddress);
		txtParams.put("receiverMobile", this.receiverMobile);
		txtParams.put("receiverName", this.receiverName);
		txtParams.put("receiverState", this.receiverState);
		txtParams.put("status", this.status);
		txtParams.put("tid", this.tid);
		txtParams.put("tidStr", this.tidStr);
		txtParams.put("title", this.title);
		txtParams.put("type", this.type);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}
     
     public Class<HshcRiskcontolOrdersReturnResponse> getResponseClass() {
		return HshcRiskcontolOrdersReturnResponse.class;
	}

     public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(orders, 20, "orders");
     }
     
	/**
 * 订单结构
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Order {

	/**
		 * 手工调整金额.格式为:1.01;单位:元;精确到小数点后两位.
		 */
		@ApiField("adjustFee")
		private String adjustFee;
		/**
		 * 买家是否已评价。可选值：true(已评价)，false(未评价)
		 */
		@ApiField("buyerRate")
		private Boolean buyerRate;
		/**
		 * carStoreCode
		 */
		@ApiField("carStoreCode")
		private String carStoreCode;
		/**
		 * carStoreName
		 */
		@ApiField("carStoreName")
		private String carStoreName;
		/**
		 * carTaker
		 */
		@ApiField("carTaker")
		private String carTaker;
		/**
		 * carTakerId
		 */
		@ApiField("carTakerId")
		private String carTakerId;
		/**
		 * carTakerPhone
		 */
		@ApiField("carTakerPhone")
		private String carTakerPhone;
		/**
		 * 交易商品对应的类目ID
		 */
		@ApiField("cid")
		private Long cid;
		/**
		 * 子订单发货时间，当卖家对订单进行了多次发货，子订单的发货时间和主订单的发货时间可能不一样了，那么就需要以子订单的时间为准。（没有进行多次发货的订单，主订单的发货时间和子订单的发货时间都一样）
		 */
		@ApiField("consignTime")
		private String consignTime;
		/**
		 * 子订单级订单优惠金额。精确到2位小数;单位:元。如:200.07，表示:200元7分
		 */
		@ApiField("discountFee")
		private String discountFee;
		/**
		 * downPayment
		 */
		@ApiField("downPayment")
		private String downPayment;
		/**
		 * downPaymentRatio
		 */
		@ApiField("downPaymentRatio")
		private String downPaymentRatio;
		/**
		 * 子订单预计发货时间
		 */
		@ApiField("estimateConTime")
		private String estimateConTime;
		/**
		 * 电子凭证预约门店地址
		 */
		@ApiField("etShopName")
		private String etShopName;
		/**
		 * installmentNum
		 */
		@ApiField("installmentNum")
		private String installmentNum;
		/**
		 * 表示订单交易是否含有对应的代销采购单。如果该订单中存在一个对应的代销采购单，那么该值为true；反之，该值为false。
		 */
		@ApiField("isDaixiao")
		private Boolean isDaixiao;
		/**
		 * 是否超卖
		 */
		@ApiField("isOversold")
		private Boolean isOversold;
		/**
		 * 子订单发货的快递公司名称
		 */
		@ApiField("logisticsCompany")
		private String logisticsCompany;
		/**
		 * monthPayment
		 */
		@ApiField("monthPayment")
		private String monthPayment;
		/**
		 * 购买数量。取值范围:大于零的整数
		 */
		@ApiField("num")
		private String num;
		/**
		 * 商品数字ID
		 */
		@ApiField("numIid")
		private String numIid;
		/**
		 * 子订单编号
		 */
		@ApiField("oid")
		private String oid;
		/**
		 * oidStr
		 */
		@ApiField("oidStr")
		private String oidStr;
		/**
		 * top动态字段
		 */
		@ApiField("orderAttr")
		private String orderAttr;
		/**
		 * 子订单来源,如jhs(聚划算)、taobao(淘宝)、wap(无线)
		 */
		@ApiField("orderFrom")
		private String orderFrom;
		/**
		 * outUniqueId
		 */
		@ApiField("outUniqueId")
		private String outUniqueId;
		/**
		 * payment
		 */
		@ApiField("payment")
		private String payment;
		/**
		 * penalty
		 */
		@ApiField("penalty")
		private String penalty;
		/**
		 * 商品图片的绝对路径
		 */
		@ApiField("picPath")
		private String picPath;
		/**
		 * 商品价格。精确到2位小数;单位:元。如:200.07，表示:200元7分
		 */
		@ApiField("price")
		private String price;
		/**
		 * 退款状态。退款状态。可选值 WAIT_SELLER_AGREE(买家已经申请退款，等待卖家同意) WAIT_BUYER_RETURN_GOODS(卖家已经同意退款，等待买家退货) WAIT_SELLER_CONFIRM_GOODS(买家已经退货，等待卖家确认收货) SELLER_REFUSE_BUYER(卖家拒绝退款) CLOSED(退款关闭) SUCCESS(退款成功)
		 */
		@ApiField("refundStatus")
		private String refundStatus;
		/**
		 * 卖家是否已评价。可选值：true(已评价)，false(未评价)
		 */
		@ApiField("sellerRate")
		private Boolean sellerRate;
		/**
		 * 卖家类型，可选值为：B（商城商家），C（普通卖家）
		 */
		@ApiField("sellerType")
		private String sellerType;
		/**
		 * serviceFee
		 */
		@ApiField("serviceFee")
		private String serviceFee;
		/**
		 * 子订单的运送方式（卖家对订单进行多次发货之后，一个主订单下的子订单的运送方式可能不同，用order.shipping_type来区分子订单的运送方式）
		 */
		@ApiField("shippingType")
		private String shippingType;
		/**
		 * 商品的最小库存单位Sku的id.可以通过taobao.item.sku.get获取详细的Sku信息
		 */
		@ApiField("skuId")
		private String skuId;
		/**
		 * SKU的值。如：机身颜色:黑色;手机套餐:官方标配
		 */
		@ApiField("skuPropertiesName")
		private String skuPropertiesName;
		/**
		 * 订单快照URL
		 */
		@ApiField("snapshotUrl")
		private String snapshotUrl;
		/**
		 * 订单状态
		 */
		@ApiField("status")
		private String status;
		/**
		 * 发货的仓库编码
		 */
		@ApiField("storeCode")
		private String storeCode;
		/**
		 * tailPayment
		 */
		@ApiField("tailPayment")
		private String tailPayment;
		/**
		 * 应付金额（商品价格 * 商品数量 + 手工调整金额 - 子订单级订单优惠金额）。精确到2位小数;单位:元。如:200.07，表示:200元7分
		 */
		@ApiField("title")
		private String title;
		/**
		 * wsBankApplyNo
		 */
		@ApiField("wsBankApplyNo")
		private String wsBankApplyNo;
	

	public String getAdjustFee() {
			return this.adjustFee;
		}
		public void setAdjustFee(String adjustFee) {
			this.adjustFee = adjustFee;
		}
		public Boolean getBuyerRate() {
			return this.buyerRate;
		}
		public void setBuyerRate(Boolean buyerRate) {
			this.buyerRate = buyerRate;
		}
		public String getCarStoreCode() {
			return this.carStoreCode;
		}
		public void setCarStoreCode(String carStoreCode) {
			this.carStoreCode = carStoreCode;
		}
		public String getCarStoreName() {
			return this.carStoreName;
		}
		public void setCarStoreName(String carStoreName) {
			this.carStoreName = carStoreName;
		}
		public String getCarTaker() {
			return this.carTaker;
		}
		public void setCarTaker(String carTaker) {
			this.carTaker = carTaker;
		}
		public String getCarTakerId() {
			return this.carTakerId;
		}
		public void setCarTakerId(String carTakerId) {
			this.carTakerId = carTakerId;
		}
		public String getCarTakerPhone() {
			return this.carTakerPhone;
		}
		public void setCarTakerPhone(String carTakerPhone) {
			this.carTakerPhone = carTakerPhone;
		}
		public Long getCid() {
			return this.cid;
		}
		public void setCid(Long cid) {
			this.cid = cid;
		}
		public String getConsignTime() {
			return this.consignTime;
		}
		public void setConsignTime(String consignTime) {
			this.consignTime = consignTime;
		}
		public String getDiscountFee() {
			return this.discountFee;
		}
		public void setDiscountFee(String discountFee) {
			this.discountFee = discountFee;
		}
		public String getDownPayment() {
			return this.downPayment;
		}
		public void setDownPayment(String downPayment) {
			this.downPayment = downPayment;
		}
		public String getDownPaymentRatio() {
			return this.downPaymentRatio;
		}
		public void setDownPaymentRatio(String downPaymentRatio) {
			this.downPaymentRatio = downPaymentRatio;
		}
		public String getEstimateConTime() {
			return this.estimateConTime;
		}
		public void setEstimateConTime(String estimateConTime) {
			this.estimateConTime = estimateConTime;
		}
		public String getEtShopName() {
			return this.etShopName;
		}
		public void setEtShopName(String etShopName) {
			this.etShopName = etShopName;
		}
		public String getInstallmentNum() {
			return this.installmentNum;
		}
		public void setInstallmentNum(String installmentNum) {
			this.installmentNum = installmentNum;
		}
		public Boolean getIsDaixiao() {
			return this.isDaixiao;
		}
		public void setIsDaixiao(Boolean isDaixiao) {
			this.isDaixiao = isDaixiao;
		}
		public Boolean getIsOversold() {
			return this.isOversold;
		}
		public void setIsOversold(Boolean isOversold) {
			this.isOversold = isOversold;
		}
		public String getLogisticsCompany() {
			return this.logisticsCompany;
		}
		public void setLogisticsCompany(String logisticsCompany) {
			this.logisticsCompany = logisticsCompany;
		}
		public String getMonthPayment() {
			return this.monthPayment;
		}
		public void setMonthPayment(String monthPayment) {
			this.monthPayment = monthPayment;
		}
		public String getNum() {
			return this.num;
		}
		public void setNum(String num) {
			this.num = num;
		}
		public String getNumIid() {
			return this.numIid;
		}
		public void setNumIid(String numIid) {
			this.numIid = numIid;
		}
		public String getOid() {
			return this.oid;
		}
		public void setOid(String oid) {
			this.oid = oid;
		}
		public String getOidStr() {
			return this.oidStr;
		}
		public void setOidStr(String oidStr) {
			this.oidStr = oidStr;
		}
		public String getOrderAttr() {
			return this.orderAttr;
		}
		public void setOrderAttr(String orderAttr) {
			this.orderAttr = orderAttr;
		}
		public String getOrderFrom() {
			return this.orderFrom;
		}
		public void setOrderFrom(String orderFrom) {
			this.orderFrom = orderFrom;
		}
		public String getOutUniqueId() {
			return this.outUniqueId;
		}
		public void setOutUniqueId(String outUniqueId) {
			this.outUniqueId = outUniqueId;
		}
		public String getPayment() {
			return this.payment;
		}
		public void setPayment(String payment) {
			this.payment = payment;
		}
		public String getPenalty() {
			return this.penalty;
		}
		public void setPenalty(String penalty) {
			this.penalty = penalty;
		}
		public String getPicPath() {
			return this.picPath;
		}
		public void setPicPath(String picPath) {
			this.picPath = picPath;
		}
		public String getPrice() {
			return this.price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		public String getRefundStatus() {
			return this.refundStatus;
		}
		public void setRefundStatus(String refundStatus) {
			this.refundStatus = refundStatus;
		}
		public Boolean getSellerRate() {
			return this.sellerRate;
		}
		public void setSellerRate(Boolean sellerRate) {
			this.sellerRate = sellerRate;
		}
		public String getSellerType() {
			return this.sellerType;
		}
		public void setSellerType(String sellerType) {
			this.sellerType = sellerType;
		}
		public String getServiceFee() {
			return this.serviceFee;
		}
		public void setServiceFee(String serviceFee) {
			this.serviceFee = serviceFee;
		}
		public String getShippingType() {
			return this.shippingType;
		}
		public void setShippingType(String shippingType) {
			this.shippingType = shippingType;
		}
		public String getSkuId() {
			return this.skuId;
		}
		public void setSkuId(String skuId) {
			this.skuId = skuId;
		}
		public String getSkuPropertiesName() {
			return this.skuPropertiesName;
		}
		public void setSkuPropertiesName(String skuPropertiesName) {
			this.skuPropertiesName = skuPropertiesName;
		}
		public String getSnapshotUrl() {
			return this.snapshotUrl;
		}
		public void setSnapshotUrl(String snapshotUrl) {
			this.snapshotUrl = snapshotUrl;
		}
		public String getStatus() {
			return this.status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getStoreCode() {
			return this.storeCode;
		}
		public void setStoreCode(String storeCode) {
			this.storeCode = storeCode;
		}
		public String getTailPayment() {
			return this.tailPayment;
		}
		public void setTailPayment(String tailPayment) {
			this.tailPayment = tailPayment;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getWsBankApplyNo() {
			return this.wsBankApplyNo;
		}
		public void setWsBankApplyNo(String wsBankApplyNo) {
			this.wsBankApplyNo = wsBankApplyNo;
		}

}



}
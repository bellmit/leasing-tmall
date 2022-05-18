package com.taobao.api.response;

import com.taobao.api.TaobaoObject;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: taobao.trade.drug.orders.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TradeDrugOrdersGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6764664625956125395L;

	/** 
	 * 查询到的订单列表对象
	 */
	@ApiField("result")
	private Result result;


	public void setResult(Result result) {
		this.result = result;
	}
	public Result getResult( ) {
		return this.result;
	}
	
	/**
 * 用户地址对象
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class UserAddress extends TaobaoObject {

	private static final long serialVersionUID = 5866664978733418787L;

	/**
		 * 送货地址
		 */
		@ApiField("address")
		private String address;
		/**
		 * 手机号
		 */
		@ApiField("mobile")
		private String mobile;
		/**
		 * 买家姓名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 联系电话
		 */
		@ApiField("phone")
		private String phone;
	

	public String getAddress() {
			return this.address;
		}
		public void setAddress(String address) {
			this.address = address;
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
		public String getPhone() {
			return this.phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}

}

	/**
 * 下单列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class OrderGoods extends TaobaoObject {

	private static final long serialVersionUID = 3634941378656192333L;

	/**
		 * 外卖商品购买数量
		 */
		@ApiField("count")
		private Long count;
		/**
		 * 外卖商品外部ID
		 */
		@ApiField("goods_code")
		private String goodsCode;
		/**
		 * 商品ID
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 外卖商品名称
		 */
		@ApiField("name")
		private String name;
		/**
		 * 外卖商品实际购买价格
		 */
		@ApiField("real_price")
		private String realPrice;
	

	public Long getCount() {
			return this.count;
		}
		public void setCount(Long count) {
			this.count = count;
		}
		public String getGoodsCode() {
			return this.goodsCode;
		}
		public void setGoodsCode(String goodsCode) {
			this.goodsCode = goodsCode;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getRealPrice() {
			return this.realPrice;
		}
		public void setRealPrice(String realPrice) {
			this.realPrice = realPrice;
		}

}

	/**
 * 订单列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Result extends TaobaoObject {

	private static final long serialVersionUID = 3836481989488361411L;

	/**
		 * 送货地址
		 */
		@ApiField("address")
		private String address;
		/**
		 * 支付宝流水号
		 */
		@ApiField("alipay_stream_id")
		private String alipayStreamId;
		/**
		 * 创建时间
		 */
		@ApiField("create_time")
		private String createTime;
		/**
		 * 配送费
		 */
		@ApiField("delivery_pay")
		private String deliveryPay;
		/**
		 * (encrypt)买家ID
		 */
		@ApiField("encrypt_user_id")
		private String encryptUserId;
		/**
		 * 送达时间要求_结束
		 */
		@ApiField("end_delivery_time")
		private String endDeliveryTime;
		/**
		 * 用户下单方式(PC/APP)
		 */
		@ApiField("from")
		private Long from;
		/**
		 * 下单列表
		 */
		@ApiListField("goods_list")
		@ApiField("order_goods")
		private List<OrderGoods> goodsList;
		/**
		 * 订单号
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 用户下单时的备注信息
		 */
		@ApiField("note")
		private String note;
		/**
		 * 买家支付宝账号
		 */
		@ApiField("pay_account")
		private String payAccount;
		/**
		 * 送达时间要求_起始
		 */
		@ApiField("start_delivery_time")
		private String startDeliveryTime;
		/**
		 * 店铺联系电话
		 */
		@ApiField("store_contact_phone")
		private String storeContactPhone;
		/**
		 * 分店ID
		 */
		@ApiField("store_id")
		private Long storeId;
		/**
		 * 店铺名称
		 */
		@ApiField("store_name")
		private String storeName;
		/**
		 * 总支付金额
		 */
		@ApiField("total_pay")
		private String totalPay;
		/**
		 * 用户地址对象
		 */
		@ApiField("user_address")
		private UserAddress userAddress;
		/**
		 * 买家ID
		 */
		@ApiField("user_id")
		private Long userId;
	

	public String getAddress() {
			return this.address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getAlipayStreamId() {
			return this.alipayStreamId;
		}
		public void setAlipayStreamId(String alipayStreamId) {
			this.alipayStreamId = alipayStreamId;
		}
		public String getCreateTime() {
			return this.createTime;
		}
		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}
		public String getDeliveryPay() {
			return this.deliveryPay;
		}
		public void setDeliveryPay(String deliveryPay) {
			this.deliveryPay = deliveryPay;
		}
		public String getEncryptUserId() {
			return this.encryptUserId;
		}
		public void setEncryptUserId(String encryptUserId) {
			this.encryptUserId = encryptUserId;
		}
		public String getEndDeliveryTime() {
			return this.endDeliveryTime;
		}
		public void setEndDeliveryTime(String endDeliveryTime) {
			this.endDeliveryTime = endDeliveryTime;
		}
		public Long getFrom() {
			return this.from;
		}
		public void setFrom(Long from) {
			this.from = from;
		}
		public List<OrderGoods> getGoodsList() {
			return this.goodsList;
		}
		public void setGoodsList(List<OrderGoods> goodsList) {
			this.goodsList = goodsList;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNote() {
			return this.note;
		}
		public void setNote(String note) {
			this.note = note;
		}
		public String getPayAccount() {
			return this.payAccount;
		}
		public void setPayAccount(String payAccount) {
			this.payAccount = payAccount;
		}
		public String getStartDeliveryTime() {
			return this.startDeliveryTime;
		}
		public void setStartDeliveryTime(String startDeliveryTime) {
			this.startDeliveryTime = startDeliveryTime;
		}
		public String getStoreContactPhone() {
			return this.storeContactPhone;
		}
		public void setStoreContactPhone(String storeContactPhone) {
			this.storeContactPhone = storeContactPhone;
		}
		public Long getStoreId() {
			return this.storeId;
		}
		public void setStoreId(Long storeId) {
			this.storeId = storeId;
		}
		public String getStoreName() {
			return this.storeName;
		}
		public void setStoreName(String storeName) {
			this.storeName = storeName;
		}
		public String getTotalPay() {
			return this.totalPay;
		}
		public void setTotalPay(String totalPay) {
			this.totalPay = totalPay;
		}
		public UserAddress getUserAddress() {
			return this.userAddress;
		}
		public void setUserAddress(UserAddress userAddress) {
			this.userAddress = userAddress;
		}
		public Long getUserId() {
			return this.userId;
		}
		public void setUserId(Long userId) {
			this.userId = userId;
		}

}



}

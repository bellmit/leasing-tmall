package com.taobao.api.response;

import com.taobao.api.TaobaoObject;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: taobao.wlb.wms.consign.order.notify response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWmsConsignOrderNotifyResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5343152392169457976L;

	/** 
	 * 系统自动生成
	 */
	@ApiListField("consign_order_list")
	@ApiField("consignorderlist")
	private List<Consignorderlist> consignOrderList;

	/** 
	 * 订单编码
	 */
	@ApiField("order_code")
	private String orderCode;

	/** 
	 * 错误编码
	 */
	@ApiField("wl_error_code")
	private String wlErrorCode;

	/** 
	 * 错误详细
	 */
	@ApiField("wl_error_msg")
	private String wlErrorMsg;

	/** 
	 * 是否成功
	 */
	@ApiField("wl_success")
	private Boolean wlSuccess;


	public void setConsignOrderList(List<Consignorderlist> consignOrderList) {
		this.consignOrderList = consignOrderList;
	}
	public List<Consignorderlist> getConsignOrderList( ) {
		return this.consignOrderList;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public String getOrderCode( ) {
		return this.orderCode;
	}

	public void setWlErrorCode(String wlErrorCode) {
		this.wlErrorCode = wlErrorCode;
	}
	public String getWlErrorCode( ) {
		return this.wlErrorCode;
	}

	public void setWlErrorMsg(String wlErrorMsg) {
		this.wlErrorMsg = wlErrorMsg;
	}
	public String getWlErrorMsg( ) {
		return this.wlErrorMsg;
	}

	public void setWlSuccess(Boolean wlSuccess) {
		this.wlSuccess = wlSuccess;
	}
	public Boolean getWlSuccess( ) {
		return this.wlSuccess;
	}
	
	/**
 * 仓库物流订单信息列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Consignorderitem extends TaobaoObject {

	private static final long serialVersionUID = 3221582512321481884L;

	/**
		 * 商品编码
		 */
		@ApiField("item_code")
		private String itemCode;
		/**
		 * 商品ID
		 */
		@ApiField("item_id")
		private String itemId;
		/**
		 * 商品数量
		 */
		@ApiField("item_quantity")
		private Long itemQuantity;
		/**
		 * ERP订单明细行号ID
		 */
		@ApiField("order_item_id")
		private String orderItemId;
	

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
		public Long getItemQuantity() {
			return this.itemQuantity;
		}
		public void setItemQuantity(Long itemQuantity) {
			this.itemQuantity = itemQuantity;
		}
		public String getOrderItemId() {
			return this.orderItemId;
		}
		public void setOrderItemId(String orderItemId) {
			this.orderItemId = orderItemId;
		}

}

	/**
 * 仓库物流订单信息列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Consignorderitemlist extends TaobaoObject {

	private static final long serialVersionUID = 8184574339575426653L;

	/**
		 * 仓库物流订单信息列表
		 */
		@ApiField("consign_order_item")
		private Consignorderitem consignOrderItem;
	

	public Consignorderitem getConsignOrderItem() {
			return this.consignOrderItem;
		}
		public void setConsignOrderItem(Consignorderitem consignOrderItem) {
			this.consignOrderItem = consignOrderItem;
		}

}

	/**
 * 发货订单信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Consignorder extends TaobaoObject {

	private static final long serialVersionUID = 5358151881475757777L;

	/**
		 * 仓库物流订单信息列表
		 */
		@ApiListField("consign_order_item_list")
		@ApiField("consignorderitemlist")
		private List<Consignorderitemlist> consignOrderItemList;
		/**
		 * 错误编码
		 */
		@ApiField("error_code")
		private String errorCode;
		/**
		 * 错误信息
		 */
		@ApiField("error_msg")
		private String errorMsg;
		/**
		 * 仓库编码
		 */
		@ApiField("store_code")
		private String storeCode;
		/**
		 * 仓库订单编码
		 */
		@ApiField("store_order_code")
		private String storeOrderCode;
		/**
		 * 是否成功
		 */
		@ApiField("success")
		private Boolean success;
		/**
		 * 配送编码
		 */
		@ApiField("tms_code")
		private String tmsCode;
	

	public List<Consignorderitemlist> getConsignOrderItemList() {
			return this.consignOrderItemList;
		}
		public void setConsignOrderItemList(List<Consignorderitemlist> consignOrderItemList) {
			this.consignOrderItemList = consignOrderItemList;
		}
		public String getErrorCode() {
			return this.errorCode;
		}
		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}
		public String getErrorMsg() {
			return this.errorMsg;
		}
		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}
		public String getStoreCode() {
			return this.storeCode;
		}
		public void setStoreCode(String storeCode) {
			this.storeCode = storeCode;
		}
		public String getStoreOrderCode() {
			return this.storeOrderCode;
		}
		public void setStoreOrderCode(String storeOrderCode) {
			this.storeOrderCode = storeOrderCode;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
		public String getTmsCode() {
			return this.tmsCode;
		}
		public void setTmsCode(String tmsCode) {
			this.tmsCode = tmsCode;
		}

}

	/**
 * 系统自动生成
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Consignorderlist extends TaobaoObject {

	private static final long serialVersionUID = 4285311765754849951L;

	/**
		 * 发货订单信息
		 */
		@ApiField("consign_order")
		private Consignorder consignOrder;
	

	public Consignorder getConsignOrder() {
			return this.consignOrder;
		}
		public void setConsignOrder(Consignorder consignOrder) {
			this.consignOrder = consignOrder;
		}

}



}

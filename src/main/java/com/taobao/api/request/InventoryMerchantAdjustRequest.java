package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.InventoryMerchantAdjustResponse;

import java.util.List;
import java.util.Map;

/**
 * TOP API: taobao.inventory.merchant.adjust request
 * 
 * @author top auto create
 * @since 1.0, 2017.04.18
 */
public class InventoryMerchantAdjustRequest extends BaseTaobaoRequest<InventoryMerchantAdjustResponse> {
	
	

	/** 
	* 调整库存对象
	 */
	//@ApiField("inventory_check")
	private String inventoryCheck;

	public void setInventoryCheck(String inventoryCheck) {
		this.inventoryCheck = inventoryCheck;
	}

	public void setInventoryCheck(InventoryCheckDto inventoryCheck) {
		this.inventoryCheck = new JSONWriter(false,true).write(inventoryCheck);
	}

	public String getInventoryCheck() {
		return this.inventoryCheck;
	}

	public String getApiMethodName() {
		return "taobao.inventory.merchant.adjust";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("inventory_check", this.inventoryCheck);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<InventoryMerchantAdjustResponse> getResponseClass() {
		return InventoryMerchantAdjustResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
 * 调整明细
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class InventoryCheckDetailDto extends TaobaoObject {

	private static final long serialVersionUID = 4349156744935882817L;

	/**
		 * 如果是门店类型,则为必填。 ONLINE_INVENTORY  线上可售库存，  SHARE_INVENTORY 线下可售库存
		 */
		@ApiField("inv_biz_code")
		private String invBizCode;
		/**
		 * 调整数量，正数盘盈，负数盘亏
		 */
		@ApiField("quantity")
		private Long quantity;
		/**
		 * 后端货品id
		 */
		@ApiField("sc_item_id")
		private Long scItemId;
		/**
		 * 每个货品的调整子单据号，作为业务调整依据，处理时会幂等
		 */
		@ApiField("sub_order_id")
		private String subOrderId;
	

	public String getInvBizCode() {
			return this.invBizCode;
		}
		public void setInvBizCode(String invBizCode) {
			this.invBizCode = invBizCode;
		}
		public Long getQuantity() {
			return this.quantity;
		}
		public void setQuantity(Long quantity) {
			this.quantity = quantity;
		}
		public Long getScItemId() {
			return this.scItemId;
		}
		public void setScItemId(Long scItemId) {
			this.scItemId = scItemId;
		}
		public String getSubOrderId() {
			return this.subOrderId;
		}
		public void setSubOrderId(String subOrderId) {
			this.subOrderId = subOrderId;
		}

}

	/**
 * 调整库存对象
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class InventoryCheckDto extends TaobaoObject {

	private static final long serialVersionUID = 7888972778529432994L;

	/**
		 * 2: 出入库盘盈盘亏
		 */
		@ApiField("check_mode")
		private Long checkMode;
		/**
		 * 调整明细
		 */
		@ApiListField("detail_list")
		@ApiField("inventory_check_detail_dto")
		private List<InventoryCheckDetailDto> detailList;
		/**
		 * 2： 仓库类型   6：门店类型
		 */
		@ApiField("inv_store_type")
		private Long invStoreType;
		/**
		 * 调整单据号
		 */
		@ApiField("order_id")
		private String orderId;
		/**
		 * 仓库code或者门店id
		 */
		@ApiField("store_code")
		private String storeCode;
	

	public Long getCheckMode() {
			return this.checkMode;
		}
		public void setCheckMode(Long checkMode) {
			this.checkMode = checkMode;
		}
		public List<InventoryCheckDetailDto> getDetailList() {
			return this.detailList;
		}
		public void setDetailList(List<InventoryCheckDetailDto> detailList) {
			this.detailList = detailList;
		}
		public Long getInvStoreType() {
			return this.invStoreType;
		}
		public void setInvStoreType(Long invStoreType) {
			this.invStoreType = invStoreType;
		}
		public String getOrderId() {
			return this.orderId;
		}
		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}
		public String getStoreCode() {
			return this.storeCode;
		}
		public void setStoreCode(String storeCode) {
			this.storeCode = storeCode;
		}

}


}
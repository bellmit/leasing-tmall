package com.qimen.api.request;

import com.qimen.api.QimenRequest;
import com.qimen.api.response.ItemlackReportResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;

import java.util.List;
import java.util.Map;

/**
 * TOP API: taobao.qimen.itemlack.report request
 * 
 * @author top auto create
 * @since 1.0, 2016.11.25
 */
public class ItemlackReportRequest extends QimenRequest<ItemlackReportResponse> {
	
	

	/** 
	* 缺货回告创建时间(YYYY-MM-DD HH:mm:ss)
	 */
	private String createTime;

	/** 
	* ERP的发货单编码
	 */
	private String deliveryOrderCode;

	/** 
	* 仓库系统的发货单编码
	 */
	private String deliveryOrderId;

	/** 
	* 扩展属性
	 */
	private Map extendProps;

	/**
	* 缺货商品列表
	 */
	private List<Item> items;

	/**
	* 外部业务编码(消息ID;用于去重;ISV对于同一请求;分配一个唯一性的编码。用来保证因为网络等原因导致重复传输;请求不 会被重复处理)
	 */
	private String outBizCode;

	/**
	* 仓库编码
	 */
	private String warehouseCode;

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setDeliveryOrderCode(String deliveryOrderCode) {
		this.deliveryOrderCode = deliveryOrderCode;
	}

	public String getDeliveryOrderCode() {
		return this.deliveryOrderCode;
	}

	public void setDeliveryOrderId(String deliveryOrderId) {
		this.deliveryOrderId = deliveryOrderId;
	}

	public String getDeliveryOrderId() {
		return this.deliveryOrderId;
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

	public void setOutBizCode(String outBizCode) {
		this.outBizCode = outBizCode;
	}

	public String getOutBizCode() {
		return this.outBizCode;
	}

	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

	public String getWarehouseCode() {
		return this.warehouseCode;
	}

	public String getApiMethodName() {
		return "taobao.qimen.itemlack.report";
	}

	public Class<ItemlackReportResponse> getResponseClass() {
		return ItemlackReportResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(createTime, "createTime");
		RequestCheckUtils.checkMaxLength(createTime, 19, "createTime");
		RequestCheckUtils.checkNotEmpty(deliveryOrderCode, "deliveryOrderCode");
		RequestCheckUtils.checkMaxLength(deliveryOrderCode, 50, "deliveryOrderCode");
		RequestCheckUtils.checkMaxLength(deliveryOrderId, 50, "deliveryOrderId");
		RequestCheckUtils.checkNotEmpty(outBizCode, "outBizCode");
		RequestCheckUtils.checkMaxLength(outBizCode, 50, "outBizCode");
		RequestCheckUtils.checkNotEmpty(warehouseCode, "warehouseCode");
		RequestCheckUtils.checkMaxLength(warehouseCode, 50, "warehouseCode");
	}
	
	/**
 * 缺货商品列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Item {

	/**
		 * 批次编码
		 */
		@ApiField("batchCode")
		private String batchCode;
		/**
		 * 商品过期日期(YYYY-MM-DD)
		 */
		@ApiField("expireDate")
		private String expireDate;
		/**
		 * 库存类型(ZP=正品;CC=残次;JS=机损;XS=箱损;ZT=在途库存)
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
		 * 缺货商品数量
		 */
		@ApiField("lackQty")
		private Long lackQty;
		/**
		 * 应发商品数量
		 */
		@ApiField("planQty")
		private Long planQty;
		/**
		 * 生产批号
		 */
		@ApiField("produceCode")
		private String produceCode;
		/**
		 * 商品生产日期(YYYY-MM-DD)
		 */
		@ApiField("productDate")
		private String productDate;
		/**
		 * 缺货原因(系统报缺;实物报缺)
		 */
		@ApiField("reason")
		private String reason;
	

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
		public Long getLackQty() {
			return this.lackQty;
		}
		public void setLackQty(Long lackQty) {
			this.lackQty = lackQty;
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
		public String getProductDate() {
			return this.productDate;
		}
		public void setProductDate(String productDate) {
			this.productDate = productDate;
		}
		public String getReason() {
			return this.reason;
		}
		public void setReason(String reason) {
			this.reason = reason;
		}

}


}
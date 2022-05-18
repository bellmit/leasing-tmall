package com.qimen.api.request;

import com.qimen.api.QimenRequest;
import com.qimen.api.response.StoreprocessCreateResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;

import java.util.List;
import java.util.Map;

/**
 * TOP API: taobao.qimen.storeprocess.create request
 * 
 * @author top auto create
 * @since 1.0, 2017.04.27
 */
public class StoreprocessCreateRequest extends QimenRequest<StoreprocessCreateResponse> {
	
	

	/** 
	* 扩展属性
	 */
	private Map extendProps;

	/**
	* 加工商品列表
	 */
	private List<MaterialItem> materialitems;

	/**
	* 加工单创建时间(YYYY-MM-DD HH:MM:SS)
	 */
	private String orderCreateTime;

	/**
	* 单据类型(CNJG=仓内加工作业单)
	 */
	private String orderType;

	/**
	* 成品计划数量
	 */
	private Long planQty;

	/**
	* 计划加工时间(YYYY-MM-DD HH:MM:SS)
	 */
	private String planTime;

	/**
	* 加工单编码
	 */
	private String processOrderCode;

	/**
	* 商品列表
	 */
	private List<ProductItem> productitems;

	/**
	* 备注
	 */
	private String remark;

	/**
	* 加工类型(1:仓内组合加工 2:仓内组合拆分)
	 */
	private String serviceType;

	/**
	* 仓库编码(统仓统配等无需ERP指定仓储编码的情况填OTHER)
	 */
	private String warehouseCode;

	public void setExtendProps(Map extendProps) {
		this.extendProps = extendProps;
	}

	public Map getExtendProps() {
		return this.extendProps;
	}

	public void setMaterialitems(List<MaterialItem> materialitems) {
		this.materialitems = materialitems;
	}

	public List<MaterialItem> getMaterialitems() {
		return this.materialitems;
	}

	public void setOrderCreateTime(String orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public String getOrderCreateTime() {
		return this.orderCreateTime;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setPlanQty(Long planQty) {
		this.planQty = planQty;
	}

	public Long getPlanQty() {
		return this.planQty;
	}

	public void setPlanTime(String planTime) {
		this.planTime = planTime;
	}

	public String getPlanTime() {
		return this.planTime;
	}

	public void setProcessOrderCode(String processOrderCode) {
		this.processOrderCode = processOrderCode;
	}

	public String getProcessOrderCode() {
		return this.processOrderCode;
	}

	public void setProductitems(List<ProductItem> productitems) {
		this.productitems = productitems;
	}

	public List<ProductItem> getProductitems() {
		return this.productitems;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getServiceType() {
		return this.serviceType;
	}

	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

	public String getWarehouseCode() {
		return this.warehouseCode;
	}

	public String getApiMethodName() {
		return "taobao.qimen.storeprocess.create";
	}

	public Class<StoreprocessCreateResponse> getResponseClass() {
		return StoreprocessCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(orderCreateTime, "orderCreateTime");
		RequestCheckUtils.checkMaxLength(orderCreateTime, 19, "orderCreateTime");
		RequestCheckUtils.checkNotEmpty(orderType, "orderType");
		RequestCheckUtils.checkMaxLength(orderType, 50, "orderType");
		RequestCheckUtils.checkNotEmpty(planTime, "planTime");
		RequestCheckUtils.checkMaxLength(planTime, 19, "planTime");
		RequestCheckUtils.checkNotEmpty(processOrderCode, "processOrderCode");
		RequestCheckUtils.checkMaxLength(processOrderCode, 50, "processOrderCode");
		RequestCheckUtils.checkMaxLength(remark, 500, "remark");
		RequestCheckUtils.checkNotEmpty(serviceType, "serviceType");
		RequestCheckUtils.checkMaxLength(serviceType, 50, "serviceType");
		RequestCheckUtils.checkNotEmpty(warehouseCode, "warehouseCode");
		RequestCheckUtils.checkMaxLength(warehouseCode, 50, "warehouseCode");
	}
	
	/**
 * 加工商品列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class MaterialItem {

	/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("batchCode")
		private String batchCode;
		/**
		 * 商品过期日期(YYYY-MM-DD)
		 */
		@ApiField("expireDate")
		private String expireDate;
		/**
		 * 库存类型(ZP=正品;CC=残次;JS=机损;XS=箱损;默认为ZP)
		 */
		@ApiField("inventoryType")
		private String inventoryType;
		/**
		 * erp系统商品编码
		 */
		@ApiField("itemCode")
		private String itemCode;
		/**
		 * 仓储系统商品ID
		 */
		@ApiField("itemId")
		private String itemId;
		/**
		 * 货主编码
		 */
		@ApiField("ownerCode")
		private String ownerCode;
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
		 * 数量
		 */
		@ApiField("quantity")
		private Long quantity;
		/**
		 * 配比数量
		 */
		@ApiField("ratioQty")
		private Long ratioQty;
		/**
		 * 备注
		 */
		@ApiField("remark")
		private String remark;
	

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
		public String getOwnerCode() {
			return this.ownerCode;
		}
		public void setOwnerCode(String ownerCode) {
			this.ownerCode = ownerCode;
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
		public Long getQuantity() {
			return this.quantity;
		}
		public void setQuantity(Long quantity) {
			this.quantity = quantity;
		}
		public Long getRatioQty() {
			return this.ratioQty;
		}
		public void setRatioQty(Long ratioQty) {
			this.ratioQty = ratioQty;
		}
		public String getRemark() {
			return this.remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}

}

	/**
 * 商品列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class ProductItem {

	/**
		 * batchCode
		 */
		@ApiField("batchCode")
		private String batchCode;
		/**
		 * 商品过期日期(YYYY-MM-DD)
		 */
		@ApiField("expireDate")
		private String expireDate;
		/**
		 * 库存类型(ZP=正品;CC=残次;JS=机损;XS=箱损;默认为ZP)
		 */
		@ApiField("inventoryType")
		private String inventoryType;
		/**
		 * erp系统商品编码
		 */
		@ApiField("itemCode")
		private String itemCode;
		/**
		 * 仓储系统商品ID
		 */
		@ApiField("itemId")
		private String itemId;
		/**
		 * 货主编码
		 */
		@ApiField("ownerCode")
		private String ownerCode;
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
		 * 数量
		 */
		@ApiField("quantity")
		private Long quantity;
		/**
		 * 配比数量
		 */
		@ApiField("ratioQty")
		private Long ratioQty;
		/**
		 * 备注
		 */
		@ApiField("remark")
		private String remark;
	

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
		public String getOwnerCode() {
			return this.ownerCode;
		}
		public void setOwnerCode(String ownerCode) {
			this.ownerCode = ownerCode;
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
		public Long getQuantity() {
			return this.quantity;
		}
		public void setQuantity(Long quantity) {
			this.quantity = quantity;
		}
		public Long getRatioQty() {
			return this.ratioQty;
		}
		public void setRatioQty(Long ratioQty) {
			this.ratioQty = ratioQty;
		}
		public String getRemark() {
			return this.remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}

}


}
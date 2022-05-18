package com.qimen.api.request;

import com.qimen.api.QimenRequest;
import com.qimen.api.response.InventoryQueryResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.mapping.ApiField;

import java.util.List;
import java.util.Map;

/**
 * TOP API: taobao.qimen.inventory.query request
 * 
 * @author top auto create
 * @since 1.0, 2016.11.25
 */
public class InventoryQueryRequest extends QimenRequest<InventoryQueryResponse> {
	
	

	/** 
	* 查询准则
	 */
	private List<Criteria> criteriaList;

	/** 
	* 扩展属性
	 */
	private Map extendProps;

	public void setCriteriaList(List<Criteria> criteriaList) {
		this.criteriaList = criteriaList;
	}

	public List<Criteria> getCriteriaList() {
		return this.criteriaList;
	}

	public void setExtendProps(Map extendProps) {
		this.extendProps = extendProps;
	}

	public Map getExtendProps() {
		return this.extendProps;
	}

	public String getApiMethodName() {
		return "taobao.qimen.inventory.query";
	}

	public Class<InventoryQueryResponse> getResponseClass() {
		return InventoryQueryResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
 * 查询准则
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Criteria {

	/**
		 * 库存类型(ZP=正品;CC=残次;JS=机损;XS=箱损;ZT=在途库存;默认为查所有类型的库存)
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
		 * 货主编码
		 */
		@ApiField("ownerCode")
		private String ownerCode;
		/**
		 * 仓库编码
		 */
		@ApiField("warehouseCode")
		private String warehouseCode;
	

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
		public String getWarehouseCode() {
			return this.warehouseCode;
		}
		public void setWarehouseCode(String warehouseCode) {
			this.warehouseCode = warehouseCode;
		}

}


}
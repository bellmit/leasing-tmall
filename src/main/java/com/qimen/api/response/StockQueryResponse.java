package com.qimen.api.response;

import com.qimen.api.QimenResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: taobao.qimen.stock.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class StockQueryResponse extends QimenResponse {

	private static final long serialVersionUID = 2273383757225683934L;

	/** 
	 * 商品的库存信息列表
	 */
	@ApiListField("items")
	@ApiField("item")
	private List<Item> items;

	/** 
	 * 总数
	 */
	@ApiField("totalCount")
	private Long totalCount;


	public void setItems(List<Item> items) {
		this.items = items;
	}
	public List<Item> getItems( ) {
		return this.items;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}
	
	/**
 * 商品的库存信息列表
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
		 * 库存类型(ZP=正品;CC=残次;JS=机损;XS= 箱损;ZT=在途库存)
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
		 * 冻结库存数量
		 */
		@ApiField("lockQuantity")
		private Long lockQuantity;
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
		 * 未冻结库存数量
		 */
		@ApiField("quantity")
		private Long quantity;
		/**
		 * 仓库编码
		 */
		@ApiField("warehouseCode")
		private String warehouseCode;
	

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
		public Long getLockQuantity() {
			return this.lockQuantity;
		}
		public void setLockQuantity(Long lockQuantity) {
			this.lockQuantity = lockQuantity;
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
		public String getWarehouseCode() {
			return this.warehouseCode;
		}
		public void setWarehouseCode(String warehouseCode) {
			this.warehouseCode = warehouseCode;
		}

}



}

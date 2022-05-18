package com.qimen.api.request;

import com.qimen.api.QimenRequest;
import com.qimen.api.response.InventoryReportResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;

import java.util.List;
import java.util.Map;

/**
 * TOP API: taobao.qimen.inventory.report request
 * 
 * @author top auto create
 * @since 1.0, 2017.04.27
 */
public class InventoryReportRequest extends QimenRequest<InventoryReportResponse> {
	
	

	/** 
	* 盘点单编码
	 */
	private String checkOrderCode;

	/** 
	* 仓储系统的盘点单编码
	 */
	private String checkOrderId;

	/** 
	* 盘点时间(YYYY-MM-DD HH:MM:SS)
	 */
	private String checkTime;

	/** 
	* 当前页(从1开始)
	 */
	private Long currentPage;

	/** 
	* 扩展属性
	 */
	private Map extendProps;

	/**
	* 商品库存信息列表
	 */
	private List<Item> items;

	/**
	* orderType
	 */
	private String orderType;

	/**
	* 外部业务编码(消息ID;用于去重;ISV对于同一请求;分配一个唯一性的编码。用来保证因为网络等原因导致重复传输;请求不 会被重复处理)
	 */
	private String outBizCode;

	/**
	* 货主编码
	 */
	private String ownerCode;

	/**
	* 每页记录的条数
	 */
	private Long pageSize;

	/**
	* 备注
	 */
	private String remark;

	/**
	* 总页数
	 */
	private Long totalPage;

	/**
	* 仓库编码
	 */
	private String warehouseCode;

	public void setCheckOrderCode(String checkOrderCode) {
		this.checkOrderCode = checkOrderCode;
	}

	public String getCheckOrderCode() {
		return this.checkOrderCode;
	}

	public void setCheckOrderId(String checkOrderId) {
		this.checkOrderId = checkOrderId;
	}

	public String getCheckOrderId() {
		return this.checkOrderId;
	}

	public void setCheckTime(String checkTime) {
		this.checkTime = checkTime;
	}

	public String getCheckTime() {
		return this.checkTime;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public Long getCurrentPage() {
		return this.currentPage;
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

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setOutBizCode(String outBizCode) {
		this.outBizCode = outBizCode;
	}

	public String getOutBizCode() {
		return this.outBizCode;
	}

	public void setOwnerCode(String ownerCode) {
		this.ownerCode = ownerCode;
	}

	public String getOwnerCode() {
		return this.ownerCode;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}

	public Long getTotalPage() {
		return this.totalPage;
	}

	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

	public String getWarehouseCode() {
		return this.warehouseCode;
	}

	public String getApiMethodName() {
		return "taobao.qimen.inventory.report";
	}

	public Class<InventoryReportResponse> getResponseClass() {
		return InventoryReportResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(checkOrderCode, "checkOrderCode");
		RequestCheckUtils.checkMaxLength(checkOrderCode, 50, "checkOrderCode");
		RequestCheckUtils.checkMaxLength(checkOrderId, 50, "checkOrderId");
		RequestCheckUtils.checkMaxLength(checkTime, 19, "checkTime");
		RequestCheckUtils.checkNotEmpty(currentPage, "currentPage");
		RequestCheckUtils.checkNotEmpty(outBizCode, "outBizCode");
		RequestCheckUtils.checkMaxLength(outBizCode, 50, "outBizCode");
		RequestCheckUtils.checkNotEmpty(ownerCode, "ownerCode");
		RequestCheckUtils.checkMaxLength(ownerCode, 50, "ownerCode");
		RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
		RequestCheckUtils.checkMaxLength(remark, 500, "remark");
		RequestCheckUtils.checkNotEmpty(totalPage, "totalPage");
		RequestCheckUtils.checkNotEmpty(warehouseCode, "warehouseCode");
		RequestCheckUtils.checkMaxLength(warehouseCode, 50, "warehouseCode");
	}
	
	/**
 * 商品库存信息列表
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
		 * 库存类型(ZP=正品;CC=残次;JS=机损;XS= 箱损;ZT=在途库存;默认为ZP)
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
		 * ownerCode
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
		 * 盘盈盘亏商品变化量(盘盈为正数;盘亏为负数)
		 */
		@ApiField("quantity")
		private Long quantity;
		/**
		 * 备注
		 */
		@ApiField("remark")
		private String remark;
		/**
		 * 商品序列号
		 */
		@ApiField("snCode")
		private String snCode;
		/**
		 * warehouseCode
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
		public String getRemark() {
			return this.remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}
		public String getSnCode() {
			return this.snCode;
		}
		public void setSnCode(String snCode) {
			this.snCode = snCode;
		}
		public String getWarehouseCode() {
			return this.warehouseCode;
		}
		public void setWarehouseCode(String warehouseCode) {
			this.warehouseCode = warehouseCode;
		}

}


}
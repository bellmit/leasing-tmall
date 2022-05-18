package com.qimen.api.request;

import com.qimen.api.QimenRequest;
import com.qimen.api.response.StockchangeReportResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;
import java.util.Map;

/**
 * TOP API: taobao.qimen.stockchange.report request
 * 
 * @author top auto create
 * @since 1.0, 2017.04.27
 */
public class StockchangeReportRequest extends QimenRequest<StockchangeReportResponse> {
	
	

	/** 
	* 奇门仓储字段,说明,string(50),,
	 */
	private String currentPage;

	/** 
	* 扩展属性
	 */
	private Map extendProps;

	/**
	* item
	 */
	private List<Item> items;

	/**
	* 奇门仓储字段,说明,string(50),,
	 */
	private String orderCode;

	/**
	* 奇门仓储字段,说明,string(50),,
	 */
	private String orderType;

	/**
	* 奇门仓储字段,说明,string(50),,
	 */
	private String ownerCode;

	/**
	* 奇门仓储字段,说明,string(50),,
	 */
	private String pageSize;

	/**
	* 奇门仓储字段,说明,string(50),,
	 */
	private String remark;

	/**
	* 奇门仓储字段,说明,string(50),,
	 */
	private String totalPage;

	/**
	* 奇门仓储字段,说明,string(50),,
	 */
	private String warehouseCode;

	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}

	public String getCurrentPage() {
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

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getOrderCode() {
		return this.orderCode;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setOwnerCode(String ownerCode) {
		this.ownerCode = ownerCode;
	}

	public String getOwnerCode() {
		return this.ownerCode;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setTotalPage(String totalPage) {
		this.totalPage = totalPage;
	}

	public String getTotalPage() {
		return this.totalPage;
	}

	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

	public String getWarehouseCode() {
		return this.warehouseCode;
	}

	public String getApiMethodName() {
		return "taobao.qimen.stockchange.report";
	}

	public Class<StockchangeReportResponse> getResponseClass() {
		return StockchangeReportResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
 * priceAdjustment
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class PriceAdjustment {

	/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("discount")
		private String discount;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("endDate")
		private String endDate;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("standardPrice")
		private String standardPrice;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("startDate")
		private String startDate;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("type")
		private String type;
	

	public String getDiscount() {
			return this.discount;
		}
		public void setDiscount(String discount) {
			this.discount = discount;
		}
		public String getEndDate() {
			return this.endDate;
		}
		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}
		public String getStandardPrice() {
			return this.standardPrice;
		}
		public void setStandardPrice(String standardPrice) {
			this.standardPrice = standardPrice;
		}
		public String getStartDate() {
			return this.startDate;
		}
		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}

}

	/**
 * batchs
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Batch {

	/**
		 * 批次编号
		 */
		@ApiField("batchCode")
		private String batchCode;
		/**
		 * 过期日期(YYYY-MM-DD)
		 */
		@ApiField("expireDate")
		private String expireDate;
		/**
		 * 库存类型(ZP=正品;CC=残次;JS=机损 XS= 箱损;ZT=在途库存)
		 */
		@ApiField("inventoryType")
		private String inventoryType;
		/**
		 * 生产批号
		 */
		@ApiField("produceCode")
		private String produceCode;
		/**
		 * 生产日期(YYYY-MM-DD)
		 */
		@ApiField("productDate")
		private String productDate;
		/**
		 * 异动数量(要求batchs节点下所有的异动数量之和等于orderline中的异动数量)
		 */
		@ApiField("quantity")
		private Long quantity;
	

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

}

	/**
 * item
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Item {

	/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("actualAmount")
		private String actualAmount;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("actualQty")
		private String actualQty;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("adventLifecycle")
		private String adventLifecycle;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("amount")
		private String amount;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("approvalNumber")
		private String approvalNumber;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("barCode")
		private String barCode;
		/**
		 * 批次编码
		 */
		@ApiField("batchCode")
		private String batchCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("batchRemark")
		private String batchRemark;
		/**
		 * batchs
		 */
		@ApiListField("batchs")
		@ApiField("batch")
		private List<Batch> batchs;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("brandCode")
		private String brandCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("brandName")
		private String brandName;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("categoryId")
		private String categoryId;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("categoryName")
		private String categoryName;
		/**
		 * 异动时间(YYYY-MM-DD HH:MM:SS)
		 */
		@ApiField("changeTime")
		private String changeTime;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("channelCode")
		private String channelCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("color")
		private String color;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("costPrice")
		private String costPrice;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("defectiveQty")
		private String defectiveQty;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("diffQuantity")
		private String diffQuantity;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("discount")
		private String discount;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("discountPrice")
		private String discountPrice;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("englishName")
		private String englishName;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("exCode")
		private String exCode;
		/**
		 * 商品过期日期(YYYY-MM-DD)
		 */
		@ApiField("expireDate")
		private String expireDate;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("extCode")
		private String extCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("goodsCode")
		private String goodsCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("grossWeight")
		private String grossWeight;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("height")
		private String height;
		/**
		 * 库存类型(ZP=正品;CC=残次;JS=机损;XS=箱损;ZT=在途库存)
		 */
		@ApiField("inventoryType")
		private String inventoryType;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("isAreaSale")
		private String isAreaSale;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("isBatchMgmt")
		private String isBatchMgmt;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("isFragile")
		private String isFragile;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("isHazardous")
		private String isHazardous;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("isSNMgmt")
		private String isSNMgmt;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("isShelfLifeMgmt")
		private String isShelfLifeMgmt;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("isSku")
		private String isSku;
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
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("itemName")
		private String itemName;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("itemType")
		private String itemType;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("lackQty")
		private String lackQty;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("latestUpdateTime")
		private String latestUpdateTime;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("length")
		private String length;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("lockQuantity")
		private String lockQuantity;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("lockupLifecycle")
		private String lockupLifecycle;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("netWeight")
		private String netWeight;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("normalQty")
		private String normalQty;
		/**
		 * 引起异动的单据编码
		 */
		@ApiField("orderCode")
		private String orderCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("orderLineNo")
		private String orderLineNo;
		/**
		 * 单据类型(JYCK=一般交易出库单;HHCK=换货出库;BFCK=补发出库;PTCK=普通出库单;DBCK=调拨出库;B2BRK=B2B入 库;B2BCK=B2B出库;QTCK=其他出库;SCRK=生产入库;LYRK=领用入库;CCRK=残次品入库;CGRK=采购入库;DBRK= 调拨入库;QTRK= 其他入 库;XTRK= 销退入库;HHRK= 换货入库;CNJG= 仓内加工单)
		 */
		@ApiField("orderType")
		private String orderType;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("originAddress")
		private String originAddress;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("originCode")
		private String originCode;
		/**
		 * 外部业务编码(消息ID;用于去重;用来保证因为网络等原因导致重复传输;请求不会被重复处理)
		 */
		@ApiField("outBizCode")
		private String outBizCode;
		/**
		 * 货主编码
		 */
		@ApiField("ownerCode")
		private String ownerCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("packCode")
		private String packCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("packageMaterial")
		private String packageMaterial;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("paperQty")
		private String paperQty;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("pcs")
		private String pcs;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("planQty")
		private String planQty;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("price")
		private String price;
		/**
		 * priceAdjustment
		 */
		@ApiField("priceAdjustment")
		private PriceAdjustment priceAdjustment;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("pricingCategory")
		private String pricingCategory;
		/**
		 * 生产批号
		 */
		@ApiField("produceCode")
		private String produceCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("productCode")
		private String productCode;
		/**
		 * 商品生产日期(YYYY-MM-DD)
		 */
		@ApiField("productDate")
		private String productDate;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("purchasePrice")
		private String purchasePrice;
		/**
		 * 商品变化量(可为正为负)
		 */
		@ApiField("quantity")
		private Long quantity;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("reason")
		private String reason;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("receiveQty")
		private String receiveQty;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("referencePrice")
		private String referencePrice;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("rejectLifecycle")
		private String rejectLifecycle;
		/**
		 * 备注
		 */
		@ApiField("remark")
		private String remark;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("retailPrice")
		private String retailPrice;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("safetyStock")
		private String safetyStock;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("seasonCode")
		private String seasonCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("seasonName")
		private String seasonName;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("shelfLife")
		private String shelfLife;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("shortName")
		private String shortName;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("size")
		private String size;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("skuProperty")
		private String skuProperty;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("sn")
		private String sn;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("snCode")
		private String snCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("sourceOrderCode")
		private String sourceOrderCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("standardPrice")
		private String standardPrice;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("stockStatus")
		private String stockStatus;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("stockUnit")
		private String stockUnit;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("subSourceOrderCode")
		private String subSourceOrderCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("supplierCode")
		private String supplierCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("supplierName")
		private String supplierName;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("tagPrice")
		private String tagPrice;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("tareWeight")
		private String tareWeight;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("tempRequirement")
		private String tempRequirement;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("title")
		private String title;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("unit")
		private String unit;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("volume")
		private String volume;
		/**
		 * 仓库编码
		 */
		@ApiField("warehouseCode")
		private String warehouseCode;
		/**
		 * 奇门仓储字段,说明,string(50),,
		 */
		@ApiField("width")
		private String width;
	

	public String getActualAmount() {
			return this.actualAmount;
		}
		public void setActualAmount(String actualAmount) {
			this.actualAmount = actualAmount;
		}
		public String getActualQty() {
			return this.actualQty;
		}
		public void setActualQty(String actualQty) {
			this.actualQty = actualQty;
		}
		public String getAdventLifecycle() {
			return this.adventLifecycle;
		}
		public void setAdventLifecycle(String adventLifecycle) {
			this.adventLifecycle = adventLifecycle;
		}
		public String getAmount() {
			return this.amount;
		}
		public void setAmount(String amount) {
			this.amount = amount;
		}
		public String getApprovalNumber() {
			return this.approvalNumber;
		}
		public void setApprovalNumber(String approvalNumber) {
			this.approvalNumber = approvalNumber;
		}
		public String getBarCode() {
			return this.barCode;
		}
		public void setBarCode(String barCode) {
			this.barCode = barCode;
		}
		public String getBatchCode() {
			return this.batchCode;
		}
		public void setBatchCode(String batchCode) {
			this.batchCode = batchCode;
		}
		public String getBatchRemark() {
			return this.batchRemark;
		}
		public void setBatchRemark(String batchRemark) {
			this.batchRemark = batchRemark;
		}
		public List<Batch> getBatchs() {
			return this.batchs;
		}
		public void setBatchs(List<Batch> batchs) {
			this.batchs = batchs;
		}
		public String getBrandCode() {
			return this.brandCode;
		}
		public void setBrandCode(String brandCode) {
			this.brandCode = brandCode;
		}
		public String getBrandName() {
			return this.brandName;
		}
		public void setBrandName(String brandName) {
			this.brandName = brandName;
		}
		public String getCategoryId() {
			return this.categoryId;
		}
		public void setCategoryId(String categoryId) {
			this.categoryId = categoryId;
		}
		public String getCategoryName() {
			return this.categoryName;
		}
		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}
		public String getChangeTime() {
			return this.changeTime;
		}
		public void setChangeTime(String changeTime) {
			this.changeTime = changeTime;
		}
		public String getChannelCode() {
			return this.channelCode;
		}
		public void setChannelCode(String channelCode) {
			this.channelCode = channelCode;
		}
		public String getColor() {
			return this.color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getCostPrice() {
			return this.costPrice;
		}
		public void setCostPrice(String costPrice) {
			this.costPrice = costPrice;
		}
		public String getDefectiveQty() {
			return this.defectiveQty;
		}
		public void setDefectiveQty(String defectiveQty) {
			this.defectiveQty = defectiveQty;
		}
		public String getDiffQuantity() {
			return this.diffQuantity;
		}
		public void setDiffQuantity(String diffQuantity) {
			this.diffQuantity = diffQuantity;
		}
		public String getDiscount() {
			return this.discount;
		}
		public void setDiscount(String discount) {
			this.discount = discount;
		}
		public String getDiscountPrice() {
			return this.discountPrice;
		}
		public void setDiscountPrice(String discountPrice) {
			this.discountPrice = discountPrice;
		}
		public String getEnglishName() {
			return this.englishName;
		}
		public void setEnglishName(String englishName) {
			this.englishName = englishName;
		}
		public String getExCode() {
			return this.exCode;
		}
		public void setExCode(String exCode) {
			this.exCode = exCode;
		}
		public String getExpireDate() {
			return this.expireDate;
		}
		public void setExpireDate(String expireDate) {
			this.expireDate = expireDate;
		}
		public String getExtCode() {
			return this.extCode;
		}
		public void setExtCode(String extCode) {
			this.extCode = extCode;
		}
		public String getGoodsCode() {
			return this.goodsCode;
		}
		public void setGoodsCode(String goodsCode) {
			this.goodsCode = goodsCode;
		}
		public String getGrossWeight() {
			return this.grossWeight;
		}
		public void setGrossWeight(String grossWeight) {
			this.grossWeight = grossWeight;
		}
		public String getHeight() {
			return this.height;
		}
		public void setHeight(String height) {
			this.height = height;
		}
		public String getInventoryType() {
			return this.inventoryType;
		}
		public void setInventoryType(String inventoryType) {
			this.inventoryType = inventoryType;
		}
		public String getIsAreaSale() {
			return this.isAreaSale;
		}
		public void setIsAreaSale(String isAreaSale) {
			this.isAreaSale = isAreaSale;
		}
		public String getIsBatchMgmt() {
			return this.isBatchMgmt;
		}
		public void setIsBatchMgmt(String isBatchMgmt) {
			this.isBatchMgmt = isBatchMgmt;
		}
		public String getIsFragile() {
			return this.isFragile;
		}
		public void setIsFragile(String isFragile) {
			this.isFragile = isFragile;
		}
		public String getIsHazardous() {
			return this.isHazardous;
		}
		public void setIsHazardous(String isHazardous) {
			this.isHazardous = isHazardous;
		}
		public String getIsSNMgmt() {
			return this.isSNMgmt;
		}
		public void setIsSNMgmt(String isSNMgmt) {
			this.isSNMgmt = isSNMgmt;
		}
		public String getIsShelfLifeMgmt() {
			return this.isShelfLifeMgmt;
		}
		public void setIsShelfLifeMgmt(String isShelfLifeMgmt) {
			this.isShelfLifeMgmt = isShelfLifeMgmt;
		}
		public String getIsSku() {
			return this.isSku;
		}
		public void setIsSku(String isSku) {
			this.isSku = isSku;
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
		public String getItemName() {
			return this.itemName;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		public String getItemType() {
			return this.itemType;
		}
		public void setItemType(String itemType) {
			this.itemType = itemType;
		}
		public String getLackQty() {
			return this.lackQty;
		}
		public void setLackQty(String lackQty) {
			this.lackQty = lackQty;
		}
		public String getLatestUpdateTime() {
			return this.latestUpdateTime;
		}
		public void setLatestUpdateTime(String latestUpdateTime) {
			this.latestUpdateTime = latestUpdateTime;
		}
		public String getLength() {
			return this.length;
		}
		public void setLength(String length) {
			this.length = length;
		}
		public String getLockQuantity() {
			return this.lockQuantity;
		}
		public void setLockQuantity(String lockQuantity) {
			this.lockQuantity = lockQuantity;
		}
		public String getLockupLifecycle() {
			return this.lockupLifecycle;
		}
		public void setLockupLifecycle(String lockupLifecycle) {
			this.lockupLifecycle = lockupLifecycle;
		}
		public String getNetWeight() {
			return this.netWeight;
		}
		public void setNetWeight(String netWeight) {
			this.netWeight = netWeight;
		}
		public String getNormalQty() {
			return this.normalQty;
		}
		public void setNormalQty(String normalQty) {
			this.normalQty = normalQty;
		}
		public String getOrderCode() {
			return this.orderCode;
		}
		public void setOrderCode(String orderCode) {
			this.orderCode = orderCode;
		}
		public String getOrderLineNo() {
			return this.orderLineNo;
		}
		public void setOrderLineNo(String orderLineNo) {
			this.orderLineNo = orderLineNo;
		}
		public String getOrderType() {
			return this.orderType;
		}
		public void setOrderType(String orderType) {
			this.orderType = orderType;
		}
		public String getOriginAddress() {
			return this.originAddress;
		}
		public void setOriginAddress(String originAddress) {
			this.originAddress = originAddress;
		}
		public String getOriginCode() {
			return this.originCode;
		}
		public void setOriginCode(String originCode) {
			this.originCode = originCode;
		}
		public String getOutBizCode() {
			return this.outBizCode;
		}
		public void setOutBizCode(String outBizCode) {
			this.outBizCode = outBizCode;
		}
		public String getOwnerCode() {
			return this.ownerCode;
		}
		public void setOwnerCode(String ownerCode) {
			this.ownerCode = ownerCode;
		}
		public String getPackCode() {
			return this.packCode;
		}
		public void setPackCode(String packCode) {
			this.packCode = packCode;
		}
		public String getPackageMaterial() {
			return this.packageMaterial;
		}
		public void setPackageMaterial(String packageMaterial) {
			this.packageMaterial = packageMaterial;
		}
		public String getPaperQty() {
			return this.paperQty;
		}
		public void setPaperQty(String paperQty) {
			this.paperQty = paperQty;
		}
		public String getPcs() {
			return this.pcs;
		}
		public void setPcs(String pcs) {
			this.pcs = pcs;
		}
		public String getPlanQty() {
			return this.planQty;
		}
		public void setPlanQty(String planQty) {
			this.planQty = planQty;
		}
		public String getPrice() {
			return this.price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		public PriceAdjustment getPriceAdjustment() {
			return this.priceAdjustment;
		}
		public void setPriceAdjustment(PriceAdjustment priceAdjustment) {
			this.priceAdjustment = priceAdjustment;
		}
		public String getPricingCategory() {
			return this.pricingCategory;
		}
		public void setPricingCategory(String pricingCategory) {
			this.pricingCategory = pricingCategory;
		}
		public String getProduceCode() {
			return this.produceCode;
		}
		public void setProduceCode(String produceCode) {
			this.produceCode = produceCode;
		}
		public String getProductCode() {
			return this.productCode;
		}
		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}
		public String getProductDate() {
			return this.productDate;
		}
		public void setProductDate(String productDate) {
			this.productDate = productDate;
		}
		public String getPurchasePrice() {
			return this.purchasePrice;
		}
		public void setPurchasePrice(String purchasePrice) {
			this.purchasePrice = purchasePrice;
		}
		public Long getQuantity() {
			return this.quantity;
		}
		public void setQuantity(Long quantity) {
			this.quantity = quantity;
		}
		public String getReason() {
			return this.reason;
		}
		public void setReason(String reason) {
			this.reason = reason;
		}
		public String getReceiveQty() {
			return this.receiveQty;
		}
		public void setReceiveQty(String receiveQty) {
			this.receiveQty = receiveQty;
		}
		public String getReferencePrice() {
			return this.referencePrice;
		}
		public void setReferencePrice(String referencePrice) {
			this.referencePrice = referencePrice;
		}
		public String getRejectLifecycle() {
			return this.rejectLifecycle;
		}
		public void setRejectLifecycle(String rejectLifecycle) {
			this.rejectLifecycle = rejectLifecycle;
		}
		public String getRemark() {
			return this.remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}
		public String getRetailPrice() {
			return this.retailPrice;
		}
		public void setRetailPrice(String retailPrice) {
			this.retailPrice = retailPrice;
		}
		public String getSafetyStock() {
			return this.safetyStock;
		}
		public void setSafetyStock(String safetyStock) {
			this.safetyStock = safetyStock;
		}
		public String getSeasonCode() {
			return this.seasonCode;
		}
		public void setSeasonCode(String seasonCode) {
			this.seasonCode = seasonCode;
		}
		public String getSeasonName() {
			return this.seasonName;
		}
		public void setSeasonName(String seasonName) {
			this.seasonName = seasonName;
		}
		public String getShelfLife() {
			return this.shelfLife;
		}
		public void setShelfLife(String shelfLife) {
			this.shelfLife = shelfLife;
		}
		public String getShortName() {
			return this.shortName;
		}
		public void setShortName(String shortName) {
			this.shortName = shortName;
		}
		public String getSize() {
			return this.size;
		}
		public void setSize(String size) {
			this.size = size;
		}
		public String getSkuProperty() {
			return this.skuProperty;
		}
		public void setSkuProperty(String skuProperty) {
			this.skuProperty = skuProperty;
		}
		public String getSn() {
			return this.sn;
		}
		public void setSn(String sn) {
			this.sn = sn;
		}
		public String getSnCode() {
			return this.snCode;
		}
		public void setSnCode(String snCode) {
			this.snCode = snCode;
		}
		public String getSourceOrderCode() {
			return this.sourceOrderCode;
		}
		public void setSourceOrderCode(String sourceOrderCode) {
			this.sourceOrderCode = sourceOrderCode;
		}
		public String getStandardPrice() {
			return this.standardPrice;
		}
		public void setStandardPrice(String standardPrice) {
			this.standardPrice = standardPrice;
		}
		public String getStockStatus() {
			return this.stockStatus;
		}
		public void setStockStatus(String stockStatus) {
			this.stockStatus = stockStatus;
		}
		public String getStockUnit() {
			return this.stockUnit;
		}
		public void setStockUnit(String stockUnit) {
			this.stockUnit = stockUnit;
		}
		public String getSubSourceOrderCode() {
			return this.subSourceOrderCode;
		}
		public void setSubSourceOrderCode(String subSourceOrderCode) {
			this.subSourceOrderCode = subSourceOrderCode;
		}
		public String getSupplierCode() {
			return this.supplierCode;
		}
		public void setSupplierCode(String supplierCode) {
			this.supplierCode = supplierCode;
		}
		public String getSupplierName() {
			return this.supplierName;
		}
		public void setSupplierName(String supplierName) {
			this.supplierName = supplierName;
		}
		public String getTagPrice() {
			return this.tagPrice;
		}
		public void setTagPrice(String tagPrice) {
			this.tagPrice = tagPrice;
		}
		public String getTareWeight() {
			return this.tareWeight;
		}
		public void setTareWeight(String tareWeight) {
			this.tareWeight = tareWeight;
		}
		public String getTempRequirement() {
			return this.tempRequirement;
		}
		public void setTempRequirement(String tempRequirement) {
			this.tempRequirement = tempRequirement;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getUnit() {
			return this.unit;
		}
		public void setUnit(String unit) {
			this.unit = unit;
		}
		public String getVolume() {
			return this.volume;
		}
		public void setVolume(String volume) {
			this.volume = volume;
		}
		public String getWarehouseCode() {
			return this.warehouseCode;
		}
		public void setWarehouseCode(String warehouseCode) {
			this.warehouseCode = warehouseCode;
		}
		public String getWidth() {
			return this.width;
		}
		public void setWidth(String width) {
			this.width = width;
		}

}


}
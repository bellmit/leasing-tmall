package com.qimen.api.request;

import com.qimen.api.QimenRequest;
import com.qimen.api.response.StockQueryResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;

import java.util.Map;

/**
 * TOP API: taobao.qimen.stock.query request
 * 
 * @author top auto create
 * @since 1.0, 2016.11.25
 */
public class StockQueryRequest extends QimenRequest<StockQueryResponse> {
	
	

	/** 
	* 批次编码
	 */
	private String batchCode;

	/** 
	* 商品过期日期(YYYY-MM-DD)
	 */
	private String expireDate;

	/** 
	* 扩展属性
	 */
	private Map extendProps;

	/**
	* 库存类型(ZP=正品;CC=残次;JS=机损;XS=箱损;ZT=在途库存;默认为查所有类型的库存)
	 */
	private String inventoryType;

	/**
	* 商品编码
	 */
	private String itemCode;

	/**
	* 仓储系统商品ID
	 */
	private String itemId;

	/**
	* 货主编码
	 */
	private String ownerCode;

	/**
	* 当前页(从1开始)
	 */
	private Long page;

	/**
	* 每页条数(最多100条)
	 */
	private Long pageSize;

	/**
	* 商品生产日期(YYYY-MM-DD)
	 */
	private String productDate;

	/**
	* 仓库编码
	 */
	private String warehouseCode;

	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}

	public String getBatchCode() {
		return this.batchCode;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public String getExpireDate() {
		return this.expireDate;
	}

	public void setExtendProps(Map extendProps) {
		this.extendProps = extendProps;
	}

	public Map getExtendProps() {
		return this.extendProps;
	}

	public void setInventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
	}

	public String getInventoryType() {
		return this.inventoryType;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemCode() {
		return this.itemCode;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemId() {
		return this.itemId;
	}

	public void setOwnerCode(String ownerCode) {
		this.ownerCode = ownerCode;
	}

	public String getOwnerCode() {
		return this.ownerCode;
	}

	public void setPage(Long page) {
		this.page = page;
	}

	public Long getPage() {
		return this.page;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setProductDate(String productDate) {
		this.productDate = productDate;
	}

	public String getProductDate() {
		return this.productDate;
	}

	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

	public String getWarehouseCode() {
		return this.warehouseCode;
	}

	public String getApiMethodName() {
		return "taobao.qimen.stock.query";
	}

	public Class<StockQueryResponse> getResponseClass() {
		return StockQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxLength(batchCode, 50, "batchCode");
		RequestCheckUtils.checkMaxLength(expireDate, 10, "expireDate");
		RequestCheckUtils.checkMaxLength(inventoryType, 50, "inventoryType");
		RequestCheckUtils.checkNotEmpty(itemCode, "itemCode");
		RequestCheckUtils.checkMaxLength(itemCode, 50, "itemCode");
		RequestCheckUtils.checkMaxLength(itemId, 50, "itemId");
		RequestCheckUtils.checkMaxLength(ownerCode, 50, "ownerCode");
		RequestCheckUtils.checkNotEmpty(page, "page");
		RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
		RequestCheckUtils.checkMaxLength(productDate, 10, "productDate");
		RequestCheckUtils.checkMaxLength(warehouseCode, 50, "warehouseCode");
	}
	

}
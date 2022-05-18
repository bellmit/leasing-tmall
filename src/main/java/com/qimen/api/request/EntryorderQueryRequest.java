package com.qimen.api.request;

import com.qimen.api.QimenRequest;
import com.qimen.api.response.EntryorderQueryResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;

import java.util.Map;

/**
 * TOP API: taobao.qimen.entryorder.query request
 * 
 * @author top auto create
 * @since 1.0, 2017.04.25
 */
public class EntryorderQueryRequest extends QimenRequest<EntryorderQueryResponse> {
	
	

	/** 
	* 入库单编码
	 */
	private String entryOrderCode;

	/** 
	* 仓储系统入库单ID
	 */
	private String entryOrderId;

	/** 
	* extOrderCode
	 */
	private String extOrderCode;

	/** 
	* 扩展属性
	 */
	private Map extendProps;

	/**
	* orderType
	 */
	private String orderType;

	/**
	* 货主编码
	 */
	private String ownerCode;

	/**
	* 当前页(从1开始)
	 */
	private Long page;

	/**
	* 每页orderLine条数(最多100条)
	 */
	private Long pageSize;

	/**
	* 仓库编码
	 */
	private String warehouseCode;

	public void setEntryOrderCode(String entryOrderCode) {
		this.entryOrderCode = entryOrderCode;
	}

	public String getEntryOrderCode() {
		return this.entryOrderCode;
	}

	public void setEntryOrderId(String entryOrderId) {
		this.entryOrderId = entryOrderId;
	}

	public String getEntryOrderId() {
		return this.entryOrderId;
	}

	public void setExtOrderCode(String extOrderCode) {
		this.extOrderCode = extOrderCode;
	}

	public String getExtOrderCode() {
		return this.extOrderCode;
	}

	public void setExtendProps(Map extendProps) {
		this.extendProps = extendProps;
	}

	public Map getExtendProps() {
		return this.extendProps;
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

	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

	public String getWarehouseCode() {
		return this.warehouseCode;
	}

	public String getApiMethodName() {
		return "taobao.qimen.entryorder.query";
	}

	public Class<EntryorderQueryResponse> getResponseClass() {
		return EntryorderQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(entryOrderCode, "entryOrderCode");
		RequestCheckUtils.checkMaxLength(entryOrderCode, 50, "entryOrderCode");
		RequestCheckUtils.checkMaxLength(entryOrderId, 50, "entryOrderId");
		RequestCheckUtils.checkMaxLength(ownerCode, 50, "ownerCode");
		RequestCheckUtils.checkNotEmpty(page, "page");
		RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
		RequestCheckUtils.checkMaxLength(warehouseCode, 50, "warehouseCode");
	}
	

}
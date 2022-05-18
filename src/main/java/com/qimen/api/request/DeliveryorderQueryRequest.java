package com.qimen.api.request;

import com.qimen.api.QimenRequest;
import com.qimen.api.response.DeliveryorderQueryResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;

import java.util.Map;

/**
 * TOP API: taobao.qimen.deliveryorder.query request
 * 
 * @author top auto create
 * @since 1.0, 2017.04.27
 */
public class DeliveryorderQueryRequest extends QimenRequest<DeliveryorderQueryResponse> {
	
	

	/** 
	* 奇门仓储字段,说明,string(50),,
	 */
	private String deliveryOrderCode;

	/** 
	* 奇门仓储字段,说明,string(50),,
	 */
	private String deliveryOrderId;

	/** 
	* 扩展属性
	 */
	private Map extendProps;

	/**
	* 发库单号
	 */
	private String orderCode;

	/**
	* 仓储系统发库单号
	 */
	private String orderId;

	/**
	* 交易单号
	 */
	private String orderSourceCode;

	/**
	* 货主编码
	 */
	private String ownerCode;

	/**
	* 当前页
	 */
	private Long page;

	/**
	* 每页orderLine条数(最多100条)
	 */
	private Long pageSize;

	/**
	* 奇门仓储字段,说明,string(50),,
	 */
	private String status;

	/**
	* 仓库编码
	 */
	private String warehouseCode;

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

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getOrderCode() {
		return this.orderCode;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderSourceCode(String orderSourceCode) {
		this.orderSourceCode = orderSourceCode;
	}

	public String getOrderSourceCode() {
		return this.orderSourceCode;
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

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return this.status;
	}

	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

	public String getWarehouseCode() {
		return this.warehouseCode;
	}

	public String getApiMethodName() {
		return "taobao.qimen.deliveryorder.query";
	}

	public Class<DeliveryorderQueryResponse> getResponseClass() {
		return DeliveryorderQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(orderCode, "orderCode");
		RequestCheckUtils.checkMaxLength(orderCode, 50, "orderCode");
		RequestCheckUtils.checkMaxLength(orderId, 50, "orderId");
		RequestCheckUtils.checkMaxLength(orderSourceCode, 50, "orderSourceCode");
		RequestCheckUtils.checkMaxLength(ownerCode, 50, "ownerCode");
		RequestCheckUtils.checkNotEmpty(page, "page");
		RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
		RequestCheckUtils.checkMaxLength(warehouseCode, 50, "warehouseCode");
	}
	

}
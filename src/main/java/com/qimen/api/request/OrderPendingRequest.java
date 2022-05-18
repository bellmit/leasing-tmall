package com.qimen.api.request;

import com.qimen.api.QimenRequest;
import com.qimen.api.response.OrderPendingResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;

import java.util.Map;

/**
 * TOP API: taobao.qimen.order.pending request
 * 
 * @author top auto create
 * @since 1.0, 2016.11.25
 */
public class OrderPendingRequest extends QimenRequest<OrderPendingResponse> {
	
	

	/** 
	* 操作类型(pending=挂起;restore=恢复)
	 */
	private String actionType;

	/** 
	* 扩展属性
	 */
	private Map extendProps;

	/**
	* 单据编码
	 */
	private String orderCode;

	/**
	* 仓储系统单据编码
	 */
	private String orderId;

	/**
	* 单据类型(JYCK=一般交易出库单;HHCK=换货出库;BFCK=补发出库;PTCK=普通出库单;DBCK=调拨出库;QTCK=其他出库;B2BRK=B2B入库;B2BCK=B2B出库;CGRK=采购入库;DBRK=调拨入库;QTRK=其他入库;XTRK=销退入库;HHRK=换货入库;CNJG=仓内加工单)
	 */
	private String orderType;

	/**
	* 货主编码
	 */
	private String ownerCode;

	/**
	* 挂起/恢复原因
	 */
	private String reason;

	/**
	* 仓库编码(统仓统配等无需ERP指定仓储编码的情况填OTHER)
	 */
	private String warehouseCode;

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getActionType() {
		return this.actionType;
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

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getReason() {
		return this.reason;
	}

	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

	public String getWarehouseCode() {
		return this.warehouseCode;
	}

	public String getApiMethodName() {
		return "taobao.qimen.order.pending";
	}

	public Class<OrderPendingResponse> getResponseClass() {
		return OrderPendingResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(actionType, "actionType");
		RequestCheckUtils.checkMaxLength(actionType, 50, "actionType");
		RequestCheckUtils.checkNotEmpty(orderCode, "orderCode");
		RequestCheckUtils.checkMaxLength(orderCode, 50, "orderCode");
		RequestCheckUtils.checkMaxLength(orderId, 50, "orderId");
		RequestCheckUtils.checkMaxLength(orderType, 50, "orderType");
		RequestCheckUtils.checkMaxLength(ownerCode, 50, "ownerCode");
		RequestCheckUtils.checkMaxLength(reason, 500, "reason");
		RequestCheckUtils.checkNotEmpty(warehouseCode, "warehouseCode");
		RequestCheckUtils.checkMaxLength(warehouseCode, 50, "warehouseCode");
	}
	

}
package com.qimen.api.request;

import com.qimen.api.QimenRequest;
import com.qimen.api.response.OrderprocessQueryResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;

import java.util.Map;

/**
 * TOP API: taobao.qimen.orderprocess.query request
 * 
 * @author top auto create
 * @since 1.0, 2016.11.25
 */
public class OrderprocessQueryRequest extends QimenRequest<OrderprocessQueryResponse> {
	
	

	/** 
	* 扩展属性
	 */
	private Map extendProps;

	/**
	* 单据号
	 */
	private String orderCode;

	/**
	* 仓储系统单据号
	 */
	private String orderId;

	/**
	* 单据类型(JYCK=一般交易出库单;HHCK=换货出库;BFCK=补发出库;PTCK=普通出库单;DBCK=调拨出库;QTCK=其他出库;B2BRK=B2B入库;B2BCK=B2B出库;CGRK=采购入库;DBRK=调拨入库;QTRK=其他入库;XTRK=销退入库;HHRK=换货入库;CNJG=仓内加工单)
	 */
	private String orderType;

	/**
	* 仓库编码
	 */
	private String warehouseCode;

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

	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

	public String getWarehouseCode() {
		return this.warehouseCode;
	}

	public String getApiMethodName() {
		return "taobao.qimen.orderprocess.query";
	}

	public Class<OrderprocessQueryResponse> getResponseClass() {
		return OrderprocessQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(orderCode, "orderCode");
		RequestCheckUtils.checkMaxLength(orderCode, 50, "orderCode");
		RequestCheckUtils.checkMaxLength(orderId, 50, "orderId");
		RequestCheckUtils.checkMaxLength(orderType, 50, "orderType");
		RequestCheckUtils.checkMaxLength(warehouseCode, 50, "warehouseCode");
	}
	

}
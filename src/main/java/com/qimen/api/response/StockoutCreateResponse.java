package com.qimen.api.response;

import com.qimen.api.QimenResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.qimen.stockout.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class StockoutCreateResponse extends QimenResponse {

	private static final long serialVersionUID = 6147218923999219517L;

	/** 
	 * 订单创建时间(YYYY-MM-DD HH:MM:SS)
	 */
	@ApiField("createTime")
	private String createTime;

	/** 
	 * 出库单仓储系统编码
	 */
	@ApiField("deliveryOrderId")
	private String deliveryOrderId;


	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getCreateTime( ) {
		return this.createTime;
	}

	public void setDeliveryOrderId(String deliveryOrderId) {
		this.deliveryOrderId = deliveryOrderId;
	}
	public String getDeliveryOrderId( ) {
		return this.deliveryOrderId;
	}
	


}

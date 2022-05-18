package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.CainiaoReturnBillReturnorderinfo;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.wlb.wms.return.bill.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWmsReturnBillGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7686872617788844487L;

	/** 
	 * 回退订单信息
	 */
	@ApiField("return_order_info")
	private CainiaoReturnBillReturnorderinfo returnOrderInfo;


	public void setReturnOrderInfo(CainiaoReturnBillReturnorderinfo returnOrderInfo) {
		this.returnOrderInfo = returnOrderInfo;
	}
	public CainiaoReturnBillReturnorderinfo getReturnOrderInfo( ) {
		return this.returnOrderInfo;
	}
	


}

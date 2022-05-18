package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.fenxiao.dealer.requisitionorder.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class FenxiaoDealerRequisitionorderCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7313133829287398887L;

	/** 
	 * 经销采购申请编号
	 */
	@ApiField("dealer_order_id")
	private Long dealerOrderId;


	public void setDealerOrderId(Long dealerOrderId) {
		this.dealerOrderId = dealerOrderId;
	}
	public Long getDealerOrderId( ) {
		return this.dealerOrderId;
	}
	


}

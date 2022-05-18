package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Trade;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.trade.shippingaddress.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TradeShippingaddressUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2784359933672345399L;

	/** 
	 * 交易结构
	 */
	@ApiField("trade")
	private Trade trade;


	public void setTrade(Trade trade) {
		this.trade = trade;
	}
	public Trade getTrade( ) {
		return this.trade;
	}
	


}

package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Trade;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.trade.fullinfo.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TradeFullinfoGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6828997994118495717L;

	/** 
	 * 交易主订单信息
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

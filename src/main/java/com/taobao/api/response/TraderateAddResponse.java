package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TradeRate;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.traderate.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TraderateAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6184979287374781839L;

	/** 
	 * 返回tid、oid、create
	 */
	@ApiField("trade_rate")
	private TradeRate tradeRate;


	public void setTradeRate(TradeRate tradeRate) {
		this.tradeRate = tradeRate;
	}
	public TradeRate getTradeRate( ) {
		return this.tradeRate;
	}
	


}

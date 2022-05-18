package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TradeRate;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.traderate.list.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TraderateListAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1785793553443766733L;

	/** 
	 * 返回的评论的信息，仅返回tid和created字段
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

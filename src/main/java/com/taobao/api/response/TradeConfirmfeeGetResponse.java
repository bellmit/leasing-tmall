package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TradeConfirmFee;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.trade.confirmfee.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TradeConfirmfeeGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5473825351956762168L;

	/** 
	 * 获取到的交易确认收货费用
	 */
	@ApiField("trade_confirm_fee")
	private TradeConfirmFee tradeConfirmFee;


	public void setTradeConfirmFee(TradeConfirmFee tradeConfirmFee) {
		this.tradeConfirmFee = tradeConfirmFee;
	}
	public TradeConfirmFee getTradeConfirmFee( ) {
		return this.tradeConfirmFee;
	}
	


}

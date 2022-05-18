package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TradeDrugOrderGetResponse;

import java.util.Map;

/**
 * TOP API: taobao.trade.drug.order.get request
 * 
 * @author top auto create
 * @since 1.0, 2017.04.10
 */
public class TradeDrugOrderGetRequest extends BaseTaobaoRequest<TradeDrugOrderGetResponse> {
	
	

	/** 
	* 订单id
	 */
	private Long orderId;

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getOrderId() {
		return this.orderId;
	}

	public String getApiMethodName() {
		return "taobao.trade.drug.order.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("order_id", this.orderId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TradeDrugOrderGetResponse> getResponseClass() {
		return TradeDrugOrderGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(orderId, "orderId");
	}
	

}
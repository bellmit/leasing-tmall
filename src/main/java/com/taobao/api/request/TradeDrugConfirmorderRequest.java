package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TradeDrugConfirmorderResponse;

import java.util.Map;

/**
 * TOP API: taobao.trade.drug.confirmorder request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.21
 */
public class TradeDrugConfirmorderRequest extends BaseTaobaoRequest<TradeDrugConfirmorderResponse> {
	
	

	/** 
	* public static int NORMAL_TYPE=0; 普通发货 默认 public static int DD_DAI_SONG=2; 代送宝	public static int DD_SONG_TYPE_V2=3; 点点送发货
	 */
	private Long confirmType;

	/** 
	* 代送宝 代送商ID
	 */
	private Long deliveryId;

	/** 
	* 订单ID
	 */
	private Long orderId;

	public void setConfirmType(Long confirmType) {
		this.confirmType = confirmType;
	}

	public Long getConfirmType() {
		return this.confirmType;
	}

	public void setDeliveryId(Long deliveryId) {
		this.deliveryId = deliveryId;
	}

	public Long getDeliveryId() {
		return this.deliveryId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getOrderId() {
		return this.orderId;
	}

	public String getApiMethodName() {
		return "taobao.trade.drug.confirmorder";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("confirm_type", this.confirmType);
		txtParams.put("delivery_id", this.deliveryId);
		txtParams.put("order_id", this.orderId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TradeDrugConfirmorderResponse> getResponseClass() {
		return TradeDrugConfirmorderResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(orderId, "orderId");
	}
	

}
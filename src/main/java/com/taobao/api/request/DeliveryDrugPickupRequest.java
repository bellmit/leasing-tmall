package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.DeliveryDrugPickupResponse;

import java.util.Map;

/**
 * TOP API: taobao.delivery.drug.pickup request
 * 
 * @author top auto create
 * @since 1.0, 2017.03.20
 */
public class DeliveryDrugPickupRequest extends BaseTaobaoRequest<DeliveryDrugPickupResponse> {
	
	

	/** 
	* 物流订单号
	 */
	private Long deliveryOrderNo;

	/** 
	* 地图坐标：维度
	 */
	private String latitude;

	/** 
	* 地图坐标：经度
	 */
	private String longitude;

	public void setDeliveryOrderNo(Long deliveryOrderNo) {
		this.deliveryOrderNo = deliveryOrderNo;
	}

	public Long getDeliveryOrderNo() {
		return this.deliveryOrderNo;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLatitude() {
		return this.latitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLongitude() {
		return this.longitude;
	}

	public String getApiMethodName() {
		return "taobao.delivery.drug.pickup";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("delivery_order_no", this.deliveryOrderNo);
		txtParams.put("latitude", this.latitude);
		txtParams.put("longitude", this.longitude);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<DeliveryDrugPickupResponse> getResponseClass() {
		return DeliveryDrugPickupResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(deliveryOrderNo, "deliveryOrderNo");
		RequestCheckUtils.checkNotEmpty(latitude, "latitude");
		RequestCheckUtils.checkNotEmpty(longitude, "longitude");
	}
	

}
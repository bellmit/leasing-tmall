package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.DeliveryDrugDeliveryconfirmResponse;

import java.util.Map;

/**
 * TOP API: taobao.delivery.drug.deliveryconfirm request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.21
 */
public class DeliveryDrugDeliveryconfirmRequest extends BaseTaobaoRequest<DeliveryDrugDeliveryconfirmResponse> {
	
	

	/** 
	* 配送单号
	 */
	private Long deliveryOrderNo;

	/** 
	* 配送员id
	 */
	private String deviceId;

	/** 
	* 纬度
	 */
	private String latitude;

	/** 
	* 定位错误
	 */
	private String locationErrorReason;

	/** 
	* 经度
	 */
	private String longitude;

	public void setDeliveryOrderNo(Long deliveryOrderNo) {
		this.deliveryOrderNo = deliveryOrderNo;
	}

	public Long getDeliveryOrderNo() {
		return this.deliveryOrderNo;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLatitude() {
		return this.latitude;
	}

	public void setLocationErrorReason(String locationErrorReason) {
		this.locationErrorReason = locationErrorReason;
	}

	public String getLocationErrorReason() {
		return this.locationErrorReason;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLongitude() {
		return this.longitude;
	}

	public String getApiMethodName() {
		return "taobao.delivery.drug.deliveryconfirm";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("delivery_order_no", this.deliveryOrderNo);
		txtParams.put("device_id", this.deviceId);
		txtParams.put("latitude", this.latitude);
		txtParams.put("location_error_reason", this.locationErrorReason);
		txtParams.put("longitude", this.longitude);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<DeliveryDrugDeliveryconfirmResponse> getResponseClass() {
		return DeliveryDrugDeliveryconfirmResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(deliveryOrderNo, "deliveryOrderNo");
		RequestCheckUtils.checkNotEmpty(latitude, "latitude");
		RequestCheckUtils.checkNotEmpty(longitude, "longitude");
	}
	

}
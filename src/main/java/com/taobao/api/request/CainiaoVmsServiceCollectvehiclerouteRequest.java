package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CainiaoVmsServiceCollectvehiclerouteResponse;

import java.util.Date;
import java.util.Map;

/**
 * TOP API: cainiao.vms.service.collectvehicleroute request
 * 
 * @author top auto create
 * @since 1.0, 2016.10.10
 */
public class CainiaoVmsServiceCollectvehiclerouteRequest extends BaseTaobaoRequest<CainiaoVmsServiceCollectvehiclerouteResponse> {
	
	

	/** 
	* 数据 采集时间
	 */
	private Date colDate;

	/** 
	* cp编码
	 */
	private String cpCode;

	/** 
	* 车辆唯一标识号
	 */
	private String deviceId;

	/** 
	* 纬度
	 */
	private String latitude;

	/** 
	* 经度
	 */
	private String longitude;

	/** 
	* 车牌号
	 */
	private String vechileNumber;

	public void setColDate(Date colDate) {
		this.colDate = colDate;
	}

	public Date getColDate() {
		return this.colDate;
	}

	public void setCpCode(String cpCode) {
		this.cpCode = cpCode;
	}

	public String getCpCode() {
		return this.cpCode;
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

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLongitude() {
		return this.longitude;
	}

	public void setVechileNumber(String vechileNumber) {
		this.vechileNumber = vechileNumber;
	}

	public String getVechileNumber() {
		return this.vechileNumber;
	}

	public String getApiMethodName() {
		return "cainiao.vms.service.collectvehicleroute";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("col_date", this.colDate);
		txtParams.put("cp_code", this.cpCode);
		txtParams.put("device_id", this.deviceId);
		txtParams.put("latitude", this.latitude);
		txtParams.put("longitude", this.longitude);
		txtParams.put("vechile_number", this.vechileNumber);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoVmsServiceCollectvehiclerouteResponse> getResponseClass() {
		return CainiaoVmsServiceCollectvehiclerouteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(colDate, "colDate");
		RequestCheckUtils.checkNotEmpty(cpCode, "cpCode");
		RequestCheckUtils.checkNotEmpty(latitude, "latitude");
		RequestCheckUtils.checkNotEmpty(longitude, "longitude");
		RequestCheckUtils.checkNotEmpty(vechileNumber, "vechileNumber");
	}
	

}
package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CainiaoCloudprintClientinfoPutResponse;

import java.util.Map;

/**
 * TOP API: cainiao.cloudprint.clientinfo.put request
 * 
 * @author top auto create
 * @since 1.0, 2016.06.23
 */
public class CainiaoCloudprintClientinfoPutRequest extends BaseTaobaoRequest<CainiaoCloudprintClientinfoPutResponse> {
	
	

	/** 
	* 收集的数据，json格式
	 */
	private String jsonData;

	public void setJsonData(String jsonData) {
		this.jsonData = jsonData;
	}

	public String getJsonData() {
		return this.jsonData;
	}

	public String getApiMethodName() {
		return "cainiao.cloudprint.clientinfo.put";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("json_data", this.jsonData);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoCloudprintClientinfoPutResponse> getResponseClass() {
		return CainiaoCloudprintClientinfoPutResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(jsonData, "jsonData");
	}
	

}
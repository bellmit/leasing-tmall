package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CainiaoCloudprintIsvResourcesGetResponse;

import java.util.Map;

/**
 * TOP API: cainiao.cloudprint.isv.resources.get request
 * 
 * @author top auto create
 * @since 1.0, 2017.01.19
 */
public class CainiaoCloudprintIsvResourcesGetRequest extends BaseTaobaoRequest<CainiaoCloudprintIsvResourcesGetResponse> {
	
	

	/** 
	* isv资源类型，分为：TEMPLATE（表示模板），PRINT_ITEM（打印项），CUSTOM_AREA（预设自定义区）
	 */
	private String isvResourceType;

	public void setIsvResourceType(String isvResourceType) {
		this.isvResourceType = isvResourceType;
	}

	public String getIsvResourceType() {
		return this.isvResourceType;
	}

	public String getApiMethodName() {
		return "cainiao.cloudprint.isv.resources.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("isv_resource_type", this.isvResourceType);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoCloudprintIsvResourcesGetResponse> getResponseClass() {
		return CainiaoCloudprintIsvResourcesGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(isvResourceType, "isvResourceType");
	}
	

}
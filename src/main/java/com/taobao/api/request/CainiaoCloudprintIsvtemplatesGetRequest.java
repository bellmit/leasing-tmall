package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CainiaoCloudprintIsvtemplatesGetResponse;

import java.util.Map;

/**
 * TOP API: cainiao.cloudprint.isvtemplates.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.06.29
 */
public class CainiaoCloudprintIsvtemplatesGetRequest extends BaseTaobaoRequest<CainiaoCloudprintIsvtemplatesGetResponse> {
	
	

	public String getApiMethodName() {
		return "cainiao.cloudprint.isvtemplates.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoCloudprintIsvtemplatesGetResponse> getResponseClass() {
		return CainiaoCloudprintIsvtemplatesGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}
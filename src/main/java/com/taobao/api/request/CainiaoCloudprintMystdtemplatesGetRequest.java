package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CainiaoCloudprintMystdtemplatesGetResponse;

import java.util.Map;

/**
 * TOP API: cainiao.cloudprint.mystdtemplates.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.09.19
 */
public class CainiaoCloudprintMystdtemplatesGetRequest extends BaseTaobaoRequest<CainiaoCloudprintMystdtemplatesGetResponse> {
	
	

	public String getApiMethodName() {
		return "cainiao.cloudprint.mystdtemplates.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoCloudprintMystdtemplatesGetResponse> getResponseClass() {
		return CainiaoCloudprintMystdtemplatesGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}
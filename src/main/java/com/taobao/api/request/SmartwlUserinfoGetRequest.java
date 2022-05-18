package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SmartwlUserinfoGetResponse;

import java.util.Map;

/**
 * TOP API: taobao.smartwl.userinfo.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.04.17
 */
public class SmartwlUserinfoGetRequest extends BaseTaobaoRequest<SmartwlUserinfoGetResponse> {
	
	

	/** 
	* 预留扩展字段，格式json串
	 */
	private String feature;

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public String getFeature() {
		return this.feature;
	}

	public String getApiMethodName() {
		return "taobao.smartwl.userinfo.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("feature", this.feature);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<SmartwlUserinfoGetResponse> getResponseClass() {
		return SmartwlUserinfoGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxLength(feature, 500, "feature");
	}
	

}
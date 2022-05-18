package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmcAuthGetResponse;

import java.util.Map;

/**
 * TOP API: taobao.tmc.auth.get request
 * 
 * @author top auto create
 * @since 1.0, 2017.04.19
 */
public class TmcAuthGetRequest extends BaseTaobaoRequest<TmcAuthGetResponse> {
	
	

	/** 
	* tmc组名
	 */
	private String group;

	public void setGroup(String group) {
		this.group = group;
	}

	public String getGroup() {
		return this.group;
	}

	public String getApiMethodName() {
		return "taobao.tmc.auth.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("group", this.group);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmcAuthGetResponse> getResponseClass() {
		return TmcAuthGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}
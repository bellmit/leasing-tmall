package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TopSecretRegisterResponse;

import java.util.Map;

/**
 * TOP API: taobao.top.secret.register request
 * 
 * @author top auto create
 * @since 1.0, 2016.08.16
 */
public class TopSecretRegisterRequest extends BaseTaobaoRequest<TopSecretRegisterResponse> {
	
	

	/** 
	* 用户id，保证唯一
	 */
	private Long userId;

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getUserId() {
		return this.userId;
	}

	public String getApiMethodName() {
		return "taobao.top.secret.register";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("user_id", this.userId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TopSecretRegisterResponse> getResponseClass() {
		return TopSecretRegisterResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}
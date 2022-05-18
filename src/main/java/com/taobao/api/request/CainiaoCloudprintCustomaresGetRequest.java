package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CainiaoCloudprintCustomaresGetResponse;

import java.util.Map;

/**
 * TOP API: cainiao.cloudprint.customares.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.09.18
 */
public class CainiaoCloudprintCustomaresGetRequest extends BaseTaobaoRequest<CainiaoCloudprintCustomaresGetResponse> {
	
	

	/** 
	* 用户使用的标准模板id
	 */
	private Long templateId;

	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

	public Long getTemplateId() {
		return this.templateId;
	}

	public String getApiMethodName() {
		return "cainiao.cloudprint.customares.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("template_id", this.templateId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoCloudprintCustomaresGetResponse> getResponseClass() {
		return CainiaoCloudprintCustomaresGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(templateId, "templateId");
	}
	

}
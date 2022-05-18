package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CainiaoCloudprintTemplatesMigrateResponse;

import java.util.Map;

/**
 * TOP API: cainiao.cloudprint.templates.migrate request
 * 
 * @author top auto create
 * @since 1.0, 2016.10.14
 */
public class CainiaoCloudprintTemplatesMigrateRequest extends BaseTaobaoRequest<CainiaoCloudprintTemplatesMigrateResponse> {
	
	

	/** 
	* 自定义区内容
	 */
	private String customAreaContent;

	/** 
	* 自定义区名称
	 */
	private String customAreaName;

	/** 
	* 标准电子面单模板的id
	 */
	private Long tempalteId;

	public void setCustomAreaContent(String customAreaContent) {
		this.customAreaContent = customAreaContent;
	}

	public String getCustomAreaContent() {
		return this.customAreaContent;
	}

	public void setCustomAreaName(String customAreaName) {
		this.customAreaName = customAreaName;
	}

	public String getCustomAreaName() {
		return this.customAreaName;
	}

	public void setTempalteId(Long tempalteId) {
		this.tempalteId = tempalteId;
	}

	public Long getTempalteId() {
		return this.tempalteId;
	}

	public String getApiMethodName() {
		return "cainiao.cloudprint.templates.migrate";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("custom_area_content", this.customAreaContent);
		txtParams.put("custom_area_name", this.customAreaName);
		txtParams.put("tempalte_id", this.tempalteId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoCloudprintTemplatesMigrateResponse> getResponseClass() {
		return CainiaoCloudprintTemplatesMigrateResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}
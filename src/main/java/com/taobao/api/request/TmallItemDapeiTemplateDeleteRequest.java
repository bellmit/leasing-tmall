package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmallItemDapeiTemplateDeleteResponse;

import java.util.Map;

/**
 * TOP API: tmall.item.dapei.template.delete request
 * 
 * @author top auto create
 * @since 1.0, 2016.07.06
 */
public class TmallItemDapeiTemplateDeleteRequest extends BaseTaobaoRequest<TmallItemDapeiTemplateDeleteResponse> {
	
	

	/** 
	* 搭配模板ID
	 */
	private Long id;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return this.id;
	}

	public String getApiMethodName() {
		return "tmall.item.dapei.template.delete";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("id", this.id);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallItemDapeiTemplateDeleteResponse> getResponseClass() {
		return TmallItemDapeiTemplateDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(id, "id");
	}
	

}
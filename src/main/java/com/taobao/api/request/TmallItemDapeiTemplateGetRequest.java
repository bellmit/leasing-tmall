package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmallItemDapeiTemplateGetResponse;

import java.util.Map;

/**
 * TOP API: tmall.item.dapei.template.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.07.06
 */
public class TmallItemDapeiTemplateGetRequest extends BaseTaobaoRequest<TmallItemDapeiTemplateGetResponse> {
	
	

	public String getApiMethodName() {
		return "tmall.item.dapei.template.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallItemDapeiTemplateGetResponse> getResponseClass() {
		return TmallItemDapeiTemplateGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}
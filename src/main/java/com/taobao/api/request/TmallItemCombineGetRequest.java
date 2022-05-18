package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmallItemCombineGetResponse;

import java.util.Map;

/**
 * TOP API: tmall.item.combine.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.08.05
 */
public class TmallItemCombineGetRequest extends BaseTaobaoRequest<TmallItemCombineGetResponse> {
	
	

	/** 
	* 组合商品ID
	 */
	private Long itemId;

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public String getApiMethodName() {
		return "tmall.item.combine.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_id", this.itemId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallItemCombineGetResponse> getResponseClass() {
		return TmallItemCombineGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}
package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TmallCarLeaseItemcarinfoResponse;

/**
 * TOP API: tmall.car.lease.itemcarinfo request
 * 
 * @author top auto create
 * @since 1.0, 2017.04.07
 */
public class TmallCarLeaseItemcarinfoRequest extends BaseTaobaoRequest<TmallCarLeaseItemcarinfoResponse> {
	
	

	/** 
	* 商品id
	 */
	private Long itemId;

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public String getApiMethodName() {
		return "tmall.car.lease.itemcarinfo";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_id", this.itemId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallCarLeaseItemcarinfoResponse> getResponseClass() {
		return TmallCarLeaseItemcarinfoResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}
package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.RegionWarehouseQueryResponse;

import java.util.Map;

/**
 * TOP API: taobao.region.warehouse.query request
 * 
 * @author top auto create
 * @since 1.0, 2016.07.07
 */
public class RegionWarehouseQueryRequest extends BaseTaobaoRequest<RegionWarehouseQueryResponse> {
	
	

	/** 
	* 仓库编码
	 */
	private String storeCode;

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getStoreCode() {
		return this.storeCode;
	}

	public String getApiMethodName() {
		return "taobao.region.warehouse.query";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("store_code", this.storeCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<RegionWarehouseQueryResponse> getResponseClass() {
		return RegionWarehouseQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(storeCode, "storeCode");
	}
	

}
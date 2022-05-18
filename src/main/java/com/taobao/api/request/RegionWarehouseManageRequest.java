package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.RegionWarehouseManageResponse;

import java.util.Map;

/**
 * TOP API: taobao.region.warehouse.manage request
 * 
 * @author top auto create
 * @since 1.0, 2016.07.14
 */
public class RegionWarehouseManageRequest extends BaseTaobaoRequest<RegionWarehouseManageResponse> {
	
	

	/** 
	* 可映射三级地址,例: 广东省
	 */
	private String regions;

	/** 
	* 仓库编码
	 */
	private String storeCode;

	public void setRegions(String regions) {
		this.regions = regions;
	}

	public String getRegions() {
		return this.regions;
	}

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getStoreCode() {
		return this.storeCode;
	}

	public String getApiMethodName() {
		return "taobao.region.warehouse.manage";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("regions", this.regions);
		txtParams.put("store_code", this.storeCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<RegionWarehouseManageResponse> getResponseClass() {
		return RegionWarehouseManageResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(regions, "regions");
		RequestCheckUtils.checkMaxListSize(regions, 20, "regions");
		RequestCheckUtils.checkNotEmpty(storeCode, "storeCode");
	}
	

}
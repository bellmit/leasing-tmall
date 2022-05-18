package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.DrugQuantityBatchUpdateResponse;

import java.util.Map;

/**
 * TOP API: taobao.drug.quantity.batch.update request
 * 
 * @author top auto create
 * @since 1.0, 2017.04.02
 */
public class DrugQuantityBatchUpdateRequest extends BaseTaobaoRequest<DrugQuantityBatchUpdateResponse> {
	
	

	/** 
	* 商品ID和库存
	 */
	private String outItemIdQuantityMap;

	/** 
	* 外部店铺ID
	 */
	private String outStoreId;

	public void setOutItemIdQuantityMap(String outItemIdQuantityMap) {
		this.outItemIdQuantityMap = outItemIdQuantityMap;
	}
	public void setOutItemIdQuantityMapString(String outItemIdQuantityMap) {
		this.outItemIdQuantityMap = outItemIdQuantityMap;
	}

	public String getOutItemIdQuantityMap() {
		return this.outItemIdQuantityMap;
	}

	public void setOutStoreId(String outStoreId) {
		this.outStoreId = outStoreId;
	}

	public String getOutStoreId() {
		return this.outStoreId;
	}

	public String getApiMethodName() {
		return "taobao.drug.quantity.batch.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("out_item_id_quantity_map", this.outItemIdQuantityMap);
		txtParams.put("out_store_id", this.outStoreId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<DrugQuantityBatchUpdateResponse> getResponseClass() {
		return DrugQuantityBatchUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(outItemIdQuantityMap, "outItemIdQuantityMap");
		RequestCheckUtils.checkNotEmpty(outStoreId, "outStoreId");
	}
	

}
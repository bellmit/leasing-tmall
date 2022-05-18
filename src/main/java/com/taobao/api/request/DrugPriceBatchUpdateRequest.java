package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.DrugPriceBatchUpdateResponse;

import java.util.Map;

/**
 * TOP API: taobao.drug.price.batch.update request
 * 
 * @author top auto create
 * @since 1.0, 2017.03.30
 */
public class DrugPriceBatchUpdateRequest extends BaseTaobaoRequest<DrugPriceBatchUpdateResponse> {
	
	

	/** 
	* 商品ID和价格
	 */
	private String outItemIdPriceMap;

	/** 
	* 外部店铺ID
	 */
	private String outStoreId;

	public void setOutItemIdPriceMap(String outItemIdPriceMap) {
		this.outItemIdPriceMap = outItemIdPriceMap;
	}
	public void setOutItemIdPriceMapString(String outItemIdPriceMap) {
		this.outItemIdPriceMap = outItemIdPriceMap;
	}

	public String getOutItemIdPriceMap() {
		return this.outItemIdPriceMap;
	}

	public void setOutStoreId(String outStoreId) {
		this.outStoreId = outStoreId;
	}

	public String getOutStoreId() {
		return this.outStoreId;
	}

	public String getApiMethodName() {
		return "taobao.drug.price.batch.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("out_item_id_price_map", this.outItemIdPriceMap);
		txtParams.put("out_store_id", this.outStoreId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<DrugPriceBatchUpdateResponse> getResponseClass() {
		return DrugPriceBatchUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(outItemIdPriceMap, "outItemIdPriceMap");
		RequestCheckUtils.checkNotEmpty(outStoreId, "outStoreId");
	}
	

}
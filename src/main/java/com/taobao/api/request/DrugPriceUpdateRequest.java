package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.DrugPriceUpdateResponse;

import java.util.Map;

/**
 * TOP API: taobao.drug.price.update request
 * 
 * @author top auto create
 * @since 1.0, 2017.03.17
 */
public class DrugPriceUpdateRequest extends BaseTaobaoRequest<DrugPriceUpdateResponse> {
	
	

	/** 
	* 对应的外部商品编码
	 */
	private String outItemId;

	/** 
	* 对应的外部店铺ID
	 */
	private String outStoreId;

	/** 
	* 商品价格
	 */
	private String price;

	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getOutItemId() {
		return this.outItemId;
	}

	public void setOutStoreId(String outStoreId) {
		this.outStoreId = outStoreId;
	}

	public String getOutStoreId() {
		return this.outStoreId;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPrice() {
		return this.price;
	}

	public String getApiMethodName() {
		return "taobao.drug.price.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("out_item_id", this.outItemId);
		txtParams.put("out_store_id", this.outStoreId);
		txtParams.put("price", this.price);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<DrugPriceUpdateResponse> getResponseClass() {
		return DrugPriceUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(outItemId, "outItemId");
		RequestCheckUtils.checkNotEmpty(outStoreId, "outStoreId");
		RequestCheckUtils.checkNotEmpty(price, "price");
	}
	

}
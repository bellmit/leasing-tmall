package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.DrugQuantityUpdateResponse;

import java.util.Map;

/**
 * TOP API: taobao.drug.quantity.update request
 * 
 * @author top auto create
 * @since 1.0, 2017.03.17
 */
public class DrugQuantityUpdateRequest extends BaseTaobaoRequest<DrugQuantityUpdateResponse> {
	
	

	/** 
	* 外部商品ID
	 */
	private String outItemId;

	/** 
	* 外部店铺ID
	 */
	private String outStoreId;

	/** 
	* 库存数量
	 */
	private Long quantity;

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

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getQuantity() {
		return this.quantity;
	}

	public String getApiMethodName() {
		return "taobao.drug.quantity.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("out_item_id", this.outItemId);
		txtParams.put("out_store_id", this.outStoreId);
		txtParams.put("quantity", this.quantity);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<DrugQuantityUpdateResponse> getResponseClass() {
		return DrugQuantityUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(outItemId, "outItemId");
		RequestCheckUtils.checkNotEmpty(outStoreId, "outStoreId");
		RequestCheckUtils.checkNotEmpty(quantity, "quantity");
	}
	

}
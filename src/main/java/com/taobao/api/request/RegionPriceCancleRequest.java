package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.RegionPriceCancleResponse;

import java.util.Map;

/**
 * TOP API: taobao.region.price.cancle request
 * 
 * @author top auto create
 * @since 1.0, 2016.07.20
 */
public class RegionPriceCancleRequest extends BaseTaobaoRequest<RegionPriceCancleResponse> {
	
	

	/** 
	* 商品
	 */
	private Long itemId;

	/** 
	* 无sku传0
	 */
	private Long skuId;

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public Long getSkuId() {
		return this.skuId;
	}

	public String getApiMethodName() {
		return "taobao.region.price.cancle";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_id", this.itemId);
		txtParams.put("sku_id", this.skuId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<RegionPriceCancleResponse> getResponseClass() {
		return RegionPriceCancleResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(itemId, "itemId");
		RequestCheckUtils.checkNotEmpty(skuId, "skuId");
	}
	

}
package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.RegionSaleQueryResponse;

import java.util.Map;

/**
 * TOP API: taobao.region.sale.query request
 * 
 * @author top auto create
 * @since 1.0, 2016.07.07
 */
public class RegionSaleQueryRequest extends BaseTaobaoRequest<RegionSaleQueryResponse> {
	
	

	/** 
	* 商品id
	 */
	private Long itemId;

	/** 
	* 1:国家;2:省;3: 市;4:区县
	 */
	private Long saleRegionLevel;

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

	public void setSaleRegionLevel(Long saleRegionLevel) {
		this.saleRegionLevel = saleRegionLevel;
	}

	public Long getSaleRegionLevel() {
		return this.saleRegionLevel;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public Long getSkuId() {
		return this.skuId;
	}

	public String getApiMethodName() {
		return "taobao.region.sale.query";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_id", this.itemId);
		txtParams.put("sale_region_level", this.saleRegionLevel);
		txtParams.put("sku_id", this.skuId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<RegionSaleQueryResponse> getResponseClass() {
		return RegionSaleQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(itemId, "itemId");
		RequestCheckUtils.checkNotEmpty(saleRegionLevel, "saleRegionLevel");
		RequestCheckUtils.checkNotEmpty(skuId, "skuId");
	}
	

}
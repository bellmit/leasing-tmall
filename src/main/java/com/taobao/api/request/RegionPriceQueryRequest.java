package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.RegionPriceQueryResponse;

import java.util.List;
import java.util.Map;

/**
 * TOP API: taobao.region.price.query request
 * 
 * @author top auto create
 * @since 1.0, 2016.07.15
 */
public class RegionPriceQueryRequest extends BaseTaobaoRequest<RegionPriceQueryResponse> {
	
	

	/** 
	* 商品id
	 */
	private Long itemId;

	/** 
	* 不传则返回所有设置的区域价格
	 */
	private String regionalPriceDtos;

	/** 
	* 无sku可传0
	 */
	private Long skuId;

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public void setRegionalPriceDtos(String regionalPriceDtos) {
		this.regionalPriceDtos = regionalPriceDtos;
	}

	public void setRegionalPriceDtos(List<RegionalPriceDto> regionalPriceDtos) {
		this.regionalPriceDtos = new JSONWriter(false,true).write(regionalPriceDtos);
	}

	public String getRegionalPriceDtos() {
		return this.regionalPriceDtos;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public Long getSkuId() {
		return this.skuId;
	}

	public String getApiMethodName() {
		return "taobao.region.price.query";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_id", this.itemId);
		txtParams.put("regional_price_dtos", this.regionalPriceDtos);
		txtParams.put("sku_id", this.skuId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<RegionPriceQueryResponse> getResponseClass() {
		return RegionPriceQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(itemId, "itemId");
		RequestCheckUtils.checkObjectMaxListSize(regionalPriceDtos, 20, "regionalPriceDtos");
	}
	
	/**
 * 不传则返回所有设置的区域价格
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class RegionalPriceDto extends TaobaoObject {

	private static final long serialVersionUID = 1278317956933468666L;

	/**
		 * 市
		 */
		@ApiField("city")
		private String city;
		/**
		 * 区县，特殊可选
		 */
		@ApiField("district")
		private String district;
		/**
		 * 省
		 */
		@ApiField("province")
		private String province;
		/**
		 * 街道，特殊可选
		 */
		@ApiField("street")
		private String street;
	

	public String getCity() {
			return this.city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getDistrict() {
			return this.district;
		}
		public void setDistrict(String district) {
			this.district = district;
		}
		public String getProvince() {
			return this.province;
		}
		public void setProvince(String province) {
			this.province = province;
		}
		public String getStreet() {
			return this.street;
		}
		public void setStreet(String street) {
			this.street = street;
		}

}


}
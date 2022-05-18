package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.RegionPriceManageResponse;

import java.util.List;
import java.util.Map;

/**
 * TOP API: taobao.region.price.manage request
 * 
 * @author top auto create
 * @since 1.0, 2016.11.24
 */
public class RegionPriceManageRequest extends BaseTaobaoRequest<RegionPriceManageResponse> {
	
	

	/** 
	* true:全量, false:增量
	 */
	private Boolean isFull;

	/** 
	* 商品id
	 */
	private Long itemId;

	/** 
	* 列表
	 */
	private String regionalPriceDtos;

	/** 
	* 无sku传0
	 */
	private Long skuId;

	public void setIsFull(Boolean isFull) {
		this.isFull = isFull;
	}

	public Boolean getIsFull() {
		return this.isFull;
	}

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
		return "taobao.region.price.manage";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("is_full", this.isFull);
		txtParams.put("item_id", this.itemId);
		txtParams.put("regional_price_dtos", this.regionalPriceDtos);
		txtParams.put("sku_id", this.skuId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<RegionPriceManageResponse> getResponseClass() {
		return RegionPriceManageResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(itemId, "itemId");
		RequestCheckUtils.checkObjectMaxListSize(regionalPriceDtos, 20, "regionalPriceDtos");
	}
	
	/**
 * 列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class RegionalPriceDto extends TaobaoObject {

	private static final long serialVersionUID = 8554267249427462318L;

	/**
		 * 市
		 */
		@ApiField("city")
		private String city;
		/**
		 * 金额（分）
		 */
		@ApiField("price")
		private Long price;
		/**
		 * 省
		 */
		@ApiField("province")
		private String province;
	

	public String getCity() {
			return this.city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public Long getPrice() {
			return this.price;
		}
		public void setPrice(Long price) {
			this.price = price;
		}
		public String getProvince() {
			return this.province;
		}
		public void setProvince(String province) {
			this.province = province;
		}

}


}
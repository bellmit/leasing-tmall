package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.TmallItemPriceUpdateResponse;

import java.util.List;
import java.util.Map;

/**
 * TOP API: tmall.item.price.update request
 * 
 * @author top auto create
 * @since 1.0, 2017.01.03
 */
public class TmallItemPriceUpdateRequest extends BaseTaobaoRequest<TmallItemPriceUpdateResponse> {
	
	

	/** 
	* 商品ID
	 */
	private Long itemId;

	/** 
	* 被更新商品价格
	 */
	private String itemPrice;

	/** 
	* 商品价格更新时候的可选参数
	 */
	private String options;

	/** 
	* 更新SKU价格时候的SKU价格对象；如果没有SKU或者不更新SKU价格，可以不填;查找SKU目前支持ID，属性串和商家编码三种模式，建议选用一种最合适的，切勿滥用，一次调用中如果混合使用，更新结果不可预期！
	 */
	private String skuPrices;

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemPrice() {
		return this.itemPrice;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	public void setOptions(UpdateItemPriceOption options) {
		this.options = new JSONWriter(false,true).write(options);
	}

	public String getOptions() {
		return this.options;
	}

	public void setSkuPrices(String skuPrices) {
		this.skuPrices = skuPrices;
	}

	public void setSkuPrices(List<UpdateSkuPrice> skuPrices) {
		this.skuPrices = new JSONWriter(false,true).write(skuPrices);
	}

	public String getSkuPrices() {
		return this.skuPrices;
	}

	public String getApiMethodName() {
		return "tmall.item.price.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_id", this.itemId);
		txtParams.put("item_price", this.itemPrice);
		txtParams.put("options", this.options);
		txtParams.put("sku_prices", this.skuPrices);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallItemPriceUpdateResponse> getResponseClass() {
		return TmallItemPriceUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(itemId, "itemId");
		RequestCheckUtils.checkObjectMaxListSize(skuPrices, 999999, "skuPrices");
	}
	
	/**
 * 更新SKU价格时候的SKU价格对象；如果没有SKU或者不更新SKU价格，可以不填;查找SKU目前支持ID，属性串和商家编码三种模式，建议选用一种最合适的，切勿滥用，一次调用中如果混合使用，更新结果不可预期！
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class UpdateSkuPrice extends TaobaoObject {

	private static final long serialVersionUID = 4287681942641948427L;

	/**
		 * Sku的商家外部id，用于指定被修改价格的SKU
		 */
		@ApiField("outer_id")
		private String outerId;
		/**
		 * 属于这个sku的商品的价格 取值范围:0-100000000;精确到2位小数;单位:元。如:200.07，表示:200元7分。
		 */
		@ApiField("price")
		private String price;
		/**
		 * Sku属性串。格式:pid:vid;pid:vid,如: 1627207:3232483;1630696:3284570,表示机身颜色:军绿色;手机套餐:一电一充，用于指定被修改价格的SKU
		 */
		@ApiField("properties")
		private String properties;
		/**
		 * SkuID，用于指定被修改价格的SKU
		 */
		@ApiField("sku_id")
		private Long skuId;
	

	public String getOuterId() {
			return this.outerId;
		}
		public void setOuterId(String outerId) {
			this.outerId = outerId;
		}
		public String getPrice() {
			return this.price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		public String getProperties() {
			return this.properties;
		}
		public void setProperties(String properties) {
			this.properties = properties;
		}
		public Long getSkuId() {
			return this.skuId;
		}
		public void setSkuId(Long skuId) {
			this.skuId = skuId;
		}

}

	/**
 * 商品价格更新时候的可选参数
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class UpdateItemPriceOption extends TaobaoObject {

	private static final long serialVersionUID = 6619331823295349171L;

	/**
		 * 目标币种，非必填，仅支持天猫国际官网同购商家将外币价格修改成人民币价格时使用
		 */
		@ApiField("currency_type")
		private String currencyType;
		/**
		 * 是否忽略涉嫌炒信警告信息
		 */
		@ApiField("ignore_fake_credit")
		private Boolean ignoreFakeCredit;
	

	public String getCurrencyType() {
			return this.currencyType;
		}
		public void setCurrencyType(String currencyType) {
			this.currencyType = currencyType;
		}
		public Boolean getIgnoreFakeCredit() {
			return this.ignoreFakeCredit;
		}
		public void setIgnoreFakeCredit(Boolean ignoreFakeCredit) {
			this.ignoreFakeCredit = ignoreFakeCredit;
		}

}


}
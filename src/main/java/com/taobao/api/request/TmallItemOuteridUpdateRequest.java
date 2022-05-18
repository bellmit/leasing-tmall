package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.TmallItemOuteridUpdateResponse;

import java.util.List;
import java.util.Map;

/**
 * TOP API: tmall.item.outerid.update request
 * 
 * @author top auto create
 * @since 1.0, 2017.01.04
 */
public class TmallItemOuteridUpdateRequest extends BaseTaobaoRequest<TmallItemOuteridUpdateResponse> {
	
	

	/** 
	* 商品ID
	 */
	private Long itemId;

	/** 
	* 商品维度商家编码，如果不修改可以不传；清空请设置空串
	 */
	private String outerId;

	/** 
	* 商品SKU更新OuterId时候用的数据
	 */
	private String skuOuters;

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getOuterId() {
		return this.outerId;
	}

	public void setSkuOuters(String skuOuters) {
		this.skuOuters = skuOuters;
	}

	public void setSkuOuters(List<UpdateSkuOuterId> skuOuters) {
		this.skuOuters = new JSONWriter(false,true).write(skuOuters);
	}

	public String getSkuOuters() {
		return this.skuOuters;
	}

	public String getApiMethodName() {
		return "tmall.item.outerid.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_id", this.itemId);
		txtParams.put("outer_id", this.outerId);
		txtParams.put("sku_outers", this.skuOuters);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallItemOuteridUpdateResponse> getResponseClass() {
		return TmallItemOuteridUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(itemId, "itemId");
		RequestCheckUtils.checkObjectMaxListSize(skuOuters, 2000, "skuOuters");
	}
	
	/**
 * 商品SKU更新OuterId时候用的数据
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class UpdateSkuOuterId extends TaobaoObject {

	private static final long serialVersionUID = 8319728942828492719L;

	/**
		 * 被更新的Sku的商家外部id
		 */
		@ApiField("outer_id")
		private String outerId;
		/**
		 * Sku属性串。格式:pid:vid;pid:vid,如: 1627207:3232483;1630696:3284570,表示机身颜色:军绿色;手机套餐:一电一充；如果填写将以属性对形式查找被更新SKU
		 */
		@ApiField("properties")
		private String properties;
		/**
		 * SkuID，如果填写，将以SKUID查找被更新的SKU
		 */
		@ApiField("sku_id")
		private Long skuId;
	

	public String getOuterId() {
			return this.outerId;
		}
		public void setOuterId(String outerId) {
			this.outerId = outerId;
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


}
package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.TmallItemShiptimeUpdateResponse;

import java.util.List;
import java.util.Map;

/**
 * TOP API: tmall.item.shiptime.update request
 * 
 * @author top auto create
 * @since 1.0, 2017.01.03
 */
public class TmallItemShiptimeUpdateRequest extends BaseTaobaoRequest<TmallItemShiptimeUpdateResponse> {
	
	

	/** 
	* 商品ID
	 */
	private Long itemId;

	/** 
	* 批量更新商品/SKU发货时间的备选项
	 */
	private String option;

	/** 
	* 被更新发货时间（商品级）；格式和具体设置的发货时间格式相关。绝对发货时间填写yyyy-MM-dd;相对发货时间填写数字。发货时间必须在当前时间后三天。如果设置的绝对时间小于当前时间的三天后，会清除该商品的发货时间设置。如果是相对时间小于3，则会提示出错。如果shiptimeType为0，要清除商品上的发货时间，该字段可以填任意字符,也可以不填。
	 */
	private String shipTime;

	/** 
	* 被更新SKU的发货时间，后台会根据三个子属性去查找匹配的sku，如果找到就默认对sku进行更新，当无匹配sku且更新类型针对sku，会报错。
	 */
	private String skuShipTimes;

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public void setOption(UpdateItemShipTimeOption option) {
		this.option = new JSONWriter(false,true).write(option);
	}

	public String getOption() {
		return this.option;
	}

	public void setShipTime(String shipTime) {
		this.shipTime = shipTime;
	}

	public String getShipTime() {
		return this.shipTime;
	}

	public void setSkuShipTimes(String skuShipTimes) {
		this.skuShipTimes = skuShipTimes;
	}

	public void setSkuShipTimes(List<UpdateSkuShipTime> skuShipTimes) {
		this.skuShipTimes = new JSONWriter(false,true).write(skuShipTimes);
	}

	public String getSkuShipTimes() {
		return this.skuShipTimes;
	}

	public String getApiMethodName() {
		return "tmall.item.shiptime.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_id", this.itemId);
		txtParams.put("option", this.option);
		txtParams.put("ship_time", this.shipTime);
		txtParams.put("sku_ship_times", this.skuShipTimes);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallItemShiptimeUpdateResponse> getResponseClass() {
		return TmallItemShiptimeUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(itemId, "itemId");
		RequestCheckUtils.checkObjectMaxListSize(skuShipTimes, 20, "skuShipTimes");
	}
	
	/**
 * 被更新SKU的发货时间，后台会根据三个子属性去查找匹配的sku，如果找到就默认对sku进行更新，当无匹配sku且更新类型针对sku，会报错。
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class UpdateSkuShipTime extends TaobaoObject {

	private static final long serialVersionUID = 7261676277621768595L;

	/**
		 * Sku的商家外部id；如：2015_07_23_D_123
		 */
		@ApiField("outer_id")
		private String outerId;
		/**
		 * Sku属性串。格式:pid:vid;pid:vid,如: 1627207:3232483;1630696:3284570,表示机身颜色:军绿色;手机套餐:一电一充
		 */
		@ApiField("properties")
		private String properties;
		/**
		 * 被更新发货时间；格式和具体设置的发货时间格式相关。绝对发货时间填写yyyy-MM-dd;相对发货时间填写数字。
		 */
		@ApiField("ship_time")
		private String shipTime;
		/**
		 * SKU的ID
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
		public String getShipTime() {
			return this.shipTime;
		}
		public void setShipTime(String shipTime) {
			this.shipTime = shipTime;
		}
		public Long getSkuId() {
			return this.skuId;
		}
		public void setSkuId(Long skuId) {
			this.skuId = skuId;
		}

}

	/**
 * 批量更新商品/SKU发货时间的备选项
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class UpdateItemShipTimeOption extends TaobaoObject {

	private static final long serialVersionUID = 6188883198523958239L;

	/**
		 * 0代表清空匹配的SKU发货时间数据或者商品发货时间数据；1代表：固定发货时间；2代表：相对发货时间
		 */
		@ApiField("ship_time_type")
		private Long shipTimeType;
		/**
		 * 更新类型，默认不填时更新sku，0表示更新sku，1表示更新商品维度，其他值均非法
		 */
		@ApiField("update_type")
		private Long updateType;
	

	public Long getShipTimeType() {
			return this.shipTimeType;
		}
		public void setShipTimeType(Long shipTimeType) {
			this.shipTimeType = shipTimeType;
		}
		public Long getUpdateType() {
			return this.updateType;
		}
		public void setUpdateType(Long updateType) {
			this.updateType = updateType;
		}

}


}
package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TradeDrugGetResponse;

import java.util.Map;

/**
 * TOP API: taobao.trade.drug.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.21
 */
public class TradeDrugGetRequest extends BaseTaobaoRequest<TradeDrugGetResponse> {
	
	

	/** 
	* true-商家下所有店铺的待确认订单, false—指定店铺的订单
	 */
	private Boolean isAll;

	/** 
	* 返回记录数，超过20按20条返回数据
	 */
	private Long maxSize;

	/** 
	* 店铺id
	 */
	private Long storeId;

	public void setIsAll(Boolean isAll) {
		this.isAll = isAll;
	}

	public Boolean getIsAll() {
		return this.isAll;
	}

	public void setMaxSize(Long maxSize) {
		this.maxSize = maxSize;
	}

	public Long getMaxSize() {
		return this.maxSize;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	public Long getStoreId() {
		return this.storeId;
	}

	public String getApiMethodName() {
		return "taobao.trade.drug.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("is_all", this.isAll);
		txtParams.put("max_size", this.maxSize);
		txtParams.put("store_id", this.storeId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TradeDrugGetResponse> getResponseClass() {
		return TradeDrugGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(maxSize, "maxSize");
		RequestCheckUtils.checkMaxValue(maxSize, 20L, "maxSize");
		RequestCheckUtils.checkMinValue(maxSize, 1L, "maxSize");
		RequestCheckUtils.checkNotEmpty(storeId, "storeId");
	}
	

}
package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AlibabaAlicomOfflineCommissionQueryResponse;

import java.util.Date;
import java.util.Map;

/**
 * TOP API: alibaba.alicom.offline.commission.query request
 * 
 * @author top auto create
 * @since 1.0, 2017.04.05
 */
public class AlibabaAlicomOfflineCommissionQueryRequest extends BaseTaobaoRequest<AlibabaAlicomOfflineCommissionQueryResponse> {
	
	

	/** 
	* 截止时间
	 */
	private Date endTime;

	/** 
	* 店铺id
	 */
	private String shopId;

	/** 
	* 开始时间
	 */
	private Date startTime;

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopId() {
		return this.shopId;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public String getApiMethodName() {
		return "alibaba.alicom.offline.commission.query";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("end_time", this.endTime);
		txtParams.put("shop_id", this.shopId);
		txtParams.put("start_time", this.startTime);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlibabaAlicomOfflineCommissionQueryResponse> getResponseClass() {
		return AlibabaAlicomOfflineCommissionQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(endTime, "endTime");
		RequestCheckUtils.checkNotEmpty(shopId, "shopId");
		RequestCheckUtils.checkNotEmpty(startTime, "startTime");
	}
	

}
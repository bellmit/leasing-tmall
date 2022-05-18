package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AlibabaWtVerifyFetchdataResponse;

import java.util.Map;

/**
 * TOP API: alibaba.wt.verify.fetchdata request
 * 
 * @author top auto create
 * @since 1.0, 2017.04.28
 */
public class AlibabaWtVerifyFetchdataRequest extends BaseTaobaoRequest<AlibabaWtVerifyFetchdataResponse> {
	
	

	/** 
	* 订单id
	 */
	private String bizOrderId;

	/** 
	* 认证类型为1时需要，分配的pid
	 */
	private String sellerId;

	/** 
	* 认证类型 0-有天猫订单的 1-线下类型，无天猫订单的，线下类型
	 */
	private Long type;

	public void setBizOrderId(String bizOrderId) {
		this.bizOrderId = bizOrderId;
	}

	public String getBizOrderId() {
		return this.bizOrderId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerId() {
		return this.sellerId;
	}

	public void setType(Long type) {
		this.type = type;
	}

	public Long getType() {
		return this.type;
	}

	public String getApiMethodName() {
		return "alibaba.wt.verify.fetchdata";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("biz_order_id", this.bizOrderId);
		txtParams.put("seller_id", this.sellerId);
		txtParams.put("type", this.type);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlibabaWtVerifyFetchdataResponse> getResponseClass() {
		return AlibabaWtVerifyFetchdataResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}
package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.OcEserviceAppointDeleteResponse;

import java.util.Map;

/**
 * TOP API: taobao.oc.eservice.appoint.delete request
 * 
 * @author top auto create
 * @since 1.0, 2016.05.09
 */
public class OcEserviceAppointDeleteRequest extends BaseTaobaoRequest<OcEserviceAppointDeleteResponse> {
	
	

	/** 
	* 预约信息唯一编码
	 */
	private Long code;

	/** 
	* 卖家的sellerId
	 */
	private Long sellerId;

	public void setCode(Long code) {
		this.code = code;
	}

	public Long getCode() {
		return this.code;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public Long getSellerId() {
		return this.sellerId;
	}

	public String getApiMethodName() {
		return "taobao.oc.eservice.appoint.delete";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("code", this.code);
		txtParams.put("seller_id", this.sellerId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OcEserviceAppointDeleteResponse> getResponseClass() {
		return OcEserviceAppointDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(code, "code");
		RequestCheckUtils.checkNotEmpty(sellerId, "sellerId");
	}
	

}
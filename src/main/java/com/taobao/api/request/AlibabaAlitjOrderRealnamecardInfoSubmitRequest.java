package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AlibabaAlitjOrderRealnamecardInfoSubmitResponse;

import java.util.Map;

/**
 * TOP API: alibaba.alitj.order.realnamecard.info.submit request
 * 
 * @author top auto create
 * @since 1.0, 2016.12.29
 */
public class AlibabaAlitjOrderRealnamecardInfoSubmitRequest extends BaseTaobaoRequest<AlibabaAlitjOrderRealnamecardInfoSubmitResponse> {
	
	

	/** 
	* sim卡iccid（一般为18位到20位）
	 */
	private String iccid;

	/** 
	* 淘宝订单号
	 */
	private Long orderNo;

	public void setIccid(String iccid) {
		this.iccid = iccid;
	}

	public String getIccid() {
		return this.iccid;
	}

	public void setOrderNo(Long orderNo) {
		this.orderNo = orderNo;
	}

	public Long getOrderNo() {
		return this.orderNo;
	}

	public String getApiMethodName() {
		return "alibaba.alitj.order.realnamecard.info.submit";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("iccid", this.iccid);
		txtParams.put("order_no", this.orderNo);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlibabaAlitjOrderRealnamecardInfoSubmitResponse> getResponseClass() {
		return AlibabaAlitjOrderRealnamecardInfoSubmitResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(iccid, "iccid");
		RequestCheckUtils.checkMaxLength(iccid, 32, "iccid");
		RequestCheckUtils.checkNotEmpty(orderNo, "orderNo");
		RequestCheckUtils.checkMinValue(orderNo, 1000L, "orderNo");
	}
	

}
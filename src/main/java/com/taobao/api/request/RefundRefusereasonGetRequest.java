package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.RefundRefusereasonGetResponse;

import java.util.Map;

/**
 * TOP API: taobao.refund.refusereason.get request
 * 
 * @author top auto create
 * @since 1.0, 2016.02.20
 */
public class RefundRefusereasonGetRequest extends BaseTaobaoRequest<RefundRefusereasonGetResponse> {
	
	

	/** 
	* 返回参数
	 */
	private String fields;

	/** 
	* 退款编号
	 */
	private Long refundId;

	/** 
	* 售中或售后
	 */
	private String refundPhase;

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
	}

	public void setRefundId(Long refundId) {
		this.refundId = refundId;
	}

	public Long getRefundId() {
		return this.refundId;
	}

	public void setRefundPhase(String refundPhase) {
		this.refundPhase = refundPhase;
	}

	public String getRefundPhase() {
		return this.refundPhase;
	}

	public String getApiMethodName() {
		return "taobao.refund.refusereason.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("refund_id", this.refundId);
		txtParams.put("refund_phase", this.refundPhase);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<RefundRefusereasonGetResponse> getResponseClass() {
		return RefundRefusereasonGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(fields, "fields");
		RequestCheckUtils.checkNotEmpty(refundId, "refundId");
		RequestCheckUtils.checkNotEmpty(refundPhase, "refundPhase");
	}
	

}
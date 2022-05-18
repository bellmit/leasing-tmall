package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.domain.DistributionOrderModel;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.AlibabaWttOrderContractSubscribeResponse;

import java.util.Map;

/**
 * TOP API: alibaba.wtt.order.contract.subscribe request
 * 
 * @author top auto create
 * @since 1.0, 2015.12.08
 */
public class AlibabaWttOrderContractSubscribeRequest extends BaseTaobaoRequest<AlibabaWttOrderContractSubscribeResponse> {
	
	

	/** 
	* 分销商合约生产
	 */
	private String distributionOrderModel;

	public void setDistributionOrderModel(String distributionOrderModel) {
		this.distributionOrderModel = distributionOrderModel;
	}

	public void setDistributionOrderModel(DistributionOrderModel distributionOrderModel) {
		this.distributionOrderModel = new JSONWriter(false,true).write(distributionOrderModel);
	}

	public String getDistributionOrderModel() {
		return this.distributionOrderModel;
	}

	public String getApiMethodName() {
		return "alibaba.wtt.order.contract.subscribe";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("distribution_order_model", this.distributionOrderModel);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlibabaWttOrderContractSubscribeResponse> getResponseClass() {
		return AlibabaWttOrderContractSubscribeResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}
package com.qimencloud.api.sceneo67v8y8p21.request;

import java.util.Map;

import com.qimencloud.api.BaseQimenCloudRequest;
import com.qimencloud.api.sceneo67v8y8p21.response.HshcRiskControlCustomerReturnResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.TaobaoHashMap;


/**
 * TOP API(QimenCloud): hshc.riskcontol.customer.return request
 * 
 * @author top auto create
 * @since 1.0, 2017.05.11
 */
public class HshcRiskControlCustomerReturnRequest extends BaseQimenCloudRequest<HshcRiskControlCustomerReturnResponse> {
     
	/**
	* 收货地址
	 */
	private String consigneeAddress;

	/** 
	* 身份证号
	 */
	private String identityNo;

	/** 
	* 手机号
	 */
	private String mobile;

	/** 
	* 姓名
	 */
	private String name;

	/**
	 * 商品id
	 */
	private long itemId;

	public void setConsigneeAddress(String consigneeAddress) {
		this.consigneeAddress = consigneeAddress;
	}

	public String getConsigneeAddress() {
		return this.consigneeAddress;
	}

	public void setIdentityNo(String identityNo) {
		this.identityNo = identityNo;
	}

	public String getIdentityNo() {
		return this.identityNo;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

    public String getApiMethodName() {
          return "hshc.riskcontrol.customer.out";
     }
     
    public Map<String, String> getTextParams() {
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("consigneeAddress", this.consigneeAddress);
		txtParams.put("identityNo", this.identityNo);
		txtParams.put("mobile", this.mobile);
		txtParams.put("name", this.name);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}
     
    public Class<HshcRiskControlCustomerReturnResponse> getResponseClass() {
		return HshcRiskControlCustomerReturnResponse.class;
	}

    public void check() throws ApiRuleException {
    }

	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
}
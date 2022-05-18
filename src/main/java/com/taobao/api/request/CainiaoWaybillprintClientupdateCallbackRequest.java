package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.CainiaoWaybillprintClientupdateCallbackResponse;

import java.util.Map;

/**
 * TOP API: cainiao.waybillprint.clientupdate.callback request
 * 
 * @author top auto create
 * @since 1.0, 2016.10.14
 */
public class CainiaoWaybillprintClientupdateCallbackRequest extends BaseTaobaoRequest<CainiaoWaybillprintClientupdateCallbackResponse> {
	
	

	/** 
	* 客户端mac
	 */
	private String mac;

	/** 
	* 更新类型
	 */
	private String updateTypaName;

	/** 
	* 最新的、需要更新的版本
	 */
	private String version;

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getMac() {
		return this.mac;
	}

	public void setUpdateTypaName(String updateTypaName) {
		this.updateTypaName = updateTypaName;
	}

	public String getUpdateTypaName() {
		return this.updateTypaName;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getVersion() {
		return this.version;
	}

	public String getApiMethodName() {
		return "cainiao.waybillprint.clientupdate.callback";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("mac", this.mac);
		txtParams.put("update_typa_name", this.updateTypaName);
		txtParams.put("version", this.version);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<CainiaoWaybillprintClientupdateCallbackResponse> getResponseClass() {
		return CainiaoWaybillprintClientupdateCallbackResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(mac, "mac");
		RequestCheckUtils.checkNotEmpty(updateTypaName, "updateTypaName");
		RequestCheckUtils.checkNotEmpty(version, "version");
	}
	

}
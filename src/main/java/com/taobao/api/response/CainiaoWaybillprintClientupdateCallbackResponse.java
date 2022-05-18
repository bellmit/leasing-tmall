package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: cainiao.waybillprint.clientupdate.callback response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoWaybillprintClientupdateCallbackResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7267254565943959134L;

	/** 
	 * result
	 */
	@ApiField("result")
	private Boolean result;


	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}
	


}

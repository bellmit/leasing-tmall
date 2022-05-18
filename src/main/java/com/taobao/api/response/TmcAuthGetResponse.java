package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.tmc.auth.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmcAuthGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8459189696314234422L;

	/** 
	 * result
	 */
	@ApiField("result")
	private String result;


	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}
	


}

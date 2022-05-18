package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.smartwl.userinfo.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class SmartwlUserinfoGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4523753748891181582L;

	/** 
	 * 商家是否已经制定智选物流方案
	 */
	@ApiField("solution_enabled")
	private Boolean solutionEnabled;

	/** 
	 * 商家是否已经开通智选物流
	 */
	@ApiField("user_enabled")
	private Boolean userEnabled;


	public void setSolutionEnabled(Boolean solutionEnabled) {
		this.solutionEnabled = solutionEnabled;
	}
	public Boolean getSolutionEnabled( ) {
		return this.solutionEnabled;
	}

	public void setUserEnabled(Boolean userEnabled) {
		this.userEnabled = userEnabled;
	}
	public Boolean getUserEnabled( ) {
		return this.userEnabled;
	}
	


}

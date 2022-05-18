package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Role;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.sellercenter.role.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class SellercenterRoleAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7873497616631118622L;

	/** 
	 * 子账号角色
	 */
	@ApiField("role")
	private Role role;


	public void setRole(Role role) {
		this.role = role;
	}
	public Role getRole( ) {
		return this.role;
	}
	


}

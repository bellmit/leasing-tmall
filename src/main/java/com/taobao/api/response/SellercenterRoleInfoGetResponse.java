package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Role;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.sellercenter.role.info.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class SellercenterRoleInfoGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1167924997877439313L;

	/** 
	 * 角色具体信息
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

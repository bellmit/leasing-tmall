package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Role;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: taobao.sellercenter.roles.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class SellercenterRolesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1159899245134925975L;

	/** 
	 * 卖家子账号角色列表。<br/>返回对象为 role数据对象中的role_id，role_name，description，seller_id，create_time，modified_time。不包含permissions(权限点)
	 */
	@ApiListField("roles")
	@ApiField("role")
	private List<Role> roles;


	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	public List<Role> getRoles( ) {
		return this.roles;
	}
	


}

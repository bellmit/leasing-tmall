package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SubUserInfo;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: taobao.sellercenter.subusers.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class SellercenterSubusersGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5589482438365856155L;

	/** 
	 * 子账号基本信息列表。具体信息为id、子账号用户名、主账号id、主账号昵称、当前状态值、是否分流
	 */
	@ApiListField("subusers")
	@ApiField("sub_user_info")
	private List<SubUserInfo> subusers;


	public void setSubusers(List<SubUserInfo> subusers) {
		this.subusers = subusers;
	}
	public List<SubUserInfo> getSubusers( ) {
		return this.subusers;
	}
	


}

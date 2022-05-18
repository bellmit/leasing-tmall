package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SubAccountInfo;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: taobao.subusers.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class SubusersGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8155275188119871661L;

	/** 
	 * 子账号基本信息
	 */
	@ApiListField("subaccounts")
	@ApiField("sub_account_info")
	private List<SubAccountInfo> subaccounts;


	public void setSubaccounts(List<SubAccountInfo> subaccounts) {
		this.subaccounts = subaccounts;
	}
	public List<SubAccountInfo> getSubaccounts( ) {
		return this.subaccounts;
	}
	


}

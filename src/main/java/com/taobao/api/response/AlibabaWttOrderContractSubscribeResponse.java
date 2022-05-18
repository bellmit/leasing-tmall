package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: alibaba.wtt.order.contract.subscribe response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlibabaWttOrderContractSubscribeResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8253752349366513791L;

	/** 
	 * 合约产生陈宫
	 */
	@ApiField("issuccess")
	private Boolean issuccess;


	public void setIssuccess(Boolean issuccess) {
		this.issuccess = issuccess;
	}
	public Boolean getIssuccess( ) {
		return this.issuccess;
	}
	


}

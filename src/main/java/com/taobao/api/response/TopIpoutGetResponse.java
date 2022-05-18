package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: taobao.top.ipout.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TopIpoutGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7483125737579476175L;

	/** 
	 * TOP网关出口IP列表
	 */
	@ApiListField("ip_list")
	@ApiField("string")
	private List<String> ipList;


	public void setIpList(List<String> ipList) {
		this.ipList = ipList;
	}
	public List<String> getIpList( ) {
		return this.ipList;
	}
	


}

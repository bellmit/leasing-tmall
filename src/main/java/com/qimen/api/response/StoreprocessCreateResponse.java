package com.qimen.api.response;

import com.qimen.api.QimenResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.qimen.storeprocess.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class StoreprocessCreateResponse extends QimenResponse {

	private static final long serialVersionUID = 7628884835822222795L;

	/** 
	 * 仓储系统处理单ID
	 */
	@ApiField("processOrderId")
	private String processOrderId;


	public void setProcessOrderId(String processOrderId) {
		this.processOrderId = processOrderId;
	}
	public String getProcessOrderId( ) {
		return this.processOrderId;
	}
	


}

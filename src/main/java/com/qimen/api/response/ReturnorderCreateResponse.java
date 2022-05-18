package com.qimen.api.response;

import com.qimen.api.QimenResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.qimen.returnorder.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ReturnorderCreateResponse extends QimenResponse {

	private static final long serialVersionUID = 3155847839149958382L;

	/** 
	 * 仓储系统退货单编码
	 */
	@ApiField("returnOrderId")
	private String returnOrderId;


	public void setReturnOrderId(String returnOrderId) {
		this.returnOrderId = returnOrderId;
	}
	public String getReturnOrderId( ) {
		return this.returnOrderId;
	}
	


}

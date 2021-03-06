package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.fenxiao.refund.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class FenxiaoRefundCreateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5574126775731463459L;

	/** 
	 * 退款是否创建成功
	 */
	@ApiField("is_success")
	private Boolean isSuccess;


	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}
	


}

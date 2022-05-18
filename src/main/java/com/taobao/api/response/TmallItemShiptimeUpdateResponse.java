package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: tmall.item.shiptime.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallItemShiptimeUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6229913462822284396L;

	/** 
	 * 被更新商品ID
	 */
	@ApiField("shiptime_update_result")
	private String shiptimeUpdateResult;


	public void setShiptimeUpdateResult(String shiptimeUpdateResult) {
		this.shiptimeUpdateResult = shiptimeUpdateResult;
	}
	public String getShiptimeUpdateResult( ) {
		return this.shiptimeUpdateResult;
	}
	


}

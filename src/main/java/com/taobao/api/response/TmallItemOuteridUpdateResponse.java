package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: tmall.item.outerid.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallItemOuteridUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5598564594597433639L;

	/** 
	 * 商家编码更新结果
	 */
	@ApiField("outerid_update_result")
	private String outeridUpdateResult;


	public void setOuteridUpdateResult(String outeridUpdateResult) {
		this.outeridUpdateResult = outeridUpdateResult;
	}
	public String getOuteridUpdateResult( ) {
		return this.outeridUpdateResult;
	}
	


}

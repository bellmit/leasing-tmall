package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: tmall.product.match.schema.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallProductMatchSchemaGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8657198187914321777L;

	/** 
	 * 返回匹配product的规则文档
	 */
	@ApiField("match_result")
	private String matchResult;


	public void setMatchResult(String matchResult) {
		this.matchResult = matchResult;
	}
	public String getMatchResult( ) {
		return this.matchResult;
	}
	


}

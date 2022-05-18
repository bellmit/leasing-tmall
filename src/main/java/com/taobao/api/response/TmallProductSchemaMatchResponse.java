package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: tmall.product.schema.match response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallProductSchemaMatchResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1215948419347491522L;

	/** 
	 * 返回匹配产品ID，部分类目可能返回多个产品ID，以逗号分隔。
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

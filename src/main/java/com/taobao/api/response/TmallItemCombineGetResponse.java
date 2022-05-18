package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: tmall.item.combine.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallItemCombineGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3356419183381453442L;

	/** 
	 * results
	 */
	@ApiListField("results")
	@ApiField("json")
	private List<String> results;


	public void setResults(List<String> results) {
		this.results = results;
	}
	public List<String> getResults( ) {
		return this.results;
	}
	


}

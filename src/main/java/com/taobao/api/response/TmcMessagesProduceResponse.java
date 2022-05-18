package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TmcProduceResult;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: taobao.tmc.messages.produce response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmcMessagesProduceResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2499998425479861219L;

	/** 
	 * 是否全部成功
	 */
	@ApiField("is_all_success")
	private Boolean isAllSuccess;

	/** 
	 * 发送结果，与发送时的参数顺序一致。如果is_all_success为true时，不用校验result是否成功
	 */
	@ApiListField("results")
	@ApiField("tmc_produce_result")
	private List<TmcProduceResult> results;


	public void setIsAllSuccess(Boolean isAllSuccess) {
		this.isAllSuccess = isAllSuccess;
	}
	public Boolean getIsAllSuccess( ) {
		return this.isAllSuccess;
	}

	public void setResults(List<TmcProduceResult> results) {
		this.results = results;
	}
	public List<TmcProduceResult> getResults( ) {
		return this.results;
	}
	


}

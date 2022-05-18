package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ScoreResult;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: taobao.fuwu.scores.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class FuwuScoresGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8151133917599279176L;

	/** 
	 * 评价流水记录
	 */
	@ApiListField("score_result")
	@ApiField("score_result")
	private List<ScoreResult> scoreResult;


	public void setScoreResult(List<ScoreResult> scoreResult) {
		this.scoreResult = scoreResult;
	}
	public List<ScoreResult> getScoreResult( ) {
		return this.scoreResult;
	}
	


}

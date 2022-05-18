package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TradeTagRelationDo;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: taobao.oc.tradetags.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OcTradetagsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7758175739446472916L;

	/** 
	 * 返回结果
	 */
	@ApiListField("trade_tags")
	@ApiField("trade_tag_relation_do")
	private List<TradeTagRelationDo> tradeTags;


	public void setTradeTags(List<TradeTagRelationDo> tradeTags) {
		this.tradeTags = tradeTags;
	}
	public List<TradeTagRelationDo> getTradeTags( ) {
		return this.tradeTags;
	}
	


}

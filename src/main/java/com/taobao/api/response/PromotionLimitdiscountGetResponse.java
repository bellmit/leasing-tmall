package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.LimitDiscount;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: taobao.promotion.limitdiscount.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class PromotionLimitdiscountGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7361736282588348928L;

	/** 
	 * 限时打折列表。
	 */
	@ApiListField("limit_discount_list")
	@ApiField("limit_discount")
	private List<LimitDiscount> limitDiscountList;

	/** 
	 * 满足该查询条件的限时打折总数量。
	 */
	@ApiField("total_count")
	private Long totalCount;


	public void setLimitDiscountList(List<LimitDiscount> limitDiscountList) {
		this.limitDiscountList = limitDiscountList;
	}
	public List<LimitDiscount> getLimitDiscountList( ) {
		return this.limitDiscountList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}
	


}

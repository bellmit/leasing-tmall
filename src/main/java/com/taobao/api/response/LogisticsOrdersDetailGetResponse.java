package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Shipping;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: taobao.logistics.orders.detail.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class LogisticsOrdersDetailGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6427663981761676637L;

	/** 
	 * 获取的物流订单详情列表.返回的Shipping包含的具体信息为入参fields请求的字段信息.
	 */
	@ApiListField("shippings")
	@ApiField("shipping")
	private List<Shipping> shippings;

	/** 
	 * 搜索到的物流订单列表总数
	 */
	@ApiField("total_results")
	private Long totalResults;


	public void setShippings(List<Shipping> shippings) {
		this.shippings = shippings;
	}
	public List<Shipping> getShippings( ) {
		return this.shippings;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}
	


}

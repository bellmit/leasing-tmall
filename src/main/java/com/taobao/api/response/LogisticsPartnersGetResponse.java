package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.LogisticsPartner;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: taobao.logistics.partners.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class LogisticsPartnersGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2472951728236426335L;

	/** 
	 * 查询揽送范围之内的物流公司信息
	 */
	@ApiListField("logistics_partners")
	@ApiField("logistics_partner")
	private List<LogisticsPartner> logisticsPartners;


	public void setLogisticsPartners(List<LogisticsPartner> logisticsPartners) {
		this.logisticsPartners = logisticsPartners;
	}
	public List<LogisticsPartner> getLogisticsPartners( ) {
		return this.logisticsPartners;
	}
	


}

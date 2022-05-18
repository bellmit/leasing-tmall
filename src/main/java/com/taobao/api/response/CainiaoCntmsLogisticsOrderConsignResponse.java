package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: cainiao.cntms.logistics.order.consign response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoCntmsLogisticsOrderConsignResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4637783655342394965L;

	/** 
	 * 物流单号
	 */
	@ApiField("logistics_order_code")
	private String logisticsOrderCode;


	public void setLogisticsOrderCode(String logisticsOrderCode) {
		this.logisticsOrderCode = logisticsOrderCode;
	}
	public String getLogisticsOrderCode( ) {
		return this.logisticsOrderCode;
	}
	


}

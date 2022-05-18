package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.CainiaoStockInBillStockininfo;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.wlb.wms.stock.in.bill.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class WlbWmsStockInBillGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2155232847312315799L;

	/** 
	 * 入库单信息
	 */
	@ApiField("stock_in_info")
	private CainiaoStockInBillStockininfo stockInInfo;


	public void setStockInInfo(CainiaoStockInBillStockininfo stockInInfo) {
		this.stockInInfo = stockInInfo;
	}
	public CainiaoStockInBillStockininfo getStockInInfo( ) {
		return this.stockInInfo;
	}
	


}

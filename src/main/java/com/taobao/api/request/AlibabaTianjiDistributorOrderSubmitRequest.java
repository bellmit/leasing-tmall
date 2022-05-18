package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AlibabaTianjiDistributorOrderSubmitResponse;

import java.util.Map;

/**
 * TOP API: alibaba.tianji.distributor.order.submit request
 * 
 * @author top auto create
 * @since 1.0, 2017.03.27
 */
public class AlibabaTianjiDistributorOrderSubmitRequest extends BaseTaobaoRequest<AlibabaTianjiDistributorOrderSubmitResponse> {
	
	

	/** 
	* 商品编码，如手机串号
	 */
	private String itemSerialNo;

	/** 
	* 淘宝交易订单号
	 */
	private String orderNo;

	/** 
	* 供应商产品编码，如SIM卡号
	 */
	private String productSerialNo;

	public void setItemSerialNo(String itemSerialNo) {
		this.itemSerialNo = itemSerialNo;
	}

	public String getItemSerialNo() {
		return this.itemSerialNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderNo() {
		return this.orderNo;
	}

	public void setProductSerialNo(String productSerialNo) {
		this.productSerialNo = productSerialNo;
	}

	public String getProductSerialNo() {
		return this.productSerialNo;
	}

	public String getApiMethodName() {
		return "alibaba.tianji.distributor.order.submit";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_serial_no", this.itemSerialNo);
		txtParams.put("order_no", this.orderNo);
		txtParams.put("product_serial_no", this.productSerialNo);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlibabaTianjiDistributorOrderSubmitResponse> getResponseClass() {
		return AlibabaTianjiDistributorOrderSubmitResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(orderNo, "orderNo");
	}
	

}
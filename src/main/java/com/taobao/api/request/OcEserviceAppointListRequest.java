package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.OcEserviceAppointListResponse;

import java.util.Map;

/**
 * TOP API: taobao.oc.eservice.appoint.list request
 * 
 * @author top auto create
 * @since 1.0, 2016.05.09
 */
public class OcEserviceAppointListRequest extends BaseTaobaoRequest<OcEserviceAppointListResponse> {
	
	

	/** 
	* 预约信息唯一编码(code, customerNick, customerPhone, houseAddressCity, mallCode 调用时五个可选参数中任选一个作为输入参数)
	 */
	private Long code;

	/** 
	* 买家客户nick(code, customerNick, customerPhone, houseAddressCity, mallCode 调用时五个可选参数中任选一个作为输入参数)
	 */
	private String customerNick;

	/** 
	* 买家客户电话号码(code, customerNick, customerPhone, houseAddressCity, mallCode 调用时五个可选参数中任选一个作为输入参数)
	 */
	private String customerPhone;

	/** 
	* 买家客户装修房屋所在的市(code, customerNick, customerPhone, houseAddressCity, mallCode 调用时五个可选参数中任选一个作为输入参数)
	 */
	private String houseAddressCity;

	/** 
	* 门店编码(code, customerNick, customerPhone, houseAddressCity, mallCode 调用时五个可选参数中任选一个作为输入参数)
	 */
	private String mallCode;

	/** 
	* 卖家主账号id
	 */
	private Long sellerId;

	/** 
	* 返回结果按预约时间排序，指示升序还是降息，取值asc和desc
	 */
	private String sortOrder;

	/** 
	* 查询预约的起始时间，格式yyyyMMddHHmmss，默认为当前时间
	 */
	private String startAppointTime;

	public void setCode(Long code) {
		this.code = code;
	}

	public Long getCode() {
		return this.code;
	}

	public void setCustomerNick(String customerNick) {
		this.customerNick = customerNick;
	}

	public String getCustomerNick() {
		return this.customerNick;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getCustomerPhone() {
		return this.customerPhone;
	}

	public void setHouseAddressCity(String houseAddressCity) {
		this.houseAddressCity = houseAddressCity;
	}

	public String getHouseAddressCity() {
		return this.houseAddressCity;
	}

	public void setMallCode(String mallCode) {
		this.mallCode = mallCode;
	}

	public String getMallCode() {
		return this.mallCode;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public Long getSellerId() {
		return this.sellerId;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getSortOrder() {
		return this.sortOrder;
	}

	public void setStartAppointTime(String startAppointTime) {
		this.startAppointTime = startAppointTime;
	}

	public String getStartAppointTime() {
		return this.startAppointTime;
	}

	public String getApiMethodName() {
		return "taobao.oc.eservice.appoint.list";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("code", this.code);
		txtParams.put("customer_nick", this.customerNick);
		txtParams.put("customer_phone", this.customerPhone);
		txtParams.put("house_address_city", this.houseAddressCity);
		txtParams.put("mall_code", this.mallCode);
		txtParams.put("seller_id", this.sellerId);
		txtParams.put("sort_order", this.sortOrder);
		txtParams.put("start_appoint_time", this.startAppointTime);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OcEserviceAppointListResponse> getResponseClass() {
		return OcEserviceAppointListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(sellerId, "sellerId");
	}
	

}
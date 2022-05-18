package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SmartwlAssistantGetResponse;

import java.util.Map;

/**
 * TOP API: taobao.smartwl.assistant.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.04.22
 */
public class SmartwlAssistantGetRequest extends BaseTaobaoRequest<SmartwlAssistantGetResponse> {
	
	

	/** 
	* 物流公司id列表，可以从接口taobao.logistics.companies.get获取所有物流公司id，可以传入多个值，以英文逗号分隔
	 */
	private String cpidList;

	/** 
	* 预留扩展字段，json格式
	 */
	private String feature;

	/** 
	* 订单来源，淘宝(TB)、天猫(TM)、京东(JD)、当当(DD)、拍拍(PP)、易讯(YX)、ebay(EBAY)、QQ网购(QQ)、亚马逊(AMAZON)、苏宁(SN)、国美(GM)、唯品会(WPH)、聚美(JM)、乐蜂(LF)、蘑菇街(MGJ)、聚尚(JS)、拍鞋(PX)、银泰(YT)、1号店(YHD)、凡客(VANCL)、邮乐(YL)、优购(YG)、其他(OTHERS)
	 */
	private String orderSource;

	/** 
	* 收货地详细地址
	 */
	private String receiveAddress;

	/** 
	* 发货地，至少三级行政地址
	 */
	private String sendAddress;

	/** 
	* 物流服务类型
	 */
	private Long serviceType;

	/** 
	* 交易流水号，淘外订单号或者商家内部交易流水号，ISV保证其唯一性
	 */
	private String tradeOrder;

	public void setCpidList(String cpidList) {
		this.cpidList = cpidList;
	}

	public String getCpidList() {
		return this.cpidList;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public String getFeature() {
		return this.feature;
	}

	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}

	public String getOrderSource() {
		return this.orderSource;
	}

	public void setReceiveAddress(String receiveAddress) {
		this.receiveAddress = receiveAddress;
	}

	public String getReceiveAddress() {
		return this.receiveAddress;
	}

	public void setSendAddress(String sendAddress) {
		this.sendAddress = sendAddress;
	}

	public String getSendAddress() {
		return this.sendAddress;
	}

	public void setServiceType(Long serviceType) {
		this.serviceType = serviceType;
	}

	public Long getServiceType() {
		return this.serviceType;
	}

	public void setTradeOrder(String tradeOrder) {
		this.tradeOrder = tradeOrder;
	}

	public String getTradeOrder() {
		return this.tradeOrder;
	}

	public String getApiMethodName() {
		return "taobao.smartwl.assistant.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("cpid_list", this.cpidList);
		txtParams.put("feature", this.feature);
		txtParams.put("order_source", this.orderSource);
		txtParams.put("receive_address", this.receiveAddress);
		txtParams.put("send_address", this.sendAddress);
		txtParams.put("service_type", this.serviceType);
		txtParams.put("trade_order", this.tradeOrder);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<SmartwlAssistantGetResponse> getResponseClass() {
		return SmartwlAssistantGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxLength(cpidList, 100, "cpidList");
		RequestCheckUtils.checkMaxLength(feature, 1024, "feature");
		RequestCheckUtils.checkNotEmpty(orderSource, "orderSource");
		RequestCheckUtils.checkMaxLength(orderSource, 64, "orderSource");
		RequestCheckUtils.checkNotEmpty(receiveAddress, "receiveAddress");
		RequestCheckUtils.checkMaxLength(receiveAddress, 300, "receiveAddress");
		RequestCheckUtils.checkMaxLength(sendAddress, 200, "sendAddress");
		RequestCheckUtils.checkNotEmpty(serviceType, "serviceType");
		RequestCheckUtils.checkNotEmpty(tradeOrder, "tradeOrder");
		RequestCheckUtils.checkMaxLength(tradeOrder, 50, "tradeOrder");
	}
	

}
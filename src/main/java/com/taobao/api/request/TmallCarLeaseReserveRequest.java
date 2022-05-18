package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TmallCarLeaseReserveResponse;

/**
 * TOP API: tmall.car.lease.reserve request
 * 
 * @author top auto create
 * @since 1.0, 2017.03.31
 */
public class TmallCarLeaseReserveRequest extends BaseTaobaoRequest<TmallCarLeaseReserveResponse> {
	
	

	/** 
	* 买家id
	 */
	private Long buyerId;

	/** 
	* 买家昵称
	 */
	@NotBlank(message = "买家昵称不能为空")
	private String buyerNick;

	/** 
	* 1 代表 车辆到店，已预约用户到店提车   ; 2 车辆到店，未能联系到用户
	 */
	@NotNull(message = "车辆状态flag不能为空")
	private Long flag;

	/** 
	* 订单id
	 */
	@NotNull(message = "订单id不能为空")
	private Long orderId;

	/** 
	* 文案
	 */
	@NotBlank(message = "文案不能为空")
	private String text;

	/** 
	* 车架号
	 */
	@NotBlank(message = "车架号不能为空")
	private String vin;

	public void setBuyerId(Long buyerId) {
		this.buyerId = buyerId;
	}

	public Long getBuyerId() {
		return this.buyerId;
	}

	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public String getBuyerNick() {
		return this.buyerNick;
	}

	public void setFlag(Long flag) {
		this.flag = flag;
	}

	public Long getFlag() {
		return this.flag;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getOrderId() {
		return this.orderId;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getVin() {
		return this.vin;
	}

	public String getApiMethodName() {
		return "tmall.car.lease.reserve";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("buyer_id", this.buyerId);
		txtParams.put("buyer_nick", this.buyerNick);
		txtParams.put("flag", this.flag);
		txtParams.put("order_id", this.orderId);
		txtParams.put("text", this.text);
		txtParams.put("vin", this.vin);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallCarLeaseReserveResponse> getResponseClass() {
		return TmallCarLeaseReserveResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(buyerNick, "buyerNick");
		RequestCheckUtils.checkNotEmpty(flag, "flag");
		RequestCheckUtils.checkNotEmpty(orderId, "orderId");
		RequestCheckUtils.checkNotEmpty(text, "text");
		RequestCheckUtils.checkNotEmpty(vin, "vin");
	}
	

}
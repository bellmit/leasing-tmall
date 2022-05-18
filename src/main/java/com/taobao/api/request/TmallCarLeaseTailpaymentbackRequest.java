package com.taobao.api.request;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import java.util.Map;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.TmallCarLeaseTailpaymentbackResponse;

/**
 * TOP API: tmall.car.lease.tailpaymentback request
 * 
 * @author top auto create
 * @since 1.0, 2017.04.06
 */
public class TmallCarLeaseTailpaymentbackRequest extends BaseTaobaoRequest<TmallCarLeaseTailpaymentbackResponse> {
	
	

	/** 
	* 尾款方案
	 */
	private String tailPaymentDTO;

	public void setTailPaymentDTO(String tailPaymentDTO) {
		this.tailPaymentDTO = tailPaymentDTO;
	}

	public void setTailPaymentDTO(TailPaymentDto tailPaymentDTO) {
		this.tailPaymentDTO = new JSONWriter(false,true).write(tailPaymentDTO);
	}

	public String getTailPaymentDTO() {
		return this.tailPaymentDTO;
	}

	public String getApiMethodName() {
		return "tmall.car.lease.tailpaymentback";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("tail_payment_d_t_o", this.tailPaymentDTO);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallCarLeaseTailpaymentbackResponse> getResponseClass() {
		return TmallCarLeaseTailpaymentbackResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
 * 尾款方案
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class TailPaymentDto extends TaobaoObject {

	private static final long serialVersionUID = 5776243313997857949L;

	/**
		 * 买家id，不需要传入
		 */
		@ApiField("buyer_id")
		private Long buyerId;
		/**
		 * 月供，如果是购买车辆，分期付尾款，则必须
		 */
		@ApiField("monthly_pay")
		private Long monthlyPay;
		/**
		 * 分期月份，如果是购买车辆，分期付尾款，则必须
		 */
		@ApiField("months")
		private Long months;
		/**
		 * 处置名字，支持3种：归还车辆; 购买车辆，一次性支付尾款; 购买车辆，分期付尾款
		 */
		@NotBlank(message = "处置名字不能为空")
		@ApiField("name")
		private String name;
		/**
		 * 订单id
		 */
		@NotNull(message = "订单id不能为空")
		@ApiField("order_id")
		private Long orderId;
		/**
		 * 尾款金额，如果是购买车辆，一次性支付尾款必填
		 */
		@ApiField("tail_amount")
		private Long tailAmount;
	

	public Long getBuyerId() {
			return this.buyerId;
		}
		public void setBuyerId(Long buyerId) {
			this.buyerId = buyerId;
		}
		public Long getMonthlyPay() {
			return this.monthlyPay;
		}
		public void setMonthlyPay(Long monthlyPay) {
			this.monthlyPay = monthlyPay;
		}
		public Long getMonths() {
			return this.months;
		}
		public void setMonths(Long months) {
			this.months = months;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getOrderId() {
			return this.orderId;
		}
		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}
		public Long getTailAmount() {
			return this.tailAmount;
		}
		public void setTailAmount(Long tailAmount) {
			this.tailAmount = tailAmount;
		}

}


}
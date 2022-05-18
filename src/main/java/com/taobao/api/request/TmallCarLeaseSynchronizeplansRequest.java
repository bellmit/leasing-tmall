package com.taobao.api.request;

import java.util.List;

import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.TaobaoObject;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.TmallCarLeaseSynchronizeplansResponse;
import org.springframework.stereotype.Repository;

/**
 * TOP API: tmall.car.lease.synchronizeplans request
 * 
 * @author top auto create
 * @since 1.0, 2017.03.29
 */
public class TmallCarLeaseSynchronizeplansRequest extends BaseTaobaoRequest<TmallCarLeaseSynchronizeplansResponse> {
	
	/**
	* 商品id
	 */
	private Long itemId;

	/** 
	* 租赁计划
	 */
	private String plans;

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public void setPlans(String plans) {
		this.plans = plans;
	}

	public void setPlans(List<CarLeasePlanDo> plans) {
		this.plans = new JSONWriter(false,true).write(plans);
	}

	public String getPlans() {
		return this.plans;
	}

	public String getApiMethodName() {
		return "tmall.car.lease.synchronizeplans";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_id", this.itemId);
		txtParams.put("plans", this.plans);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallCarLeaseSynchronizeplansResponse> getResponseClass() {
		return TmallCarLeaseSynchronizeplansResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(itemId, "itemId");
		RequestCheckUtils.checkObjectMaxListSize(plans, 20, "plans");
	}
	
	/**
	 * 租赁计划
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CarLeasePlanDo extends TaobaoObject {

		private static final long serialVersionUID = 3528962451522396997L;

		/**
		 * 发布商品时选的汽车品牌
		 */
		@ApiField("brand")
		private String brand;
		/**
		 * 租赁公司名字
		 */
		@ApiField("company_name")
		private String companyName;
		/**
		 * 无需填写
		 */
		@ApiField("ext")
		private String ext;
		/**
		 * 首付金额,单位分
		 */
		@ApiField("initial_payment_amount")
		private Long initialPaymentAmount;
		/**
		 * 首付比例10,15,20代表10%,15%,20%
		 */
		@ApiField("initial_payment_ratio")
		private Long initialPaymentRatio;
		/**
		 * 商品id,外面已经传入，里面可选，传了也会被外面的覆盖
		 */
		@ApiField("item_id")
		private Long itemId;
		/**
		 * 租期12,24,36期
		 */
		@ApiField("lease_term")
		private Long leaseTerm;
		/**
		 * 发布商品时选的汽车车系
		 */
		@ApiField("line")
		private String line;
		/**
		 * 融资额,单位分
		 */
		@ApiField("loan_amount")
		private Long loanAmount;
		/**
		 * 发布商品时选的汽车型号
		 */
		@ApiField("model")
		private String model;
		/**
		 * 月供,单位分
		 */
		@ApiField("monthly_payment")
		private Long monthlyPayment;
		/**
		 * 官方指导价,单位分
		 */
		@ApiField("msrp")
		private Long msrp;
		/**
		 * 商家这边唯一用来关联方案的
		 */
		@ApiField("out_unique_id")
		private String outUniqueId;
		/**
		 * 违约金,单位分
		 */
		@ApiField("penalty")
		private Long penalty;
		/**
		 * 卖家id
		 */
		@ApiField("seller_id")
		private Long sellerId;
		/**
		 * 门店手续费,单位分
		 */
		@ApiField("store_fee")
		private Long storeFee;
		/**
		 * 尾款金额,单位分
		 */
		@ApiField("tail_payment_amount")
		private Long tailPaymentAmount;
		/**
		 * 支持的尾款类型
		 */
		@ApiField("tail_payment_type")
		private String tailPaymentType;
		/**
		 * 发布商品时选的汽车年款
		 */
		@ApiField("year")
		private String year;


		public String getBrand() {
				return this.brand;
			}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public String getCompanyName() {
			return this.companyName;
		}

		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}

		public String getExt() {
			return this.ext;
		}

		public void setExt(String ext) {
			this.ext = ext;
		}

		public Long getInitialPaymentAmount() {
			return this.initialPaymentAmount;
		}

		public void setInitialPaymentAmount(Long initialPaymentAmount) {
			this.initialPaymentAmount = initialPaymentAmount;
		}

		public Long getInitialPaymentRatio() {
			return this.initialPaymentRatio;
		}

		public void setInitialPaymentRatio(Long initialPaymentRatio) {
			this.initialPaymentRatio = initialPaymentRatio;
		}

		public Long getItemId() {
			return this.itemId;
		}

		public void setItemId(Long itemId) {
			this.itemId = itemId;
		}

		public Long getLeaseTerm() {
			return this.leaseTerm;
		}

		public void setLeaseTerm(Long leaseTerm) {
			this.leaseTerm = leaseTerm;
		}

		public String getLine() {
			return this.line;
		}

		public void setLine(String line) {
			this.line = line;
		}

		public Long getLoanAmount() {
			return this.loanAmount;
		}

		public void setLoanAmount(Long loanAmount) {
			this.loanAmount = loanAmount;
		}

		public String getModel() {
			return this.model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public Long getMonthlyPayment() {
			return this.monthlyPayment;
		}

		public void setMonthlyPayment(Long monthlyPayment) {
			this.monthlyPayment = monthlyPayment;
		}

		public Long getMsrp() {
			return this.msrp;
		}

		public void setMsrp(Long msrp) {
			this.msrp = msrp;
		}

		public String getOutUniqueId() {
			return this.outUniqueId;
		}

		public void setOutUniqueId(String outUniqueId) {
			this.outUniqueId = outUniqueId;
		}

		public Long getPenalty() {
			return this.penalty;
		}

		public void setPenalty(Long penalty) {
			this.penalty = penalty;
		}

		public Long getSellerId() {
			return this.sellerId;
		}

		public void setSellerId(Long sellerId) {
			this.sellerId = sellerId;
		}

		public Long getStoreFee() {
			return this.storeFee;
		}

		public void setStoreFee(Long storeFee) {
			this.storeFee = storeFee;
		}

		public Long getTailPaymentAmount() {
			return this.tailPaymentAmount;
		}

		public void setTailPaymentAmount(Long tailPaymentAmount) {
			this.tailPaymentAmount = tailPaymentAmount;
		}

		public String getTailPaymentType() {
			return this.tailPaymentType;
		}

		public void setTailPaymentType(String tailPaymentType) {
			this.tailPaymentType = tailPaymentType;
		}

		public String getYear() {
			return this.year;
		}

		public void setYear(String year) {
			this.year = year;
		}

	}

}
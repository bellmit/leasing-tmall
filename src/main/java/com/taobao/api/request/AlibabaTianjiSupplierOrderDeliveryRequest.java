package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.AlibabaTianjiSupplierOrderDeliveryResponse;

import java.util.Date;
import java.util.Map;

/**
 * TOP API: alibaba.tianji.supplier.order.delivery request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.21
 */
public class AlibabaTianjiSupplierOrderDeliveryRequest extends BaseTaobaoRequest<AlibabaTianjiSupplierOrderDeliveryResponse> {
	
	

	/** 
	* 物流信息
	 */
	private String paramDistributionOrderLogisticsModel;

	public void setParamDistributionOrderLogisticsModel(String paramDistributionOrderLogisticsModel) {
		this.paramDistributionOrderLogisticsModel = paramDistributionOrderLogisticsModel;
	}

	public void setParamDistributionOrderLogisticsModel(DistributionOrderLogisticsModel paramDistributionOrderLogisticsModel) {
		this.paramDistributionOrderLogisticsModel = new JSONWriter(false,true).write(paramDistributionOrderLogisticsModel);
	}

	public String getParamDistributionOrderLogisticsModel() {
		return this.paramDistributionOrderLogisticsModel;
	}

	public String getApiMethodName() {
		return "alibaba.tianji.supplier.order.delivery";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("param_distribution_order_logistics_model", this.paramDistributionOrderLogisticsModel);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlibabaTianjiSupplierOrderDeliveryResponse> getResponseClass() {
		return AlibabaTianjiSupplierOrderDeliveryResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
 * 身份证相关信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class IdCardModel extends TaobaoObject {

	private static final long serialVersionUID = 7534487715878424966L;

	/**
		 * 身份证反面照
		 */
		@ApiField("back_cert_pic")
		private String backCertPic;
		/**
		 * 证件失效时间
		 */
		@ApiField("card_expire_date")
		private Date cardExpireDate;
		/**
		 * 证件号码
		 */
		@ApiField("card_number")
		private String cardNumber;
		/**
		 * 证件类型
		 */
		@ApiField("card_type")
		private String cardType;
		/**
		 * 身份证正面照
		 */
		@ApiField("face_cert_pic")
		private String faceCertPic;
		/**
		 * 手持身份证照
		 */
		@ApiField("hold_cert_pic")
		private String holdCertPic;
		/**
		 * 证件名称
		 */
		@ApiField("name")
		private String name;
	

	public String getBackCertPic() {
			return this.backCertPic;
		}
		public void setBackCertPic(String backCertPic) {
			this.backCertPic = backCertPic;
		}
		public Date getCardExpireDate() {
			return this.cardExpireDate;
		}
		public void setCardExpireDate(Date cardExpireDate) {
			this.cardExpireDate = cardExpireDate;
		}
		public String getCardNumber() {
			return this.cardNumber;
		}
		public void setCardNumber(String cardNumber) {
			this.cardNumber = cardNumber;
		}
		public String getCardType() {
			return this.cardType;
		}
		public void setCardType(String cardType) {
			this.cardType = cardType;
		}
		public String getFaceCertPic() {
			return this.faceCertPic;
		}
		public void setFaceCertPic(String faceCertPic) {
			this.faceCertPic = faceCertPic;
		}
		public String getHoldCertPic() {
			return this.holdCertPic;
		}
		public void setHoldCertPic(String holdCertPic) {
			this.holdCertPic = holdCertPic;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}

}

	/**
 * 物流信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class DistributionOrderLogisticsModel extends TaobaoObject {

	private static final long serialVersionUID = 7879967885662995272L;

	/**
		 * 需要变更的订购状态, NOT_ORDER(1, "未订购"), 未订购； ORDER_AUDIT(2, "订购中"), 无订购接口，提交给供应商，线下受理中； ON_ORDER(3, "订购中"), 有订购接口，线上受理中； FAILURE(4, "订购失败")，订购失败； SUCCESS(5, "订购成功")，订购成功； CANCEL(6, "订购取消")，订购取消
		 */
		@ApiField("contract_order_status")
		private String contractOrderStatus;
		/**
		 * 分销商编号
		 */
		@ApiField("distributor_id")
		private Long distributorId;
		/**
		 * 快递公司编码
		 */
		@ApiField("express_code")
		private String expressCode;
		/**
		 * 快递名称
		 */
		@ApiField("express_name")
		private String expressName;
		/**
		 * 快递单号
		 */
		@ApiField("express_number")
		private String expressNumber;
		/**
		 * iccid
		 */
		@ApiField("iccid")
		private String iccid;
		/**
		 * 身份证相关信息
		 */
		@ApiField("id_card_model")
		private IdCardModel idCardModel;
		/**
		 * 商品编码
		 */
		@ApiField("item_serial_no")
		private String itemSerialNo;
		/**
		 * 操作时间
		 */
		@ApiField("operate_time")
		private Date operateTime;
		/**
		 * 淘宝交易订单号
		 */
		@ApiField("order_no")
		private String orderNo;
		/**
		 * 产品编码，如ICCID
		 */
		@ApiField("product_serial_no")
		private String productSerialNo;
		/**
		 * 失败原因
		 */
		@ApiField("reason")
		private String reason;
	

	public String getContractOrderStatus() {
			return this.contractOrderStatus;
		}
		public void setContractOrderStatus(String contractOrderStatus) {
			this.contractOrderStatus = contractOrderStatus;
		}
		public Long getDistributorId() {
			return this.distributorId;
		}
		public void setDistributorId(Long distributorId) {
			this.distributorId = distributorId;
		}
		public String getExpressCode() {
			return this.expressCode;
		}
		public void setExpressCode(String expressCode) {
			this.expressCode = expressCode;
		}
		public String getExpressName() {
			return this.expressName;
		}
		public void setExpressName(String expressName) {
			this.expressName = expressName;
		}
		public String getExpressNumber() {
			return this.expressNumber;
		}
		public void setExpressNumber(String expressNumber) {
			this.expressNumber = expressNumber;
		}
		public String getIccid() {
			return this.iccid;
		}
		public void setIccid(String iccid) {
			this.iccid = iccid;
		}
		public IdCardModel getIdCardModel() {
			return this.idCardModel;
		}
		public void setIdCardModel(IdCardModel idCardModel) {
			this.idCardModel = idCardModel;
		}
		public String getItemSerialNo() {
			return this.itemSerialNo;
		}
		public void setItemSerialNo(String itemSerialNo) {
			this.itemSerialNo = itemSerialNo;
		}
		public Date getOperateTime() {
			return this.operateTime;
		}
		public void setOperateTime(Date operateTime) {
			this.operateTime = operateTime;
		}
		public String getOrderNo() {
			return this.orderNo;
		}
		public void setOrderNo(String orderNo) {
			this.orderNo = orderNo;
		}
		public String getProductSerialNo() {
			return this.productSerialNo;
		}
		public void setProductSerialNo(String productSerialNo) {
			this.productSerialNo = productSerialNo;
		}
		public String getReason() {
			return this.reason;
		}
		public void setReason(String reason) {
			this.reason = reason;
		}

}


}
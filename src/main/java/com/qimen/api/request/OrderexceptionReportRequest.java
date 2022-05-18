package com.qimen.api.request;

import com.qimen.api.QimenRequest;
import com.qimen.api.response.OrderexceptionReportResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;

import java.util.List;
import java.util.Map;

/**
 * TOP API: taobao.qimen.orderexception.report request
 * 
 * @author top auto create
 * @since 1.0, 2016.11.25
 */
public class OrderexceptionReportRequest extends QimenRequest<OrderexceptionReportResponse> {
	
	

	/** 
	* 创建时间
	 */
	private String createTime;

	/** 
	* ERP的发货单编码
	 */
	private String deliveryOrderCode;

	/** 
	* 仓库系统的发货单编码
	 */
	private String deliveryOrderId;

	/** 
	* 运单号
	 */
	private String expressCode;

	/** 
	* 扩展属性
	 */
	private Map extendProps;

	/**
	* 物流公司编码(SF=顺丰、EMS=标准快递、EYB=经济快件、ZJS=宅急送、YTO=圆通 、ZTO=中通 (ZTO) 、HTKY=百世汇通、UC=优速、STO=申通、TTKDEX=天天快递 、QFKD=全峰、FAST=快捷、POSTB=邮政小包 、GTO=国通、YUNDA=韵达、JD=京东配送、DD=当当宅配、AMAZON=亚马逊物流、OTHER=其他(只传英文编码))
	 */
	private String logisticsCode;

	/**
	* 异常消息描述
	 */
	private String messageDesc;

	/**
	* 异常消息ID
	 */
	private String messageId;

	/**
	* 异常消息类型(101=系统报缺（有商品信息）.102=实物报缺（有商品信息）.201=配送延迟.202=拒收退件.203=包裹丢失)
	 */
	private String messageType;

	/**
	* 订单信息
	 */
	private List<OrderLine> orderLines;

	/**
	* 单据类型(JYCK= 一般交易出库单.HHCK= 换货出库.BFCK= 补发出库.PTCK=普通出库单.DBCK=调拨出库.QTCK=其他出库.B2BRK=B2B入库.B2BCK=B2B出库.CGRK=采购入库.DBRK= 调拨入库.QTRK= 其他入库.XTRK= 销退 入库.HHRK= 换货入库.CNJG= 仓内加工单)
	 */
	private String orderType;

	/**
	* 备注
	 */
	private String remark;

	/**
	* 仓库编码
	 */
	private String warehouseCode;

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setDeliveryOrderCode(String deliveryOrderCode) {
		this.deliveryOrderCode = deliveryOrderCode;
	}

	public String getDeliveryOrderCode() {
		return this.deliveryOrderCode;
	}

	public void setDeliveryOrderId(String deliveryOrderId) {
		this.deliveryOrderId = deliveryOrderId;
	}

	public String getDeliveryOrderId() {
		return this.deliveryOrderId;
	}

	public void setExpressCode(String expressCode) {
		this.expressCode = expressCode;
	}

	public String getExpressCode() {
		return this.expressCode;
	}

	public void setExtendProps(Map extendProps) {
		this.extendProps = extendProps;
	}

	public Map getExtendProps() {
		return this.extendProps;
	}

	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getLogisticsCode() {
		return this.logisticsCode;
	}

	public void setMessageDesc(String messageDesc) {
		this.messageDesc = messageDesc;
	}

	public String getMessageDesc() {
		return this.messageDesc;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getMessageId() {
		return this.messageId;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public String getMessageType() {
		return this.messageType;
	}

	public void setOrderLines(List<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}

	public List<OrderLine> getOrderLines() {
		return this.orderLines;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

	public String getWarehouseCode() {
		return this.warehouseCode;
	}

	public String getApiMethodName() {
		return "taobao.qimen.orderexception.report";
	}

	public Class<OrderexceptionReportResponse> getResponseClass() {
		return OrderexceptionReportResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(createTime, "createTime");
		RequestCheckUtils.checkMaxLength(createTime, 19, "createTime");
		RequestCheckUtils.checkNotEmpty(deliveryOrderCode, "deliveryOrderCode");
		RequestCheckUtils.checkMaxLength(deliveryOrderCode, 50, "deliveryOrderCode");
		RequestCheckUtils.checkMaxLength(deliveryOrderId, 50, "deliveryOrderId");
		RequestCheckUtils.checkMaxLength(expressCode, 50, "expressCode");
		RequestCheckUtils.checkMaxLength(logisticsCode, 50, "logisticsCode");
		RequestCheckUtils.checkMaxLength(messageDesc, 500, "messageDesc");
		RequestCheckUtils.checkNotEmpty(messageId, "messageId");
		RequestCheckUtils.checkMaxLength(messageId, 50, "messageId");
		RequestCheckUtils.checkNotEmpty(messageType, "messageType");
		RequestCheckUtils.checkMaxLength(messageType, 50, "messageType");
		RequestCheckUtils.checkMaxLength(orderType, 50, "orderType");
		RequestCheckUtils.checkMaxLength(remark, 2000, "remark");
		RequestCheckUtils.checkNotEmpty(warehouseCode, "warehouseCode");
		RequestCheckUtils.checkMaxLength(warehouseCode, 50, "warehouseCode");
	}
	
	/**
 * 订单信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class OrderLine {

	/**
		 * 实发商品数量
		 */
		@ApiField("exceptionQty")
		private Long exceptionQty;
		/**
		 * 库存类型(ZP=正品.CC=残次.JS=机损.XS= 箱损.ZT=在途库存.默认为查所有类型的库存)
		 */
		@ApiField("inventoryType")
		private String inventoryType;
		/**
		 * 商品编码
		 */
		@ApiField("itemCode")
		private String itemCode;
		/**
		 * 商品仓储系统编码
		 */
		@ApiField("itemId")
		private String itemId;
		/**
		 * 单据行号
		 */
		@ApiField("orderLineNo")
		private String orderLineNo;
		/**
		 * 平台交易订单编码
		 */
		@ApiField("orderSourceCode")
		private String orderSourceCode;
		/**
		 * 应发商品数量
		 */
		@ApiField("planQty")
		private Long planQty;
		/**
		 * 平台交易子订单编码
		 */
		@ApiField("subSourceCode")
		private String subSourceCode;
	

	public Long getExceptionQty() {
			return this.exceptionQty;
		}
		public void setExceptionQty(Long exceptionQty) {
			this.exceptionQty = exceptionQty;
		}
		public String getInventoryType() {
			return this.inventoryType;
		}
		public void setInventoryType(String inventoryType) {
			this.inventoryType = inventoryType;
		}
		public String getItemCode() {
			return this.itemCode;
		}
		public void setItemCode(String itemCode) {
			this.itemCode = itemCode;
		}
		public String getItemId() {
			return this.itemId;
		}
		public void setItemId(String itemId) {
			this.itemId = itemId;
		}
		public String getOrderLineNo() {
			return this.orderLineNo;
		}
		public void setOrderLineNo(String orderLineNo) {
			this.orderLineNo = orderLineNo;
		}
		public String getOrderSourceCode() {
			return this.orderSourceCode;
		}
		public void setOrderSourceCode(String orderSourceCode) {
			this.orderSourceCode = orderSourceCode;
		}
		public Long getPlanQty() {
			return this.planQty;
		}
		public void setPlanQty(Long planQty) {
			this.planQty = planQty;
		}
		public String getSubSourceCode() {
			return this.subSourceCode;
		}
		public void setSubSourceCode(String subSourceCode) {
			this.subSourceCode = subSourceCode;
		}

}


}
package com.qimen.api.response;

import com.qimen.api.QimenResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: taobao.qimen.orderprocess.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OrderprocessQueryResponse extends QimenResponse {

	private static final long serialVersionUID = 1728363654152869419L;

	/** 
	 * 订单处理流程
	 */
	@ApiField("orderProcess")
	private OrderProcess orderProcess;


	public void setOrderProcess(OrderProcess orderProcess) {
		this.orderProcess = orderProcess;
	}
	public OrderProcess getOrderProcess( ) {
		return this.orderProcess;
	}
	
	/**
 * 处理流程
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Process {

	/**
		 * 操作内容
		 */
		@ApiField("operateInfo")
		private String operateInfo;
		/**
		 * 该状态操作时间(YYYY-MM-DD HH:MM:SS)
		 */
		@ApiField("operateTime")
		private String operateTime;
		/**
		 * 该状态操作员编码
		 */
		@ApiField("operatorCode")
		private String operatorCode;
		/**
		 * 该状态操作员姓名
		 */
		@ApiField("operatorName")
		private String operatorName;
		/**
		 * 单据状态(NEW=新增;ACCEPT=仓库接单;PRINT=打印;PICK=捡货;CHECK=复核;PACKAGE=打包;WEIGH=称重;READY=待提货;DELIVERED=已发货;EXCEPTION=异常;CLOSED=关闭;CANCELED=取消;REJECT=仓库拒单;REFUSE=客户拒签;CANCELEDFAIL=取消失败;SIGN=签收;TMSCANCELED=快递拦截;PARTFULFILLED=部分收货完成;FULFILLED=收货完成;PARTDELIVERED=部分发货完成;OTHER=其他;只传英文编码)
		 */
		@ApiField("processStatus")
		private String processStatus;
		/**
		 * 备注
		 */
		@ApiField("remark")
		private String remark;
	

	public String getOperateInfo() {
			return this.operateInfo;
		}
		public void setOperateInfo(String operateInfo) {
			this.operateInfo = operateInfo;
		}
		public String getOperateTime() {
			return this.operateTime;
		}
		public void setOperateTime(String operateTime) {
			this.operateTime = operateTime;
		}
		public String getOperatorCode() {
			return this.operatorCode;
		}
		public void setOperatorCode(String operatorCode) {
			this.operatorCode = operatorCode;
		}
		public String getOperatorName() {
			return this.operatorName;
		}
		public void setOperatorName(String operatorName) {
			this.operatorName = operatorName;
		}
		public String getProcessStatus() {
			return this.processStatus;
		}
		public void setProcessStatus(String processStatus) {
			this.processStatus = processStatus;
		}
		public String getRemark() {
			return this.remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}

}

	/**
 * 订单处理流程
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class OrderProcess {

	/**
		 * 单据号
		 */
		@ApiField("orderCode")
		private String orderCode;
		/**
		 * 仓储系统单据号
		 */
		@ApiField("orderId")
		private String orderId;
		/**
		 * 单据类型(JYCK=一般交易出库单;HHCK=换货出库;BFCK=补发出库;PTCK=普通出库单;DBCK=调拨出库;QTCK=其他出库;B2BRK=B2B入库;B2BCK=B2B出库;CGRK=采购入库;DBRK=调拨入库;QTRK=其他入库;XTRK=销退入库;HHRK=换货入库;CNJG=仓内加工单)
		 */
		@ApiField("orderType")
		private String orderType;
		/**
		 * 处理流程
		 */
		@ApiListField("processes")
		@ApiField("process")
		private List<Process> processes;
		/**
		 * 仓库编码
		 */
		@ApiField("warehouseCode")
		private String warehouseCode;
	

	public String getOrderCode() {
			return this.orderCode;
		}
		public void setOrderCode(String orderCode) {
			this.orderCode = orderCode;
		}
		public String getOrderId() {
			return this.orderId;
		}
		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}
		public String getOrderType() {
			return this.orderType;
		}
		public void setOrderType(String orderType) {
			this.orderType = orderType;
		}
		public List<Process> getProcesses() {
			return this.processes;
		}
		public void setProcesses(List<Process> processes) {
			this.processes = processes;
		}
		public String getWarehouseCode() {
			return this.warehouseCode;
		}
		public void setWarehouseCode(String warehouseCode) {
			this.warehouseCode = warehouseCode;
		}

}



}

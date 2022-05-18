package com.qimen.api.request;

import com.qimen.api.QimenRequest;
import com.qimen.api.response.WavenumReportResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;

import java.util.List;
import java.util.Map;

/**
 * TOP API: taobao.qimen.wavenum.report request
 * 
 * @author top auto create
 * @since 1.0, 2016.11.25
 */
public class WavenumReportRequest extends QimenRequest<WavenumReportResponse> {
	
	

	/** 
	* 扩展属性
	 */
	private Map extendProps;

	/**
	* 发货单号
	 */
	private List<Order> orders;

	/**
	* 波次号
	 */
	private String waveNum;

	public void setExtendProps(Map extendProps) {
		this.extendProps = extendProps;
	}

	public Map getExtendProps() {
		return this.extendProps;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public List<Order> getOrders() {
		return this.orders;
	}

	public void setWaveNum(String waveNum) {
		this.waveNum = waveNum;
	}

	public String getWaveNum() {
		return this.waveNum;
	}

	public String getApiMethodName() {
		return "taobao.qimen.wavenum.report";
	}

	public Class<WavenumReportResponse> getResponseClass() {
		return WavenumReportResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(waveNum, "waveNum");
		RequestCheckUtils.checkMaxLength(waveNum, 18, "waveNum");
	}
	
	/**
 * 发货单号
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Order {

	/**
		 * 出库单号
		 */
		@ApiField("deliveryOrderCode")
		private String deliveryOrderCode;
		/**
		 * 出库单仓储系统编码
		 */
		@ApiField("deliveryOrderId")
		private String deliveryOrderId;
		/**
		 * 波次中的次序号
		 */
		@ApiField("num")
		private String num;
	

	public String getDeliveryOrderCode() {
			return this.deliveryOrderCode;
		}
		public void setDeliveryOrderCode(String deliveryOrderCode) {
			this.deliveryOrderCode = deliveryOrderCode;
		}
		public String getDeliveryOrderId() {
			return this.deliveryOrderId;
		}
		public void setDeliveryOrderId(String deliveryOrderId) {
			this.deliveryOrderId = deliveryOrderId;
		}
		public String getNum() {
			return this.num;
		}
		public void setNum(String num) {
			this.num = num;
		}

}


}
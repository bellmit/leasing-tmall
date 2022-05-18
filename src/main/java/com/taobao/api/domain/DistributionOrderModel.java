package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;


/**
 * 分销商合约生产
 *
 * @author top auto create
 * @since 1.0, null
 */
public class DistributionOrderModel extends TaobaoObject {

	private static final long serialVersionUID = 4878699814598656346L;

	/**
	 * 分销商用户ID
	 */
	@ApiField("distributor_id")
	private Long distributorId;

	/**
	 * 手机串码
	 */
	@ApiField("item_serial_no")
	private String itemSerialNo;

	/**
	 * 订单号码
	 */
	@ApiField("order_no")
	private String orderNo;


	public Long getDistributorId() {
		return this.distributorId;
	}
	public void setDistributorId(Long distributorId) {
		this.distributorId = distributorId;
	}

	public String getItemSerialNo() {
		return this.itemSerialNo;
	}
	public void setItemSerialNo(String itemSerialNo) {
		this.itemSerialNo = itemSerialNo;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}

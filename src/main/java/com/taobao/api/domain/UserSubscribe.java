package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;


/**
 * 用户订购信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class UserSubscribe extends TaobaoObject {

	private static final long serialVersionUID = 4276135714575162821L;

	/**
	 * 订购结束时间。格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 订购开始时间。格式:yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 订购状况。应用订购者：subscribeUser;尚未订购：unsubscribeUser；非法用户：invalidateUser
	 */
	@ApiField("status")
	private String status;

	/**
	 * 0-无版本信息；1-初级版；2-中级版；3-高级版
	 */
	@ApiField("version_no")
	private Long versionNo;


	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getVersionNo() {
		return this.versionNo;
	}
	public void setVersionNo(Long versionNo) {
		this.versionNo = versionNo;
	}

}

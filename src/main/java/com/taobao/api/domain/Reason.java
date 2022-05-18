package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;


/**
 * 卖家拒绝原因对象
 *
 * @author top auto create
 * @since 1.0, null
 */
public class Reason extends TaobaoObject {

	private static final long serialVersionUID = 5147175913583471277L;

	/**
	 * 
	 */
	@ApiField("reason_id")
	private Long reasonId;

	/**
	 * 
	 */
	@ApiField("reason_text")
	private String reasonText;

	/**
	 * 
	 */
	@ApiField("reason_tips")
	private String reasonTips;


	public Long getReasonId() {
		return this.reasonId;
	}
	public void setReasonId(Long reasonId) {
		this.reasonId = reasonId;
	}

	public String getReasonText() {
		return this.reasonText;
	}
	public void setReasonText(String reasonText) {
		this.reasonText = reasonText;
	}

	public String getReasonTips() {
		return this.reasonTips;
	}
	public void setReasonTips(String reasonTips) {
		this.reasonTips = reasonTips;
	}

}

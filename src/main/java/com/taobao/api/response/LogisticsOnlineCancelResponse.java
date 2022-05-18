package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.logistics.online.cancel response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class LogisticsOnlineCancelResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8677945712391855727L;

	/** 
	 * 成功与失败
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	/** 
	 * 修改时间
	 */
	@ApiField("modify_time")
	private String modifyTime;

	/** 
	 * 重新创建物流订单id
	 */
	@ApiField("recreated_order_id")
	private String recreatedOrderId;


	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}
	public String getModifyTime( ) {
		return this.modifyTime;
	}

	public void setRecreatedOrderId(String recreatedOrderId) {
		this.recreatedOrderId = recreatedOrderId;
	}
	public String getRecreatedOrderId( ) {
		return this.recreatedOrderId;
	}
	


}

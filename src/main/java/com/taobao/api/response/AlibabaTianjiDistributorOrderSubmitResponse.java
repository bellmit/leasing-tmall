package com.taobao.api.response;

import com.taobao.api.TaobaoObject;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: alibaba.tianji.distributor.order.submit response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlibabaTianjiDistributorOrderSubmitResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3426856666267199145L;

	/** 
	 * 接口结果
	 */
	@ApiField("result")
	private CommonResult result;


	public void setResult(CommonResult result) {
		this.result = result;
	}
	public CommonResult getResult( ) {
		return this.result;
	}
	
	/**
 * 接口结果
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class CommonResult extends TaobaoObject {

	private static final long serialVersionUID = 3521987476396231378L;

	/**
		 * 错误码
		 */
		@ApiField("code")
		private String code;
		/**
		 * 错误描述
		 */
		@ApiField("desc")
		private String desc;
		/**
		 * 是否成功
		 */
		@ApiField("success")
		private Boolean success;
	

	public String getCode() {
			return this.code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getDesc() {
			return this.desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}

}



}

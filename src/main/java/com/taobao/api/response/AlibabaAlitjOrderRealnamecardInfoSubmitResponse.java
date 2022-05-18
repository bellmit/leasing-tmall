package com.taobao.api.response;

import com.taobao.api.TaobaoObject;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: alibaba.alitj.order.realnamecard.info.submit response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlibabaAlitjOrderRealnamecardInfoSubmitResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4454935529783532218L;

	/** 
	 * result
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
 * result
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class CommonResult extends TaobaoObject {

	private static final long serialVersionUID = 1738241985238427752L;

	/**
		 * 目前暂无特殊作用
		 */
		@ApiField("code")
		private String code;
		/**
		 * 保存操作失败原因
		 */
		@ApiField("desc")
		private String desc;
		/**
		 * 操作成功或失败，只有当这个参数为True时，才表示数据已真正提交成功。
		 */
		@ApiField("model")
		private Boolean model;
		/**
		 * 操作是否被正常处理
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
		public Boolean getModel() {
			return this.model;
		}
		public void setModel(Boolean model) {
			this.model = model;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}

}



}

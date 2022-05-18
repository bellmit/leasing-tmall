package com.taobao.api.response;

import com.taobao.api.TaobaoObject;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: cainiao.cloudprint.mystdtemplates.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoCloudprintMystdtemplatesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4131423218358611423L;

	/** 
	 * 返回结果
	 */
	@ApiField("result")
	private CloudPrintBaseResult result;


	public void setResult(CloudPrintBaseResult result) {
		this.result = result;
	}
	public CloudPrintBaseResult getResult( ) {
		return this.result;
	}
	
	/**
 * keys
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class KeyResult extends TaobaoObject {

	private static final long serialVersionUID = 8676442666291576922L;

	/**
		 * key的名称
		 */
		@ApiField("key_name")
		private String keyName;
	

	public String getKeyName() {
			return this.keyName;
		}
		public void setKeyName(String keyName) {
			this.keyName = keyName;
		}

}

	/**
 * 用户使用的模板数据
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class UserTemplateDo extends TaobaoObject {

	private static final long serialVersionUID = 6691749912449679877L;

	/**
		 * keys
		 */
		@ApiListField("keys")
		@ApiField("key_result")
		private List<KeyResult> keys;
		/**
		 * 用户使用模板的id
		 */
		@ApiField("user_std_template_id")
		private Long userStdTemplateId;
		/**
		 * 用户使用模板名称
		 */
		@ApiField("user_std_template_name")
		private String userStdTemplateName;
		/**
		 * 用户使用模板的url
		 */
		@ApiField("user_std_template_url")
		private String userStdTemplateUrl;
	

	public List<KeyResult> getKeys() {
			return this.keys;
		}
		public void setKeys(List<KeyResult> keys) {
			this.keys = keys;
		}
		public Long getUserStdTemplateId() {
			return this.userStdTemplateId;
		}
		public void setUserStdTemplateId(Long userStdTemplateId) {
			this.userStdTemplateId = userStdTemplateId;
		}
		public String getUserStdTemplateName() {
			return this.userStdTemplateName;
		}
		public void setUserStdTemplateName(String userStdTemplateName) {
			this.userStdTemplateName = userStdTemplateName;
		}
		public String getUserStdTemplateUrl() {
			return this.userStdTemplateUrl;
		}
		public void setUserStdTemplateUrl(String userStdTemplateUrl) {
			this.userStdTemplateUrl = userStdTemplateUrl;
		}

}

	/**
 * 所有cp的数据
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class UserTemplateResult extends TaobaoObject {

	private static final long serialVersionUID = 8253549942824923712L;

	/**
		 * cp编码
		 */
		@ApiField("cp_code")
		private String cpCode;
		/**
		 * 用户使用的模板数据
		 */
		@ApiListField("user_std_templates")
		@ApiField("user_template_do")
		private List<UserTemplateDo> userStdTemplates;
	

	public String getCpCode() {
			return this.cpCode;
		}
		public void setCpCode(String cpCode) {
			this.cpCode = cpCode;
		}
		public List<UserTemplateDo> getUserStdTemplates() {
			return this.userStdTemplates;
		}
		public void setUserStdTemplates(List<UserTemplateDo> userStdTemplates) {
			this.userStdTemplates = userStdTemplates;
		}

}

	/**
 * 返回结果
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class CloudPrintBaseResult extends TaobaoObject {

	private static final long serialVersionUID = 1188255287814894548L;

	/**
		 * 所有cp的数据
		 */
		@ApiListField("datas")
		@ApiField("user_template_result")
		private List<UserTemplateResult> datas;
		/**
		 * 错误码
		 */
		@ApiField("error_code")
		private String errorCode;
		/**
		 * 错误消息
		 */
		@ApiField("error_message")
		private String errorMessage;
		/**
		 * 是否成功
		 */
		@ApiField("success")
		private Boolean success;
	

	public List<UserTemplateResult> getDatas() {
			return this.datas;
		}
		public void setDatas(List<UserTemplateResult> datas) {
			this.datas = datas;
		}
		public String getErrorCode() {
			return this.errorCode;
		}
		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}
		public String getErrorMessage() {
			return this.errorMessage;
		}
		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}

}



}

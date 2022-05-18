package com.taobao.api.response;

import com.taobao.api.TaobaoObject;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: cainiao.cloudprint.isvtemplates.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoCloudprintIsvtemplatesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5546349672326675288L;

	/** 
	 * result
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
 * 模板的keys
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class KeyResult extends TaobaoObject {

	private static final long serialVersionUID = 8249591617376195923L;

	/**
		 * key名称
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
 * data
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class CustomTemplateResult extends TaobaoObject {

	private static final long serialVersionUID = 7179165893918923169L;

	/**
		 * isv模板的id
		 */
		@ApiField("isv_template_id")
		private Long isvTemplateId;
		/**
		 * isv模板的名称
		 */
		@ApiField("isv_template_name")
		private String isvTemplateName;
		/**
		 * isv模板的url
		 */
		@ApiField("isv_template_url")
		private String isvTemplateUrl;
		/**
		 * 模板的keys
		 */
		@ApiListField("keys")
		@ApiField("key_result")
		private List<KeyResult> keys;
		/**
		 * 版本号
		 */
		@ApiField("version")
		private String version;
	

	public Long getIsvTemplateId() {
			return this.isvTemplateId;
		}
		public void setIsvTemplateId(Long isvTemplateId) {
			this.isvTemplateId = isvTemplateId;
		}
		public String getIsvTemplateName() {
			return this.isvTemplateName;
		}
		public void setIsvTemplateName(String isvTemplateName) {
			this.isvTemplateName = isvTemplateName;
		}
		public String getIsvTemplateUrl() {
			return this.isvTemplateUrl;
		}
		public void setIsvTemplateUrl(String isvTemplateUrl) {
			this.isvTemplateUrl = isvTemplateUrl;
		}
		public List<KeyResult> getKeys() {
			return this.keys;
		}
		public void setKeys(List<KeyResult> keys) {
			this.keys = keys;
		}
		public String getVersion() {
			return this.version;
		}
		public void setVersion(String version) {
			this.version = version;
		}

}

	/**
 * result
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class CloudPrintBaseResult extends TaobaoObject {

	private static final long serialVersionUID = 1212362629985618135L;

	/**
		 * data
		 */
		@ApiListField("datas")
		@ApiField("custom_template_result")
		private List<CustomTemplateResult> datas;
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
	

	public List<CustomTemplateResult> getDatas() {
			return this.datas;
		}
		public void setDatas(List<CustomTemplateResult> datas) {
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

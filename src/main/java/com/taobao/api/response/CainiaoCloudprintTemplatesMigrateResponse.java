package com.taobao.api.response;

import com.taobao.api.TaobaoObject;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: cainiao.cloudprint.templates.migrate response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoCloudprintTemplatesMigrateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3233439527351153599L;

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
 * 变量
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class KeyResult extends TaobaoObject {

	private static final long serialVersionUID = 3444534777974556322L;

	/**
		 * 变量名称
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
public static class CustomAreaResult extends TaobaoObject {

	private static final long serialVersionUID = 1493125292166781537L;

	/**
		 * 自定义区id
		 */
		@ApiField("custom_area_id")
		private Long customAreaId;
		/**
		 * 自定义区名称
		 */
		@ApiField("custom_area_name")
		private String customAreaName;
		/**
		 * 自定义区url
		 */
		@ApiField("custom_area_url")
		private String customAreaUrl;
		/**
		 * 变量
		 */
		@ApiListField("keys")
		@ApiField("key_result")
		private List<KeyResult> keys;
		/**
		 * 标准模板名称
		 */
		@ApiField("standard_template_id")
		private Long standardTemplateId;
		/**
		 * 标准模板url
		 */
		@ApiField("standard_template_url")
		private String standardTemplateUrl;
		/**
		 * 用户模板id，等同于mystdtemplates.get中返回的用户模板id
		 */
		@ApiField("user_template_id")
		private Long userTemplateId;
	

	public Long getCustomAreaId() {
			return this.customAreaId;
		}
		public void setCustomAreaId(Long customAreaId) {
			this.customAreaId = customAreaId;
		}
		public String getCustomAreaName() {
			return this.customAreaName;
		}
		public void setCustomAreaName(String customAreaName) {
			this.customAreaName = customAreaName;
		}
		public String getCustomAreaUrl() {
			return this.customAreaUrl;
		}
		public void setCustomAreaUrl(String customAreaUrl) {
			this.customAreaUrl = customAreaUrl;
		}
		public List<KeyResult> getKeys() {
			return this.keys;
		}
		public void setKeys(List<KeyResult> keys) {
			this.keys = keys;
		}
		public Long getStandardTemplateId() {
			return this.standardTemplateId;
		}
		public void setStandardTemplateId(Long standardTemplateId) {
			this.standardTemplateId = standardTemplateId;
		}
		public String getStandardTemplateUrl() {
			return this.standardTemplateUrl;
		}
		public void setStandardTemplateUrl(String standardTemplateUrl) {
			this.standardTemplateUrl = standardTemplateUrl;
		}
		public Long getUserTemplateId() {
			return this.userTemplateId;
		}
		public void setUserTemplateId(Long userTemplateId) {
			this.userTemplateId = userTemplateId;
		}

}

	/**
 * result
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class CloudPrintBaseResult extends TaobaoObject {

	private static final long serialVersionUID = 8816558389548522387L;

	/**
		 * data
		 */
		@ApiField("data")
		private CustomAreaResult data;
		/**
		 * errorCode
		 */
		@ApiField("error_code")
		private String errorCode;
		/**
		 * errorMessage
		 */
		@ApiField("error_message")
		private String errorMessage;
		/**
		 * success
		 */
		@ApiField("success")
		private Boolean success;
	

	public CustomAreaResult getData() {
			return this.data;
		}
		public void setData(CustomAreaResult data) {
			this.data = data;
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

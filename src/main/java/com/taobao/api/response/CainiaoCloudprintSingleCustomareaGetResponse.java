package com.taobao.api.response;

import com.taobao.api.TaobaoObject;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: cainiao.cloudprint.single.customarea.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoCloudprintSingleCustomareaGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7535839289927294495L;

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
 * keys
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class KeyResult extends TaobaoObject {

	private static final long serialVersionUID = 1691847866166678934L;

	/**
		 * 动态key的名称
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
public static class CustomAreaSingleResult extends TaobaoObject {

	private static final long serialVersionUID = 2554431873274828379L;

	/**
		 * 自定义区id
		 */
		@ApiField("custom_area_id")
		private Long customAreaId;
		/**
		 * 自定义区内容的URL
		 */
		@ApiField("custom_area_url")
		private String customAreaUrl;
		/**
		 * keys
		 */
		@ApiListField("keys")
		@ApiField("key_result")
		private List<KeyResult> keys;
	

	public Long getCustomAreaId() {
			return this.customAreaId;
		}
		public void setCustomAreaId(Long customAreaId) {
			this.customAreaId = customAreaId;
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

}

	/**
 * result
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class CloudPrintBaseResult extends TaobaoObject {

	private static final long serialVersionUID = 6297724886942563946L;

	/**
		 * data
		 */
		@ApiField("data")
		private CustomAreaSingleResult data;
		/**
		 * errorCode
		 */
		@ApiField("error_code")
		private String errorCode;
		/**
		 * 错误消息
		 */
		@ApiField("error_message")
		private String errorMessage;
		/**
		 * success
		 */
		@ApiField("success")
		private Boolean success;
	

	public CustomAreaSingleResult getData() {
			return this.data;
		}
		public void setData(CustomAreaSingleResult data) {
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

package com.taobao.api.response;

import com.taobao.api.TaobaoObject;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: cainiao.cloudprint.customares.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoCloudprintCustomaresGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8597587598144243185L;

	/** 
	 * 结果
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

	private static final long serialVersionUID = 3237469521945259499L;

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
 * 数据
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class CustomAreaResult extends TaobaoObject {

	private static final long serialVersionUID = 3422358655265756535L;

	/**
		 * 自定义区id
		 */
		@ApiField("custom_area_id")
		private Long customAreaId;
		/**
		 * 自定义区url
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
 * 结果
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class CloudPrintBaseResult extends TaobaoObject {

	private static final long serialVersionUID = 3497242172371642257L;

	/**
		 * 数据
		 */
		@ApiListField("datas")
		@ApiField("custom_area_result")
		private List<CustomAreaResult> datas;
		/**
		 * 系统自动生成
		 */
		@ApiField("error_code")
		private String errorCode;
		/**
		 * 系统自动生成
		 */
		@ApiField("error_message")
		private String errorMessage;
		/**
		 * 系统自动生成
		 */
		@ApiField("success")
		private Boolean success;
	

	public List<CustomAreaResult> getDatas() {
			return this.datas;
		}
		public void setDatas(List<CustomAreaResult> datas) {
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

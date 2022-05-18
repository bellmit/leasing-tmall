package com.taobao.api.response;

import com.taobao.api.TaobaoObject;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: cainiao.cloudprint.isv.resources.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoCloudprintIsvResourcesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6616367979183272248L;

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
 * data
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class IsvResourceDo extends TaobaoObject {

	private static final long serialVersionUID = 6831347226564188134L;

	/**
		 * 资源内容（当资源类型为TEMPLATE时，为空）
		 */
		@ApiField("resource_content")
		private String resourceContent;
		/**
		 * 资源id
		 */
		@ApiField("resource_id")
		private Long resourceId;
		/**
		 * 资源名称
		 */
		@ApiField("resource_name")
		private String resourceName;
		/**
		 * 资源类型
		 */
		@ApiField("resource_type")
		private String resourceType;
		/**
		 * 资源url（当资源类型为打印项时，为空）
		 */
		@ApiField("resource_url")
		private String resourceUrl;
	

	public String getResourceContent() {
			return this.resourceContent;
		}
		public void setResourceContent(String resourceContent) {
			this.resourceContent = resourceContent;
		}
		public Long getResourceId() {
			return this.resourceId;
		}
		public void setResourceId(Long resourceId) {
			this.resourceId = resourceId;
		}
		public String getResourceName() {
			return this.resourceName;
		}
		public void setResourceName(String resourceName) {
			this.resourceName = resourceName;
		}
		public String getResourceType() {
			return this.resourceType;
		}
		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}
		public String getResourceUrl() {
			return this.resourceUrl;
		}
		public void setResourceUrl(String resourceUrl) {
			this.resourceUrl = resourceUrl;
		}

}

	/**
 * result
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class CloudPrintBaseResult extends TaobaoObject {

	private static final long serialVersionUID = 3623538492962488198L;

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
		 * data
		 */
		@ApiListField("resource_list")
		@ApiField("isv_resource_do")
		private List<IsvResourceDo> resourceList;
		/**
		 * 状态
		 */
		@ApiField("success")
		private Boolean success;
	

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
		public List<IsvResourceDo> getResourceList() {
			return this.resourceList;
		}
		public void setResourceList(List<IsvResourceDo> resourceList) {
			this.resourceList = resourceList;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}

}



}

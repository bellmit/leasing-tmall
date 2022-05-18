package com.taobao.api.response;

import com.taobao.api.TaobaoObject;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: taobao.location.relation.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class LocationRelationQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2713794836723982682L;

	/** 
	 * result
	 */
	@ApiField("result")
	private SingleResult result;


	public void setResult(SingleResult result) {
		this.result = result;
	}
	public SingleResult getResult( ) {
		return this.result;
	}
	
	/**
 * 地点关系
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class LocationRelationDto extends TaobaoObject {

	private static final long serialVersionUID = 7295343233589725389L;

	/**
		 * 实体类型 2：仓库  6：门店
		 */
		@ApiField("source_inv_store_type")
		private Long sourceInvStoreType;
		/**
		 * 实体code
		 */
		@ApiField("source_store_code")
		private String sourceStoreCode;
		/**
		 * 状态 0 正常  -1 删除
		 */
		@ApiField("status")
		private Long status;
		/**
		 * 实体类型 2：仓库  6：门店
		 */
		@ApiField("target_inv_store_type")
		private Long targetInvStoreType;
		/**
		 * 实体code
		 */
		@ApiField("target_store_code")
		private String targetStoreCode;
	

	public Long getSourceInvStoreType() {
			return this.sourceInvStoreType;
		}
		public void setSourceInvStoreType(Long sourceInvStoreType) {
			this.sourceInvStoreType = sourceInvStoreType;
		}
		public String getSourceStoreCode() {
			return this.sourceStoreCode;
		}
		public void setSourceStoreCode(String sourceStoreCode) {
			this.sourceStoreCode = sourceStoreCode;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
		public Long getTargetInvStoreType() {
			return this.targetInvStoreType;
		}
		public void setTargetInvStoreType(Long targetInvStoreType) {
			this.targetInvStoreType = targetInvStoreType;
		}
		public String getTargetStoreCode() {
			return this.targetStoreCode;
		}
		public void setTargetStoreCode(String targetStoreCode) {
			this.targetStoreCode = targetStoreCode;
		}

}

	/**
 * result
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class SingleResult extends TaobaoObject {

	private static final long serialVersionUID = 6252561329758365555L;

	/**
		 * 错误码
		 */
		@ApiField("error_code")
		private String errorCode;
		/**
		 * 错误信息
		 */
		@ApiField("error_message")
		private String errorMessage;
		/**
		 * 地点关系
		 */
		@ApiListField("location_relation_list")
		@ApiField("location_relation_dto")
		private List<LocationRelationDto> locationRelationList;
		/**
		 * 是否成功
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
		public List<LocationRelationDto> getLocationRelationList() {
			return this.locationRelationList;
		}
		public void setLocationRelationList(List<LocationRelationDto> locationRelationList) {
			this.locationRelationList = locationRelationList;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}

}



}

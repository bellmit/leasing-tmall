package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.LocationRelationQueryResponse;

import java.util.Map;

/**
 * TOP API: taobao.location.relation.query request
 * 
 * @author top auto create
 * @since 1.0, 2017.04.07
 */
public class LocationRelationQueryRequest extends BaseTaobaoRequest<LocationRelationQueryResponse> {
	
	

	/** 
	* 关系查询
	 */
	private String locationRelation;

	public void setLocationRelation(String locationRelation) {
		this.locationRelation = locationRelation;
	}

	public void setLocationRelation(LocationRelationDto locationRelation) {
		this.locationRelation = new JSONWriter(false,true).write(locationRelation);
	}

	public String getLocationRelation() {
		return this.locationRelation;
	}

	public String getApiMethodName() {
		return "taobao.location.relation.query";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("location_relation", this.locationRelation);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<LocationRelationQueryResponse> getResponseClass() {
		return LocationRelationQueryResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
 * 关系查询
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class LocationRelationDto extends TaobaoObject {

	private static final long serialVersionUID = 1384319991582974397L;

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
		 * 实体类型 2：仓库  6：门店 （target,sorce 二选一填写，都填写报错）
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


}
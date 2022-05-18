package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.LocationRelationEditResponse;

import java.util.List;
import java.util.Map;

/**
 * TOP API: taobao.location.relation.edit request
 * 
 * @author top auto create
 * @since 1.0, 2017.04.14
 */
public class LocationRelationEditRequest extends BaseTaobaoRequest<LocationRelationEditResponse> {
	
	

	/** 
	* 关系对象列表
	 */
	private String locationRelationList;

	public void setLocationRelationList(String locationRelationList) {
		this.locationRelationList = locationRelationList;
	}

	public void setLocationRelationList(List<LocationRelationDto> locationRelationList) {
		this.locationRelationList = new JSONWriter(false,true).write(locationRelationList);
	}

	public String getLocationRelationList() {
		return this.locationRelationList;
	}

	public String getApiMethodName() {
		return "taobao.location.relation.edit";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("location_relation_list", this.locationRelationList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<LocationRelationEditResponse> getResponseClass() {
		return LocationRelationEditResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(locationRelationList, 20, "locationRelationList");
	}
	
	/**
 * 关系对象列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class LocationRelationDto extends TaobaoObject {

	private static final long serialVersionUID = 8421148372788329615L;

	/**
		 * 实体类型 2：仓库 6：门店
		 */
		@ApiField("source_inv_store_type")
		private Long sourceInvStoreType;
		/**
		 * 实体code
		 */
		@ApiField("source_store_code")
		private String sourceStoreCode;
		/**
		 * 状态  0 正常  -1 删除
		 */
		@ApiField("status")
		private Long status;
		/**
		 * 实体类型 2：仓库 6：门店
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


}
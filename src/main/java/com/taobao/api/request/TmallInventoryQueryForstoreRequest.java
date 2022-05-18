package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.TmallInventoryQueryForstoreResponse;

import java.util.List;
import java.util.Map;

/**
 * TOP API: tmall.inventory.query.forstore request
 * 
 * @author top auto create
 * @since 1.0, 2017.04.12
 */
public class TmallInventoryQueryForstoreRequest extends BaseTaobaoRequest<TmallInventoryQueryForstoreResponse> {
	
	

	/** 
	* 查询列表
	 */
	private String paramList;

	public void setParamList(String paramList) {
		this.paramList = paramList;
	}

	public void setParamList(List<InventoryQueryForStoreRequest> paramList) {
		this.paramList = new JSONWriter(false,true).write(paramList);
	}

	public String getParamList() {
		return this.paramList;
	}

	public String getApiMethodName() {
		return "tmall.inventory.query.forstore";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("param_list", this.paramList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallInventoryQueryForstoreResponse> getResponseClass() {
		return TmallInventoryQueryForstoreResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(paramList, 15, "paramList");
	}
	
	/**
 * 查询列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class InventoryQueryForStoreRequest extends TaobaoObject {

	private static final long serialVersionUID = 6672516796651918164L;

	/**
		 * 实体类型  2：仓库类型， 6：门店类型
		 */
		@ApiField("inv_store_type")
		private Long invStoreType;
		/**
		 * 后端商品code
		 */
		@ApiField("sc_item_code")
		private String scItemCode;
		/**
		 * 后端商品id
		 */
		@ApiField("sc_item_id")
		private Long scItemId;
		/**
		 * 仓库code
		 */
		@ApiField("store_code")
		private String storeCode;
	

	public Long getInvStoreType() {
			return this.invStoreType;
		}
		public void setInvStoreType(Long invStoreType) {
			this.invStoreType = invStoreType;
		}
		public String getScItemCode() {
			return this.scItemCode;
		}
		public void setScItemCode(String scItemCode) {
			this.scItemCode = scItemCode;
		}
		public Long getScItemId() {
			return this.scItemId;
		}
		public void setScItemId(Long scItemId) {
			this.scItemId = scItemId;
		}
		public String getStoreCode() {
			return this.storeCode;
		}
		public void setStoreCode(String storeCode) {
			this.storeCode = storeCode;
		}

}


}
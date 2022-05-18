package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.InventoryWarehouseQueryResponse;

import java.util.Map;

/**
 * TOP API: taobao.inventory.warehouse.query request
 * 
 * @author top auto create
 * @since 1.0, 2016.07.07
 */
public class InventoryWarehouseQueryRequest extends BaseTaobaoRequest<InventoryWarehouseQueryResponse> {
	
	

	/** 
	* 页码
	 */
	private Long pageNo;

	/** 
	* 页大小
	 */
	private Long pageSize;

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public String getApiMethodName() {
		return "taobao.inventory.warehouse.query";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<InventoryWarehouseQueryResponse> getResponseClass() {
		return InventoryWarehouseQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(pageNo, "pageNo");
		RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
	}
	

}
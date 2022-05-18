package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.DrugShopListResponse;

import java.util.Map;

/**
 * TOP API: taobao.drug.shop.list request
 * 
 * @author top auto create
 * @since 1.0, 2016.08.25
 */
public class DrugShopListRequest extends BaseTaobaoRequest<DrugShopListResponse> {
	
	

	/** 
	* 查询关键字
	 */
	private String keywords;

	/** 
	* 页码
	 */
	private Long page;

	/** 
	* 每页条数
	 */
	private Long pageSize;

	/** 
	* 店铺状态，歇业：0，营业：1，所有：-1
	 */
	private Long status;

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getKeywords() {
		return this.keywords;
	}

	public void setPage(Long page) {
		this.page = page;
	}

	public Long getPage() {
		return this.page;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getStatus() {
		return this.status;
	}

	public String getApiMethodName() {
		return "taobao.drug.shop.list";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("keywords", this.keywords);
		txtParams.put("page", this.page);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("status", this.status);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<DrugShopListResponse> getResponseClass() {
		return DrugShopListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(page, "page");
		RequestCheckUtils.checkMinValue(page, 1L, "page");
		RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
		RequestCheckUtils.checkMaxValue(pageSize, 20L, "pageSize");
		RequestCheckUtils.checkMinValue(pageSize, 1L, "pageSize");
	}
	

}
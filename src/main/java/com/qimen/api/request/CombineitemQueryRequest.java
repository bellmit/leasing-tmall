package com.qimen.api.request;

import com.qimen.api.QimenRequest;
import com.qimen.api.response.CombineitemQueryResponse;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;

import java.util.Map;

/**
 * TOP API: taobao.qimen.combineitem.query request
 * 
 * @author top auto create
 * @since 1.0, 2017.04.28
 */
public class CombineitemQueryRequest extends QimenRequest<CombineitemQueryResponse> {
	
	

	/** 
	* 扩展属性
	 */
	private Map extendProps;

	/**
	* 奇门仓储字段
	 */
	private String itemId;

	/**
	* 奇门仓储字段
	 */
	private String ownerCode;

	public void setExtendProps(Map extendProps) {
		this.extendProps = extendProps;
	}

	public Map getExtendProps() {
		return this.extendProps;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemId() {
		return this.itemId;
	}

	public void setOwnerCode(String ownerCode) {
		this.ownerCode = ownerCode;
	}

	public String getOwnerCode() {
		return this.ownerCode;
	}

	public String getApiMethodName() {
		return "taobao.qimen.combineitem.query";
	}

	public Class<CombineitemQueryResponse> getResponseClass() {
		return CombineitemQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxLength(itemId, 50, "itemId");
		RequestCheckUtils.checkMaxLength(ownerCode, 50, "ownerCode");
	}
	

}
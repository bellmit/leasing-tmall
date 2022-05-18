package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Store;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: taobao.inventory.store.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class InventoryStoreQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1532363294953182951L;

	/** 
	 * 仓库列表
	 */
	@ApiListField("store_list")
	@ApiField("store")
	private List<Store> storeList;


	public void setStoreList(List<Store> storeList) {
		this.storeList = storeList;
	}
	public List<Store> getStoreList( ) {
		return this.storeList;
	}
	


}

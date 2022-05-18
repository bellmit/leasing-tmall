package com.qimen.api.response;

import com.qimen.api.QimenResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.qimen.singleitem.synchronize response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class SingleitemSynchronizeResponse extends QimenResponse {

	private static final long serialVersionUID = 3495131285251476359L;

	/** 
	 * 仓储系统商品Id(当这个字段不为空的时候;所有erp传输的时候都碰到itemid必传)
	 */
	@ApiField("itemId")
	private String itemId;


	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId( ) {
		return this.itemId;
	}
	


}

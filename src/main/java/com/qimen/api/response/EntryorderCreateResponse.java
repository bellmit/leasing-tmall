package com.qimen.api.response;

import com.qimen.api.QimenResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.qimen.entryorder.create response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class EntryorderCreateResponse extends QimenResponse {

	private static final long serialVersionUID = 3428274835995381842L;

	/** 
	 * 仓储系统入库单编码
	 */
	@ApiField("entryOrderId")
	private String entryOrderId;


	public void setEntryOrderId(String entryOrderId) {
		this.entryOrderId = entryOrderId;
	}
	public String getEntryOrderId( ) {
		return this.entryOrderId;
	}
	


}

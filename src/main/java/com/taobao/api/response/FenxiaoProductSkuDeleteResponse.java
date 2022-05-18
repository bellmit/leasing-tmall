package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

/**
 * TOP API: taobao.fenxiao.product.sku.delete response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class FenxiaoProductSkuDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2494258819545441965L;

	/** 
	 * 操作时间
	 */
	@ApiField("created")
	private Date created;

	/** 
	 * 操作结果
	 */
	@ApiField("result")
	private Boolean result;


	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getCreated( ) {
		return this.created;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}
	


}

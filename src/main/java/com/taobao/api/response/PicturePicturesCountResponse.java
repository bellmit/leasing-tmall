package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.picture.pictures.count response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class PicturePicturesCountResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1266811842784839324L;

	/** 
	 * 查询的文件总数
	 */
	@ApiField("totals")
	private Long totals;


	public void setTotals(Long totals) {
		this.totals = totals;
	}
	public Long getTotals( ) {
		return this.totals;
	}
	


}

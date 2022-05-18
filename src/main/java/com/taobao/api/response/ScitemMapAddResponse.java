package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.scitem.map.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ScitemMapAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7638551477177968744L;

	/** 
	 * 接口调用返回结果信息：商家编码
	 */
	@ApiField("outer_code")
	private String outerCode;


	public void setOuterCode(String outerCode) {
		this.outerCode = outerCode;
	}
	public String getOuterCode( ) {
		return this.outerCode;
	}
	


}

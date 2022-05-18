package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.smartwl.assistant.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class SmartwlAssistantGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8572756956387645321L;

	/** 
	 * 物流商编码
	 */
	@ApiField("cp_code")
	private String cpCode;

	/** 
	 * 物流商Id
	 */
	@ApiField("cp_id")
	private Long cpId;

	/** 
	 * 物流商名称
	 */
	@ApiField("cp_name")
	private String cpName;


	public void setCpCode(String cpCode) {
		this.cpCode = cpCode;
	}
	public String getCpCode( ) {
		return this.cpCode;
	}

	public void setCpId(Long cpId) {
		this.cpId = cpId;
	}
	public Long getCpId( ) {
		return this.cpId;
	}

	public void setCpName(String cpName) {
		this.cpName = cpName;
	}
	public String getCpName( ) {
		return this.cpName;
	}
	


}

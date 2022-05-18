package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Duty;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: taobao.subuser.dutys.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class SubuserDutysGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3764293959473379279L;

	/** 
	 * 职务信息
	 */
	@ApiListField("dutys")
	@ApiField("duty")
	private List<Duty> dutys;


	public void setDutys(List<Duty> dutys) {
		this.dutys = dutys;
	}
	public List<Duty> getDutys( ) {
		return this.dutys;
	}
	


}

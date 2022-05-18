package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

import java.util.Date;

/**
 * TOP API: taobao.tmc.group.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmcGroupAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8237331545771618664L;

	/** 
	 * 创建时间
	 */
	@ApiField("created")
	private Date created;

	/** 
	 * 分组名称
	 */
	@ApiField("group_name")
	private String groupName;


	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getCreated( ) {
		return this.created;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getGroupName( ) {
		return this.groupName;
	}
	


}

package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.DisplayQualifications;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.item.qualification.display.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ItemQualificationDisplayGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4243913917184717383L;

	/** 
	 * 返回资质采集配置
	 */
	@ApiField("display_conf")
	private DisplayQualifications displayConf;


	public void setDisplayConf(DisplayQualifications displayConf) {
		this.displayConf = displayConf;
	}
	public DisplayQualifications getDisplayConf( ) {
		return this.displayConf;
	}
	


}

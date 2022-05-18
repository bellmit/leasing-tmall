package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SuiteConfDO;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: tmall.brandcat.suiteconf.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallBrandcatSuiteconfGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2769887634688764618L;

	/** 
	 * 套装的配置信息
	 */
	@ApiListField("suite_conf_list")
	@ApiField("suite_conf_d_o")
	private List<SuiteConfDO> suiteConfList;


	public void setSuiteConfList(List<SuiteConfDO> suiteConfList) {
		this.suiteConfList = suiteConfList;
	}
	public List<SuiteConfDO> getSuiteConfList( ) {
		return this.suiteConfList;
	}
	


}

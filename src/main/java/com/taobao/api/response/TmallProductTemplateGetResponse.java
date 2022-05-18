package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SpuTemplateDO;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: tmall.product.template.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallProductTemplateGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2225523266116832487L;

	/** 
	 * 见SpuTemplateDO说明
	 */
	@ApiField("template")
	private SpuTemplateDO template;


	public void setTemplate(SpuTemplateDO template) {
		this.template = template;
	}
	public SpuTemplateDO getTemplate( ) {
		return this.template;
	}
	


}

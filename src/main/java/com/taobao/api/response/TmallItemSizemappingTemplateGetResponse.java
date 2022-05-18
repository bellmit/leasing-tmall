package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SizeMappingTemplate;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: tmall.item.sizemapping.template.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallItemSizemappingTemplateGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3836669932619532558L;

	/** 
	 * 尺码表模板
	 */
	@ApiField("size_mapping_template")
	private SizeMappingTemplate sizeMappingTemplate;


	public void setSizeMappingTemplate(SizeMappingTemplate sizeMappingTemplate) {
		this.sizeMappingTemplate = sizeMappingTemplate;
	}
	public SizeMappingTemplate getSizeMappingTemplate( ) {
		return this.sizeMappingTemplate;
	}
	


}

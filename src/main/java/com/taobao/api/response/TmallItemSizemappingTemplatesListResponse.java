package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SizeMappingTemplate;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: tmall.item.sizemapping.templates.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallItemSizemappingTemplatesListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5834725632892858482L;

	/** 
	 * 尺码表模板列表
	 */
	@ApiListField("size_mapping_templates")
	@ApiField("size_mapping_template")
	private List<SizeMappingTemplate> sizeMappingTemplates;


	public void setSizeMappingTemplates(List<SizeMappingTemplate> sizeMappingTemplates) {
		this.sizeMappingTemplates = sizeMappingTemplates;
	}
	public List<SizeMappingTemplate> getSizeMappingTemplates( ) {
		return this.sizeMappingTemplates;
	}
	


}

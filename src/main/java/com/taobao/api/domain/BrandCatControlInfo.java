package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;


/**
 * 管控的类目以及品牌信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class BrandCatControlInfo extends TaobaoObject {

	private static final long serialVersionUID = 8226584963464178387L;

	/**
	 * 管控的品牌类目信息，一组列表
	 */
	@ApiListField("brand_cat_controls")
	@ApiField("brand_cat_control")
	private List<BrandCatControl> brandCatControls;


	public List<BrandCatControl> getBrandCatControls() {
		return this.brandCatControls;
	}
	public void setBrandCatControls(List<BrandCatControl> brandCatControls) {
		this.brandCatControls = brandCatControls;
	}

}

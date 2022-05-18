package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;


/**
 * 授权
 *
 * @author top auto create
 * @since 1.0, null
 */
public class SellerAuthorize extends TaobaoObject {

	private static final long serialVersionUID = 2549369229816726817L;

	/**
	 * 品牌列表
	 */
	@ApiListField("brands")
	@ApiField("brand")
	private List<Brand> brands;

	/**
	 * 类目列表
	 */
	@ApiListField("item_cats")
	@ApiField("item_cat")
	private List<ItemCat> itemCats;

	/**
	 * 被授权的新品类目列表
	 */
	@ApiListField("xinpin_item_cats")
	@ApiField("item_cat")
	private List<ItemCat> xinpinItemCats;


	public List<Brand> getBrands() {
		return this.brands;
	}
	public void setBrands(List<Brand> brands) {
		this.brands = brands;
	}

	public List<ItemCat> getItemCats() {
		return this.itemCats;
	}
	public void setItemCats(List<ItemCat> itemCats) {
		this.itemCats = itemCats;
	}

	public List<ItemCat> getXinpinItemCats() {
		return this.xinpinItemCats;
	}
	public void setXinpinItemCats(List<ItemCat> xinpinItemCats) {
		this.xinpinItemCats = xinpinItemCats;
	}

}

package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ShopCat;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: taobao.shopcats.list.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ShopcatsListGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2896567649829717562L;

	/** 
	 * 店铺类目列表信息
	 */
	@ApiListField("shop_cats")
	@ApiField("shop_cat")
	private List<ShopCat> shopCats;


	public void setShopCats(List<ShopCat> shopCats) {
		this.shopCats = shopCats;
	}
	public List<ShopCat> getShopCats( ) {
		return this.shopCats;
	}
	


}

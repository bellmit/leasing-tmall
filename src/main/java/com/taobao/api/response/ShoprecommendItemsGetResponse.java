package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.FavoriteItem;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: taobao.shoprecommend.items.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ShoprecommendItemsGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2339932326779889318L;

	/** 
	 * 返回与店铺关联的宝贝集合
	 */
	@ApiListField("favorite_items")
	@ApiField("favorite_item")
	private List<FavoriteItem> favoriteItems;


	public void setFavoriteItems(List<FavoriteItem> favoriteItems) {
		this.favoriteItems = favoriteItems;
	}
	public List<FavoriteItem> getFavoriteItems( ) {
		return this.favoriteItems;
	}
	


}

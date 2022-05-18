package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;


/**
 * 优惠信息对象
 *
 * @author top auto create
 * @since 1.0, null
 */
public class PromotionDisplayTop extends TaobaoObject {

	private static final long serialVersionUID = 8735452116917119361L;

	/**
	 * 单品级优惠信息
	 */
	@ApiListField("promotion_in_item")
	@ApiField("promotion_in_item")
	private List<PromotionInItem> promotionInItem;

	/**
	 * 店铺级优惠信息
	 */
	@ApiListField("promotion_in_shop")
	@ApiField("promotion_in_shop")
	private List<PromotionInShop> promotionInShop;


	public List<PromotionInItem> getPromotionInItem() {
		return this.promotionInItem;
	}
	public void setPromotionInItem(List<PromotionInItem> promotionInItem) {
		this.promotionInItem = promotionInItem;
	}

	public List<PromotionInShop> getPromotionInShop() {
		return this.promotionInShop;
	}
	public void setPromotionInShop(List<PromotionInShop> promotionInShop) {
		this.promotionInShop = promotionInShop;
	}

}

package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SellerCat;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: taobao.sellercats.list.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class SellercatsListGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1497594916541152276L;

	/** 
	 * 卖家自定义类目
	 */
	@ApiListField("seller_cats")
	@ApiField("seller_cat")
	private List<SellerCat> sellerCats;


	public void setSellerCats(List<SellerCat> sellerCats) {
		this.sellerCats = sellerCats;
	}
	public List<SellerCat> getSellerCats( ) {
		return this.sellerCats;
	}
	


}

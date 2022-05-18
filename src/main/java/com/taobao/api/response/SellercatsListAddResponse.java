package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SellerCat;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.sellercats.list.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class SellercatsListAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3541492747852466946L;

	/** 
	 * 返回seller_cat数据结构中的：cid,created
	 */
	@ApiField("seller_cat")
	private SellerCat sellerCat;


	public void setSellerCat(SellerCat sellerCat) {
		this.sellerCat = sellerCat;
	}
	public SellerCat getSellerCat( ) {
		return this.sellerCat;
	}
	


}

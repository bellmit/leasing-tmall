package com.taobao.api.response;

import com.taobao.api.TaobaoObject;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.shop.remainshowcase.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ShopRemainshowcaseGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6618243362247469415L;

	/** 
	 * 支持返回剩余橱窗数量，已用橱窗数量，总橱窗数量
	 */
	@ApiField("shop")
	private RemainCountShop shop;


	public void setShop(RemainCountShop shop) {
		this.shop = shop;
	}
	public RemainCountShop getShop( ) {
		return this.shop;
	}
	
	/**
 * 支持返回剩余橱窗数量，已用橱窗数量，总橱窗数量
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class RemainCountShop extends TaobaoObject {

	private static final long serialVersionUID = 1523627513976493188L;

	/**
		 * 总橱窗数量，对于C卖家返回总橱窗数，对于B卖家返回0（只有taobao.shop.remainshowcase.get可以返回）
		 */
		@ApiField("all_count")
		private Long allCount;
		/**
		 * 已用的橱窗数量，对于C卖家返回已使用的橱窗数，对于B卖家返回-1（只有taobao.shop.remainshowcase.get可以返回）
		 */
		@ApiField("remain_count")
		private Long remainCount;
		/**
		 * 剩余橱窗数量，对于C卖家返回剩余橱窗数，对于B卖家返回-1（只有taobao.shop.remainshowcase.get可以返回）
		 */
		@ApiField("used_count")
		private Long usedCount;
	

	public Long getAllCount() {
			return this.allCount;
		}
		public void setAllCount(Long allCount) {
			this.allCount = allCount;
		}
		public Long getRemainCount() {
			return this.remainCount;
		}
		public void setRemainCount(Long remainCount) {
			this.remainCount = remainCount;
		}
		public Long getUsedCount() {
			return this.usedCount;
		}
		public void setUsedCount(Long usedCount) {
			this.usedCount = usedCount;
		}

}



}

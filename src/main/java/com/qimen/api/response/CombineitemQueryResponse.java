package com.qimen.api.response;

import com.qimen.api.QimenResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: taobao.qimen.combineitem.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CombineitemQueryResponse extends QimenResponse {

	private static final long serialVersionUID = 2191393141949846663L;

	/** 
	 * 奇门仓储字段
	 */
	@ApiListField("combItems")
	@ApiField("comb_item")
	private List<CombItem> combItems;


	public void setCombItems(List<CombItem> combItems) {
		this.combItems = combItems;
	}
	public List<CombItem> getCombItems( ) {
		return this.combItems;
	}
	
	/**
 * 奇门仓储字段
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class CombItem {

	/**
		 * 奇门仓储字段
		 */
		@ApiField("count")
		private String count;
		/**
		 * 奇门仓储字段
		 */
		@ApiField("itemId")
		private String itemId;
	

	public String getCount() {
			return this.count;
		}
		public void setCount(String count) {
			this.count = count;
		}
		public String getItemId() {
			return this.itemId;
		}
		public void setItemId(String itemId) {
			this.itemId = itemId;
		}

}



}

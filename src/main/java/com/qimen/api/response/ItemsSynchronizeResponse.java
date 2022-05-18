package com.qimen.api.response;

import com.qimen.api.QimenResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: taobao.qimen.items.synchronize response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ItemsSynchronizeResponse extends QimenResponse {

	private static final long serialVersionUID = 1362835253769793179L;

	/** 
	 * 商品同步批量接口中单商品信息
	 */
	@ApiListField("items")
	@ApiField("batch_item_syn_item")
	private List<BatchItemSynItem> items;


	public void setItems(List<BatchItemSynItem> items) {
		this.items = items;
	}
	public List<BatchItemSynItem> getItems( ) {
		return this.items;
	}
	
	/**
 * 商品同步批量接口中单商品信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class BatchItemSynItem {

	/**
		 * 没有同步成功的商品的编码
		 */
		@ApiField("itemCode")
		private String itemCode;
		/**
		 * 出错信息
		 */
		@ApiField("message")
		private String message;
	

	public String getItemCode() {
			return this.itemCode;
		}
		public void setItemCode(String itemCode) {
			this.itemCode = itemCode;
		}
		public String getMessage() {
			return this.message;
		}
		public void setMessage(String message) {
			this.message = message;
		}

}



}

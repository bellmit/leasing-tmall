package com.taobao.api.response;

import com.taobao.api.TaobaoObject;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: tmall.item.dapei.template.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallItemDapeiTemplateGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8718184866169961393L;

	/** 
	 * result
	 */
	@ApiField("result")
	private Result result;


	public void setResult(Result result) {
		this.result = result;
	}
	public Result getResult( ) {
		return this.result;
	}
	
	/**
 * items
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class DapeiTemplateItem extends TaobaoObject {

	private static final long serialVersionUID = 8528686288854111593L;

	/**
		 * img
		 */
		@ApiField("img")
		private String img;
		/**
		 * itemId
		 */
		@ApiField("item_id")
		private Long itemId;
	

	public String getImg() {
			return this.img;
		}
		public void setImg(String img) {
			this.img = img;
		}
		public Long getItemId() {
			return this.itemId;
		}
		public void setItemId(Long itemId) {
			this.itemId = itemId;
		}

}

	/**
 * firstResult
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Dapei extends TaobaoObject {

	private static final long serialVersionUID = 6785133921789354833L;

	/**
		 * desc
		 */
		@ApiField("desc")
		private String desc;
		/**
		 * id
		 */
		@ApiField("id")
		private Long id;
		/**
		 * items
		 */
		@ApiListField("items")
		@ApiField("dapei_template_item")
		private List<DapeiTemplateItem> items;
		/**
		 * title
		 */
		@ApiField("title")
		private String title;
		/**
		 * url
		 */
		@ApiField("url")
		private String url;
	

	public String getDesc() {
			return this.desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public List<DapeiTemplateItem> getItems() {
			return this.items;
		}
		public void setItems(List<DapeiTemplateItem> items) {
			this.items = items;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getUrl() {
			return this.url;
		}
		public void setUrl(String url) {
			this.url = url;
		}

}

	/**
 * result
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class Result extends TaobaoObject {

	private static final long serialVersionUID = 1825968579472318431L;

	/**
		 * error
		 */
		@ApiField("error")
		private Boolean error;
		/**
		 * errorCode
		 */
		@ApiField("error_code")
		private String errorCode;
		/**
		 * errorMsg
		 */
		@ApiField("error_msg")
		private String errorMsg;
		/**
		 * firstResult
		 */
		@ApiListField("results")
		@ApiField("dapei")
		private List<Dapei> results;
	

	public Boolean getError() {
			return this.error;
		}
		public void setError(Boolean error) {
			this.error = error;
		}
		public String getErrorCode() {
			return this.errorCode;
		}
		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}
		public String getErrorMsg() {
			return this.errorMsg;
		}
		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}
		public List<Dapei> getResults() {
			return this.results;
		}
		public void setResults(List<Dapei> results) {
			this.results = results;
		}

}



}

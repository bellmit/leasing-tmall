package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.TmallItemDapeiTemplateAddResponse;

import java.util.List;
import java.util.Map;

/**
 * TOP API: tmall.item.dapei.template.add request
 * 
 * @author top auto create
 * @since 1.0, 2016.07.06
 */
public class TmallItemDapeiTemplateAddRequest extends BaseTaobaoRequest<TmallItemDapeiTemplateAddResponse> {
	
	

	/** 
	* 搭配推荐描述
	 */
	private String desc;

	/** 
	* 2-4个商品
	 */
	private String items;

	/** 
	* 搭配名称
	 */
	private String title;

	/** 
	* 模特图片
	 */
	private String url;

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return this.desc;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public void setItems(List<DapeiItem> items) {
		this.items = new JSONWriter(false,true).write(items);
	}

	public String getItems() {
		return this.items;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrl() {
		return this.url;
	}

	public String getApiMethodName() {
		return "tmall.item.dapei.template.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("desc", this.desc);
		txtParams.put("items", this.items);
		txtParams.put("title", this.title);
		txtParams.put("url", this.url);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallItemDapeiTemplateAddResponse> getResponseClass() {
		return TmallItemDapeiTemplateAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(desc, "desc");
		RequestCheckUtils.checkObjectMaxListSize(items, 20, "items");
		RequestCheckUtils.checkNotEmpty(title, "title");
		RequestCheckUtils.checkNotEmpty(url, "url");
	}
	
	/**
 * 2-4个商品
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class DapeiItem extends TaobaoObject {

	private static final long serialVersionUID = 2277782381745574767L;

	/**
		 * 指定的商品图片
		 */
		@ApiField("img")
		private String img;
		/**
		 * 商品ID
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


}
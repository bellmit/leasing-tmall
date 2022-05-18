package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemQualificationDisplayGetResponse;

import java.util.Map;

/**
 * TOP API: taobao.item.qualification.display.get request
 * 
 * @author top auto create
 * @since 1.0, 2017.04.07
 */
public class ItemQualificationDisplayGetRequest extends BaseTaobaoRequest<ItemQualificationDisplayGetResponse> {
	
	

	/** 
	* 类目id
	 */
	private Long categoryId;

	/** 
	* 商品id
	 */
	private Long itemId;

	/** 
	* 参数列表，为key和value都是string的map的转化的json格式
	 */
	private String param;

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getCategoryId() {
		return this.categoryId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public void setParam(String param) {
		this.param = param;
	}

	public String getParam() {
		return this.param;
	}

	public String getApiMethodName() {
		return "taobao.item.qualification.display.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("category_id", this.categoryId);
		txtParams.put("item_id", this.itemId);
		txtParams.put("param", this.param);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ItemQualificationDisplayGetResponse> getResponseClass() {
		return ItemQualificationDisplayGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}
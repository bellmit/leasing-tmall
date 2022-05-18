package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TopSdkFeedbackUploadResponse;

import java.util.Map;

/**
 * TOP API: taobao.top.sdk.feedback.upload request
 * 
 * @author top auto create
 * @since 1.0, 2016.08.19
 */
public class TopSdkFeedbackUploadRequest extends BaseTaobaoRequest<TopSdkFeedbackUploadResponse> {
	
	

	/** 
	* 具体内容，json形式
	 */
	private String content;

	/** 
	* 1、回传加密信息
	 */
	private String type;

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return this.content;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public String getApiMethodName() {
		return "taobao.top.sdk.feedback.upload";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("content", this.content);
		txtParams.put("type", this.type);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TopSdkFeedbackUploadResponse> getResponseClass() {
		return TopSdkFeedbackUploadResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(type, "type");
	}
	

}
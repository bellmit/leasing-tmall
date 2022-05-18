package com.qimencloud.api;

import com.taobao.api.internal.util.TaobaoHashMap;

import java.io.Serializable;
import java.util.Map;

public class QimenCloudRequest implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3854127602152305985L;
	
	/**
	 * //api方法名称
	 */
	private String apiMethodName;
	
	/**
	 *  自定义URL参数
	 */
	private TaobaoHashMap queryParams;
	
	/**
	 * HTTP请求头参数
	 */
	protected Map<String, String> headerMap;
	
	/**
	 * 目标appKey
	 */
	private String targetAppKey;
	
	/**
	 * 请求时间戳（为空则用系统当前时间）
	 */
	private Long timestamp;
	
	public TaobaoHashMap getQueryParams() {
		return this.queryParams;
	}

	public void addQueryParam(String key, String value) {
		if (this.queryParams == null) {
			this.queryParams = new TaobaoHashMap();
		}
		this.queryParams.put(key, value);
	}

	public String getApiMethodName() {
		return apiMethodName;
	}

	public void setApiMethodName(String apiMethodName) {
		this.apiMethodName = apiMethodName;
	}

	public String getTargetAppKey() {
		return targetAppKey;
	}

	public void setTargetAppKey(String targetAppKey) {
		this.targetAppKey = targetAppKey;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	
	public Map<String, String> getHeaderMap() {
		if (this.headerMap == null) {
			this.headerMap = new TaobaoHashMap();
		}
		return this.headerMap;
	}

	public void setHeaderMap(Map<String, String> headerMap) {
		this.headerMap = headerMap;
	}
	
	protected Class<QimenCloudResponse> getResponseClass() {
		return QimenCloudResponse.class;
	}
}

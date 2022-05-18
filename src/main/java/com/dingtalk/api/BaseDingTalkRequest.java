package com.dingtalk.api;

import com.taobao.api.internal.util.TaobaoHashMap;

import java.util.Map;

/**
 * 基础TOP请求类，存放一些通用的请求参数。注：这个类不能随意增加get/set/is开头类的方法，否则会有可能和API业务级的参数冲突。
 * 
 * @author fengsheng
 * @since Sep 9, 2015
 * 
 * 为钉钉API请求参数个性化定制
 * @author chaohui.zch 2016年11月4日下午11:13:35
 */
public abstract class BaseDingTalkRequest<T extends DingTalkResponse> implements DingTalkRequest<T> {

	protected Map<String, String> headerMap; // HTTP请求头参数
	protected TaobaoHashMap udfParams; // 自定义表单参数
	protected Long timestamp; // 请求时间戳

	/**
	 * 添加URL自定义请求参数。
	 */
	public void putOtherTextParam(String key, String value) {
		if (this.udfParams == null) {
			this.udfParams = new TaobaoHashMap();
		}
		this.udfParams.put(key, value);
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

	/**
	 * 添加头部自定义请求参数。
	 */
	public void putHeaderParam(String key, String value) {
		getHeaderMap().put(key, value);
	}

	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

}

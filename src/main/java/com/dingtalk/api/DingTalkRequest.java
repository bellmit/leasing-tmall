package com.dingtalk.api;

import com.taobao.api.ApiRuleException;

import java.util.Map;

/**
 * TOP请求接口。
 * 
 * @author chaohui.zch 2016年11月4日下午4:41:21
 */
public interface DingTalkRequest<T extends DingTalkResponse> {

	/**
	 * 获取TOP的API名称。
	 * 
	 * @return 钉钉API名称
	 */
	public String getApiMethodName();

	/**
	 * 获取所有的Key-Value形式的文本请求参数集合。其中：
	 * <ul>
	 * <li>Key: 请求参数名</li>
	 * <li>Value: 请求参数值</li>
	 * </ul>
	 * 
	 * @return 文本请求参数集合
	 */
	public Map<String, String> getTextParams();

	/**
	 * 获取请求时间戳（为空则用系统当前时间）
	 */
	public Long getTimestamp();

	/**
	 * 获取具体响应实现类的定义。
	 */
	public Class<T> getResponseClass();

	/**
	 * 获取自定义HTTP请求头参数。
	 */
	public Map<String, String> getHeaderMap();

	/**
	 * 客户端参数检查，减少服务端无效调用。
	 */
	public void check() throws ApiRuleException;

}

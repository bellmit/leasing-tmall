package com.qimencloud.api;

import com.taobao.api.ApiException;

public interface QimenCloudClient {
	
	/**
	 * 执行API请求。
	 * 
	 * @param <T> 具体的API响应类
	 * @param request 具体的API请求类
	 * @return 具体的API响应
	 */
	public <T extends AbstractQimenCloudResponse> T execute(IQimenCloudRequest<T> request) throws ApiException;
	
	/**
	 * 执行API请求。
	 * 
	 * @param request 具体的API请求类
	 * @return 具体的API响应
	 */
	public QimenCloudResponse execute(QimenCloudRequest request) throws ApiException;
}

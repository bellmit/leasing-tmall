package com.dingtalk.api;

import com.taobao.api.ApiException;
import com.taobao.api.ApiRuleException;
import com.taobao.api.Constants;
import com.taobao.api.TaobaoParser;
import com.taobao.api.internal.parser.json.ObjectJsonParser;
import com.taobao.api.internal.parser.xml.ObjectXmlParser;
import com.taobao.api.internal.util.RequestParametersHolder;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoLogger;
import com.taobao.api.internal.util.WebUtils;

import java.io.IOException;
import java.util.Date;

/**
 * 钉钉客户端。
 * @author chaohui.zch 2016年11月8日下午2:38:45
 */
public class DefaultDingTalkClient implements DingTalkClient {

	protected String serverUrl;
	protected String format = Constants.FORMAT_JSON;
	protected int connectTimeout = 15000; // 默认连接超时时间为15秒
	protected int readTimeout = 30000; // 默认响应超时时间为30秒
	protected boolean needCheckRequest = true; // 是否在客户端校验请求
	protected boolean needEnableParser = true; // 是否对响应结果进行解释
	protected boolean useSimplifyJson = false; // 是否采用精简化的JSON返回
	protected boolean useGzipEncoding = true; // 是否启用响应GZIP压缩
	
	public DefaultDingTalkClient(String serverUrl) {
		this.serverUrl = serverUrl;
	}

	public DefaultDingTalkClient(String serverUrl,String format) {
		this(serverUrl);
		this.format = format;
	}

	public DefaultDingTalkClient(String serverUrl, String format, int connectTimeout, int readTimeout) {
		this(serverUrl,format);
		this.connectTimeout = connectTimeout;
		this.readTimeout = readTimeout;
	}

	public <T extends DingTalkResponse> T execute(DingTalkRequest<T> request) throws ApiException {
		return execute(request, null);
	}

	public <T extends DingTalkResponse> T execute(DingTalkRequest<T> request, String session) throws ApiException {
		return _execute(request, session);
	}

	private <T extends DingTalkResponse> T _execute(DingTalkRequest<T> request, String session) throws ApiException {
		long start = System.currentTimeMillis();
		// 构建响应解释器
		TaobaoParser<T> parser = null;
		if (this.needEnableParser) {
			if (Constants.FORMAT_XML.equals(this.format)) {
				parser = new ObjectXmlParser<T>(request.getResponseClass());
			} else {
				parser = new ObjectJsonParser<T>(request.getResponseClass(), this.useSimplifyJson);
			}
		}

		// 本地校验请求参数
		if (this.needCheckRequest) {
			try {
				request.check();
			} catch (ApiRuleException e) {
				T localResponse = null;
				try {
					localResponse = request.getResponseClass().newInstance();
				} catch (Exception xe) {
					throw new ApiException(xe);
				}
				localResponse.setErrorCode(e.getErrCode());
				localResponse.setMsg(e.getErrMsg());
				return localResponse;
			}
		}

		RequestParametersHolder requestHolder = new RequestParametersHolder();
		TaobaoHashMap appParams = new TaobaoHashMap(request.getTextParams());
		requestHolder.setApplicationParams(appParams);

		// 添加协议级请求参数
		TaobaoHashMap protocalMustParams = new TaobaoHashMap();
		protocalMustParams.put(Constants.METHOD, request.getApiMethodName());
		protocalMustParams.put(Constants.VERSION, "2.0");
		Long timestamp = request.getTimestamp();
		if (timestamp == null) {
			timestamp = System.currentTimeMillis();
		}

		protocalMustParams.put(Constants.TIMESTAMP, new Date(timestamp));
		requestHolder.setProtocalMustParams(protocalMustParams);

		TaobaoHashMap protocalOptParams = new TaobaoHashMap();
		protocalOptParams.put(Constants.FORMAT, format);
		protocalOptParams.put(Constants.SESSION, session);
		protocalOptParams.put(Constants.PARTNER_ID, getSdkVersion());

		if (this.useSimplifyJson) {
			protocalOptParams.put(Constants.SIMPLIFY, Boolean.TRUE.toString());
		}
		requestHolder.setProtocalOptParams(protocalOptParams);

		try {
			
			String realServerUrl = getServerUrl(this.serverUrl, request.getApiMethodName(), session,appParams);
			String sysMustQuery = WebUtils.buildQuery(requestHolder.getProtocalMustParams(), Constants.CHARSET_UTF8);
			String sysOptQuery = WebUtils.buildQuery(requestHolder.getProtocalOptParams(), Constants.CHARSET_UTF8);
			String fullUrl = WebUtils.buildRequestUrl(realServerUrl, sysMustQuery, sysOptQuery);
			
			String rsp = null;
			// 是否需要压缩响应
			if (this.useGzipEncoding) {
				request.getHeaderMap().put(Constants.ACCEPT_ENCODING, Constants.CONTENT_ENCODING_GZIP);
			}
			rsp = WebUtils.doPost(fullUrl, appParams, Constants.CHARSET_UTF8, connectTimeout, readTimeout, request.getHeaderMap());
			requestHolder.setResponseBody(rsp);
		} catch (IOException e) {
			TaobaoLogger.logApiError("_dingtalk_", request.getApiMethodName(), serverUrl, requestHolder.getAllParams(), System.currentTimeMillis() - start, e.toString());
			throw new ApiException(e);
		}

		T tRsp = null;
		if (this.needEnableParser) {
			tRsp = parser.parse(requestHolder.getResponseBody());
			tRsp.setBody(requestHolder.getResponseBody());
		} else {
			try {
				tRsp = request.getResponseClass().newInstance();
				tRsp.setBody(requestHolder.getResponseBody());
			} catch (Exception e) {
				throw new ApiException(e);
			}
		}

		tRsp.setParams(appParams);
		if (!tRsp.isSuccess()) {
			TaobaoLogger.logApiError("_dingtalk_", request.getApiMethodName(), serverUrl, requestHolder.getAllParams(), System.currentTimeMillis() - start, tRsp.getBody());
		}
		return tRsp;
	}

	public String getServerUrl(String serverUrl, String apiName, String session,TaobaoHashMap appParams) {
		return serverUrl;
	}

	protected String getSdkVersion() {
		return Constants.SDK_VERSION;
	}

	/**
	 * 是否在客户端校验请求参数。
	 */
	public void setNeedCheckRequest(boolean needCheckRequest) {
		this.needCheckRequest = needCheckRequest;
	}

	/**
	 * 是否把响应字符串解释为对象。
	 */
	public void setNeedEnableParser(boolean needEnableParser) {
		this.needEnableParser = needEnableParser;
	}

	/**
	 * 是否采用标准化的JSON格式返回。
	 */
	public void setUseSimplifyJson(boolean useSimplifyJson) {
		this.useSimplifyJson = useSimplifyJson;
	}

	/**
	 * 是否记录API请求错误日志。
	 */
	public void setNeedEnableLogger(boolean needEnableLogger) {
		TaobaoLogger.setNeedEnableLogger(needEnableLogger);
	}

	/**
	 * 是否忽略HTTPS证书校验。
	 */
	public void setIgnoreSSLCheck(boolean ignore) {
		WebUtils.setIgnoreSSLCheck(ignore);
	}

	/**
	 * 是否启用响应GZIP压缩
	 */
	public void setUseGzipEncoding(boolean useGzipEncoding) {
		this.useGzipEncoding = useGzipEncoding;
	}

	/**
	 * 设置API请求的连接超时时间，默认为15秒。
	 */
	public void setConnectTimeout(int connectTimeout) {
		this.connectTimeout = connectTimeout;
	}

	/**
	 * 设置API请求的读超时时间，默认为30秒。
	 */
	public void setReadTimeout(int readTimeout) {
		this.readTimeout = readTimeout;
	}

}

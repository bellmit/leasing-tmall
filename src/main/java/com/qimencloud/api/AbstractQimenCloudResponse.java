package com.qimencloud.api;

import com.taobao.api.internal.mapping.ApiField;

import java.io.Serializable;

/**
 * 奇门云网关API基础响应信息。
 * 
 * @author xiaoxuan.lp
 */
public abstract class AbstractQimenCloudResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1288225551445412797L;

	@ApiField("flag")
	private String flag;

	@ApiField("code")
	private String code;

	@ApiField("message")
	private String message;
	
	@ApiField("sub_code")
	private String subCode;

	@ApiField("sub_message")
	private String subMessage;

	/**
	 * API响应结果
	 */
	private String body;
	
	/**
	 * API请求URL(不包含body)
	 */
	private String requestUrl;
	
	/**
	 * 判断响应是否成功
	 */
	public boolean isPlatformSuccess() {
		return flag == null || flag.isEmpty();
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getRequestUrl() {
		return requestUrl;
	}

	public void setRequestUrl(String requestUrl) {
		this.requestUrl = requestUrl;
	}

	public String getSubCode() {
		return subCode;
	}

	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}

	public String getSubMessage() {
		return subMessage;
	}

	public void setSubMessage(String subMessage) {
		this.subMessage = subMessage;
	}
}

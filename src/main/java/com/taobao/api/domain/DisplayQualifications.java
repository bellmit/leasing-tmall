package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;


/**
 * 资质配置数据
 *
 * @author top auto create
 * @since 1.0, null
 */
public class DisplayQualifications extends TaobaoObject {

	private static final long serialVersionUID = 5394945993721543326L;

	/**
	 * 返回消息
	 */
	@ApiField("message")
	private String message;

	/**
	 * 填充列表
	 */
	@ApiField("model")
	private String model;

	/**
	 * 是否成功
	 */
	@ApiField("result")
	private Boolean result;


	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public String getModel() {
		return this.model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	public Boolean getResult() {
		return this.result;
	}
	public void setResult(Boolean result) {
		this.result = result;
	}

}

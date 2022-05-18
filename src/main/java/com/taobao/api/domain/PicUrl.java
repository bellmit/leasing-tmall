package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;


/**
 * 图片链接
 *
 * @author top auto create
 * @since 1.0, null
 */
public class PicUrl extends TaobaoObject {

	private static final long serialVersionUID = 5173132575416195734L;

	/**
	 * 图片链接地址
	 */
	@ApiField("url")
	private String url;


	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}

package com.taobao.api.internal.parser.json;

import com.taobao.api.ApiException;
import com.taobao.api.TaobaoParser;
import com.taobao.api.internal.mapping.Converter;

/**
 * 单个JSON对象解释器。
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class QimenCloudJsonParser<T> implements TaobaoParser<T> {

	private Class<T> clazz;

	public QimenCloudJsonParser(Class<T> clazz) {
		this.clazz = clazz;
	}

	public T parse(String rsp) throws ApiException {
		Converter converter = new QimenCloudSimplifyJsonConverter();
		return converter.toResponse(rsp, clazz);
	}

	public Class<T> getResponseClass() {
		return clazz;
	}

}

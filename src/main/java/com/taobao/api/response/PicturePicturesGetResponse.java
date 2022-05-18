package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Picture;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: taobao.picture.pictures.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class PicturePicturesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8776363773237584233L;

	/** 
	 * 图片空间图片数据对象
	 */
	@ApiListField("pictures")
	@ApiField("picture")
	private List<Picture> pictures;


	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}
	public List<Picture> getPictures( ) {
		return this.pictures;
	}
	


}

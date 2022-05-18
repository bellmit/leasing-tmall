package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;


/**
 * 村淘特有商品级数据结构
 *
 * @author top auto create
 * @since 1.0, null
 */
public class CuntaoItemSpecific extends TaobaoObject {

	private static final long serialVersionUID = 4461743986366968445L;

	/**
	 * 村淘商品级佣金率
	 */
	@ApiField("kick_back_rate")
	private String kickBackRate;


	public String getKickBackRate() {
		return this.kickBackRate;
	}
	public void setKickBackRate(String kickBackRate) {
		this.kickBackRate = kickBackRate;
	}

}

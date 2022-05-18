package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;


/**
 * 包裹信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoStockOutBillPackageinfolist extends TaobaoObject {

	private static final long serialVersionUID = 5662957675855566796L;

	/**
	 * 包裹信息
	 */
	@ApiField("package_info")
	private CainiaoStockOutBillPackageinfo packageInfo;


	public CainiaoStockOutBillPackageinfo getPackageInfo() {
		return this.packageInfo;
	}
	public void setPackageInfo(CainiaoStockOutBillPackageinfo packageInfo) {
		this.packageInfo = packageInfo;
	}

}

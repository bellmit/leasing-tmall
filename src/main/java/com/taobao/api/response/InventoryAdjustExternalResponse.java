package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TipInfo;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: taobao.inventory.adjust.external response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class InventoryAdjustExternalResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6784753487687985868L;

	/** 
	 * 操作返回码
	 */
	@ApiField("operate_code")
	private String operateCode;

	/** 
	 * 提示信息
	 */
	@ApiListField("tip_infos")
	@ApiField("tip_info")
	private List<TipInfo> tipInfos;


	public void setOperateCode(String operateCode) {
		this.operateCode = operateCode;
	}
	public String getOperateCode( ) {
		return this.operateCode;
	}

	public void setTipInfos(List<TipInfo> tipInfos) {
		this.tipInfos = tipInfos;
	}
	public List<TipInfo> getTipInfos( ) {
		return this.tipInfos;
	}
	


}

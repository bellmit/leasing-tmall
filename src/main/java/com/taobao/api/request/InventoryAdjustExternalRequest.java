package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.InventoryAdjustExternalResponse;

import java.util.Date;
import java.util.Map;

/**
 * TOP API: taobao.inventory.adjust.external request
 * 
 * @author top auto create
 * @since 1.0, 2017.04.18
 */
public class InventoryAdjustExternalRequest extends BaseTaobaoRequest<InventoryAdjustExternalResponse> {
	
	

	/** 
	* 外部订单类型, BALANCE:盘点、NON_TAOBAO_TRADE:非淘宝交易、ALLOCATE:调拨、OTHERS:其他
	 */
	private String bizType;

	/** 
	* 商家外部定单号
	 */
	private String bizUniqueCode;

	/** 
	* 商品库存预留信息： [{"scItemId":"商品后端ID，如果有传scItemCode,参数可以为0","scItemCode":"商品商家编码","inventoryType":"库存类型  1：正常,2：损坏,3：冻结,10：质押",11-20:商家自定义,”inventoryTypeName”:”库存类型名称,可选”,"occupyQuantity":"数量"}]
	 */
	private String items;

	/** 
	* test
	 */
	private String occupyOperateCode;

	/** 
	* 操作时间
	 */
	private Date operateTime;

	/** 
	* 操作类型  BALANCE 盘点  OUTBOUND出库  INBOUND 入库
	 */
	private String operateType;

	/** 
	* test
	 */
	private String reduceType;

	/** 
	* 商家仓库编码
	 */
	private String storeCode;

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizUniqueCode(String bizUniqueCode) {
		this.bizUniqueCode = bizUniqueCode;
	}

	public String getBizUniqueCode() {
		return this.bizUniqueCode;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public String getItems() {
		return this.items;
	}

	public void setOccupyOperateCode(String occupyOperateCode) {
		this.occupyOperateCode = occupyOperateCode;
	}

	public String getOccupyOperateCode() {
		return this.occupyOperateCode;
	}

	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}

	public Date getOperateTime() {
		return this.operateTime;
	}

	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getOperateType() {
		return this.operateType;
	}

	public void setReduceType(String reduceType) {
		this.reduceType = reduceType;
	}

	public String getReduceType() {
		return this.reduceType;
	}

	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public String getStoreCode() {
		return this.storeCode;
	}

	public String getApiMethodName() {
		return "taobao.inventory.adjust.external";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("biz_type", this.bizType);
		txtParams.put("biz_unique_code", this.bizUniqueCode);
		txtParams.put("items", this.items);
		txtParams.put("occupy_operate_code", this.occupyOperateCode);
		txtParams.put("operate_time", this.operateTime);
		txtParams.put("operate_type", this.operateType);
		txtParams.put("reduce_type", this.reduceType);
		txtParams.put("store_code", this.storeCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<InventoryAdjustExternalResponse> getResponseClass() {
		return InventoryAdjustExternalResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizType, "bizType");
		RequestCheckUtils.checkNotEmpty(bizUniqueCode, "bizUniqueCode");
		RequestCheckUtils.checkNotEmpty(items, "items");
		RequestCheckUtils.checkNotEmpty(operateTime, "operateTime");
		RequestCheckUtils.checkNotEmpty(operateType, "operateType");
		RequestCheckUtils.checkNotEmpty(storeCode, "storeCode");
	}
	

}
package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;


/**
 * 仓库收货商品信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoStockInBillInventoryitemlist extends TaobaoObject {

	private static final long serialVersionUID = 4259423998375886828L;

	/**
	 * 仓库收货商品信息
	 */
	@ApiField("inventory_item")
	private CainiaoStockInBillInventoryitem inventoryItem;


	public CainiaoStockInBillInventoryitem getInventoryItem() {
		return this.inventoryItem;
	}
	public void setInventoryItem(CainiaoStockInBillInventoryitem inventoryItem) {
		this.inventoryItem = inventoryItem;
	}

}

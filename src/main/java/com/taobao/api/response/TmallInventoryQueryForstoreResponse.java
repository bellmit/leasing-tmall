package com.taobao.api.response;

import com.taobao.api.TaobaoObject;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: tmall.inventory.query.forstore response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallInventoryQueryForstoreResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2897971672461548912L;

	/** 
	 * 错误code
	 */
	@ApiField("errorcode")
	private String errorcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errormessage")
	private String errormessage;

	/** 
	 * 整体成功或失败
	 */
	@ApiField("issuccess")
	private Boolean issuccess;

	/** 
	 * 查询结果
	 */
	@ApiField("result")
	private InventoryQueryResult result;


	public void setErrorcode(String errorcode) {
		this.errorcode = errorcode;
	}
	public String getErrorcode( ) {
		return this.errorcode;
	}

	public void setErrormessage(String errormessage) {
		this.errormessage = errormessage;
	}
	public String getErrormessage( ) {
		return this.errormessage;
	}

	public void setIssuccess(Boolean issuccess) {
		this.issuccess = issuccess;
	}
	public Boolean getIssuccess( ) {
		return this.issuccess;
	}

	public void setResult(InventoryQueryResult result) {
		this.result = result;
	}
	public InventoryQueryResult getResult( ) {
		return this.result;
	}
	
	/**
 * subList
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class InventorySubDetailDto extends TaobaoObject {

	private static final long serialVersionUID = 1344346962755574726L;

	/**
		 * ONLINE_INVENTORY:线上可售卖库存。SHARE_INVENTORY：线下独享库存，门店自提可用
		 */
		@ApiField("inv_biz_code")
		private String invBizCode;
		/**
		 * 占用库存数
		 */
		@ApiField("occupy_quantity")
		private Long occupyQuantity;
		/**
		 * 仓库物理库存数
		 */
		@ApiField("quantity")
		private Long quantity;
		/**
		 * 预扣库存数
		 */
		@ApiField("reserve_quantity")
		private Long reserveQuantity;
	

	public String getInvBizCode() {
			return this.invBizCode;
		}
		public void setInvBizCode(String invBizCode) {
			this.invBizCode = invBizCode;
		}
		public Long getOccupyQuantity() {
			return this.occupyQuantity;
		}
		public void setOccupyQuantity(Long occupyQuantity) {
			this.occupyQuantity = occupyQuantity;
		}
		public Long getQuantity() {
			return this.quantity;
		}
		public void setQuantity(Long quantity) {
			this.quantity = quantity;
		}
		public Long getReserveQuantity() {
			return this.reserveQuantity;
		}
		public void setReserveQuantity(Long reserveQuantity) {
			this.reserveQuantity = reserveQuantity;
		}

}

	/**
 * 查询成功列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class InventoryInfoDetailDto extends TaobaoObject {

	private static final long serialVersionUID = 3661553383383326335L;

	/**
		 * distType
		 */
		@ApiField("inv_store_type")
		private Long invStoreType;
		/**
		 * 占用库存数
		 */
		@ApiField("occupy_quantity")
		private Long occupyQuantity;
		/**
		 * 仓库物理库存数
		 */
		@ApiField("quantity")
		private Long quantity;
		/**
		 * 预扣库存数
		 */
		@ApiField("reserve_quantity")
		private Long reserveQuantity;
		/**
		 * 后端商品code
		 */
		@ApiField("sc_item_code")
		private String scItemCode;
		/**
		 * 后端商品id
		 */
		@ApiField("sc_item_id")
		private Long scItemId;
		/**
		 * 仓库code
		 */
		@ApiField("store_code")
		private String storeCode;
		/**
		 * subList
		 */
		@ApiListField("sub_list")
		@ApiField("inventory_sub_detail_dto")
		private List<InventorySubDetailDto> subList;
	

	public Long getInvStoreType() {
			return this.invStoreType;
		}
		public void setInvStoreType(Long invStoreType) {
			this.invStoreType = invStoreType;
		}
		public Long getOccupyQuantity() {
			return this.occupyQuantity;
		}
		public void setOccupyQuantity(Long occupyQuantity) {
			this.occupyQuantity = occupyQuantity;
		}
		public Long getQuantity() {
			return this.quantity;
		}
		public void setQuantity(Long quantity) {
			this.quantity = quantity;
		}
		public Long getReserveQuantity() {
			return this.reserveQuantity;
		}
		public void setReserveQuantity(Long reserveQuantity) {
			this.reserveQuantity = reserveQuantity;
		}
		public String getScItemCode() {
			return this.scItemCode;
		}
		public void setScItemCode(String scItemCode) {
			this.scItemCode = scItemCode;
		}
		public Long getScItemId() {
			return this.scItemId;
		}
		public void setScItemId(Long scItemId) {
			this.scItemId = scItemId;
		}
		public String getStoreCode() {
			return this.storeCode;
		}
		public void setStoreCode(String storeCode) {
			this.storeCode = storeCode;
		}
		public List<InventorySubDetailDto> getSubList() {
			return this.subList;
		}
		public void setSubList(List<InventorySubDetailDto> subList) {
			this.subList = subList;
		}

}

	/**
 * tipInfos
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class TipInfo extends TaobaoObject {

	private static final long serialVersionUID = 6655746993882667834L;

	/**
		 * errorCode
		 */
		@ApiField("errorcode")
		private String errorcode;
		/**
		 * errorMessage
		 */
		@ApiField("errormessage")
		private String errormessage;
		/**
		 * invStoreType
		 */
		@ApiField("inv_store_type")
		private Long invStoreType;
		/**
		 * scItemCode
		 */
		@ApiField("sc_item_code")
		private String scItemCode;
		/**
		 * scItemId
		 */
		@ApiField("sc_item_id")
		private Long scItemId;
		/**
		 * storeCode
		 */
		@ApiField("store_code")
		private String storeCode;
	

	public String getErrorcode() {
			return this.errorcode;
		}
		public void setErrorcode(String errorcode) {
			this.errorcode = errorcode;
		}
		public String getErrormessage() {
			return this.errormessage;
		}
		public void setErrormessage(String errormessage) {
			this.errormessage = errormessage;
		}
		public Long getInvStoreType() {
			return this.invStoreType;
		}
		public void setInvStoreType(Long invStoreType) {
			this.invStoreType = invStoreType;
		}
		public String getScItemCode() {
			return this.scItemCode;
		}
		public void setScItemCode(String scItemCode) {
			this.scItemCode = scItemCode;
		}
		public Long getScItemId() {
			return this.scItemId;
		}
		public void setScItemId(Long scItemId) {
			this.scItemId = scItemId;
		}
		public String getStoreCode() {
			return this.storeCode;
		}
		public void setStoreCode(String storeCode) {
			this.storeCode = storeCode;
		}

}

	/**
 * 查询结果
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class InventoryQueryResult extends TaobaoObject {

	private static final long serialVersionUID = 1758671628853354942L;

	/**
		 * 查询成功列表
		 */
		@ApiListField("item_inventorys")
		@ApiField("inventory_info_detail_dto")
		private List<InventoryInfoDetailDto> itemInventorys;
		/**
		 * tipInfos
		 */
		@ApiListField("tip_infos")
		@ApiField("tip_info")
		private List<TipInfo> tipInfos;
	

	public List<InventoryInfoDetailDto> getItemInventorys() {
			return this.itemInventorys;
		}
		public void setItemInventorys(List<InventoryInfoDetailDto> itemInventorys) {
			this.itemInventorys = itemInventorys;
		}
		public List<TipInfo> getTipInfos() {
			return this.tipInfos;
		}
		public void setTipInfos(List<TipInfo> tipInfos) {
			this.tipInfos = tipInfos;
		}

}



}

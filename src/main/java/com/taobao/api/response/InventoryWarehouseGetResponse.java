package com.taobao.api.response;

import com.taobao.api.TaobaoObject;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.inventory.warehouse.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class InventoryWarehouseGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6128961285145676373L;

	/** 
	 * result
	 */
	@ApiField("result")
	private BaseResult result;


	public void setResult(BaseResult result) {
		this.result = result;
	}
	public BaseResult getResult( ) {
		return this.result;
	}
	
	/**
 * 仓传输值
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class WareHouseDto extends TaobaoObject {

	private static final long serialVersionUID = 1597114467496498665L;

	/**
		 * 详细地址
		 */
		@ApiField("address")
		private String address;
		/**
		 * 仓库地址, 到三级区域
		 */
		@ApiField("address_area_name")
		private String addressAreaName;
		/**
		 * 仓库别名
		 */
		@ApiField("alias_name")
		private String aliasName;
		/**
		 * 联系人
		 */
		@ApiField("contact")
		private String contact;
		/**
		 * 电话号码
		 */
		@ApiField("phone")
		private String phone;
		/**
		 * 邮编
		 */
		@ApiField("post_code")
		private String postCode;
		/**
		 * 仓库编码
		 */
		@ApiField("store_code")
		private String storeCode;
		/**
		 * 仓库名
		 */
		@ApiField("store_name")
		private String storeName;
	

	public String getAddress() {
			return this.address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getAddressAreaName() {
			return this.addressAreaName;
		}
		public void setAddressAreaName(String addressAreaName) {
			this.addressAreaName = addressAreaName;
		}
		public String getAliasName() {
			return this.aliasName;
		}
		public void setAliasName(String aliasName) {
			this.aliasName = aliasName;
		}
		public String getContact() {
			return this.contact;
		}
		public void setContact(String contact) {
			this.contact = contact;
		}
		public String getPhone() {
			return this.phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getPostCode() {
			return this.postCode;
		}
		public void setPostCode(String postCode) {
			this.postCode = postCode;
		}
		public String getStoreCode() {
			return this.storeCode;
		}
		public void setStoreCode(String storeCode) {
			this.storeCode = storeCode;
		}
		public String getStoreName() {
			return this.storeName;
		}
		public void setStoreName(String storeName) {
			this.storeName = storeName;
		}

}

	/**
 * result
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class BaseResult extends TaobaoObject {

	private static final long serialVersionUID = 7459458335382957277L;

	/**
		 * 仓传输值
		 */
		@ApiField("data")
		private WareHouseDto data;
		/**
		 * 错误编码
		 */
		@ApiField("error_code")
		private String errorCode;
		/**
		 * 错误信息
		 */
		@ApiField("error_msg")
		private String errorMsg;
		/**
		 * 是否成功
		 */
		@ApiField("success")
		private Boolean success;
	

	public WareHouseDto getData() {
			return this.data;
		}
		public void setData(WareHouseDto data) {
			this.data = data;
		}
		public String getErrorCode() {
			return this.errorCode;
		}
		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}
		public String getErrorMsg() {
			return this.errorMsg;
		}
		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}

}



}

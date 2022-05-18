package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.InventoryWarehouseManageResponse;

import java.util.Map;

/**
 * TOP API: taobao.inventory.warehouse.manage request
 * 
 * @author top auto create
 * @since 1.0, 2016.07.07
 */
public class InventoryWarehouseManageRequest extends BaseTaobaoRequest<InventoryWarehouseManageResponse> {
	
	

	/** 
	* 仓库信息
	 */
	private String wareHouseDto;

	public void setWareHouseDto(String wareHouseDto) {
		this.wareHouseDto = wareHouseDto;
	}

	public void setWareHouseDto(WareHouseDto wareHouseDto) {
		this.wareHouseDto = new JSONWriter(false,true).write(wareHouseDto);
	}

	public String getWareHouseDto() {
		return this.wareHouseDto;
	}

	public String getApiMethodName() {
		return "taobao.inventory.warehouse.manage";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("ware_house_dto", this.wareHouseDto);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<InventoryWarehouseManageResponse> getResponseClass() {
		return InventoryWarehouseManageResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
 * 仓库信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class WareHouseDto extends TaobaoObject {

	private static final long serialVersionUID = 6341943991819128981L;

	/**
		 * 详细地址描述
		 */
		@ApiField("address")
		private String address;
		/**
		 * 仓库地址信息,格式 :省~市~区县
		 */
		@ApiField("address_area_name")
		private String addressAreaName;
		/**
		 * 别名
		 */
		@ApiField("alias_name")
		private String aliasName;
		/**
		 * 联系人
		 */
		@ApiField("contact")
		private String contact;
		/**
		 * 操作类型，新增:ADD;修改:UPDATE
		 */
		@ApiField("operate_type")
		private String operateType;
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
		 * 仓库编码，仅允许使用字母、数字、下划线，并且在6-30个字符内
		 */
		@ApiField("store_code")
		private String storeCode;
		/**
		 * 仓库名称
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
		public String getOperateType() {
			return this.operateType;
		}
		public void setOperateType(String operateType) {
			this.operateType = operateType;
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


}
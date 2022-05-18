package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.OcEserviceAppointSaveResponse;

import java.util.List;
import java.util.Map;

/**
 * TOP API: taobao.oc.eservice.appoint.save request
 * 
 * @author top auto create
 * @since 1.0, 2016.05.06
 */
public class OcEserviceAppointSaveRequest extends BaseTaobaoRequest<OcEserviceAppointSaveResponse> {
	
	

	/** 
	* 预约信息结构
	 */
	private String paramO2oAppointInfoDTO;

	public void setParamO2oAppointInfoDTO(String paramO2oAppointInfoDTO) {
		this.paramO2oAppointInfoDTO = paramO2oAppointInfoDTO;
	}

	public void setParamO2oAppointInfoDTO(O2oAppointInfoDto paramO2oAppointInfoDTO) {
		this.paramO2oAppointInfoDTO = new JSONWriter(false,true).write(paramO2oAppointInfoDTO);
	}

	public String getParamO2oAppointInfoDTO() {
		return this.paramO2oAppointInfoDTO;
	}

	public String getApiMethodName() {
		return "taobao.oc.eservice.appoint.save";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("param_o2o_appoint_info_d_t_o", this.paramO2oAppointInfoDTO);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OcEserviceAppointSaveResponse> getResponseClass() {
		return OcEserviceAppointSaveResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
 * 预约信息属性列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class O2oAppointInfoParam extends TaobaoObject {

	private static final long serialVersionUID = 5723858466736952272L;

	/**
		 * 预约信息属性名,如必填的有seller_id（卖家主账号）, customer_nick（客户淘宝nick）, mall_code（门店编码）, appoint_time（预约时间，格式yyyyMMddHHmmss）, ww_nick（卖家客服子账号nick）, ww_user_id（卖家客服子账号用户id），mall_address_city(门店所在的市)，customer_phone(买家客户电话)等。可选的有appoint_status(默认0，预约状态：0-未确认，1-已确认，2-已到店)，mall_name(门店名称), mall_phone(门店电话),mall_address_province(门店所在的省),  mall_address_area(门店所在的街道村镇),mall_address_detail(门店所在的详细街道地址),designer_code(设计师编码),designer_name（设计师名称）,designer_phone（设计师电话）,designer_image(设计师图像url地址)，designer_introduction(设计师描述)，ww_phone(旺旺客服电话)，house_address_province(装修房屋所在的省), house_address_city(装修房屋所在的市), house_address_area(装修房屋所在的街道), house_address_detail(装修房屋所在的详细街道地址),house_area(装修面积), house_decoration(装修类型，如新房装修，二手房装修等), remark(备注信息)等，可以根据自己的需要增加属性字段。
		 */
		@ApiField("param_name")
		private String paramName;
		/**
		 * 属性值
		 */
		@ApiField("param_value")
		private String paramValue;
	

	public String getParamName() {
			return this.paramName;
		}
		public void setParamName(String paramName) {
			this.paramName = paramName;
		}
		public String getParamValue() {
			return this.paramValue;
		}
		public void setParamValue(String paramValue) {
			this.paramValue = paramValue;
		}

}

	/**
 * 预约信息结构
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class O2oAppointInfoDto extends TaobaoObject {

	private static final long serialVersionUID = 2123224243785132553L;

	/**
		 * 预约信息唯一编码，如果填写为修改，否则为创建
		 */
		@ApiField("appoint_code")
		private Long appointCode;
		/**
		 * 预约信息属性列表
		 */
		@ApiListField("appoint_info_params")
		@ApiField("o2o_appoint_info_param")
		private List<O2oAppointInfoParam> appointInfoParams;
	

	public Long getAppointCode() {
			return this.appointCode;
		}
		public void setAppointCode(Long appointCode) {
			this.appointCode = appointCode;
		}
		public List<O2oAppointInfoParam> getAppointInfoParams() {
			return this.appointInfoParams;
		}
		public void setAppointInfoParams(List<O2oAppointInfoParam> appointInfoParams) {
			this.appointInfoParams = appointInfoParams;
		}

}


}
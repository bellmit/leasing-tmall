package com.taobao.api.response;

import com.taobao.api.TaobaoObject;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: taobao.oc.eservice.appoint.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OcEserviceAppointListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3712237833888548916L;

	/** 
	 * 返回的预约信息，多个预约信息按照预约时间升序排序
	 */
	@ApiListField("models")
	@ApiField("o2o_appoint_info_dto")
	private List<O2oAppointInfoDto> models;

	/** 
	 * 返回的预约信息数目
	 */
	@ApiField("total_number")
	private Long totalNumber;


	public void setModels(List<O2oAppointInfoDto> models) {
		this.models = models;
	}
	public List<O2oAppointInfoDto> getModels( ) {
		return this.models;
	}

	public void setTotalNumber(Long totalNumber) {
		this.totalNumber = totalNumber;
	}
	public Long getTotalNumber( ) {
		return this.totalNumber;
	}
	
	/**
 * 预约属性信息列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class O2oAppointInfoParam extends TaobaoObject {

	private static final long serialVersionUID = 7139255815139246852L;

	/**
		 * 预约属性名信息
		 */
		@ApiField("param_name")
		private String paramName;
		/**
		 * 预约属性值信息
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
 * 返回的预约信息，多个预约信息按照预约时间升序排序
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class O2oAppointInfoDto extends TaobaoObject {

	private static final long serialVersionUID = 7691683977613166543L;

	/**
		 * 预约信息唯一编码，如果使用此参数，customer_nick和mall_code参数不会使用
		 */
		@ApiField("appoint_code")
		private Long appointCode;
		/**
		 * 预约属性信息列表
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

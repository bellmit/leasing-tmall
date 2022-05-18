package com.taobao.api.request;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import java.util.Map;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.TmallCarLeaseConsumeResponse;

/**
 * TOP API: tmall.car.lease.consume request
 * 
 * @author top auto create
 * @since 1.0, 2017.03.31
 */
public class TmallCarLeaseConsumeRequest extends BaseTaobaoRequest<TmallCarLeaseConsumeResponse> {
	
	

	/** 
	* 核销请求
	 */
	private String cosumeCodeReqDTO;

	public void setCosumeCodeReqDTO(String cosumeCodeReqDTO) {
		this.cosumeCodeReqDTO = cosumeCodeReqDTO;
	}

	public void setCosumeCodeReqDTO(CosumeCodeReqDto cosumeCodeReqDTO) {
		this.cosumeCodeReqDTO = new JSONWriter(false,true).write(cosumeCodeReqDTO);
	}

	public String getCosumeCodeReqDTO() {
		return this.cosumeCodeReqDTO;
	}

	public String getApiMethodName() {
		return "tmall.car.lease.consume";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("cosume_code_req_d_t_o", this.cosumeCodeReqDTO);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallCarLeaseConsumeResponse> getResponseClass() {
		return TmallCarLeaseConsumeResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
 * 核销请求
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class CosumeCodeReqDto extends TaobaoObject {

	private static final long serialVersionUID = 1877656537147779452L;

	/**
		 * 业务id
		 */
		@ApiField("biz_id")
		private String bizId;
		/**
		 * 业务类型,整车租赁传入：car_lease
		 */
		@NotBlank(message = "业务类型不能为空")
		@ApiField("biz_type")
		private String bizType;
		/**
		 * 车牌号
		 */
		@NotBlank(message = "车牌号不能为空")
		@ApiField("car_no")
		private String carNo;
		/**
		 * 核销码
		 */
		@NotBlank(message = "核销码不能为空")
		@ApiField("code")
		private String code;
		/**
		 * 身份证
		 */
		@NotBlank(message = "身份证不能为空")
		@ApiField("identity_no")
		private String identityNo;
		/**
		 * 门店id
		 */
		@NotNull(message = "门店id不能为空")
		@ApiField("store_id")
		private Long storeId;
		/**
		 * 门店名字
		 */
		@NotBlank(message = "门店名字不能为空")
		@ApiField("store_name")
		private String storeName;
		/**
		 * 车架号
		 */
		@NotBlank(message = "车架号不能为空")
		@ApiField("vin")
		private String vin;
	

	public String getBizId() {
			return this.bizId;
		}
		public void setBizId(String bizId) {
			this.bizId = bizId;
		}
		public String getBizType() {
			return this.bizType;
		}
		public void setBizType(String bizType) {
			this.bizType = bizType;
		}
		public String getCarNo() {
			return this.carNo;
		}
		public void setCarNo(String carNo) {
			this.carNo = carNo;
		}
		public String getCode() {
			return this.code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getIdentityNo() {
			return this.identityNo;
		}
		public void setIdentityNo(String identityNo) {
			this.identityNo = identityNo;
		}
		public Long getStoreId() {
			return this.storeId;
		}
		public void setStoreId(Long storeId) {
			this.storeId = storeId;
		}
		public String getStoreName() {
			return this.storeName;
		}
		public void setStoreName(String storeName) {
			this.storeName = storeName;
		}
		public String getVin() {
			return this.vin;
		}
		public void setVin(String vin) {
			this.vin = vin;
		}

}


}
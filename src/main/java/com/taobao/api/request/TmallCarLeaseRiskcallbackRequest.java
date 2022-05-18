package com.taobao.api.request;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.TmallCarLeaseRiskcallbackResponse;

/**
 * TOP API: tmall.car.lease.riskcallback request
 * 
 * @author top auto create
 * @since 1.0, 2017.04.05
 */
public class TmallCarLeaseRiskcallbackRequest extends BaseTaobaoRequest<TmallCarLeaseRiskcallbackResponse> {
	
	

	/** 
	* 授信结果
	 */
	private String creditInfo;

	public void setCreditInfo(String creditInfo) {
		this.creditInfo = creditInfo;
	}

	public void setCreditInfo(CreditInfoTopDto creditInfo) {
		this.creditInfo = new JSONWriter(false,true).write(creditInfo);
	}

	public String getCreditInfo() {
		return this.creditInfo;
	}

	public String getApiMethodName() {
		return "tmall.car.lease.riskcallback";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("credit_info", this.creditInfo);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallCarLeaseRiskcallbackResponse> getResponseClass() {
		return TmallCarLeaseRiskcallbackResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	
	/**
 * 授信结果
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class CreditInfoTopDto extends TaobaoObject {

	private static final long serialVersionUID = 7429684129645477991L;

	/**
		 * 身份证
		 */
		@ApiField("identity_no")
		private String identityNo;
		/**
		 * 手机号
		 */
		@ApiField("mobile")
		private Long mobile;
		/**
		 * 名字
		 */
		@ApiField("name")
		private String name;
		/**
		 * 是否通过
		 */
		@ApiField("pass")
		private Boolean pass;
		/**
		 * 被拒原因，只支持传入1,2,3,4.其中1代表综合评分不足；2代表黑名单客群；3代表信用不良；4代表其他
		 */
		@ApiField("reject_msg")
		private String rejectMsg;
		/**
		 * 唯一id
		 */
		@ApiField("uuid")
		private String uuid;
	

	public String getIdentityNo() {
			return this.identityNo;
		}
		public void setIdentityNo(String identityNo) {
			this.identityNo = identityNo;
		}
		public Long getMobile() {
			return this.mobile;
		}
		public void setMobile(Long mobile) {
			this.mobile = mobile;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Boolean getPass() {
			return this.pass;
		}
		public void setPass(Boolean pass) {
			this.pass = pass;
		}
		public String getRejectMsg() {
			return this.rejectMsg;
		}
		public void setRejectMsg(String rejectMsg) {
			this.rejectMsg = rejectMsg;
		}
		public String getUuid() {
			return this.uuid;
		}
		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

}


}
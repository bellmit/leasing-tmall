package com.taobao.api.response;

import com.taobao.api.TaobaoObject;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: cainiao.vms.service.collectvehicleroute response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class CainiaoVmsServiceCollectvehiclerouteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7543667295346179779L;

	/** 
	 * result
	 */
	@ApiField("result")
	private CollectVehicleRouteResponse result;


	public void setResult(CollectVehicleRouteResponse result) {
		this.result = result;
	}
	public CollectVehicleRouteResponse getResult( ) {
		return this.result;
	}
	
	/**
 * result
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class CollectVehicleRouteResponse extends TaobaoObject {

	private static final long serialVersionUID = 5631835632382389526L;

	/**
		 * message
		 */
		@ApiField("message")
		private String message;
		/**
		 * statusCode
		 */
		@ApiField("status_code")
		private Long statusCode;
	

	public String getMessage() {
			return this.message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public Long getStatusCode() {
			return this.statusCode;
		}
		public void setStatusCode(Long statusCode) {
			this.statusCode = statusCode;
		}

}



}

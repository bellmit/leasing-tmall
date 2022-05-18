package com.taobao.api.response;

import com.taobao.api.TaobaoObject;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.inventory.warehouse.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class InventoryWarehouseQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5634987898486598185L;

	/** 
	 * result
	 */
	@ApiField("result")
	private PaginationResult result;


	public void setResult(PaginationResult result) {
		this.result = result;
	}
	public PaginationResult getResult( ) {
		return this.result;
	}
	
	/**
 * result
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class PaginationResult extends TaobaoObject {

	private static final long serialVersionUID = 2361372272893415938L;

	/**
		 * 仓库信息数组
		 */
		@ApiField("data")
		private String data;
		/**
		 * 错误码
		 */
		@ApiField("error_code")
		private String errorCode;
		/**
		 * 错误信息
		 */
		@ApiField("error_msg")
		private String errorMsg;
		/**
		 * 页码
		 */
		@ApiField("page_no")
		private Long pageNo;
		/**
		 * 页大小
		 */
		@ApiField("page_size")
		private Long pageSize;
		/**
		 * 是否成功
		 */
		@ApiField("success")
		private Boolean success;
		/**
		 * 总条数
		 */
		@ApiField("total_count")
		private Long totalCount;
	

	public String getData() {
			return this.data;
		}
		public void setData(String data) {
			this.data = data;
		}
		public void setDataString(String data) {
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
		public Long getPageNo() {
			return this.pageNo;
		}
		public void setPageNo(Long pageNo) {
			this.pageNo = pageNo;
		}
		public Long getPageSize() {
			return this.pageSize;
		}
		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}
		public Boolean getSuccess() {
			return this.success;
		}
		public void setSuccess(Boolean success) {
			this.success = success;
		}
		public Long getTotalCount() {
			return this.totalCount;
		}
		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

}



}

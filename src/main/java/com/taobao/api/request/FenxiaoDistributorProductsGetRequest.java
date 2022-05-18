package com.taobao.api.request;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoDistributorProductsGetResponse;

import java.util.Date;
import java.util.Map;

/**
 * TOP API: taobao.fenxiao.distributor.products.get request
 * 
 * @author top auto create
 * @since 1.0, 2017.03.06
 */
public class FenxiaoDistributorProductsGetRequest extends BaseTaobaoRequest<FenxiaoDistributorProductsGetResponse> {
	
	

	/** 
	* 结束时间
	 */
	private Date endTime;

	/** 
	* 指定查询额外的信息，可选值：skus（sku数据）、images（多图），多个可选值用逗号分割。
	 */
	private String fields;

	/** 
	* 根据商品ID列表查询，优先级次于产品ID列表，高于其他分页查询条件。如果商品不是分销商品，自动过滤。最大限制20，用逗号分割，例如：“1001,1002,1003,1004,1005”
	 */
	private String itemIds;

	/** 
	* 页码（大于0的整数，默认1）
	 */
	private Long pageNo;

	/** 
	* 每页记录数（默认20，最大50）
	 */
	private Long pageSize;

	/** 
	* 产品ID列表（最大限制30），用逗号分割，例如：“1001,1002,1003,1004,1005”
	 */
	private String pids;

	/** 
	* 产品线ID
	 */
	private Long productcatId;

	/** 
	* 开始修改时间
	 */
	private Date startTime;

	/** 
	* 供应商nick，分页查询时，必传
	 */
	private String supplierNick;

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getFields() {
		return this.fields;
	}

	public void setItemIds(String itemIds) {
		this.itemIds = itemIds;
	}

	public String getItemIds() {
		return this.itemIds;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPids(String pids) {
		this.pids = pids;
	}

	public String getPids() {
		return this.pids;
	}

	public void setProductcatId(Long productcatId) {
		this.productcatId = productcatId;
	}

	public Long getProductcatId() {
		return this.productcatId;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setSupplierNick(String supplierNick) {
		this.supplierNick = supplierNick;
	}

	public String getSupplierNick() {
		return this.supplierNick;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.distributor.products.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("end_time", this.endTime);
		txtParams.put("fields", this.fields);
		txtParams.put("item_ids", this.itemIds);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("pids", this.pids);
		txtParams.put("productcat_id", this.productcatId);
		txtParams.put("start_time", this.startTime);
		txtParams.put("supplier_nick", this.supplierNick);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<FenxiaoDistributorProductsGetResponse> getResponseClass() {
		return FenxiaoDistributorProductsGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(itemIds, 20, "itemIds");
		RequestCheckUtils.checkMaxListSize(pids, 30, "pids");
	}
	

}
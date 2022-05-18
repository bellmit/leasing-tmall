package com.taobao.api.response;

import com.taobao.api.TaobaoObject;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.Date;
import java.util.List;

/**
 * TOP API: alibaba.alicom.offline.commission.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlibabaAlicomOfflineCommissionQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6597932865937473664L;

	/** 
	 * 描述信息，目前查询条数限制500，时间范围3个月，超过会在这个字段给出提示
	 */
	@ApiField("desc")
	private String desc;

	/** 
	 * 指定时间范围内的佣金列表
	 */
	@ApiListField("shop_commission_list")
	@ApiField("shop_commission_dto")
	private List<ShopCommissionDto> shopCommissionList;

	/** 
	 * 指定时间范围的查询总数
	 */
	@ApiField("total_count")
	private Long totalCount;


	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc( ) {
		return this.desc;
	}

	public void setShopCommissionList(List<ShopCommissionDto> shopCommissionList) {
		this.shopCommissionList = shopCommissionList;
	}
	public List<ShopCommissionDto> getShopCommissionList( ) {
		return this.shopCommissionList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}
	
	/**
 * 单个用户的佣金条目
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class CommissionDto extends TaobaoObject {

	private static final long serialVersionUID = 4679817783516877495L;

	/**
		 * 描述
		 */
		@ApiField("desc")
		private String desc;
		/**
		 * 佣金（分）
		 */
		@ApiField("fee")
		private Long fee;
		/**
		 * 类型，1-阿里通信
		 */
		@ApiField("type")
		private Long type;
	

	public String getDesc() {
			return this.desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		public Long getFee() {
			return this.fee;
		}
		public void setFee(Long fee) {
			this.fee = fee;
		}
		public Long getType() {
			return this.type;
		}
		public void setType(Long type) {
			this.type = type;
		}

}

	/**
 * 指定时间范围内的佣金列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class ShopCommissionDto extends TaobaoObject {

	private static final long serialVersionUID = 5546433346888667184L;

	/**
		 * 单个用户的佣金条目
		 */
		@ApiListField("commission_list")
		@ApiField("commission_dto")
		private List<CommissionDto> commissionList;
		/**
		 * 充值手机号
		 */
		@ApiField("phone_no")
		private String phoneNo;
		/**
		 * 店铺id
		 */
		@ApiField("shop_id")
		private String shopId;
		/**
		 * 交易成功时间
		 */
		@ApiField("trade_time")
		private Date tradeTime;
	

	public List<CommissionDto> getCommissionList() {
			return this.commissionList;
		}
		public void setCommissionList(List<CommissionDto> commissionList) {
			this.commissionList = commissionList;
		}
		public String getPhoneNo() {
			return this.phoneNo;
		}
		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}
		public String getShopId() {
			return this.shopId;
		}
		public void setShopId(String shopId) {
			this.shopId = shopId;
		}
		public Date getTradeTime() {
			return this.tradeTime;
		}
		public void setTradeTime(Date tradeTime) {
			this.tradeTime = tradeTime;
		}

}



}

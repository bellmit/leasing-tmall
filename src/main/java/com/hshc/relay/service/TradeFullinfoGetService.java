package com.hshc.relay.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.hshc.relay.controller.erp.StoreManageController;
import com.hshc.relay.dao.OrderDao;
import com.hshc.relay.dao.TradeDao;
import com.qimencloud.api.DefaultQimenCloudClient;
import com.qimencloud.api.QimenCloudClient;
import com.qimencloud.api.request.HshcRiskcontolOrdersReturnRequest;
import com.qimencloud.api.response.HshcRiskcontolOrdersReturnResponse;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.domain.Order;
import com.taobao.api.domain.Trade;
import com.taobao.api.request.TradeFullinfoGetRequest;
import com.taobao.api.response.TradeFullinfoGetResponse;
/**
 * 获取单笔交易的详细信息
 * @author 史珂
 * 2017年5月11日上午10:55:52
 */
@Service
public class TradeFullinfoGetService extends BaseService<TradeFullinfoGetResponse>{
	public static final Logger LOGGER = LoggerFactory.getLogger(StoreManageController.class); 
	
	@Autowired
	private AuthorizedSessionService asService;
	@Autowired
	private TradeDao tDao;
	@Autowired
	private OrderDao oDao;
	
	
	/*public TradeFullinfoGetResponse tradeFullinfo(Long tid) throws ApiException {
		TradeFullinfoGetRequest req = new TradeFullinfoGetRequest();
		req.setFields("tid,title,type,status,payment,est_con_time,receiver_name,receiver_state,receiver_address,receiver_mobile,receiver_phone,orders,buyer_nick");
		req.setTid(tid);
		TaobaoClient client = new DefaultTaobaoClient(getTopApi(), asService.getAppKey(), asService.getAppSecret());
		TradeFullinfoGetResponse rsp = client.execute(req, asService.getAuthorizedSession("花生好车旗舰店").getAccessToken());
	    //TradeFullinfoGetResponse rsp = (TradeFullinfoGetResponse)RequestTaobaoClientService.requset(req);
		Trade trade = rsp.getTrade();
		if(trade!=null){
		   //保存订单信息
		   addtradeFullinfo(trade);
		   //把数据传给erp
		   HshcRiskcontolOrdersReturnResponse erp = toErp(trade);
	   }
		return rsp;		
	}*/

	

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int modify(TradeFullinfoGetResponse res){
		Trade trade = res.getTrade();
		Long tid = trade.getTid();
		int i = 0;
		//修改主表信息
		i+= tDao.update(trade);
		List<Order> orders = trade.getOrders();
		for (Order order : orders) {
			order.setTid((long) tid);
			//修改子订单
		    i+= oDao.update(order);
		}
		return i;
	}
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public int add(TradeFullinfoGetResponse res){
		Trade trade = res.getTrade();
		Long tid = trade.getTid();
		int i = 0;
		//添加主订单信息
		i+= tDao.insert(trade);
		List<Order> orders = trade.getOrders();
		for (Order order : orders) {
			order.setTid((long) tid);
			//保存子订单
			i+=oDao.insert(order);
		}
		return i;
	}
	
	public HshcRiskcontolOrdersReturnResponse toErp(Trade trade) throws ApiException {
		//trade.setOrders(null);
		//实体转化json
		QimenCloudClient client = new DefaultQimenCloudClient(getReturnUrl(), asService.getAppKey(), asService.getAppSecret());
		String str=JSON.toJSONStringWithDateFormat(trade, "yyyy-MM-dd HH:mm:ss",SerializerFeature.DisableCircularReferenceDetect);
		HshcRiskcontolOrdersReturnRequest parseObject = JSON.parseObject(str, HshcRiskcontolOrdersReturnRequest.class, Feature.UseBigDecimal);
		parseObject.setTargetAppKey(asService.getAppKey());
		HshcRiskcontolOrdersReturnResponse rsp = client.execute(parseObject);
		LOGGER.info("rsp:"+rsp.getBody());
		
		//HshcRiskcontolOrdersReturnResponse res= (HshcRiskcontolOrdersReturnResponse)RequestQimenCloudClientService.client().execute(parseObject);
		return rsp;
	}

	
}

package com.hshc.relay.service;

import com.taobao.api.domain.Order;
import com.taobao.api.response.TradeFullinfoGetResponse;

import java.util.List;

/**
 * Created by wanghuaying on 2017/5/16.
 */
public class TradeFullinfoGetResponseService extends BaseService<TradeFullinfoGetResponse> {
    @Override
    public int modify(TradeFullinfoGetResponse tradeFullinfoGetResponse) {
        return baseDao.update(tradeFullinfoGetResponse);
    }

    @Override
    public int add(TradeFullinfoGetResponse tradeFullinfoGetResponse) {
        int i=0;
        //持久化主订单
        if (tradeFullinfoGetResponse != null && tradeFullinfoGetResponse.getTrade() != null) {
            i=i+baseDao.insert(tradeFullinfoGetResponse);
        }

        //持久化子订单
        if (tradeFullinfoGetResponse != null && tradeFullinfoGetResponse.getTrade() != null && tradeFullinfoGetResponse.getTrade().getOrders() != null) {
            for (Order order : tradeFullinfoGetResponse.getTrade().getOrders()) {
                order.setTid(tradeFullinfoGetResponse.getTrade().getTid());
                i=i+baseDao.insert(tradeFullinfoGetResponse);
            }
        }
        return i;
    }

}
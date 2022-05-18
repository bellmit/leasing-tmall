package com.hshc.relay.dao;

import org.springframework.stereotype.Repository;

import com.taobao.api.domain.Trade;

import java.util.Map;

/**
 * 主订单
 * @author 史珂
 * 2017年5月11日下午2:18:45
 */
@Repository
public interface TradeDao extends BaseDao<Trade>{

	int selectInt(Long tid);

	int updateSendStatu(Map<String,String> param);
}

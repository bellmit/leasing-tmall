package com.hshc.relay.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.taobao.api.response.TmallCarLeaseTailpaymentbackResponse;
/**
 * 尾款处置方案回传
 * @author 史珂
 * 2017年5月10日下午3:28:04
 */
@Repository
public interface CarLeaseTailpaymentbackDao extends BaseDao<TmallCarLeaseTailpaymentbackResponse>{

	int insertMap(Map<String, Object> map);

}

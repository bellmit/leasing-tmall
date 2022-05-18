package com.hshc.relay.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.taobao.api.response.TmallCarLeaseConsumeResponse;
/**
 * 汽车租赁核销
 * @author 史珂
 * 2017年5月10日下午1:50:46
 */
@Repository
public interface CarLeaseConsumeDao extends BaseDao<TmallCarLeaseConsumeResponse>{

	int insertMap(Map<String, Object> mapResult);

}

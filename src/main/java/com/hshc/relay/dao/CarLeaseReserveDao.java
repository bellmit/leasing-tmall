package com.hshc.relay.dao;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.taobao.api.response.TmallCarLeaseReserveResponse;
/**
 * 整车租车回传预约信息
 * @author 史珂
 * 2017年5月9日下午3:14:51
 */

@Repository
public interface CarLeaseReserveDao extends BaseDao<TmallCarLeaseReserveResponse>{

	int insertMap(Map<String, Object> map);

}

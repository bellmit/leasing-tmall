package com.hshc.relay.dao;

import com.taobao.api.request.TmallCarLeaseSynchronizeplansRequest;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * 租赁方案同步请求对象
 * @author 王华英
 * @version  v 1.0 2017年5月16日16:01:14
 */
@Repository
public interface TmallCarLeaseSynchronizeplansRequestDao extends BaseDao<TmallCarLeaseSynchronizeplansRequest>{

    int updateSendStatu (Map<String,String> param);

}

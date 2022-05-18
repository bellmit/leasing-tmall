package com.hshc.relay.dao;

import com.taobao.api.request.ScitemAddRequest;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * 发布后端商品
 * @version v1.0 2017年5月18日15:53:02
 * @author  王华英
 */
@Repository
public interface ScitemAddRequestDao extends BaseDao<ScitemAddRequest> {
    int updateSendStatu(Map<String,String> param);

}

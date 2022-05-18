package com.hshc.relay.dao;

import com.taobao.api.request.ScitemMapAddRequest;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * Created by wanghuaying on 2017/5/8.
 */
@Repository
public interface ScitemMapAddRequestDao extends BaseDao<ScitemMapAddRequest> {
    int updateSendStatu(Map<String,String> param);
}

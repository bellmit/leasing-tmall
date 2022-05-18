package com.hshc.relay.dao;

import com.taobao.api.request.ItemSellerGetRequest;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * Created by wanghuaying on 2017/5/9.
 */
@Repository
public interface ItemSellerGetRequestDao extends BaseDao<ItemSellerGetRequest>{
    int updateSendStatu(Map<String,String> param);
}

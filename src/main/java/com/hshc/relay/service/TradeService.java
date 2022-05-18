package com.hshc.relay.service;

import com.alibaba.fastjson.JSON;
import com.taobao.api.internal.util.WebUtils;
import com.taobao.api.response.TradeFullinfoGetResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 钟林俊
 * @version V1.0 2017-05-09 10:27
 */
@Service
public class TradeService extends BaseService<TradeFullinfoGetResponse> {

    @Autowired
    private AuthorizedSessionService authorizedSessionService;

    @Async
    public void transferToErp(TradeFullinfoGetResponse tradeFullinfoGetResponse) throws IOException {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json;charset=utf-8");

        String ret = WebUtils.doPost("", JSON.toJSONString(tradeFullinfoGetResponse), "utf-8", 30000, 30000, headers);
    }

}

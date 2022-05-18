package com.hshc.relay.service.messagehandler;

import com.hshc.relay.service.BaseService;
import com.taobao.api.ApiException;
import com.taobao.api.internal.tmc.Message;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

/**
 * @author 钟林俊
 * @version V1.0 2017-05-10 13:38
 */
@Service
public class ItemUpdateMessageHandler extends BaseService implements HshcMessageHandler {

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void handle(Message message) throws ApiException, IOException {
    }

}

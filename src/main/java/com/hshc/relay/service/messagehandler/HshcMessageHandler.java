package com.hshc.relay.service.messagehandler;

import com.taobao.api.ApiException;
import com.taobao.api.internal.tmc.Message;

import java.io.IOException;

/**
 * @author 钟林俊
 * @version V1.0 2017-05-09 14:04
 */
public interface HshcMessageHandler {

    void handle(Message message) throws ApiException, IOException;

}

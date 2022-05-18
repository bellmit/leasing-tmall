package com.hshc.relay.controller;

import com.alibaba.fastjson.JSON;
import com.hshc.relay.exception.InvalidQimenSignException;
import com.hshc.relay.service.AuthorizedSessionService;
import com.taobao.api.internal.spi.CheckResult;
import com.taobao.api.internal.spi.SpiUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author 钟林俊
 * @version V1.0 2017-05-16 09:34
 */
public class QimenStreamController extends BaseController{

    @Autowired
    private AuthorizedSessionService authorizedSessionService;

    @ModelAttribute("requestBody")
    public String getRequestBody(HttpServletRequest request) throws IOException {
        String appSecret = authorizedSessionService.getAppSecret();
        CheckResult checkResult = SpiUtils.checkSign(request, appSecret);
        logger.info("qimen stream checkResult: " + JSON.toJSONString(checkResult));
        if(!checkResult.isSuccess()){
            throw new InvalidQimenSignException();
        }

        return checkResult.getRequestBody();
    }

}

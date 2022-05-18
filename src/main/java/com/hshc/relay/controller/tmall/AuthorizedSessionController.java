package com.hshc.relay.controller.tmall;

import com.alibaba.fastjson.JSON;
import com.hshc.relay.entity.AuthorizedSession;
import com.hshc.relay.controller.BaseController;
import com.hshc.relay.exception.BaseException;
import com.hshc.relay.service.AuthorizedSessionService;
import com.hshc.relay.vo.BaseResponseVo;
import com.taobao.api.internal.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 钟林俊
 * @version V1.0 2017-05-06 16:31
 */
@Controller
public class AuthorizedSessionController extends BaseController {

    @Autowired
    private AuthorizedSessionService authorizedSessionService;

    @RequestMapping("/session-auth")
    @ResponseBody
    public BaseResponseVo retrieveCode(@RequestParam(name = "code", required = true) String code) throws IOException {
        logger.info("code: " + code);

        Map<String, String> params = new HashMap<>();
        params.put("client_id", authorizedSessionService.getAppKey());
        params.put("client_secret", authorizedSessionService.getAppSecret());
        params.put("grant_type", "authorization_code");
        params.put("redirect_uri", authorizedSessionService.getRedirectUri());
        params.put("code", code);

        String s = WebUtils.doPost(authorizedSessionService.getTokenUrl(), params, 15000, 15000);
        logger.info("authorized session: " + s);

        if(s.contains("error")){
            @SuppressWarnings("unchecked")
            Map<String, Object> result = (Map<String, Object>) JSON.parse(s);
            if(result.get("error") != null){
                throw new BaseException("400", (String) result.get("error_description"));
            }
            throw new BaseException("401", "未知错误！");
        }else{
            AuthorizedSession authorizedSession = JSON.parseObject(s, AuthorizedSession.class);
            // 防止url编码
            authorizedSession.setTaobaoUserNick(URLDecoder.decode(authorizedSession.getTaobaoUserNick(), "utf-8"));
            if(authorizedSession.getSubTaobaoUserNick() != null){
                authorizedSession.setSubTaobaoUserNick(URLDecoder.decode(authorizedSession.getSubTaobaoUserNick(), "utf-8"));
            }

            if(authorizedSessionService.modify(authorizedSession) == 0){
                authorizedSessionService.add(authorizedSession);
            }

            return new BaseResponseVo();
        }
    }

}

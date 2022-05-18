package com.hshc.relay.interceptor;

import com.alibaba.fastjson.JSON;
import com.hshc.relay.annotation.QimenSignAuthentication;
import com.hshc.relay.exception.InvalidQimenSignException;
import com.hshc.relay.service.AuthorizedSessionService;
import com.hshc.relay.vo.BaseQimenResponseVo;
import com.taobao.api.internal.spi.SpiUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 钟林俊
 * @version V1.0 2017-05-07 11:33
 */
public class QimenSignInterceptor extends HandlerInterceptorAdapter {

    private static final Logger LOGGER = LoggerFactory.getLogger(QimenSignInterceptor.class);

    @Autowired
    private AuthorizedSessionService authorizedSessionService;

    /**
     * This implementation always returns {@code true}.
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        try{
            if (handler.getClass().isAssignableFrom(HandlerMethod.class)) {
                QimenSignAuthentication annotation = ((HandlerMethod) handler).getMethodAnnotation(QimenSignAuthentication.class);
                if (annotation != null) {
                    LOGGER.debug("qimen queryString: " + request.getQueryString());
                    String appSecret = authorizedSessionService.getAppSecret();
                    if(!SpiUtils.checkSign(request, appSecret).isSuccess()){
                        throw new InvalidQimenSignException();
                    }
                }
            }
        }catch (Exception e){
            LOGGER.error("", e);

            String subCode = e.getClass().getSimpleName();
            String subMessage = e.getMessage();

            if(e instanceof InvalidQimenSignException){
                subCode = ((InvalidQimenSignException)e).getCode();
            }

            BaseQimenResponseVo qimenCloudResponse = new BaseQimenResponseVo();
            qimenCloudResponse.setFlag("failure");
            qimenCloudResponse.setSubCode(subCode);
            qimenCloudResponse.setSubMessage(subMessage);

            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            response.setContentType("application/json;charset=utf-8");
            response.getWriter().write(JSON.toJSONString(qimenCloudResponse));

            return false;
        }

        return true;
    }
}

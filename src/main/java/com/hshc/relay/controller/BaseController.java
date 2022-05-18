package com.hshc.relay.controller;

import com.hshc.relay.exception.BaseException;
import com.qimencloud.api.QimenCloudResponse;
import com.taobao.api.ApiException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
public abstract class BaseController
{
    protected static final Logger logger = LoggerFactory.getLogger(BaseController.class);

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public QimenCloudResponse errorResponse(Exception e, HttpServletResponse response) {
        logger.error("", e);
        response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        QimenCloudResponse qimenCloudResponse = new QimenCloudResponse();
        String code = e.getClass().getSimpleName();
        String message = e.getMessage();
        if(e instanceof BindException){
            BindException bindException = (BindException) e;
            BindingResult bindingResult = bindException.getBindingResult();
            if(bindingResult.hasErrors()){
                message = "验证失败：";
                for(FieldError fieldError : bindingResult.getFieldErrors()){
                    message += fieldError.getDefaultMessage() + " ";
                }
            }
        } else if (e instanceof BaseException) {
            BaseException baseException = (BaseException) e;
            code = baseException.getCode();
            message = e.getMessage();
        } else if (e instanceof ApiException){
            ApiException apiException = (ApiException) e;
            code = apiException.getSubErrCode();
            message = apiException.getSubErrMsg();
        }
        qimenCloudResponse.setFlag("failure");
        qimenCloudResponse.setSubCode(code);
        qimenCloudResponse.setSubMessage(message);
        return qimenCloudResponse;
    }

}

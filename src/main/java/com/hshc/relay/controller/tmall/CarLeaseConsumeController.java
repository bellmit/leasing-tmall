package com.hshc.relay.controller.tmall;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.hshc.relay.annotation.QimenSignAuthentication;
import com.hshc.relay.controller.BaseController;
import com.hshc.relay.controller.erp.StoreManageController;
import com.hshc.relay.service.CarLeaseConsumeService;
import com.hshc.relay.vo.BaseQimenResponseVo;
import com.taobao.api.request.TmallCarLeaseConsumeRequest;
import com.taobao.api.request.TmallCarLeaseConsumeRequest.CosumeCodeReqDto;
import com.taobao.api.request.TmallCarLeaseTailpaymentbackRequest.TailPaymentDto;
import com.taobao.api.response.TmallCarLeaseConsumeResponse;
/**
 * 汽车租赁核销
 * @author 史珂
 * 2017年5月10日上午00:07:45
 */
@Controller
public class CarLeaseConsumeController extends BaseController {

	public static final Logger LOGGER = LoggerFactory.getLogger(StoreManageController.class); 
	
	@Autowired
	CarLeaseConsumeService clcService;
	
	
	@RequestMapping("/lease-consume")
	@ResponseBody
	@QimenSignAuthentication
	public BaseQimenResponseVo leaseConsume(TmallCarLeaseConsumeRequest res){
		TmallCarLeaseConsumeResponse rsp = new TmallCarLeaseConsumeResponse();
		try {
			//获取返回参数
			LOGGER.info("111:"+res.getCosumeCodeReqDTO());
			rsp = clcService.leaseConsume(res);
			LOGGER.info("leaseConsume:"+rsp.getBody());
		    //保存核销返回信息
			
			clcService.addleaseConsume(rsp.getResult());
		} catch (Exception e) {
			new BaseQimenResponseVo(false,JSON.toJSONString(rsp));
		}
		return 	new BaseQimenResponseVo(true,JSON.toJSONString(rsp));

	}
}

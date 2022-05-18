package com.hshc.relay.controller.tmall;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.hshc.relay.annotation.QimenSignAuthentication;
import com.hshc.relay.controller.BaseController;
import com.hshc.relay.controller.erp.StoreManageController;
import com.hshc.relay.service.CarLeaseTailpaymentbackService;
import com.hshc.relay.vo.BaseQimenResponseVo;
import com.taobao.api.request.TmallCarLeaseTailpaymentbackRequest;
import com.taobao.api.response.TmallCarLeaseTailpaymentbackResponse;
/**
 * 尾款处置方案回传
 * @author 史珂
 * 2017年5月10日下午2:58:40
 */
@Controller
public class CarLeaseTailpaymentbackController extends BaseController {

	public static final Logger LOGGER = LoggerFactory.getLogger(StoreManageController.class); 

	@Autowired
	private CarLeaseTailpaymentbackService cltService;
	
	@RequestMapping("/lease-tailpaymentback")
	@ResponseBody
	@QimenSignAuthentication
	public BaseQimenResponseVo leaseTailpaymentback(TmallCarLeaseTailpaymentbackRequest req){
		TmallCarLeaseTailpaymentbackResponse rsp = new TmallCarLeaseTailpaymentbackResponse();
		try {
			LOGGER.info("leaseTailpaymentback:"+req.getTailPaymentDTO());
			//获取返回值
			rsp = cltService.leaseTailpaymentback(req);
			LOGGER.info("leaseTailpaymentback:"+rsp.getBody());
			//保存返回的信息
			cltService.addleaseTailpaymentback(rsp.getResult());
		} catch (Exception e) {
			return new BaseQimenResponseVo(false,JSON.toJSONString(rsp));
		}
		return new BaseQimenResponseVo(true,JSON.toJSONString(rsp));
	}
}

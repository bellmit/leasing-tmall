package com.hshc.relay.controller.erp;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.hshc.relay.annotation.QimenSignAuthentication;
import com.hshc.relay.controller.BaseController;
import com.hshc.relay.service.InventoryMerchantAdjustService;
import com.hshc.relay.vo.BaseQimenResponseVo;
import com.taobao.api.request.InventoryMerchantAdjustRequest;
import com.taobao.api.request.InventoryMerchantAdjustRequest.InventoryCheckDetailDto;
import com.taobao.api.request.InventoryMerchantAdjustRequest.InventoryCheckDto;
import com.taobao.api.response.InventoryMerchantAdjustResponse;
/**
 * taobao.inventory.merchant.adjust (货品库存商家端调整)
 * @author 吴国伟
 *
 */
@Controller
public class InventoryMerchantAdjustController extends BaseController{

	private Logger logger =Logger.getLogger(InventoryMerchantAdjustController.class);
	@Autowired
	private InventoryMerchantAdjustService inventoryMerchantAdjustService;
	
	
	@RequestMapping("/merchant-adjust")
	@ResponseBody
	@QimenSignAuthentication
	public BaseQimenResponseVo inventoryMerchantAdjust(InventoryMerchantAdjustRequest inventoryMerchantAdjustRequest){
		InventoryMerchantAdjustResponse rsp = new InventoryMerchantAdjustResponse();
		try {
		   rsp = inventoryMerchantAdjustService.InventoryMerchantAdjust(inventoryMerchantAdjustRequest);
		   logger.info("body="+JSON.toJSONString(rsp));
		} catch (Exception e) {
			new BaseQimenResponseVo(false,JSON.toJSONString(rsp));
		}
		return new BaseQimenResponseVo(true,JSON.toJSONString(rsp));
	}
}

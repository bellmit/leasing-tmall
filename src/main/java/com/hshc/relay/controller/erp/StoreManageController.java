package com.hshc.relay.controller.erp;

import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.hshc.relay.annotation.QimenSignAuthentication;
import com.hshc.relay.controller.BaseController;
import com.hshc.relay.service.AuthorizedSessionService;
import com.hshc.relay.service.RequestTaobaoClientService;
import com.hshc.relay.service.StoreManageService;
import com.hshc.relay.vo.BaseQimenResponseVo;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.domain.Store;
import com.taobao.api.request.InventoryStoreManageRequest;
import com.taobao.api.response.InventoryStoreManageResponse;

/**
 * 创建/更新仓库
 * @author 史珂 2017年5月7日09:56:18
 *
 */
@Controller
public class StoreManageController extends BaseController{

	public static final Logger LOGGER = LoggerFactory.getLogger(StoreManageController.class); 

	@Autowired
	protected StoreManageService smService;

	
	@RequestMapping("/lease-storeManage")
	@ResponseBody
	@QimenSignAuthentication
	public BaseQimenResponseVo storeManager(@Valid InventoryStoreManageRequest smr){
		//调用
		InventoryStoreManageResponse res;
		try {
			//获得返回值
			Store store = smService.getStoreManage(smr);
			//res.getBody()返回值 json
			//结果存储对应表
			System.out.println("==========="+store);
			if(smr.getOperateType().equals("ADD")||smr.getOperateType()=="ADD"){
				smService.addStoreList(store);
			}else if(smr.getOperateType().equals("UPDATE")||smr.getOperateType()=="UPDATE"){
				smService.upStoreList(store);
			}
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new BaseQimenResponseVo("创建/更新成功");
	}


}

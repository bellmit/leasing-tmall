package com.hshc.relay.controller.erp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hshc.relay.annotation.QimenSignAuthentication;
import com.hshc.relay.controller.BaseController;
import com.hshc.relay.service.StoreQueryService;
import com.hshc.relay.vo.BaseQimenResponseVo;
import com.taobao.api.response.InventoryStoreQueryResponse;
/**
 * 查询仓库信息
 * @author 史珂
 * 2017年5月10日下午5:02:09
 */
@Controller
public class StoreQueryController extends BaseController{
	
	public static final Logger LOGGER = LoggerFactory.getLogger(StoreManageController.class); 
	
	@Autowired
	private StoreQueryService sqService;
	
	@RequestMapping("/lease-storeQuery")
	@ResponseBody
	@QimenSignAuthentication
	public BaseQimenResponseVo storeQuery(@RequestParam("store_code") String storeCode){
		try {
			//获取仓库信息
			InventoryStoreQueryResponse storeQuery = sqService.storeQuery(storeCode);
			LOGGER.info("storeQuery:"+storeQuery.getBody());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return new BaseQimenResponseVo("查询仓库信息成功");
	}
}

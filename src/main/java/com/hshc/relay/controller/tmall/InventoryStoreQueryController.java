package com.hshc.relay.controller.tmall;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.InventoryStoreQueryRequest;
import com.taobao.api.response.InventoryStoreQueryResponse;

/**
 * 
 * @author 吴国伟
 *
 */
@Controller
public class InventoryStoreQueryController {
	
	private static Logger logger = Logger.getLogger(InventoryStoreQueryController.class);
	private static String url="http://gw.api.taobao.com/router/rest";
	private static String appkey="23795481";
	private static String secret="2757dd39ca8bda28fdf14f3bafac622d";
	private static String sessionKey="6101611e49d4f6c78531879a3db2a337910b2908787de723164940675";

	@RequestMapping("/storeQuery")
	public void inventoryStoreQuery(){
		TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
		InventoryStoreQueryRequest req = new InventoryStoreQueryRequest();
		//req.setStoreCode("ABC0001");
		InventoryStoreQueryResponse rsp;
		try {
			rsp = client.execute(req, sessionKey);
			logger.info(rsp.getBody());
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

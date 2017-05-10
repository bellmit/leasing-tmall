package com.hshc.relay.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.InventoryMerchantAdjustRequest;
import com.taobao.api.response.InventoryMerchantAdjustResponse;
/**
 * 
 * @author 吴国伟
 *
 */
@Service
public class InventoryMerchantAdjustService extends BaseService<InventoryMerchantAdjustRequest>{

	@Autowired
    private AuthorizedSessionService authorizedSessionService;

	/**
	 * 
	 * @param sc_item_id 后端商品ID
	 * @param quantity 调整数量  +-值
	 */
	public void InventoryMerchantAdjust(InventoryMerchantAdjustRequest inventoryMerchantAdjustRequest) throws ApiException{
        TaobaoClient client = new DefaultTaobaoClient("http://gw.api.taobao.com/router/rest", authorizedSessionService.getAppKey(), authorizedSessionService.getAppSecret());
		InventoryMerchantAdjustResponse rsp = client.execute(inventoryMerchantAdjustRequest, authorizedSessionService.getAuthorizedSession("花生好车旗舰店").getAccessToken());
		System.out.println(rsp.getBody());
	}
}

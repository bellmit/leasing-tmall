package com.hshc.relay.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.InventoryQueryRequest;
import com.taobao.api.request.ItemAddRequest;
import com.taobao.api.response.InventoryQueryResponse;
import com.taobao.api.response.ItemAddResponse;

/**
 * taobao.inventory.query (查询商品库存信息)
 * @author 吴国伟
 *
 */
@Service
public class InventoryQueryService extends BaseService<InventoryQueryRequest> {
	@Autowired
	private AuthorizedSessionService authorizedSessionService;
	
	public InventoryQueryResponse inventoryQuery(InventoryQueryRequest inventoryQueryRequest) throws ApiException {

        TaobaoClient client = new DefaultTaobaoClient(inventoryQueryRequest.getApiMethodName(), authorizedSessionService.getAppKey(), authorizedSessionService.getAppSecret());

        return client.execute(inventoryQueryRequest, authorizedSessionService.getAuthorizedSession("花生好车旗舰店").getAccessToken());

    }

}

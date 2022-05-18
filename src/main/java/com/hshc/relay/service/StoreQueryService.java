package com.hshc.relay.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hshc.relay.dao.StoreManageDao;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.InventoryStoreQueryRequest;
import com.taobao.api.response.InventoryStoreQueryResponse;
/**
 * 查询仓库信息
 * @author 史珂
 * 2017年5月10日下午5:21:52
 */
@Service
public class StoreQueryService extends BaseService<InventoryStoreQueryResponse> {

	@Autowired
	private AuthorizedSessionService asService;
	@Autowired
	private StoreManageDao smDao;
	
	public InventoryStoreQueryResponse storeQuery(String storeCode) throws ApiException {
		InventoryStoreQueryRequest req = new InventoryStoreQueryRequest();
		req.setStoreCode(storeCode);
		TaobaoClient client = new DefaultTaobaoClient("http://gw.api.taobao.com/router/rest", asService.getAppKey(), asService.getAppSecret());
		InventoryStoreQueryResponse rsp = client.execute(req, asService.getAuthorizedSession("花生好车旗舰店").getAccessToken());
		return rsp;
	}

	
}

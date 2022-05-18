package com.hshc.relay.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hshc.relay.dao.StoreManageDao;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.domain.Store;
import com.taobao.api.request.InventoryStoreManageRequest;
import com.taobao.api.response.InventoryStoreManageResponse;
/**
 * 创建更新仓库
 * @author 史珂
 *
 */
@Service
public class StoreManageService extends BaseService<Store>{

	@Autowired
	protected StoreManageDao smDao;
	@Autowired
	private AuthorizedSessionService asService;
	
	@Transactional(rollbackFor = Exception.class)
	public void addStoreList(Store storeManage) {
		smDao.insert(storeManage);
	}
	
	@Transactional(rollbackFor = Exception.class)
	public void upStoreList(Store storeManage) {
		smDao.update(storeManage);
	}

	public Store getStoreManage(InventoryStoreManageRequest smr) throws ApiException {
		TaobaoClient client = new DefaultTaobaoClient("http://gw.api.taobao.com/router/rest",asService.getAppKey(), asService.getAppSecret());
		InventoryStoreManageResponse res = client.execute(smr, asService.getAuthorizedSession("花生好车旗舰店").getAccessToken());
		Store store = res.getStoreList().get(0);
		return store;
	}

}

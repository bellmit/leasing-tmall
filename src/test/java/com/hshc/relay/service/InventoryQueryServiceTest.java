package com.hshc.relay.service;

import com.hshc.relay.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hshc.relay.BaseTest;
import com.taobao.api.ApiException;
import com.taobao.api.request.InventoryQueryRequest;
import com.taobao.api.response.InventoryQueryResponse;

/**
 * taobao.inventory.query (查询商品库存信息)
 * @author 吴国伟
 *
 */
public class InventoryQueryServiceTest extends BaseTest{

	@Autowired
	private InventoryQueryService inventoryQueryService;
	
	@Test
	public void inventoryQueryTest() throws ApiException{
//		InventoryQueryRequest req = new InventoryQueryRequest();
//		req.setScItemIds("550354838075");
//		//req.setScItemCodes("GLY201210120001^GLY23214141");
//		//req.setSellerNick("Nike");
//		//req.setStoreCodes("GLY001^GLY002");
//		InventoryQueryResponse rsp = inventoryQueryService.inventoryQuery(req);
//		Assert.assertNotNull(rsp);
	}
}

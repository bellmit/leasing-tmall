package com.hshc.relay.service;

import com.hshc.relay.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hshc.relay.BaseTest;
import com.taobao.api.ApiException;
import com.taobao.api.request.ItemAddRequest;
import com.taobao.api.request.ItemSellerGetRequest;
import com.taobao.api.response.ItemAddResponse;
import com.taobao.api.response.ItemSellerGetResponse;

/**
 * @author 钟林俊
 * @version V1.0 2017-05-08 14:18
 */
public class ItemServiceTest extends BaseTest {

    @Autowired
    private ItemService itemService;

    @Test
    public void testAddItemRequest() throws ApiException {
        ItemAddRequest itemAddRequest = new ItemAddRequest();
        // TODO 设置itemAddRequest的值
        ItemAddResponse itemAddResponse = itemService.addItemRequest(itemAddRequest);

        Assert.assertNotNull(itemAddResponse);

    }

    @Test
    public void testGetItem() throws ApiException {
        ItemSellerGetRequest itemSellerGetRequest = new ItemSellerGetRequest();

        itemSellerGetRequest.setFields("sku");
        itemSellerGetRequest.setNumIid(549072390595L);
//        itemSellerGetRequest.setNumIid(549102259028L);

        ItemSellerGetResponse response = itemService.getItem(itemSellerGetRequest);

        Assert.assertNotNull(response);

    }

}

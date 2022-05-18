package com.hshc.relay.service;

import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.ItemAddRequest;
import com.taobao.api.request.ItemSellerGetRequest;
import com.taobao.api.response.ItemAddResponse;
import com.taobao.api.response.ItemSellerGetResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 钟林俊
 * @version V1.0 2017-05-08 14:03
 */
@Service
public class ItemService extends BaseService<ItemAddRequest> {

    @Autowired
    private AuthorizedSessionService authorizedSessionService;


    public ItemAddResponse addItemRequest(ItemAddRequest itemAddRequest) throws ApiException {

        TaobaoClient client = new DefaultTaobaoClient(itemAddRequest.getApiMethodName(), authorizedSessionService.getAppKey(), authorizedSessionService.getAppSecret());

        return client.execute(itemAddRequest, authorizedSessionService.getAuthorizedSession("sandbox_taobao1234").getAccessToken());

    }


    public ItemSellerGetResponse getItem(ItemSellerGetRequest request) throws ApiException {
        TaobaoClient client = new DefaultTaobaoClient("http://gw.api.taobao.com/router/rest", authorizedSessionService.getAppKey(), authorizedSessionService.getAppSecret());

        return client.execute(request, authorizedSessionService.getAuthorizedSession("花生好车旗舰店").getAccessToken());

    }
}

package com.hshc.relay.controller.tmall;

import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.internal.util.StringUtils;
import com.taobao.api.request.FenxiaoDistributorProductsGetRequest;
import com.taobao.api.response.FenxiaoDistributorProductsGetResponse;

/**
 * Created by wanghuaying on 2017/5/5.
 */
public class FenxiaoDistributorProductsGet {

    public static void test() {
        String url = "http://gw.api.tbsandbox.com/router/rest";
        String appkey = "23795481";
        String secret = "2757dd39ca8bda28fdf14f3bafac622d";
        try{
            TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
            FenxiaoDistributorProductsGetRequest req = new FenxiaoDistributorProductsGetRequest();
            req.setEndTime(StringUtils.parseDateTime("2000-01-01 00:00:00"));
            req.setFields("skus");
            req.setItemIds("1001,1002,1003,1004,1005");
            req.setProductcatId(3232312L);
            req.setPids("1001,1002,1003,1004,1005");
            req.setStartTime(StringUtils.parseDateTime("2000-01-01 00:00:00"));
            req.setPageNo(1L);
            req.setPageSize(20L);
            req.setSupplierNick("test");
            String sessionKey = "";
            FenxiaoDistributorProductsGetResponse rsp = client.execute(req, sessionKey);
        }catch (ApiException e){
            System.out.println("出错啦："+e);
        }
    }
}

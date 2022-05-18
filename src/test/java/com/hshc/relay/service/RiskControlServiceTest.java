//package com.hshc.relay.service;
//
//import com.alibaba.fastjson.JSON;
//import com.hshc.relay.BaseTest;
//import com.hshc.relay.entity.riskcontrol.Customer;
//import com.taobao.api.ApiException;
//import com.taobao.api.response.TmallCarLeaseRiskcallbackResponse;
//import org.junit.Assert;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.UUID;
//
///**
// * @author 钟林俊
// * @version V1.0 2017-05-12 10:14
// */
//public class RiskControlServiceTest extends BaseTest {
//
//    @Autowired
//    private RiskControlService riskControlService;
//
//    @Test
//    public void testSaveCustomer(){
//        Customer customer = new Customer();
//        customer.setName("张三");
//        customer.setMobile("13833883388");
//        customer.setIdentityNo("110101190001011111");
//        customer.setAddr("啊十分士大夫撒地方");
//        customer.setUuid(UUID.randomUUID().toString());
//
//        int added = riskControlService.add(customer);
//        Assert.assertEquals(added, 1);
//    }
//
//    @Test
//    public void testSendRiskControlResult() throws ApiException {
//        String uuid = "b7708d9f-504e-4a25-92f2-30380a69b05822";
//        TmallCarLeaseRiskcallbackResponse.Result result = riskControlService.sendRiskControlResult(uuid);
//        System.out.println(JSON.toJSONString(result));
//        Assert.assertNotNull(result);
//    }
//}

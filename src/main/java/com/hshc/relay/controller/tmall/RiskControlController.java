package com.hshc.relay.controller.tmall;

import com.hshc.relay.annotation.QimenSignAuthentication;
import com.hshc.relay.controller.BaseController;
import com.hshc.relay.entity.riskcontrol.Customer;
import com.hshc.relay.service.RiskControlService;
import com.hshc.relay.vo.BaseQimenResponseVo;
import com.taobao.api.ApiException;
import com.taobao.api.response.TmallCarLeaseRiskcallbackResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 钟林俊
 * @version V1.0 2017-05-07 16:49
 */
@RestController
@RequestMapping("/risk-control")
public class RiskControlController extends BaseController {

    @Autowired
    private RiskControlService riskControlService;

    @RequestMapping(value = "/customer")
    @QimenSignAuthentication
    public BaseQimenResponseVo acceptCustomerInfo(Customer customer, @RequestParam("identity_no") String identityNo, @RequestParam("item_id") long itemId){
        customer.setIdentityNo(identityNo);
        customer.setItemId(itemId);
        riskControlService.add(customer);

        return BaseQimenResponseVo.success();
    }

    @RequestMapping(value = "/return-top/{uuid}", method = RequestMethod.POST)
    public TmallCarLeaseRiskcallbackResponse.Result sendRiskControlResult(@PathVariable String uuid) throws ApiException {
        return riskControlService.sendRiskControlResult(uuid);
    }
}

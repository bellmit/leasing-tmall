package com.hshc.relay.controller.erp;

import com.alibaba.fastjson.JSON;
import com.hshc.relay.annotation.QimenSignAuthentication;
import com.hshc.relay.controller.BaseController;
import com.hshc.relay.entity.CLSynPlansResponse;
import com.hshc.relay.service.SynPlansService;
import com.taobao.api.ApiException;
import com.taobao.api.request.TmallCarLeaseSynchronizeplansRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 同步租赁方案信息
 * @author 王华英
 * @version V1.0 2017年5月6日16:54:25
 */
@Controller
public class SynPlansController extends BaseController{

    @Autowired
    private SynPlansService synPlansService;

    //同步租赁方案信息
    @RequestMapping("/lease-sysplans")
    @ResponseBody
    @QimenSignAuthentication
    public CLSynPlansResponse sysPlans(TmallCarLeaseSynchronizeplansRequest reqSyn)throws ApiException{
        List<TmallCarLeaseSynchronizeplansRequest.CarLeasePlanDo> plans = JSON.parseArray(reqSyn.getPlans(), TmallCarLeaseSynchronizeplansRequest.CarLeasePlanDo.class);
        reqSyn.setPlans(plans);
        return  synPlansService.sysPlans(reqSyn);
    }

}

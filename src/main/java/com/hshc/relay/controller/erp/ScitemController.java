package com.hshc.relay.controller.erp;

import com.hshc.relay.annotation.QimenSignAuthentication;
import com.hshc.relay.controller.BaseController;
import com.hshc.relay.entity.ISGetResponse;
import com.hshc.relay.entity.ScAddResponse;
import com.hshc.relay.entity.ScMapAddResponse;
import com.hshc.relay.service.ItemSellerService;
import com.hshc.relay.service.ScitemMapService;
import com.hshc.relay.service.ScitemService;
import com.hshc.relay.vo.BaseQimenResponseVo;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.domain.ScItem;
import com.taobao.api.request.ItemSellerGetRequest;
import com.taobao.api.request.ScitemAddRequest;
import com.taobao.api.request.ScitemMapAddRequest;
import com.taobao.api.response.ItemSellerGetResponse;
import com.taobao.api.response.ScitemAddResponse;
import com.taobao.api.response.ScitemMapAddResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 发布后端商品
 * @author 王华英
 * @version V1.0 2017年5月6日16:54:25
 */
@Controller
public class ScitemController extends BaseController{
    private static Logger LOGGER = LoggerFactory.getLogger(ScitemController.class);

    @Autowired
    private ScitemService scitemService;

    @Autowired
    private ScitemMapService scitemMapService;

    @Autowired
    private ItemSellerService itemSellerService;

    @RequestMapping("/add-scitem")
    @ResponseBody
    @QimenSignAuthentication
    public ScAddResponse addScitem(ScitemAddRequest scitemAddRequest)throws ApiException{
        return scitemService.addScitem(scitemAddRequest);
    }

    @RequestMapping("/get-seller")
    @ResponseBody
    @QimenSignAuthentication
    public ISGetResponse getItemSeller(ItemSellerGetRequest reqSc) throws ApiException{
        return itemSellerService.getItemSeller(reqSc);
    }

    @RequestMapping("/add-scitemmap")
    @ResponseBody
    @QimenSignAuthentication
    public ScMapAddResponse addScitemMap(ScitemMapAddRequest reqSc)throws ApiException{
        return scitemMapService.addScitemMap(reqSc);
    }





}
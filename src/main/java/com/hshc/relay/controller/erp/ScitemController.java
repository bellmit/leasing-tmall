package com.hshc.relay.controller.erp;

import com.hshc.relay.annotation.QimenSignAuthentication;
import com.hshc.relay.controller.BaseController;
import com.hshc.relay.entity.ISGetResponse;
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

    @RequestMapping("/add-scitem")
    @ResponseBody
    //@QimenSignAuthentication
    public ScitemAddResponse addScitem(@RequestBody ScitemAddRequest scitemAddRequest){
        ScitemAddResponse response=new ScitemAddResponse();
        System.out.print("发布后端商品_商品名称："+scitemAddRequest.getItemName());
        System.out.print("发布后端商品_商家编号："+scitemAddRequest.getOuterCode());
        try{
            response=scitemService.addScitem(scitemAddRequest);
        }catch(Exception e){
            System.out.print("发布后端商品："+e);
        }
        return response;
    }

    @RequestMapping("/get-seller")
    @ResponseBody
    @QimenSignAuthentication
    public ISGetResponse getItemSeller(ItemSellerGetRequest reqSc){
        ISGetResponse response=new ISGetResponse();
        try{
            response=scitemService.getItemSeller(reqSc);
        }catch(Exception e){
            System.out.print("获取单个商品详细信息："+e);
        }
        return response;
    }

    @RequestMapping("/add-scitemMap")
    @ResponseBody
//    @QimenSignAuthentication
    public ScitemMapAddResponse addScitemMap(@RequestBody ScitemMapAddRequest reqSc){

        ScitemMapAddResponse response=new ScitemMapAddResponse();
        System.out.print(reqSc.getOuterCode());
        System.out.print(reqSc.getItemId());
        System.out.print(reqSc.getSkuId());
        System.out.print(reqSc.getScItemId());
        System.out.print(reqSc.getNeedCheck());
        try {
            response=scitemService.addScitemMap(reqSc);
        }catch (Exception e){
            System.out.print("创建IC商品与后端商品的映射关系:"+e);
        }
        return response;
    }





}
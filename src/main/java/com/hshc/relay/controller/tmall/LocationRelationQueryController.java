package com.hshc.relay.controller.tmall;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.hshc.relay.controller.BaseController;
import com.hshc.relay.controller.erp.ScitemController;
import com.hshc.relay.service.LocationRelationEditService;
import com.hshc.relay.vo.BaseQimenResponseVo;
import com.taobao.api.ApiException;
import com.taobao.api.response.LocationRelationQueryResponse;

/**
 * taobao.location.relation.query (地点关联关系查询)
 * @author lenovo
 *
 */
@Controller
public class LocationRelationQueryController extends BaseController{
    private static Logger LOGGER = LoggerFactory.getLogger(ScitemController.class);

	@Autowired
	private LocationRelationEditService locationRelationEditService;

	@RequestMapping(value="/realtion-query")
	@ResponseBody
	public BaseQimenResponseVo locationRelationEdit()throws ApiException{
		LocationRelationQueryResponse  rsp =  new LocationRelationQueryResponse ();
		try{
	    rsp = locationRelationEditService.locationRelationQuery();
		LOGGER.info("getBody:"+JSON.toJSONString(rsp));
	} catch (Exception e) {
		new BaseQimenResponseVo(false,JSON.toJSONString(rsp));
	}
	return new BaseQimenResponseVo(true,JSON.toJSONString(rsp));
	}
	
}

package com.hshc.relay.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.hshc.relay.dao.CarLeaseConsumeDao;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.TmallCarLeaseConsumeRequest;
import com.taobao.api.request.TmallCarLeaseConsumeRequest.CosumeCodeReqDto;
import com.taobao.api.response.TmallCarLeaseConsumeResponse;
import com.taobao.api.response.TmallCarLeaseConsumeResponse.Result;
/**
 * 汽车租赁核销
 * @author 史珂
 * 2017年5月10日上午10:14:03
 */
@Service
public class CarLeaseConsumeService extends BaseService<TmallCarLeaseConsumeResponse> {

	@Autowired
	private AuthorizedSessionService asService;
	@Autowired
	private CarLeaseConsumeDao clcDao;
	
	public TmallCarLeaseConsumeResponse leaseConsume(TmallCarLeaseConsumeRequest req) throws ApiException {
		TaobaoClient client = new DefaultTaobaoClient(asService.getTopApi(), asService.getAppKey(), asService.getAppSecret());
		TmallCarLeaseConsumeResponse rsp = client.execute(req, asService.getAuthorizedSession("花生好车旗舰店").getAccessToken());
		//TmallCarLeaseConsumeResponse rsp = (TmallCarLeaseConsumeResponse)RequestTaobaoClientService.requset(req);
		return rsp;
	}

	@Transactional(rollbackFor = Exception.class)
	public void addleaseConsume(Result result) {
		Map<String, Object> mapResult = getMapResult(result);
		clcDao.insertMap(mapResult);
	}
	
	public Map<String,Object> getMapResult(Result result){
		Map<String,Object> map = new HashMap<>();
		map.put("costTime", result.getCostTime());
		map.put("errorCode", result.getErrorCode());
		map.put("errorMessage", result.getErrorMessage());
		map.put("gmtCurrentTime", result.getGmtCurrentTime());
		map.put("object", result.getObject());
		map.put("success", result.getSuccess());
		map.put("leaseType","汽车租赁核销");
		return map;
	}

	
}

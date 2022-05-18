package com.hshc.relay.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hshc.relay.dao.CarLeaseTailpaymentbackDao;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.TmallCarLeaseTailpaymentbackRequest;
import com.taobao.api.request.TmallCarLeaseTailpaymentbackRequest.TailPaymentDto;
import com.taobao.api.response.TmallCarLeaseTailpaymentbackResponse;
import com.taobao.api.response.TmallCarLeaseTailpaymentbackResponse.Result;
/**
 * 尾款处置方案回传
 * @author 史珂
 * 2017年5月10日下午3:13:03
 */
@Service
public class CarLeaseTailpaymentbackService extends BaseService<TmallCarLeaseTailpaymentbackResponse> {

	@Autowired
	private AuthorizedSessionService asService;
	@Autowired
	private CarLeaseTailpaymentbackDao cltDao;
	
	public TmallCarLeaseTailpaymentbackResponse leaseTailpaymentback(TmallCarLeaseTailpaymentbackRequest req) throws ApiException {
		TaobaoClient client = new DefaultTaobaoClient(getTopApi(), getAppKey(), getAppSecret());
		TmallCarLeaseTailpaymentbackResponse rsp = client.execute(req, asService.getAuthorizedSession("花生好车旗舰店").getAccessToken());
		//TmallCarLeaseTailpaymentbackResponse rsp = (TmallCarLeaseTailpaymentbackResponse)RequestTaobaoClientService.requset(req);
		return rsp;
	}

	@Transactional(rollbackFor = Exception.class)
	public void addleaseTailpaymentback(Result result) {
		 Map<String, Object> map = getMapResult(result);
		 cltDao.insertMap(map);
	}

	public Map<String,Object> getMapResult(Result result){
		Map<String,Object> map = new HashMap<>();
		map.put("costTime", result.getCostTime());
		map.put("errorCode", result.getErrorCode());
		map.put("errorMessage", result.getErrorMessage());
		map.put("gmtCurrentTime", result.getGmtCurrentTime());
		map.put("object", result.getObject());
		map.put("success", result.getSuccess());
		map.put("leaseType","尾款处置方案回传");
		return map;
	}

	
}

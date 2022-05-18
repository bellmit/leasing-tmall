package com.hshc.relay.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hshc.relay.dao.CarLeaseReserveDao;
import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.TmallCarLeaseReserveRequest;
import com.taobao.api.response.TmallCarLeaseReserveResponse;
import com.taobao.api.response.TmallCarLeaseReserveResponse.Result;
/**
 * 整车租车回传预约信息
 * @author 史珂 2017年5月9日14:00:43
 *
 */
@Service
public class CarLeaseReserveService extends BaseService<TmallCarLeaseReserveResponse>{

	@Autowired
	private AuthorizedSessionService asService;
	@Autowired
	private CarLeaseReserveDao clrDao;
	
	public TmallCarLeaseReserveResponse leaseReserve(TmallCarLeaseReserveRequest req) throws ApiException {
		// TODO Auto-generated method stub
		if(req.getBuyerId()==null||req.getBuyerId().equals("")){
			req.setBuyerId((long) 0);
		}
		
		TaobaoClient client = new DefaultTaobaoClient(asService.getTopApi(), asService.getAppKey(), asService.getAppSecret());
		TmallCarLeaseReserveResponse rsp = client.execute(req, asService.getAuthorizedSession("花生好车旗舰店").getAccessToken());
		//TmallCarLeaseReserveResponse rsp = (TmallCarLeaseReserveResponse)RequestTaobaoClientService.requset(req);
		return rsp;
	}

	@Transactional(rollbackFor = Exception.class)
	public void addLeaseReserve(TmallCarLeaseReserveResponse lr) {
		Result result = lr.getResult();
		Map<String, Object> map = getMapResult(result);
		clrDao.insertMap(map);
	}
	
	public Map<String,Object> getMapResult(Result result){
		Map<String,Object> map = new HashMap<>();
		map.put("costTime", result.getCostTime());
		map.put("errorCode", result.getErrorCode());
		map.put("errorMessage", result.getErrorMessage());
		map.put("gmtCurrentTime", result.getGmtCurrentTime());
		map.put("msgCode", result.getMsgCode());
		map.put("msgInfo", result.getMsgInfo());
		map.put("object", result.getObject());
		map.put("success", result.getSuccess());
		map.put("type", "整车租车回传预约信息");
		return map;
	}

}

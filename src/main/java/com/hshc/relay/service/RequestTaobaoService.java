package com.hshc.relay.service;

import org.springframework.stereotype.Service;

import com.taobao.api.ApiException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.TaobaoResponse;

@Service
public class RequestTaobaoService{
	
	/*public static String url="http://gw.api.tbsandbox.com/router/rest";
	public static String appkey="1023795481";
	public static String secret="sandbox9ca8bda28fdf14f3bafac622d";
	public static String sessionKey="61029181acaa6b8b009b7b36c4193164e6fe55c7c62656b2054399034";
*/	//public static String sessionKey="610110384351ea3cc2c070ed53f79925000f317cbcceaa92054718217";
	//public static String sessionKey="61012282c758f7202e29753cfc802723d7861447b3d21112076226627";
	//public static String sessionKey="61029181acaa6b8b009b7b36c4193164e6fe55c7c62656b2054399034";
	private static String url="http://gw.api.taobao.com/router/rest";
	private static String appkey="23795481";
	private static String secret="2757dd39ca8bda28fdf14f3bafac622d";
	private static String sessionKey="62004009ZZ10cdfad36bfde9605f0287af073a0466633f33164940675";
	public static TaobaoClient client(){
		TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
		return client;
	}
	public static TaobaoResponse requset(TaobaoRequest<?> req) throws ApiException{
		TaobaoResponse res = client().execute(req,sessionKey);
		return res;
	}

}


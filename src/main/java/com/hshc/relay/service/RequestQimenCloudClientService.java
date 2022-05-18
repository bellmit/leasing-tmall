package com.hshc.relay.service;

import org.springframework.stereotype.Service;

import com.qimencloud.api.DefaultQimenCloudClient;
import com.qimencloud.api.QimenCloudClient;
import com.qimencloud.api.QimenCloudRequest;
import com.qimencloud.api.QimenCloudResponse;
import com.taobao.api.ApiException;

@Service
public class RequestQimenCloudClientService{
	
	public static String url="http://o67v8y8p21.api.taobao.com/router/qmtest";
	public static String appkey="23795481";
	public static String secret="2757dd39ca8bda28fdf14f3bafac622d";
	//public static String sessionKey="61029181acaa6b8b009b7b36c4193164e6fe55c7c62656b2054399034";
	public static String sessionKey="6102a24bde8fba29a6d711c8da9d9dc51b79a5210d26e543710661031";
	public static QimenCloudClient client(){
		QimenCloudClient client = new DefaultQimenCloudClient(url, appkey, secret);
		return client;
	}
	public static QimenCloudResponse requset(QimenCloudRequest req) throws ApiException{
		QimenCloudResponse res = client().execute(req);
		return res;
	}

}

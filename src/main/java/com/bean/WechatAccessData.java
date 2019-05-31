package com.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import com.utils.SMSUtils;

import net.sf.json.JSONObject;

/**
 * 微信Access_token对象
 * @author ws
 *
 */
@Component
public class WechatAccessData implements InitializingBean  {
	public static String postData;  //微信的access_token
	//消息模板请求路径
	private static final String postUrl = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=";

	public WechatAccessData() {
		super();
	}
	
	//加载bean完成时初始化bean
	public void afterPropertiesSet() throws Exception {
		String request = SMSUtils.request("https://api.weixin.qq.com/cgi-bin/token", "grant_type=client_credential&appid=wxe6bc37813437f71b&secret=9091227f65f637f8425d328afb646f30");
        JSONObject object = JSONObject.fromObject(request);
        WechatToken wechatToken = (WechatToken) JSONObject.toBean(object, WechatToken.class);
        WechatAccessData.setPostData(wechatToken.getAccess_token());
	}

	public static String getPostData() {
		return postData;
	}

	public static void setPostData(String postData) {
		WechatAccessData.postData = postData;
	}

	public static String getPostUrl() {
		return postUrl;
	}
	
	
	
}

package com.utils;

import com.pojo.WXToken;
import com.pojo.WXUserListOpenid;
import com.pojo.WXopenid;

import net.sf.json.JSONObject;

/**
 * 微信的工具类
 * @author ws
 */
public class WXUtils {
	
	/**
	 * 获取微信的access_token
	 * @return 返回wxtoken对象
	 */
	public static WXToken getAccess_token() {
		String url = "https://api.weixin.qq.com/cgi-bin/token";
		String data = "grant_type=client_credential&appid=wxe6bc37813437f71b&secret=9091227f65f637f8425d328afb646f30";
		String string = SMSUtils.request(url, data);
		JSONObject object = JSONObject.fromObject(string);
		WXToken token =  (WXToken) JSONObject.toBean(object,WXToken.class);
		return token;
	}
	
	/**
	 * 获取微信用户的openid列表
	 * @param Acess_tokrn 
	 * @return 用户openid数组
	 */
	public static String[] getWXUserOpenid(String Acess_tokrn) {
		String getOpenid_Url = "https://api.weixin.qq.com/cgi-bin/user/get";
		String token = "access_token="+Acess_tokrn;
		String string = SMSUtils.request(getOpenid_Url, token);
		JSONObject object = JSONObject.fromObject(string);
		WXUserListOpenid openid = (WXUserListOpenid) JSONObject.toBean(object, WXUserListOpenid.class);
		WXopenid data = openid.getData();
		return data.getOpenid();
	}
	
	
}

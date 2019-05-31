package com.wx.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wx.common.HttpClientUtil;

@RestController
public class WXLoginController {
	
	
	@RequestMapping("/wx/login")
	public void wxLogin(String code) {
		System.out.println("从微信端获取得到的code="+code);  //从前端传过来的code
		
		String url = "https://api.weixin.qq.com/sns/jscode2session"; 
		
		Map<String, String> param = new HashMap<String, String>();
		param.put("appid", "");  //登录微信账号 --> 获取微信小程序id
		param.put("secret", "");  //获取微信小程序秘钥
		param.put("js_code", code);  //code
		param.put("grant_type", "authorization_code"); //类型
		
		String wxResult = HttpClientUtil.doGet(url, param);  //访问微信官方的接口，根据code获取相关的值，返回一个String类型，需要转换
		System.out.println(wxResult);
		//wxResult转换成json对象后存入Redis中
		
		
		
	}
	
	
	
}

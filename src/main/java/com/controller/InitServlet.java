package com.controller;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pojo.WXUserStatic;
import com.service.pValService;

@Component
public class InitServlet implements InitializingBean {

	@Autowired
	pValService pushService;
	
	public void afterPropertiesSet() throws Exception {
		WXUserStatic.setPusha(pushService.getWXUserOpenid());  //初始化
		WXUserStatic.setPushba(pushService.getWXUserOpenidAndB());
	}
	
}

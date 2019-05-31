package com.test;

import java.util.ArrayList;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.bean.WXUser;
import com.pojo.WXToken;
import com.pojo.WXUserInfo;
import com.service.pValService;
import com.utils.SMSUtils;
import com.utils.WXUtils;

import net.sf.json.JSONObject;

/**
 * 保存微信用户测试类
 * @author ws
 */
public class WXUserTest {
	
	@Autowired
	private pValService service;
	
	@Test
	public void test2() throws CloneNotSupportedException {
		WXToken token = WXUtils.getAccess_token();
		String[] strings = WXUtils.getWXUserOpenid(token.getAccess_token());
		String openid_Url = "https://api.weixin.qq.com/cgi-bin/user/info";
		ArrayList<WXUser> list = new ArrayList<WXUser>();
		WXUser wxUser = new WXUser();
		for (String string : strings) {
			WXUser clone = wxUser.clone();
			String param = "access_token="+token.getAccess_token()+"&openid="+string+"&lang=zh_CN";
			String request = SMSUtils.request(openid_Url, param);
			JSONObject object = JSONObject.fromObject(request);
			WXUserInfo user = (WXUserInfo) JSONObject.toBean(object, WXUserInfo.class);
			clone.setNickname(user.getNickname());
			clone.setHeadimgurl(user.getHeadimgurl());
			clone.setOpenid(user.getOpenid());
			list.add(clone);
		}
		for (WXUser user : list) {
			try {
				//service.addWXUser(user);   //保存到数据库
				System.out.println("【微信用户信息:"+user.toString()+"】");  //打印微信用户信息
			} catch (Exception e) {
				System.out.println("保存失败"+e.getMessage());
			}
		}
	}
}

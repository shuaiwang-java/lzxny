package com.test;
import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import com.bean.Template;
import com.bean.WechatTemplate;
import com.pojo.WXToken;
import com.pojo.WXUserInfo;
import com.utils.SMSUtils;
import com.utils.WXUtils;

import net.sf.json.JSONObject;

public class TestSMS {

	
	@Test
	public void test() {
		
		String postData = "18_orX61vXbXSWuD-Nzjbohh_TtcMS3UHrsxyRBlj7KXoHBAq4nbQt7UNIKk2LPLiKD-S_uG7vha9j9IKMSWQD02f9Q7L2WZLhYK4xZO3j0lCQTFLD0clvxBDZtibz2dY2TogY86wg48XUU8k4VXTCeAIAEAJ";
		String postUrl = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=";
		
		HashMap<String,Template> map = new HashMap<String,Template>();
		
		Template first = new Template();
		first.setValue("故障通知");
		map.put("first", first);
		Template keyword1 = new Template();
		keyword1.setValue("甲烷");
		map.put("keyword1", keyword1);
		Template keyword2 = new Template();
		keyword2.setValue("当前甲烷过低");
		map.put("keyword2", keyword2);
		Template remark = new Template();
		remark.setValue("请注意数据变化");
		map.put("remark", remark);
		
		WechatTemplate wechatTemplate = new WechatTemplate();
		

		wechatTemplate.setTouser("ou4Z4wbhdMmgdXgv7G0onbw5i1lI");
		wechatTemplate.setTemplate_id("SZO7Tlqh-BL59IKxdD7e1OrStYx_2iBCN2BZdhl8Wq4");
		wechatTemplate.setUrl("http://www.chengdulvzhou.cn/goca.html");
		wechatTemplate.setData(map);
		
		JSONObject object = JSONObject.fromObject(wechatTemplate);
		
		String aa = object.toString();
		
		System.out.println(aa);
		
		String post = SMSUtils.Post(postUrl+postData, aa);
		System.out.println(post);
		
	}
	
	@Test
	public void test2() {
		WXToken token = WXUtils.getAccess_token();
		String[] strings = WXUtils.getWXUserOpenid(token.getAccess_token());
		String openid_Url = "https://api.weixin.qq.com/cgi-bin/user/info";
		ArrayList<WXUserInfo> list = new ArrayList<WXUserInfo>();
		for (String string : strings) {
			String param = "access_token="+token.getAccess_token()+"&openid="+string+"&lang=zh_CN";
			String request = SMSUtils.request(openid_Url, param);
			JSONObject object = JSONObject.fromObject(request);
			WXUserInfo user = (WXUserInfo) JSONObject.toBean(object, WXUserInfo.class);
			list.add(user);
		}
		for (WXUserInfo WXUserInfo : list) {
			System.out.println("姓名:"+WXUserInfo.getNickname()+"------用户openid: "+WXUserInfo.getOpenid());
			System.out.println(WXUserInfo.getHeadimgurl());
		}
	}
	
}

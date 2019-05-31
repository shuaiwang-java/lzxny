package com.test;
import java.util.HashMap;

import org.junit.Test;

import com.bean.Template;
import com.bean.WechatTemplate;
import com.utils.SMSUtils;

import net.sf.json.JSONObject;



public class testTimeNum<E> {
	
	@Test
	public void steTime() {
		
		/*Date date = new Date();
		
		long time = date.getTime();
		
		
		
		long time1 = time + 1800;
		
		System.out.println(time);
		System.out.println(time1);*/
		
		
	/*	  {
	           "touser":"OPENID",
	           "template_id":"ngqIpbwh8bUfcSsECmogfXcV14J0tQlEpBO27izEYtY",
	           "url":"http://weixin.qq.com/download",  
	           "data":{
	                   "first": {
	                       "value":"恭喜你购买成功！",
	                       "color":"#173177"
	                   },
	                   "keyword1":{
	                       "value":"巧克力",
	                       "color":"#173177"
	                   },
	                   "keyword2": {
	                       "value":"39.8元",
	                       "color":"#173177"
	                   },
	                   "remark": {
	                       "value":"2014年9月22日",
	                       "color":"#173177"
	                   }
	           		}
	       }	*/
		
		String postData = "18_1rMlrTt2wjjMDmZFCsA2TqX1SqXsPIKWpbPESdJAADsXgf4zwAlMPuD5-HDtHe89mxlKX8uANcUydHOWpi5YonMrTlCBOFQy7o6FXsTINEZOlImdE6ckGDpaqU7c0_pgB3FDp1XvsvbZeO_zWXUdAFACDA";
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

		String[] touser = {"ou4Z4wbhdMmgdXgv7G0onbw5i1lI"};
		
		//wechatTemplate.setTouser(touser);
		wechatTemplate.setTemplate_id("SZO7Tlqh-BL59IKxdD7e1OrStYx_2iBCN2BZdhl8Wq4");
		wechatTemplate.setUrl("http://www.chengdulvzhou.cn/goca.html");
		wechatTemplate.setData(map);
		
		JSONObject object = JSONObject.fromObject(wechatTemplate);
		
		String string = object.toString();
		
		System.out.println(string);
		
		String post = SMSUtils.Post(postUrl+postData, string);
		System.out.println(post);
		
	}
	

}

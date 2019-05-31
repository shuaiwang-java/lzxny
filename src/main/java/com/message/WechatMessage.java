package com.message;
import java.util.HashMap;
import java.util.Map;
import com.bean.Lzxny;
import com.bean.Template;
import com.bean.WXdata;
import com.bean.WechatTemplate;
import com.utils.DateUtils;

import net.sf.json.JSONObject;

/**
 * 微信消息通知业务处理类
 * @author ws
 */
public class WechatMessage {
	
	//返回甲烷异常
	public static String errorCH4(Lzxny lzxny,String touser) {
		Map<String, Template> map = null;
		try {
			map = new HashMap<String,Template>();
			Template first = new Template();
			first.setValue("警报时间"+DateUtils.getFormatDate());
			map.put("first", first);
			Template keyword1 = first.clone();
			keyword1.setValue("气质数据-甲烷");
			map.put("keyword1", keyword1);
			Template keyword2 = first.clone();
			keyword2.setColor("#FF0000");
			keyword2.setValue("当前甲烷浓度低于设定值");
			map.put("keyword2", keyword2);
			Template remark = first.clone(); 
			remark.setValue("当前甲烷值:"+lzxny.getCh4()+" %");
			map.put("remark", remark);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		WechatTemplate wechatTemplate = new WechatTemplate();
		wechatTemplate.setTouser(touser);
		wechatTemplate.setTemplate_id("SZO7Tlqh-BL59IKxdD7e1OrStYx_2iBCN2BZdhl8Wq4");
		wechatTemplate.setUrl("http://www.chengdulvzhou.cn/goca.html");
		wechatTemplate.setData(map);
		JSONObject object = JSONObject.fromObject(wechatTemplate);
		return object.toString();
	}

	//返回氧气异常
	public static String errorO2(Lzxny lzxny,String touser) {
		Map<String, Template> map = null;
		try {
			map = new HashMap<String,Template>();
			Template first = new Template();
			first.setValue("警报时间"+DateUtils.getFormatDate());
			map.put("first", first);
			Template keyword1 = first.clone();
			keyword1.setValue("气质数据-氧气");
			map.put("keyword1", keyword1);
			Template keyword2 = first.clone();
			keyword2.setColor("#FF0000");
			keyword2.setValue("当前氧含量过高于设定值");
			map.put("keyword2", keyword2);
			Template remark = first.clone();
			remark.setValue("当前氧气值:"+lzxny.getO2()+" %");
			map.put("remark", remark);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		WechatTemplate wechatTemplate = new WechatTemplate();
		wechatTemplate.setTouser(touser);
		wechatTemplate.setTemplate_id("SZO7Tlqh-BL59IKxdD7e1OrStYx_2iBCN2BZdhl8Wq4");
		wechatTemplate.setUrl("http://www.chengdulvzhou.cn/goca.html");
		wechatTemplate.setData(map);
		JSONObject object = JSONObject.fromObject(wechatTemplate);
		return object.toString();
	}
	
	//返回总管压力过低异常
	public static String errorKap(Lzxny lzxny,String touser) {
		Map<String, Template> map = null;
		try {
			map = new HashMap<String,Template>();
			Template first = new Template();
			first.setValue("警报时间"+DateUtils.getFormatDate());
			map.put("first", first);
			Template keyword1 = first.clone();
			keyword1.setValue("气质数据-总管负压");
			map.put("keyword1", keyword1);
			Template keyword2 = first.clone();
			keyword2.setColor("#FF0000");
			keyword2.setValue("当前总管负压过低于设定值");
			map.put("keyword2", keyword2);
			Template remark = first.clone();
			remark.setValue("当前总管负压值:"+lzxny.getKpa()+" kap");
			map.put("remark", remark);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		WechatTemplate wechatTemplate = new WechatTemplate();
		wechatTemplate.setTouser(touser);
		wechatTemplate.setTemplate_id("SZO7Tlqh-BL59IKxdD7e1OrStYx_2iBCN2BZdhl8Wq4");
		wechatTemplate.setUrl("http://www.chengdulvzhou.cn/goca.html");
		wechatTemplate.setData(map);
		JSONObject object = JSONObject.fromObject(wechatTemplate);
		return object.toString();
	}
	
	//返回风机频率
	public static String errorHz(Lzxny lzxny,String touser) {
		Map<String, Template> map = null;
		try {
			map = new HashMap<String,Template>();
			Template first = new Template();
			first.setValue("警报时间"+DateUtils.getFormatDate());
			map.put("first", first);
			Template keyword1 = first.clone();
			keyword1.setValue("预处理-风机频率");
			map.put("keyword1", keyword1);
			Template keyword2 = first.clone();
			keyword2.setColor("#FF0000");
			keyword2.setValue("当前预处理风机频率高于设定值");
			map.put("keyword2", keyword2);
			Template remark = first.clone();
			remark.setValue("当前预处理风机频率值,I号风机值:"+lzxny.getHz1()+" hz、II号风机值:"+lzxny.getHz2()+" hz");
			map.put("remark", remark);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		WechatTemplate wechatTemplate = new WechatTemplate();
		wechatTemplate.setTouser(touser);
		wechatTemplate.setTemplate_id("SZO7Tlqh-BL59IKxdD7e1OrStYx_2iBCN2BZdhl8Wq4");
		wechatTemplate.setUrl("http://www.chengdulvzhou.cn/goca.html");
		wechatTemplate.setData(map);
		JSONObject object = JSONObject.fromObject(wechatTemplate);
		return object.toString();
	}
	
	
	/**
	 * 返回上网电量模板
	 * @param touser
	 * @return
	 */
	public static String  errorSUM(WXdata wxdata,String touser) {
		Map<String, Template> map = null;
		try {
			map = new HashMap<String,Template>();
			Template first = new Template();
			first.setValue("上网电量统计");
			first.setColor("#1E90FF");
			map.put("first", first);
			Template keyword1 = first.clone();
			keyword1.setValue("上网"+wxdata.getObjc()+" 万度");
			keyword1.setColor("#1E90FF");
			map.put("keyword1", keyword1);
			Template keyword2 = first.clone();
			keyword2.setValue("上网"+wxdata.getObjf()+"万度");
			keyword2.setColor("#1E90FF");
			map.put("keyword2", keyword2);
			Template remark = first.clone();
			remark.setValue("消息推送时间:"+DateUtils.getFormatDate()+"。点击查看其他详情");
			map.put("remark", remark);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		WechatTemplate wechatTemplate = new WechatTemplate();
		wechatTemplate.setTouser(touser);
		wechatTemplate.setTemplate_id("AKwpVTax8H8T9798_QqvRLe8bUHLfhQ2qodgiZKG4Ic");   //TODO
		wechatTemplate.setUrl("http://www.chengdulvzhou.cn/demo3/a2.html");
		wechatTemplate.setData(map);
		JSONObject object = JSONObject.fromObject(wechatTemplate);
		return object.toString();
	}
	
	
	
}

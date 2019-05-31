package com.task;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import com.bean.Lzxny;
import com.bean.LzxnyStatic;
import com.bean.WXdata;
import com.bean.WechatAccessData;
import com.bean.WechatToken;
import com.message.WechatMessage;
import com.pojo.WXUserStatic;
import com.service.DataService;
import com.service.pValService;
import com.utils.DateUtils;
import com.utils.SMSUtils;
import net.sf.json.JSONObject;

/**
 * 定时任务类
 * @author ws
 */
@Component
public class TimerTask{
	private Logger logger = Logger.getLogger(TimerTask.class);
	@Autowired
	private DataService dataService;
	@Autowired
	private pValService pvalService;
	private boolean c = true; 
	private boolean o = true;
	private boolean h = true;
	private boolean k = true;
	private long cDate;
	private long oDate;
	private long hDate;
	private long kDate;
	
	
	@Scheduled(cron="0/50 * *  * * ? ") //每50秒执行一次
	public void test() {
 		try {
 			int  i = 1;
 			if(LzxnyStatic.isDataNull()) {
 				Lzxny lzxny = dataService.getdata();
 				//当前甲烷值小于
 				if(lzxny.getCh4() < LzxnyStatic.getCh4() && c) {
 					for (String string : WXUserStatic.getPusha()) {
 						SMSUtils.Post(WechatAccessData.getPostUrl()+WechatAccessData.getPostData(),WechatMessage.errorCH4(lzxny,string));
 					}
 					c = false;
 					cDate =  (DateUtils.getDate()+1800000l);
 				}else if(!c){
 					if( DateUtils.getDate() > cDate ) {
 						c = true;
 					}
 				}
 				//氧气
 				if(lzxny.getO2() > LzxnyStatic.getO2() && o) {
 					for(String string : WXUserStatic.getPusha()) {
 						SMSUtils.Post(WechatAccessData.getPostUrl()+WechatAccessData.getPostData(),WechatMessage.errorO2(lzxny,string));
 					}
 					o = false;
 					oDate =  (DateUtils.getDate()+1800000l);
 				}else if(!o){
 					if( DateUtils.getDate() > oDate ) {
 						o = true;
 					}
 				}
 				//压力
 				if(lzxny.getKpa() < LzxnyStatic.getKpa() && k) {
 					for(String string : WXUserStatic.getPusha()) {
 						SMSUtils.Post(WechatAccessData.getPostUrl()+WechatAccessData.getPostData(),WechatMessage.errorKap(lzxny,string));
 					}
 					k = false;
 					kDate =  (DateUtils.getDate()+1800000l);
 				}else if(!k){
 					if( DateUtils.getDate() > kDate ) {
 						k = true;
 					}
 				}
 				//频率
 				if((lzxny.getHz1() > LzxnyStatic.getHz1() || lzxny.getHz2() > LzxnyStatic.getHz1()) && h) {
 					for(String string : WXUserStatic.getPusha()) {
 						SMSUtils.Post(WechatAccessData.getPostUrl()+WechatAccessData.getPostData(),WechatMessage.errorHz(lzxny,string));
 					}
 					h = false;
 					hDate =  (DateUtils.getDate()+1800000l);
 				}else if(!h){
 					if( DateUtils.getDate() > hDate ) {
 						h = true;
 					}
 				}
 			}
 		} catch (Exception e) {
 			logger.error("微信公众号气质消息推送失败定时任务类:"+e.getMessage());
 		}
	}
	
	//每两小时获取微信token
	@Scheduled(cron = "0 * */2 * * ?")
	public void selectWechatToken() {
 		String request = SMSUtils.request("https://api.weixin.qq.com/cgi-bin/token", "grant_type=client_credential&appid=wxe6bc37813437f71b&secret=9091227f65f637f8425d328afb646f30");
         JSONObject object = JSONObject.fromObject(request);
         WechatToken wechatToken = (WechatToken) JSONObject.toBean(object, WechatToken.class);
         WechatAccessData.setPostData(wechatToken.getAccess_token());
         try {
 			WXUserStatic.setPusha(pvalService.getWXUserOpenid());   //两小时更新一次用户openid列表
 		} catch (Exception e) {
 			logger.error("调用getWXUserOpenid出错（获取用户openid失败）:"+e.getMessage());
 		}
	}
	
	//每天凌晨执行一次
	@Scheduled(cron = "0 0 0 * * ?")
	public void deleteDataAll() {
		try {
			dataService.deleteAllDate();
		} catch (Exception e) {
			logger.error("删除全部数据失败"+e.getMessage());
		}
	}
	
	@Scheduled(cron = "0 50 0 * * ?") //每日上网电量数据推送 
	public void pushWXDate() {
		try {
			WXdata	wxdata = pvalService.getWXData();
			for (String string : WXUserStatic.getPushba()) {
				SMSUtils.Post(WechatAccessData.getPostUrl()+WechatAccessData.getPostData(),WechatMessage.errorSUM(wxdata,string));
			}
		} catch (Exception e) {
			logger.error("上网信息推送失败"+e.getMessage());
		}
	}
	
}

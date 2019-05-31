package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bean.LzxnyStatic;
import com.bean.Msg;
import com.bean.User;
import com.bean.WXUser;
import com.bean.WXdata;
import com.bean.pSumKey;
import com.bean.pSumUser;
import com.bean.pVal;
import com.bean.pValUser;
import com.pojo.PushData;
import com.pojo.WXUserStatic;
import com.service.pUserService;
import com.service.pValService;
import com.utils.DateUtils;


/*
 * 推送消息控制层
 */
@Controller
public class PushController {

	//注入推送参数的接口
	@Autowired
	private pValService pvalService;
	
	@Autowired
	private pUserService puserService;
	
	
	/*
	 * 跳转到推送首页
	 */
	@RequestMapping("/push/pushIndex")
	public String returnPush() {
		
		return "push/pushIndex";
	}
	
	/*
	 * 查询参数和上网电量的值
	 */
	@RequestMapping("/push/pval")
	@ResponseBody
	public Msg getPvalAndPsum(HttpServletResponse response) {
		
		response.addHeader("Access-Control-Allow-Origin", "*");   //允许所有源跨域访问。解决了ajax回调函数拿不到数据的问题
		pVal pval;
		pSumKey psum;
		List<pValUser> pvUsers;
		List<pSumUser> psUsers;
		try {
			//获取到参数的值
			pval = pvalService.getpVal();
			//获取上网电量值
			psum = pvalService.getpSum();
			
			pvUsers = pvalService.getpvUser();
			psUsers = pvalService.getpsUser();
			
		} catch (Exception e) {
			return Msg.file();
		}
		
		return Msg.success().add("pval", pval).add("psum", psum).add("pvUsers", pvUsers).add("psUsers", psUsers);
	}
	
	
	@RequestMapping("/push/deletepvUser")
	@ResponseBody
	public Msg deletepvUser(int puserid) {
		try {
			puserService.deletepvUserById(puserid);
		} catch (Exception e) {
			return Msg.file();
		}
		
		return Msg.success();
	}
	
	@RequestMapping("/push/deletepsUser")
	@ResponseBody
	public Msg deletepsUser(int puserid) {
		
		try {
			puserService.deletepsUserById(puserid);
		} catch (Exception e) {
			return Msg.file();
		}
		
		return Msg.success();
	}
	
	/*
	 * 修改数据的方法
	 */
	@RequestMapping("/push/updateData")
	@ResponseBody
	public Msg updateData(pVal pval) {
		
		if(pval.getCh4() == null || pval.getO2() == null || pval.getKpa() == null || pval.getHz() == null) {
			return Msg.file();
		}
		pVal val;
		try {
			pvalService.updateDate(pval);
			val = pvalService.getpVal();
			//把值设置到Data2中
			LzxnyStatic.setCh4(val.getCh4());
			LzxnyStatic.setO2(val.getO2());
			LzxnyStatic.setKpa(val.getKpa());
			LzxnyStatic.setHz1(val.getHz());
		} catch (Exception e) {
			return Msg.file();
		}
		return Msg.success().add("pval", val);
	}
	
	/*
	 * 返回到添加添加用户的界面
	 */
	@RequestMapping("/push/addpvUser")
	public String returnAddUser() {
		return "push/AddUser";
	}
	
	@RequestMapping("/push/addpuUser2")
	public String returnAddpUser() {
		return "push/AddUser2";
	}
	
	/*	
	 * 添加用户
	 */
	@RequestMapping("/push/addUser")
	@ResponseBody
	public Msg addUser(@RequestBody List<User> users) {
		try {
			pvalService.addpvUser(users);
		} catch (Exception e) {
			return Msg.file();
		}
		return Msg.success();
	}
	/*
	 * 添加用户二
	 */
	@RequestMapping("/push/addUser2")
	@ResponseBody
	public Msg addUser2(@RequestBody List<User> users) {
		try {
			pvalService.addpvUser2(users);
		} catch (Exception e) {
			return Msg.file();
		}
		return Msg.success();
	}
	
	/**
	 * 推送参照值
	 * @param users
	 * @return
	 */
	@RequestMapping("/push/getStaticData")
	@ResponseBody
	public Msg getStaticData() {
		PushData data = new PushData();
		data.setCh4(LzxnyStatic.getCh4());
		data.setHz1(LzxnyStatic.getHz1());
		data.setKpa(LzxnyStatic.getKpa());
		data.setO2(LzxnyStatic.getO2());
		return Msg.success().add("data", data);
	}
	/**
	 * 设置推送参照值
	 */
	@RequestMapping("/push/setPushData")
	@ResponseBody
	public Msg setPushData(PushData data) {
		try {
			LzxnyStatic.setCh4(data.getCh4());
			LzxnyStatic.setHz1(data.getHz1());
			LzxnyStatic.setKpa(data.getKpa());
			LzxnyStatic.setO2(data.getO2());
		} catch (Exception e) {
			return Msg.file();
		}
		return Msg.success();
	}
	
	@RequestMapping("/push/setWXData")
	@ResponseBody
	public Msg setWXData(WXdata wxdata) {
		try {
			pvalService.addWXdata(wxdata);
		} catch (Exception e) {
			return Msg.file();
		}
		String date = DateUtils.getFormatDate();
		return Msg.success().add("data", date);
	}
	
	@RequestMapping("/push/getWXData")
	@ResponseBody
	public Msg getWXData() {
		WXdata wxData;
		try {
			wxData =  pvalService.getWXData();
		} catch (Exception e) {
			return Msg.file();
		}
		return Msg.success().add("wxData", wxData);
	}
	
	/**
	 * 获取微信用户
	 * @return
	 */
	@RequestMapping("/push/getWXUserByAll")
	@ResponseBody
	public Msg getWXUserByAll() {
		List<WXUser> user = null;
		try {
		    user = pvalService.getWXUserByAll();
		} catch (Exception e) {
			return Msg.file();
		}
		return Msg.success().add("user", user);
	}
	
	@RequestMapping("/puah/updatePusha")
	@ResponseBody
	public void updatePusha(Integer id,String string) {
		try {
			pvalService.updatePusha(id,string);
			WXUserStatic.setPusha(pvalService.getWXUserOpenid());  
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@RequestMapping("/puah/updatePushb")
	@ResponseBody
	public void updatePushb(Integer id,String string) {
		try {
			pvalService.updatePushb(id,string);
			WXUserStatic.setPushba(pvalService.getWXUserOpenidAndB());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@RequestMapping("/puah/updatePushc")
	@ResponseBody
	public void updatePushc(Integer id,String string) {
		try {
			pvalService.updatePushc(id,string);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}

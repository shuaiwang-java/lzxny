package com.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
/**
 * 数据表单控制层
 * @author ws
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.MobileData;
import com.bean.Msg;
import com.bean.SumInfo;
import com.bean.Suma;
import com.bean.jtable;
import com.bean.ytable;
import com.service.DTService;
@Controller
public class DTController {
	
	private Logger logger = Logger.getLogger(DTController.class);
	
	@Autowired
	DTService dTService;
	
	/**
	 * 返回到数据表单页面
	 */
	@RequestMapping("/data/yTable")
	public String getyData() {
		return "table/yTable";
	}
	
	/**
	 * 返回到机组数据表单首页
	 */
	
	@RequestMapping("/data/jTable")
	public String getjData() {
		return "table/jTable";
	}
	
	
	
	
	/**
	 * 返回预处理的数据
	 * @return
	 */
	@RequestMapping("/data/YData")
	@ResponseBody
	public Map<String,Object> getYTable(String string){
		List<ytable> dt = null;
		HashMap<String, Object> data = null;
		try {
			dt = dTService.getAllDT(string);
			data = new HashMap<String, Object>();
			data.put("data", dt);
		} catch (Exception e) {
			logger.error("查询预处理数据表单出现错误"+e.getMessage());
			return data;
		}
		return data;
	}
	
	/**
	 * 获取所有的数据
	 */
	@RequestMapping("/data/YDataAll")
	@ResponseBody
	public Map<String,Object> getYTableAll(){
		List<ytable> dt = null;
		HashMap<String, Object> data = null;
		try {
			dt = dTService.getAllData();
			data = new HashMap<String, Object>();
			data.put("data", dt);
		} catch (Exception e) {
			logger.error("查询预处理全部数据失败"+e.getMessage());
			return data;
		}
		return data;
	}
	
	/**
	 * 返回机组数据
	 */
	@RequestMapping("/data/JData")
	@ResponseBody
	public Map<String,Object> getJData(String string){
		List<jtable> dt = null;
		HashMap<String, Object> data = null;
		try {
			dt = dTService.getDayJTable(string);
			data = new HashMap<String, Object>();
			data.put("data", dt);
		} catch (Exception e) {
			logger.error("查询预处理数据表单出现错误"+e.getMessage());
			return data;
		}
		return data;
	}
	
	/**
	 * 返回机组所有数据
	 */
	@RequestMapping("/data/JDataAll")
	@ResponseBody
	public Map<String,Object> getJDataAll(){
		List<jtable> dt = null;
		HashMap<String, Object> data = null;
		try {
			dt = dTService.getAllJData();
			data = new HashMap<String, Object>();
			data.put("data", dt);
		} catch (Exception e) {
			logger.error("查询机组全部数据失败"+e.getMessage());
			return data;
		}
		return data;
	}
	
	/**
	 * 移动端 发电量接口
	 */
	@RequestMapping("/data/mobile")
	@ResponseBody
	public Msg get(String string,HttpServletResponse response){
		response.addHeader("Access-Control-Allow-Origin", "*");
		List<MobileData>  mobile = null;
		try {
			mobile =  dTService.selectMobileData(string);
			if(mobile.isEmpty()) {
				return Msg.file();
			}
		} catch (Exception e) {
			logger.error("移动端请求失败，查询发电量"+e.getMessage());
			return Msg.file();
		}
		return Msg.success().add("mobile", mobile);
	}
	
	/**
	 * 微信页面的上网实时数据
	 * @param string
	 * @param response
	 * @return
	 */
	@RequestMapping("/wxData/getSumInfo")
	@ResponseBody
	public Msg getSumInfo(HttpServletResponse response){
		response.addHeader("Access-Control-Allow-Origin", "*");
		SumInfo sumInfo = null;
		Suma suma = null;
		try {
			sumInfo =  dTService.getSumData();
			suma = dTService.getSumaData();
		} catch (Exception e) {
			logger.error("移动端获取发电、上网等数据失败"+e.getMessage());
			return Msg.file();
		}
		return Msg.success().add("sumInfo", sumInfo).add("suma", suma);
	}
	
	
}

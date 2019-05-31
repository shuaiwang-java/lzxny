package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.Msg;
import com.bean.Yj;
import com.bean.Yj1;
import com.service.YjService;

/**
 * 预计电量控制层
 * @author ws
 *
 */
@Controller
public class ElectricityController {
	
	
	@Autowired
	YjService yjService;
	
	@RequestMapping("/electricity/index")
	public String ele() {
		
		return "electricity/index";
	}
	
	
	/**
	 * 获取数据
	 * @param data
	 * @return
	 */
	@RequestMapping("/ele/getdata")
	@ResponseBody
	public Msg get(String date) {
		/*yjService.getData();*/
		
		System.out.println(date);
		List<Yj> yjs = yjService.getBydDate1(date);
		Yj1 yj1 = yjService.getByswdl(date);
		
		return Msg.success().add("yj",yjs).add("yj1", yj1);
	}
	
	
	
	
}

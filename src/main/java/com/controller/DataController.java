package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.Lzxny;
import com.bean.Msg;
import com.service.DataService;
import com.utils.DynamicDataSource;

/**
 * 新浪云mysql数据库中获取到数据
 * @author ws
 */
@Controller
public class DataController {
		
	@Autowired
	private DataService  dataService;
	
	
	@RequestMapping("/data/getdata")
	@ResponseBody
	public Msg getData() {
		DynamicDataSource.setCustomerType(DynamicDataSource.DATA_SOURCE_B);
		Lzxny getdata;
		try {
			getdata = dataService.getdata();
			System.out.println(getdata.getCh4());	
			DynamicDataSource.setCustomerType(DynamicDataSource.DATA_SOURCE_A);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Msg.success();
	}
	
	
	
}

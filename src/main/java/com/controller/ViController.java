package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViController {
	
	/*
	 * 跳转到膜上视屏
	 */
	@RequestMapping("vi/outVi")
	public String getOutVi() {
		return "vi/outdoorsVi";
	}
	
	/*
	 * 跳转到无人机直播画面
	 */
	@RequestMapping("vi/getDgi")
	public String getDgi() {
		//获取到webapp的路径		
		return "vi/DJI";
	}
	
	
}

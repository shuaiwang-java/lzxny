package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 权限控制层
 * @author ws
 */
@Controller
public class PermissionController {
		
	
	@RequestMapping("/per/perIndex")
	public String getPer() {
		
		
		return "/permission/perIndex";
	}
	
	
	
	
	
	
}

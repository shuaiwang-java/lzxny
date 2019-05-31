package com.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.Msg;
import com.bean.Permission;
import com.bean.Role;
import com.service.PermissionService;
import com.service.RoleService;
/**
 * 角色控制层
 * @author ws
 *
 */
@Controller
public class RoleController {
		
	@Autowired
	RoleService roleService;
	
	@Autowired
	PermissionService permissionService;
	
	//获取所有角色
	@RequestMapping("/role/roleIndex1")
	public String getRoleAll(Model model) {
		
	/*	//获取所有角色和角色所拥有的权限
	    List<Role> roles =  roleService.getRoleAndPermission();
		
	    for (Role role : roles) {
			//查询出角色所对应的权限
	    	//通过roleId获取到所对应的权限
	    	List<Permission> permissions =  permissionService.getPermissionByRoleId(role.getRid());
	    	role.setPermissions(permissions);
		}
	    
	    
	    System.out.println(roles);
	    //然后把角色放进model中
	    model.addAttribute("roles", roles);*/
	    
		return "/role/roleIndex";
	}
	
	
	//获取所有角色
	@RequestMapping("/role/roleAdd")
	@ResponseBody
	public Msg getRoleAllJson(Model model) {
		
		//获取所有角色和角色所拥有的权限
	    List<Role> roles =  roleService.getRoleAndPermission();
		
	    for (Role role : roles) {
			//查询出角色所对应的权限
	    	//通过roleId获取到所对应的权限
	    	List<Permission> permissions =  permissionService.getPermissionByRoleId(role.getRid());
	    	role.setPermissions(permissions);
		}
		return Msg.success().add("roles", roles);
	}
	
	
	
	//获取所有的权限列表
	@RequestMapping("/role/getPermission")
	public String getPermission(Model model) {
		
		//获取所有的权限返回到前页
	 List<Permission> permissions = permissionService.getPermissionAll();
		
	 model.addAttribute("permissions", permissions);
	 
		return "/role/roleAdd";
	}
	
	//添加权限的方法
	@RequestMapping("/role/addRole")
	@ResponseBody
	public Msg Add(String rname,String pids) {
		
		//pids String转换为数组
		String[] split = pids.split(",");
		
		//往role表中插入职位
		roleService.addRoleByName(rname);
		//查出roleid
		Role role =  roleService.getRoleByName(rname);
		
		//再往职位权限中间表中添加数据
		roleService.setRoleAndPermission(role.getRid(),split);
		
		return Msg.success();
	}
	
	//获取单个role及权限
	@RequestMapping("/role/getRoleby")
	public String getRoleAndPermission(Integer rid,String rname,Model model) {
		
		//通过id查询role所对应的权限
		List<Permission> permissions = permissionService.getPermissionByRoleId(rid);
		Role role = new Role();
		role.setRname(rname);
		role.setRid(rid);
		role.setPermissions(permissions);
		
		
		//查询所有的权限
		List<Permission> permissionAll = permissionService.getPermissionAll();
		
		//给role所拥有的权限添加状态为0
		for (int i=0; i<permissionAll.size(); i++) {
			
			for(int j=0; j<permissions.size(); j++) {
				if(permissionAll.get(i).getPid() == permissions.get(j).getPid()) {
					permissionAll.get(i).setState("0");
				}
			}
		}
		model.addAttribute("role", role);
		model.addAttribute("permission", permissionAll);
		
		return "/role/roleEdit";
	}
	
	//修改roel权限的方法
	@RequestMapping("/role/updateRole")
	public String updateRole(Integer rid,String pid) {
		
		//通过rid删除中间表的所有role和权限
		roleService.deleRoleAndPermission(rid);
		
		String[] split = pid.split(",");
		//再进行添加role和权限
		roleService.setRoleAndPermission(rid, split);
		
		return null;
	}
	
	
	//删除role
	@RequestMapping("/role/deleteRole")
	public void deleteRole(Integer rid) {
		
		roleService.deleRoleByRid(rid);
		
	}
	
	
}

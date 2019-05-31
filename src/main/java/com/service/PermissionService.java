package com.service;

import java.util.List;

import com.bean.Permission;

/**
 * 权限接口
 * @author ws
 */
public interface PermissionService {
	
	//通过roleId获取到权限
	List<Permission> getPermissionByRoleId(Integer rid);
	//获取所有的权限
	List<Permission> getPermissionAll();
	
	
	
}

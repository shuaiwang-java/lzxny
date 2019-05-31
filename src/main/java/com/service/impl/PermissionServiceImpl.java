package com.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Permission;
import com.dao.PermissionMapper;
import com.service.PermissionService;

@Service
@Transactional
public class PermissionServiceImpl implements PermissionService {
	
	@Autowired
	PermissionMapper permissionMapper;
	
	//通过角色id获取到权限
	public List<Permission> getPermissionByRoleId(Integer rid) {
		
		return permissionMapper.selectByPermissionAndRole(rid);
		
	}
	
	//获取所有的权限
	public List<Permission> getPermissionAll() {
		return permissionMapper.selectByExample(null);
	}

}

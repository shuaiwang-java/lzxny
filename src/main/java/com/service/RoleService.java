package com.service;

import java.util.List;

import com.bean.Role;

/**
 * 角色业务层
 * @author ws
 *
 */
public interface RoleService {

	
	//获取到所有角色
	List<Role> getRoleAll();
	
	//获取所有的角色
	List<Role> getRoleAndPermission();

	//往role表插入职位名
	void addRoleByName(String rname);
	
	//通过职位名获取role
	Role getRoleByName(String rname);
	
	//往角色权限中间表中添加数据
	void setRoleAndPermission(Integer rid, String[] split);
	
	//通过rid删除中间表的所有role和权限
	void deleRoleAndPermission(Integer rid);
	
	//删除role
	void deleRoleByRid(Integer rid);
	
}	

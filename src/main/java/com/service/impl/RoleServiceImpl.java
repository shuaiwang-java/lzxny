package com.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Role;
import com.dao.RoleMapper;
import com.service.RoleService;


@Service
@Transactional
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	RoleMapper roleMapper;

	//获取到说有角色
	public List<Role> getRoleAll() {
		return	roleMapper.selectByExample(null);
	}
	
	//获取到所有的角色的方法
	public List<Role> getRoleAndPermission() {
		
		return roleMapper.selectByExample(null);

	}
	
	//添加角色
	public void addRoleByName(String rname) {
		roleMapper.insertByName(rname);
	}

	public Role getRoleByName(String rname) {
			return roleMapper.selectByRoleName(rname);
	}
	
	//role和permission中间表添加数据
	public void setRoleAndPermission(Integer rid,String[] split) {
		
		if(split != null) {
			for(int i=0; i<split.length; i++) {
					String sp = split[i];
					int pid = Integer.valueOf(sp).intValue();
				//添加数据
				roleMapper.insertByNameAndPid(rid,pid);
			}
		}
	}
	
	
	//通过rid删除中间表的所有role和权限
	public void deleRoleAndPermission(Integer rid) {
				
		roleMapper.deleteRoleAndPermissionByRid(rid);
	}
	
	//删除role
	public void deleRoleByRid(Integer rid) {
		roleMapper.deleteByPrimaryKey(rid);
	}
	

}

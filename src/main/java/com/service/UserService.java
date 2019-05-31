package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.User;
import com.dao.UserMapper;

/**
 * 用户业务层
 * @author ws
 *
 */

public interface UserService {
		
	
	//查询所有员工
	public List<User> getAllUser();

	public List<User> getUserByName(String uName); 
	
	//查询用户和用角色
	public User getUserAndRoleBy(String uName)throws Exception;
	
	//修改用户信息
	public void updateUser(String uname, String uphone, String roleName, String pwd,Integer uId);

	//通过di获取user
	public User getUserById(Integer uId);
	
	//删除永婚
	public void deleteUser(Integer uid);
	
	//添加User
	public void insertUserByUser(User user);
	
	//修改用户密码
	public void updateUserByUser(User user);

	
	
		
}

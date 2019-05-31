package com.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.bean.Role;
import com.bean.User;
import com.dao.RoleMapper;
import com.dao.UserMapper;
import com.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserMapper userMapper;
	
	@Autowired
	RoleMapper roleMapper;
	
	//查询所有员工
	public List<User> getAllUser(){
		return userMapper.selectByExample(null);
	}
	
	public List<User> getUserByName(String uName) {

		return userMapper.selectByuName(uName);
	}
	
	//查询用户和用角色
	public User getUserAndRoleBy(String uName)throws Exception {
		return userMapper.selectByUserAndRole(uName);
	}
	
	//修改用户
	public void updateUser(String uname, String uphone, String roleName, String pwd,Integer uId){
		
		//通过role名获取到role
		Role role =  roleMapper.selectByRoleName(roleName);
		
		System.out.println("获取到role信息"+role);
		
		
		//获取user用户信息
		User user = userMapper.selectByuNameOne(uId);
		System.out.println("获取到user信息"+user);

		User u = new User();
		u.setUid(uId);
		u.setUname(uname);
		u.setUphone(uphone);
		u.setRoleid(role.getRid());
		u.setUpassword(pwd);
		
		if(pwd == null || "".equals(pwd)) {
			pwd = user.getUpassword();
			u.setUpassword(pwd);
			userMapper.updateByPrimaryKeySelective(u);
		}else {
			userMapper.updateByPrimaryKeySelective(u);
		}
		
	}
	
	//通过id获取user
	public User getUserById(Integer uId) {
		return userMapper.selectByPrimaryKey(uId);
	}
	
	//删除用户
	public void deleteUser(Integer uid) {
		userMapper.deleteByPrimaryKey(uid);
	}
	
	//添加用户的方法
	public void insertUserByUser(User user) {
		userMapper.insertSelective(user);
	}
	
	//修改用户密码的方法
	public void updateUserByUser(User user) {
		int uid = user.getUid();
		String upassword = user.getUpassword();
		userMapper.updateUserPwd(uid,upassword);
	}
}

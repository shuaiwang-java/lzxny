package com.dao;

import com.bean.User;
import com.bean.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    //通过用户名查找user
	List<User> selectByuName(String uName);
	//显示用户名和角色
	User selectByUserAndRole(String uName);
	
	//修改用户信息
	void updateUser(String uname, String uphone, String roleName, String pwd,Integer uId);
	
	//通过用户名查找Oneuser
	User selectByuNameOne(Integer uId);
	
	//修改密码
	void updateUserPwd(int uid, String upassword);
	
	//查询对应的部门
	String getDept(Integer deptid);
	//通过id查询角色
	String getroleName(Integer roleid);
	
	//通过uid查询出角色id
	Integer selectRId(Integer uid);
}
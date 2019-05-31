package com.dao;

import com.bean.Role;
import com.bean.RoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleMapper {
    long countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    int deleteByPrimaryKey(Integer rid);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    Role selectByPrimaryKey(Integer rid);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
    //通过用户名获取到Role
	Role selectByRoleName(String roleName);
	//添加职位
	void insertByName(String rname);
	//添加role权限
	void insertByNameAndPid(Integer rid, Integer pid);
	//通过rid删除中间表的所有role和权限
	void deleteRoleAndPermissionByRid(Integer rid);
    
}
package com.service;

import java.util.List;

import com.bean.Permission;
import com.bean.User;

/**
 * shiroService业务逻辑层
 */
public interface ShiroService {

    /**
     *根据用户名 得到User对象
     */
     User getUserByUserName(String username);

    /**
     * 根据User获取权限
     *
     * @param user
     * @return List
     */
    List<Permission> getPermissionsByUser(User user);

    /*
     *测试 获取数据
     */
	User getvalue();
}

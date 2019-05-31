package com.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Permission;
import com.bean.User;
import com.dao.ShiroDao;
import com.service.ShiroService;


/**
 *shiro业务层
 */
@Service("shiroService")
@Transactional
public class ShiroServiceImpl implements ShiroService {

    @Autowired
    private ShiroDao shiroDao;
    
    //根据name获取用户
    public User getUserByUserName(String username) {
        //根据账号获取账号密码
        User userByUserName = shiroDao.getUserByUserName(username);
        return userByUserName;
    }

    public List<Permission> getPermissionsByUser(User user) {
        //获取到用户角色userRoleId
        Integer roleId = shiroDao.getUserRoleByUserId(user.getUid());
        List<Permission> permissions =null;
        if (roleId != null) {
        	//通过角色id获取到所有的权限
        	permissions = shiroDao.getPermissionsByRoleId(roleId);
        }
        return permissions;
    }
    
    /*
     * 测试获取数据
     * @see com.service.ShiroService#getvalue()
     */
	public User getvalue() {
		int l = 1;
		return shiroDao.getVal(l);
	}




}

package com.shiro;

import java.util.ArrayList;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.sun.javafx.collections.MappingChange.Map;

public class UserRealm extends AuthorizingRealm{
	
	/**
	 * 授权 ，在配有缓存的情况下，只加载一次。
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection pr) {
		
		//当前登录用户，账号
		String userCode = pr.toString();
		System.out.println("当前登录用户"+userCode);
		
		//获取角色信息
		ArrayList<Map<String, Object>> roleList = new ArrayList<Map<String, Object>>();
		
		
		
		
		
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {
		// TODO Auto-generated method stub
		return null;
	}

}

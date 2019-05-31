package com.shiro;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Permission;
import com.bean.User;
import com.service.ShiroService;
import java.util.List;

/**
 * - 重写doGetAuthenticationInfo方法是：登录验证，当需要登录的时候，就会调用该方法进行验证。
 *- 重写doGetAuthorizationInfo方法：这个是授权验证，与上面的过滤器相结合。
 * @author ws
 *
 */
public class MyShiroReaml extends AuthorizingRealm {
	
	
	
	@Autowired
	private ShiroService shiroService;
	
	/** 授权验证
     *  流程
     * 1.根据用户user->2.获取角色id->3.根据角色id获取权限permission
     */
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection pc) {
		
		
        //方法一：获得user对象
        User user=(User)pc.getPrimaryPrincipal();
        
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        //获取permission
        if(user!=null) {
        	//根据用户获取用户拥有的权限
            List<Permission> permissions = shiroService.getPermissionsByUser(user);
            if (permissions.size()!=0) {
                for (Permission p: permissions) {
                	//得到用户的权限
                    info.addStringPermission(p.getPurl());
                }
                //返回用户权限
                return info;
            }
        }

        //方法二： 从subject管理器里获取user
//      Subject subject = SecurityUtils.getSubject();
//      User _user = (User) subject.getPrincipal();
//      System.out.println("subject"+_user.getUsername());
        
        //没有就返回空
        return null;
    }

	
	
	
    // 登录验证
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        /*System.out.println("验证方法start");*/
        //验证账号密码
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        /*System.out.println("当前用户名:"+token.getUsername()+""+"当前用户名"+token.getPassword());*/
        
        String  s = token.getUsername();
        User user = shiroService.getUserByUserName(s);  //根据用户名查询到用户
        if(user==null){
        	System.out.println("没有此用户名");
            return null;
        }
        //最后的比对需要交给安全管理器
        //三个参数进行初步的简单认证信息对象的包装
       /* System.out.println("数据库的user的密码："+user.getUpassword());*/
        AuthenticationInfo info = new SimpleAuthenticationInfo(user, user.getUpassword(), this.getClass().getSimpleName());

        return info;
    }

    

    public ShiroService getShiroService() {
        return shiroService;
    }

    public void setShiroService(ShiroService shiroService) {
        this.shiroService = shiroService;
    }
}

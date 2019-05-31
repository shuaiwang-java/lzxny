package com.controller;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.User;
import com.service.ShiroService;

import javax.servlet.http.HttpSession;

/**
 * 登录控制层
 * @author ws
 */
@Controller
public class loginController {
    @Autowired
    private ShiroService shiroService;
    private Logger logger = Logger.getLogger(loginController.class);
    /**
     * 验证登录
     * @param username
     * @param password
     * @param session
     * @return url
     */
    
    @RequestMapping("/user/login1")
    @ResponseBody
    public String ss(String username, String password, HttpSession session, Model model) {
    	
    	User user =  shiroService.getvalue();
    	System.out.println(user.getUname());
    	System.out.println(user.getUpassword());
		return "";
    }
    
    
    @RequestMapping("/user/login")
    @ResponseBody
    public String Login(String username, String password, HttpSession session, Model model){
        if(username==null || password == null || "".equals(username)  || "".equals(password)){
            return "0";  //返回0代表没有输入用户名或者密码
        }
        //主体,当前状态为没有认证的状态“未认证”
        Subject subject = SecurityUtils.getSubject();   
        // 登录后存放进shiro token
        UsernamePasswordToken token=new UsernamePasswordToken(username,password);
        User user;
        //登录方法（认证是否通过）
        //使用subject调用securityManager,安全管理器调用Realm
        try {
            //利用异常操作
            //需要开始调用到Realm中
            System.out.println("========================================");
            System.out.println("1、进入认证方法");
            subject.login(token);
            user = (User)subject.getPrincipal();
            session.setAttribute("user",subject);
            model.addAttribute("message", user.getUname());
            System.out.println("登录完成");
        } catch (UnknownAccountException e ) {
            model.addAttribute("message", "账号密码不正确");
            return "1";  //代表登录失败，密码或者用户名不正确
        } catch(IncorrectCredentialsException i) {
        	return "1";
        }
        
        return "2";  //登录成功打开首页
    }
   
    
    
    //跳转到index界面
    @RequestMapping("/user/index")
    public String getIndex(Model model) {
    	//获取安全
    	Subject subject = SecurityUtils.getSubject();
    	User user = (User) subject.getPrincipal();
    	System.out.println(user.getUname());
    	model.addAttribute("userName", user);
		return "index";
    }
    
    
    
    @RequestMapping("/check")
    public String check(HttpSession session){

        Subject subject=(Subject)session.getAttribute("user");

        User user=(User)subject.getPrincipal();
        System.out.println(user.toString());
        return "permission";
    }

    @RequestMapping("/readName")
    public String readName(HttpSession session){

        return "name";
    }

    @RequestMapping("/readData")
    public String readData(){
        return "data";
    }


    @RequestMapping("/nopermission")
    public String noPermission(){
        return "error";
    }
}

package com.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.Msg;
import com.bean.Role;
import com.bean.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.RoleService;
import com.service.UserService;

/**
 * 用户信息
 * @author ws
 *
 */
@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	RoleService roleService;

	private Object role;
	
	//查询user信息并显示到
	@RequestMapping("/user/list")
	public String allUser() {
		
		 //跳转到用户管理界面
		return "user/userList";
		
	}
	
	
	
	
	//查询user信息并显示到
	@RequestMapping("/user/lists")
	@ResponseBody
	public Msg getUser(@RequestParam(value="pn",defaultValue="1")Integer pn,Model model) {
		
		 //查7条数据
		 PageHelper.startPage(pn, 7);
		 //获取全部user
		 List<User> lists = userService.getAllUser();
		 //设置页码条数子的个数
		 PageInfo<User> pageInfo = new PageInfo<User>(lists,5);
		 model.addAttribute("bool", "true");
		 
		 //返回json用户列表
		return Msg.success().add("pageInfo", pageInfo);
		
	}
	
	
	@RequestMapping("/user/byUname")
	@ResponseBody
	public Msg getUserByUname(@RequestParam(value="pn",defaultValue="1")Integer pn,String uName) {
		
		 //查10条数据
		 PageHelper.startPage(pn, 7);
		 //通过用户名获取user
		 List<User> lists = userService.getUserByName(uName);
		 //设置页码条数子的个数
		 PageInfo<User> pageInfo = new PageInfo<User>(lists,5);
		 
		 //返回json用户列表
		return Msg.success().add("pageInfo", pageInfo);
		
		
	}
	
	@RequestMapping("/user/update")
	public String updateUser(String uName,Integer uid, Model model) {
		
		
		User user = null;
		try {
			//通过用户名查询到user和用户角色
			user = userService.getUserAndRoleBy(uName);
			
			if(user == null) {
				user = userService.getUserById(uid);
			}
			//获取所有的职位
			List<Role> role = roleService.getRoleAll();
			
			model.addAttribute("user", user);
			model.addAttribute("role", role);
		} catch (Exception e) {
			System.out.println("修改出现异常");
		}
		return "user/userEdit";
	}
	
	//修改用户的信息
	@RequestMapping("/user/updateUser")
	@ResponseBody
	public Msg updateUser(String uname,String uphone,String roleName,String pwd,Integer uId) {
		
			//获取所有的用户
			List<User> list = userService.getAllUser();
			
			for (User user : list) {
				if(user.getUname().equals(uname) && user.getUid() != uId) {
					return Msg.file();
				}
			}
			
			//修改用户
			userService.updateUser(uname,uphone,roleName,pwd,uId);
		
			//返回到
			return Msg.success();
	}
	
	//删除用户
	@RequestMapping("/user/delete")
	@ResponseBody
	public Msg deleteUser(Integer uid){
		userService.deleteUser(uid);  //删除用户
		return null;
	}
	
	//从数据库获取所有职位然后 跳转到添加user的方法
	@RequestMapping("/user/userAdd")
	public String userAdd(Model model) {
		
		List<Role> roles = roleService.getRoleAll();
		model.addAttribute("roles", roles);
		
		
		return "/user/userAdd";
	}
	
	//这是添加user的方法
	@RequestMapping("/user/insert")
	@ResponseBody
	public Msg insertUser(User user) {
		try {
			//获取所有user判断添加的姓名是否重复
			List<User> users = userService.getAllUser();
			for (User u : users) {
				if(u.getUname().equals(user.getUname())) {
					return Msg.file();
				}
			}
			user.setUtime(new Date());
			userService.insertUserByUser(user);
		} catch (Exception e) {
			return Msg.file();
		}
		return Msg.success();
	}
	
	//个人信息
	@RequestMapping("/user/getUser")
	public String getUserOne(String uName,Model model,HttpServletResponse res) throws IOException {
		
		try {
			
			User user = userService.getUserAndRoleBy(uName);
			model.addAttribute("user", user);
			
		} catch (Exception  e1) {
			res.getWriter().write("个人信息查询失败");
			res.getWriter().close();
		}
		
		return "/user/user";
		
	}
	
		//个人信息获取时间
		@RequestMapping("/user/getTime")
		@ResponseBody
		public Msg getUserOne(String uName) throws IOException {
			
			User user = null;
			try {
				user = userService.getUserAndRoleBy(uName);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return Msg.success().add("user", user);
			
		}
		
	//密码修改
	@RequestMapping("/user/upatePwd")
	public String updatePwd(String uName,Model model) {
		
		model.addAttribute("uName", uName);
		return "/user/userPwd";
	}
	
	
	@RequestMapping("/user/setPwd")
	@ResponseBody
	public Msg updatePwd(String uName,String pwdj,String pwd) {
		try {
			User user = userService.getUserAndRoleBy(uName);
			
			if(user.getUpassword().equals(pwdj) && pwd != null || "".equals(pwd)) {
				//旧密码正确的情况修改
				user.setUpassword(pwd);
				//修改
				userService.updateUserByUser(user);
			}else {
				return Msg.file();
			}
		} catch (Exception e) {
			return Msg.file();
		}
		return Msg.success();
	}
	
	
	/*
	 * 返回所有的User
	 */
	@RequestMapping("/user/getAdd")
	@ResponseBody
	public Msg returnAddUser() {
		//获取到所有的user
		List<User> data = userService.getAllUser();
		return Msg.success(data);
	}




	
	
}

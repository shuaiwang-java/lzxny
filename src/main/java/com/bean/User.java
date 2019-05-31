package com.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户实体
 * @author ws
 *
 */
public class User implements Serializable {
	private static final long serialVersionUID = -4512219513557276927L;
	//用户id
    private Integer uid;
    //用户名字
    private String uname;
    //用户密码
    private String upassword;
    //用户性别
    private String ugender;
    //用户电话
    private String uphone;
    //用户注册时间
    private Date utime;
    //用户年龄
    private String uage;
    //部门id
    private Integer deptid;
    
    private Integer roleid;
    
    private Role role;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer uid, String uname, String upassword, String ugender, String uphone, Date utime, String uage,
			Integer deptid, Integer roleid, Role role) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upassword = upassword;
		this.ugender = ugender;
		this.uphone = uphone;
		this.utime = utime;
		this.uage = uage;
		this.deptid = deptid;
		this.roleid = roleid;
		this.role = role;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getRoleid() {
		return roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	public String getUgender() {
		return ugender;
	}

	public void setUgender(String ugender) {
		this.ugender = ugender;
	}

	public String getUphone() {
		return uphone;
	}

	public void setUphone(String uphone) {
		this.uphone = uphone;
	}

	public Date getUtime() {
		return utime;
	}

	public void setUtime(Date utime) {
		this.utime = utime;
	}

	public String getUage() {
		return uage;
	}

	public void setUage(String uage) {
		this.uage = uage;
	}

	public Integer getDeptid() {
		return deptid;
	}

	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", upassword=" + upassword + ", ugender=" + ugender
				+ ", uphone=" + uphone + ", utime=" + utime + ", uage=" + uage + ", deptid=" + deptid + ", roleid="
				+ roleid + ", role=" + role + "]";
	}
    
}
package com.bean;

import java.util.ArrayList;
import java.util.List;
/**
 * 角色实体
 * @author ws
 *
 */
public class Role {
	//角色id
    private Integer rid;
    //角色名字
    private String rname;
    
    //角色对应多个权限
    private List<Permission> permissions = new ArrayList<Permission>();

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(Integer rid, String rname, Integer pid, List<Permission> permissions) {
		super();
		this.rid = rid;
		this.rname = rname;
		permissions = permissions;
	}

	public Integer getRid() {
		return rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	
	public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

	@Override
	public String toString() {
		return "Role [rid=" + rid + ", rname=" + rname + ", permissions=" + permissions + "]";
	}
    
}
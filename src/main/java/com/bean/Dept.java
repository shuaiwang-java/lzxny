package com.bean;

/**
 * 部门实体
 * @author ws
 *
 */

public class Dept {
	//部门id
    private Integer deptid;
    //部门名字
    private String deptname;

    
    public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dept(Integer deptid, String deptname) {
		super();
		this.deptid = deptid;
		this.deptname = deptname;
	}

	public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }
}
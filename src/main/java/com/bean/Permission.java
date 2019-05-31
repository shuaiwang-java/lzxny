package com.bean;

/**
 * 权限实体
 * @author ws
 *
 */
public class Permission {
	//权限id
    private Integer pid;
    //权限url
    private String purl;
    //角色id
    private Integer rid;
    //权限的名字
    private String pdescription;
    
    //状态
    private String  state;

    public Permission() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Permission(Integer pid, String purl, Integer rid, String pdescription) {
		super();
		this.pid = pid;
		this.purl = purl;
		this.rid = rid;
		this.pdescription = pdescription;
	}


	public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPurl() {
        return purl;
    }

    public void setPurl(String purl) {
        this.purl = purl == null ? null : purl.trim();
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPdescription() {
        return pdescription;
    }

    public void setPdescription(String pdescription) {
        this.pdescription = pdescription == null ? null : pdescription.trim();
    }

	@Override
	public String toString() {
		return "Permission [pid=" + pid + ", purl=" + purl + ", rid=" + rid + ", pdescription=" + pdescription + "]";
	}

	
    
}
package com.bean;

public class WellKey {
    private Integer wid;

    private String wname;
    
    private String wRegion; //区域

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname == null ? null : wname.trim();
    }

	public String getwRegion() {
		return wRegion;
	}

	public void setwRegion(String wRegion) {
		this.wRegion = wRegion;
	}
    
}
package com.bean;

import java.util.Date;

public class Gas {
    private Integer gid;   //id

    private String wname;   //井编号

    private float ch4;   //甲烷

    private float co2;   //二氧化碳

    private float o2;  //氧气

    private float h2s;  //

    private float bal;  //

    private Date gtime;  //时间

    private String uname;   //录入人员

    private String state;	//状态

    private float pressure;  //压力
    
    private float l;

	public Gas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gas(Integer gid, String wname, float ch4, float co2, float o2, float h2s, float bal, Date gtime,
			String uname, String state, float pressure) {
		super();
		this.gid = gid;
		this.wname = wname;
		this.ch4 = ch4;
		this.co2 = co2;
		this.o2 = o2;
		this.h2s = h2s;
		this.bal = bal;
		this.gtime = gtime;
		this.uname = uname;
		this.state = state;
		this.pressure = pressure;
	}
	
	public Integer getGid() {
		return gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public String getWname() {
		return wname;
	}

	public void setWname(String wname) {
		this.wname = wname;
	}

	public float getCh4() {
		return ch4;
	}

	public void setCh4(float ch4) {
		this.ch4 = ch4;
	}

	public float getCo2() {
		return co2;
	}

	public void setCo2(float co2) {
		this.co2 = co2;
	}

	public float getO2() {
		return o2;
	}

	public void setO2(float o2) {
		this.o2 = o2;
	}

	public float getH2s() {
		return h2s;
	}
	

	public float getL() {
		return l;
	}

	public void setL(float l) {
		this.l = l;
	}

	public void setH2s(float h2s) {
		this.h2s = h2s;
	}

	public float getBal() {
		return bal;
	}

	public void setBal(float bal) {
		this.bal = bal;
	}

	public Date getGtime() {
		return gtime;
	}

	public void setGtime(Date gtime) {
		this.gtime = gtime;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

	@Override
	public String toString() {
		return "Gas [gid=" + gid + ", wname=" + wname + ", ch4=" + ch4 + ", co2=" + co2 + ", o2=" + o2 + ", h2s=" + h2s
				+ ", bal=" + bal + ", gtime=" + gtime + ", uname=" + uname + ", state=" + state + ", pressure="
				+ pressure + ", l=" + l + "]";
	}
}
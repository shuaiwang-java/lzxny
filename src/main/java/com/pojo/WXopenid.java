package com.pojo;

import java.util.Arrays;

/**
 * 微信openid
 * @author ws
 */
public class WXopenid {
	private String[] openid;
	public WXopenid() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WXopenid(String[] openid) {
		super();
		this.openid = openid;
	}
	public String[] getOpenid() {
		return openid;
	}
	public void setOpenid(String[] openid) {
		this.openid = openid;
	}
	@Override
	public String toString() {
		return "WXopenid [openid=" + Arrays.toString(openid) + "]";
	}
	
}

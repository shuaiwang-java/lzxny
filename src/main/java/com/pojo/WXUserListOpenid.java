package com.pojo;

/**
 * 微信用户列表
 * @author ws
 */
public class WXUserListOpenid {
	
	private int total; //用户数量
	private int count; //获取到的openid
	private String next_openid; //获取到列表的最后一个id
	private WXopenid data;  
	public WXUserListOpenid() {
		super();
	}
	public WXUserListOpenid(int total, int count, String next_openid, WXopenid data) {
		super();
		this.total = total;
		this.count = count;
		this.next_openid = next_openid;
		this.data = data;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getNext_openid() {
		return next_openid;
	}
	public void setNext_openid(String next_openid) {
		this.next_openid = next_openid;
	}
	public WXopenid getData() {
		return data;
	}
	public void setData(WXopenid data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "WXUserListOpenid [total=" + total + ", count=" + count + ", next_openid=" + next_openid + ", data="
				+ data + "]";
	}
}

package com.bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 返回状态通用实体0代表成功1代表失败
 * @author ws
 *
 */
public class Msg {
	
	private int code;	//返回状态0表示成功1表示失败
	private String msg;  //返回消息
	private int count; //upload状态
	
	private Map<String,Object> map = new HashMap<String, Object>(); //用户要返回给游览器的信息
	private List<User> user;
	
	
	public List<User> getUser() {
		return user;
	}
	public void setUser(List<User> user) {
		this.user = user;
	}
	
	//返回结果成功的函数
		public static Msg success() {
			Msg result = new Msg();
			result.setCode(0);
			result.setMsg("处理成功");
			return result;
		}
	
	//返回结果成功的函数
	public static Msg success(List<User> user) {
		Msg result = new Msg();
		result.setCode(0);
		result.setMsg("处理成功");
		result.setUser(user);
		return result;
	}
	//返回结果失败的函数
	public static Msg file() {
		Msg result = new Msg();
		result.setCode(1);
		result.setMsg("处理失败");
		return result;
	}
	
	//用来返回upload请求的函数
	public static Msg uploaMsg() {
		Msg result = new Msg();
		result.setCode(0);
		result.setMsg("");
		result.setCount(200);
		return result;
	}
	//用来返回upload请求的函数
	public static Msg uploaMsgfileEnd() {
		Msg result = new Msg();
		result.setCode(1);
		result.setMsg("");
		result.setCount(200);
		return result;
	}
	
	//返回用户的数据
	public Msg add(String string,Object object) {
		this.getMap().put(string, object);
		return this;
	}
	
	public Msg returnList() {
		this.getUser();
		return this;
	}
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
}

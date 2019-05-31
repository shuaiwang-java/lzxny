package com.bean;

import java.util.Arrays;
import java.util.Map;

/**
 * 微信推送消息模板
 * @author ws
 */
public class WechatTemplate {
	
	private String touser;  //用户openid
	private String template_id;  //template模板id
	private String url;  //跳转地址
	private Map<String,Template> data; //模板数据
	public WechatTemplate() {
		super();
	}
 	public WechatTemplate(String touser, String template_id, String url, Map<String, Template> data) {
 		super();
 		this.touser = touser;
 		this.template_id = template_id;
 		this.url = url;
 		this.data = data;
 	}
 	public String getTouser() {
 		return touser;
 	}
 	public void setTouser(String touser) {
 		this.touser = touser;
 	}
 	public String getTemplate_id() {
 		return template_id;
 	}
 	public void setTemplate_id(String template_id) {
 		this.template_id = template_id;
 	}
 	public String getUrl() {
 		return url;
 	}
 	public void setUrl(String url) {
 		this.url = url;
 	}
 	public Map<String, Template> getData() {
 		return data;
 	}
 	public void setData(Map<String, Template> data) {
 		this.data = data;
 	}
 	@Override
 	public String toString() {
 		return "WechatTemplate [touser=" + touser + ", template_id=" + template_id + ", url=" + url + ", data=" + data
 				+ "]";
 	}

}

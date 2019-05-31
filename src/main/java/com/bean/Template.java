package com.bean;

import org.springframework.stereotype.Component;

/**
 * 微信消息推送数据模板
 * @author ws
 *
 */
@Component
public class Template implements Cloneable{
		
	private String value;
	private String color;
	public Template() {
		super();
	}
	public Template(String value, String color) {
		super();
		this.value = value;
		this.color = color;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Template [value=" + value + ", color=" + color + "]";
	}
	@Override
	public Template clone() throws CloneNotSupportedException {
		return (Template) super.clone();
	}
	
}

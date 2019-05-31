package com.pojo;

import java.util.List;

/**
 * 存放微信的openid
 * @author ws
 */
public class WXUserStatic {
	private static List<String> pusha;
	private static List<String> pushba;
	private static List<String> pushca;
	public WXUserStatic() {
		super();
	}
	public static List<String> getPusha() {
		return pusha;
	}
	public static void setPusha(List<String> pusha) {
		WXUserStatic.pusha = pusha;
	}
	public static List<String> getPushba() {
		return pushba;
	}
	public static void setPushba(List<String> pushba) {
		WXUserStatic.pushba = pushba;
	}
	public static List<String> getPushca() {
		return pushca;
	}
	public static void setPushca(List<String> pushca) {
		WXUserStatic.pushca = pushca;
	}
}

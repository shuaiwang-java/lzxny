package com.test;
/*
 * 状态类
 */
public class Status {
	private static boolean status;

	private static long date;   //时间

	public static boolean isStatus() {
		return status;
	}

	public static void setStatus(boolean status) {
		Status.status = status;
	}

	public static float getDate() {
		return date;
	}

	public static void setDate(long date) {
		Status.date = date;
	}
	
}

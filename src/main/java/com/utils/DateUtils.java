package com.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 时间工具类
 */
public class DateUtils {
	
	/**
	 * @return  获取当前时间搓
	 */
	public static long getDate() {
		Date date = new Date();
		return date.getTime();
	}
	
	/**
	 * 获取到当前时间
	 * @return  返回格式化后的时间  yyyy-MM-dd HH:mm:ss
	 */
	public static String getFormatDate() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(d);
	}
	
}

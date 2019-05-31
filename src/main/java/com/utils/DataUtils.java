package com.utils;
/*
 * 数据工具类
 */
public class DataUtils {
	
	//float保留一位小数
	public static float one(float a) {
        float a1 = (float)(Math.round(a*10))/10;  //10指的是要保留的小数位数
        return a1;
	}
	
}

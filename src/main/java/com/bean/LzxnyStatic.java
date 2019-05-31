package com.bean;

import java.io.Serializable;

/**
 * 推送参数常量
 * @author ws
 */
public class LzxnyStatic implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2496825521037112042L;

	private static float ch4;
	
	private static float o2;
	
	private static float kpa;
	
	private static float hz1;

	public LzxnyStatic() {
		super();
	}

	public static float getCh4() {
		return ch4;
	}

	public static void setCh4(float ch4) {
		LzxnyStatic.ch4 = ch4;
	}

	public static float getO2() {
		return o2;
	}

	public static void setO2(float o2) {
		LzxnyStatic.o2 = o2;
	}

	public static float getKpa() {
		return kpa;
	}

	public static void setKpa(float kpa) {
		LzxnyStatic.kpa = kpa;
	}

	public static float getHz1() {
		return hz1;
	}

	public static void setHz1(float hz1) {
		LzxnyStatic.hz1 = hz1;
	}
	
	public static boolean isDataNull() {
		if(ch4 == 0 || o2 == 0 || kpa == 0 || hz1 == 0 ) {
			return false;
		}
		return true;
	}
	
	
}

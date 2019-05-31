package com.pojo;
/**
 * 返回对象
 * @author ws
 */
public class PushData {
	private  float ch4;
	        
	private  float o2;
	        
	private  float kpa;
	        
	private  float hz1;

	public PushData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PushData(float ch4, float o2, float kpa, float hz1) {
		super();
		this.ch4 = ch4;
		this.o2 = o2;
		this.kpa = kpa;
		this.hz1 = hz1;
	}

	public float getCh4() {
		return ch4;
	}

	public void setCh4(float ch4) {
		this.ch4 = ch4;
	}

	public float getO2() {
		return o2;
	}

	public void setO2(float o2) {
		this.o2 = o2;
	}

	public float getKpa() {
		return kpa;
	}

	public void setKpa(float kpa) {
		this.kpa = kpa;
	}

	public float getHz1() {
		return hz1;
	}

	public void setHz1(float hz1) {
		this.hz1 = hz1;
	}
	
}

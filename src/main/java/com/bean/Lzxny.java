package com.bean;

/**
 * @author ws
 */
public class Lzxny {
	
	private  float ch4;
	
	private  float o2;
	
	private  float kpa;
	
	private  float hz1;
	
	private  float hz2;

	public Lzxny() {
		super();
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

	public float getHz2() {
		return hz2;
	}

	public void setHz2(float hz2) {
		this.hz2 = hz2;
	}

	@Override
	public String toString() {
		return "Data [ch4=" + ch4 + ", o2=" + o2 + ", kpa=" + kpa + ", hz1=" + hz1 + ", hz2=" + hz2 + "]";
	}
	
	
}

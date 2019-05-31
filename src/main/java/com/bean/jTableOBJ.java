package com.bean;

import java.util.Date;

/**
 * 机组表对象
 * @author ws
 *
 */
public class jTableOBJ {
	
	private Date ti;

    private Float a;

    private Float b;

    private Float c;

    private Float d;

    public jTableOBJ() {
	}
	public Date getTi() {
		return ti;
	}
	public jTableOBJ(Date ti, Float a, Float b, Float c, Float d) {
		super();
		this.ti = ti;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	public void setTi(Date ti) {
		this.ti = ti;
	}

	public Float getA() {
		return a;
	}

	public void setA(Float a) {
		this.a = a;
	}

	public Float getB() {
		return b;
	}

	public void setB(Float b) {
		this.b = b;
	}

	public Float getC() {
		return c;
	}

	public void setC(Float c) {
		this.c = c;
	}

	public Float getD() {
		return d;
	}

	public void setD(Float d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "jTableOBJ [ti=" + ti + ", a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}

}

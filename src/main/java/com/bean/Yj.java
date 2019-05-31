package com.bean;

public class Yj {
    private Integer yid;

    private String date1;

    private String time1;

    private Float c;

    private Float qt;

    private Float ch;

    private Float o2;

    private Float fq;

    private Float a20;

    public Integer getYid() {
        return yid;
    }

    public void setYid(Integer yid) {
        this.yid = yid;
    }

    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1 == null ? null : date1.trim();
    }

    public String getTime1() {
        return time1;
    }

    public void setTime1(String time1) {
        this.time1 = time1 == null ? null : time1.trim();
    }

    public Float getC() {
        return c;
    }

    public void setC(Float c) {
        this.c = c;
    }

    public Float getQt() {
        return qt;
    }

    public void setQt(Float qt) {
        this.qt = qt;
    }

    public Float getCh() {
        return ch;
    }

    public void setCh(Float ch) {
        this.ch = ch;
    }

    public Float getO2() {
        return o2;
    }

    public void setO2(Float o2) {
        this.o2 = o2;
    }

    public Float getFq() {
        return fq;
    }

    public void setFq(Float fq) {
        this.fq = fq;
    }

    public Float getA20() {
        return a20;
    }

    public void setA20(Float a20) {
        this.a20 = a20;
    }

	@Override
	public String toString() {
		return "Yj [yid=" + yid + ", date1=" + date1 + ", time1=" + time1 + ", c=" + c + ", qt=" + qt + ", ch=" + ch
				+ ", o2=" + o2 + ", fq=" + fq + ", a20=" + a20 + "]";
	}
    
}
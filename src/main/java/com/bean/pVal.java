package com.bean;

/**
 * 推送参数实体
 * @author ws
 *
 */
public class pVal {
    private Integer pushid;  //id

    private Float ch4;   //甲烷
 
    private Float o2;   //氧气

    private Float kpa;   //压力

    private Float hz;   //频率

    public Integer getPushid() {
        return pushid;
    }

    public void setPushid(Integer pushid) {
        this.pushid = pushid;
    }

    public Float getCh4() {
        return ch4;
    }

    public void setCh4(Float ch4) {
        this.ch4 = ch4;
    }

    public Float getO2() {
        return o2;
    }

    public void setO2(Float o2) {
        this.o2 = o2;
    }

    public Float getKpa() {
        return kpa;
    }

    public void setKpa(Float kpa) {
        this.kpa = kpa;
    }

    public Float getHz() {
        return hz;
    }

    public void setHz(Float hz) {
        this.hz = hz;
    }
}
package com.bean;

import java.util.Date;

public class SumInfo {
    private Integer id;  //

    private Date date; // 时间

    private Float suma; //发电总功率

    private Float sumb; //上网总功率

    private Float sumd; //没方产电量

    private Float sume; //累计总发电量

    private Float sumf; //累计上网电量

    private Float sumh; //累计下网电量

    private Float sumi; //一期上网电量

    private Float sumg; //二期上网电量

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Float getSuma() {
        return suma;
    }

    public void setSuma(Float suma) {
        this.suma = suma;
    }

    public Float getSumb() {
        return sumb;
    }

    public void setSumb(Float sumb) {
        this.sumb = sumb;
    }

    public Float getSumd() {
        return sumd;
    }

    public void setSumd(Float sumd) {
        this.sumd = sumd;
    }

    public Float getSume() {
        return sume;
    }

    public void setSume(Float sume) {
        this.sume = sume;
    }

    public Float getSumf() {
        return sumf;
    }

    public void setSumf(Float sumf) {
        this.sumf = sumf;
    }

    public Float getSumh() {
        return sumh;
    }

    public void setSumh(Float sumh) {
        this.sumh = sumh;
    }

    public Float getSumi() {
        return sumi;
    }

    public void setSumi(Float sumi) {
        this.sumi = sumi;
    }

    public Float getSumg() {
        return sumg;
    }

    public void setSumg(Float sumg) {
        this.sumg = sumg;
    }
}
package com.bean;

/**
 * 上网累计电量实体
 * @author ws
 *
 */
public class pSumKey {
    private Integer psumid;  //id

    private Float psumval;  //上网电量

    public Integer getPsumid() {
        return psumid;
    }

    public void setPsumid(Integer psumid) {
        this.psumid = psumid;
    }

    public Float getPsumval() {
        return psumval;
    }

    public void setPsumval(Float psumval) {
        this.psumval = psumval;
    }
}
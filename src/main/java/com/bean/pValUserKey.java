package com.bean;

public class pValUserKey {
    private Integer puserid;

    private String pusername;

    public Integer getPuserid() {
        return puserid;
    }

    public void setPuserid(Integer puserid) {
        this.puserid = puserid;
    }

    public String getPusername() {
        return pusername;
    }

    public void setPusername(String pusername) {
        this.pusername = pusername == null ? null : pusername.trim();
    }
}
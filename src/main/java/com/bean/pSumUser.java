package com.bean;
/**
 * 上网电量用户列表
 * @author ws
 *
 */
public class pSumUser extends pSumUserKey {
    private String puserphone;  //电话

    private String puserdept;   //部门

    public String getPuserphone() {
        return puserphone;
    }

    public void setPuserphone(String puserphone) {
        this.puserphone = puserphone == null ? null : puserphone.trim();
    }

    public String getPuserdept() {
        return puserdept;
    }

    public void setPuserdept(String puserdept) {
        this.puserdept = puserdept == null ? null : puserdept.trim();
    }
}
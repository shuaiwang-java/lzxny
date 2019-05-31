package com.bean;
/**
 * 参数用户实体
 * @author ws
 *
 */
public class pValUser extends pValUserKey {
    private String pusernamephone;

    private String puserdept;

    public String getPusernamephone() {
        return pusernamephone;
    }

    public void setPusernamephone(String pusernamephone) {
        this.pusernamephone = pusernamephone == null ? null : pusernamephone.trim();
    }

    public String getPuserdept() {
        return puserdept;
    }

    public void setPuserdept(String puserdept) {
        this.puserdept = puserdept == null ? null : puserdept.trim();
    }
}
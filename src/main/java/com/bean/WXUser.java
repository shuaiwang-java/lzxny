package com.bean;

public class WXUser implements Cloneable{
    private Integer id;

    private String openid;

    private String nickname;

    private String headimgurl;

    private String pusha;

    private String pushb;

    private String pushc;
    
    public WXUser() {
		super();
	}
    
	public WXUser(Integer id, String openid, String nickname, String headimgurl, String pusha, String pushb,
			String pushc) {
		super();
		this.id = id;
		this.openid = openid;
		this.nickname = nickname;
		this.headimgurl = headimgurl;
		this.pusha = pusha;
		this.pushb = pushb;
		this.pushc = pushc;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl == null ? null : headimgurl.trim();
    }

    public String getPusha() {
        return pusha;
    }

    public void setPusha(String pusha) {
        this.pusha = pusha == null ? null : pusha.trim();
    }

    public String getPushb() {
        return pushb;
    }

    public void setPushb(String pushb) {
        this.pushb = pushb == null ? null : pushb.trim();
    }

    public String getPushc() {
        return pushc;
    }

    public void setPushc(String pushc) {
        this.pushc = pushc == null ? null : pushc.trim();
    }
    public WXUser clone()throws CloneNotSupportedException{
    	return (WXUser) super.clone();
    }

	@Override
	public String toString() {
		return "WXUser [id=" + id + ", openid=" + openid + ", nickname=" + nickname + ", headimgurl=" + headimgurl
				+ ", pusha=" + pusha + ", pushb=" + pushb + ", pushc=" + pushc + "]";
	}
    
}
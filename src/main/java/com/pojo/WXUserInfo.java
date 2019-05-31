package com.pojo;

import java.util.Arrays;
/**
 * 微信用户实体类
 * @author ws
 */
public class WXUserInfo {
	private int subscribe; 
    private String openid;
    private String nickname; 
    private int sex; 
    private String language;
    private String city; 
    private String province; 
    private String country;
    private String headimgurl;
    private long subscribe_time;
    private String unionid;
    private String remark;
    private int groupid;
    private int[] tagid_list;
    private String subscribe_scene;
    private int qr_scene;
    private String qr_scene_str;
	public WXUserInfo() {
		super();
	}
	public WXUserInfo(int subscribe, String openid, String nickname, int sex, String language, String city,
			String province, String country, String headimgurl, long subscribe_time, String unionid, String remark,
			int groupid, int[] tagid_list, String subscribe_scene, int qr_scene, String qr_scene_str) {
		super();
		this.subscribe = subscribe;
		this.openid = openid;
		this.nickname = nickname;
		this.sex = sex;
		this.language = language;
		this.city = city;
		this.province = province;
		this.country = country;
		this.headimgurl = headimgurl;
		this.subscribe_time = subscribe_time;
		this.unionid = unionid;
		this.remark = remark;
		this.groupid = groupid;
		this.tagid_list = tagid_list;
		this.subscribe_scene = subscribe_scene;
		this.qr_scene = qr_scene;
		this.qr_scene_str = qr_scene_str;
	}
	public int getSubscribe() {
		return subscribe;
	}
	public void setSubscribe(int subscribe) {
		this.subscribe = subscribe;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getHeadimgurl() {
		return headimgurl;
	}
	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}
	public long getSubscribe_time() {
		return subscribe_time;
	}
	public void setSubscribe_time(long subscribe_time) {
		this.subscribe_time = subscribe_time;
	}
	public String getUnionid() {
		return unionid;
	}
	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getGroupid() {
		return groupid;
	}
	public void setGroupid(int groupid) {
		this.groupid = groupid;
	}
	public int[] getTagid_list() {
		return tagid_list;
	}
	public void setTagid_list(int[] tagid_list) {
		this.tagid_list = tagid_list;
	}
	public String getSubscribe_scene() {
		return subscribe_scene;
	}
	public void setSubscribe_scene(String subscribe_scene) {
		this.subscribe_scene = subscribe_scene;
	}
	public int getQr_scene() {
		return qr_scene;
	}
	public void setQr_scene(int qr_scene) {
		this.qr_scene = qr_scene;
	}
	public String getQr_scene_str() {
		return qr_scene_str;
	}
	public void setQr_scene_str(String qr_scene_str) {
		this.qr_scene_str = qr_scene_str;
	}
	@Override
	public String toString() {
		return "WXUserInfo [subscribe=" + subscribe + ", openid=" + openid + ", nickname=" + nickname + ", sex=" + sex
				+ ", language=" + language + ", city=" + city + ", province=" + province + ", country=" + country
				+ ", headimgurl=" + headimgurl + ", subscribe_time=" + subscribe_time + ", unionid=" + unionid
				+ ", remark=" + remark + ", groupid=" + groupid + ", tagid_list=" + Arrays.toString(tagid_list)
				+ ", subscribe_scene=" + subscribe_scene + ", qr_scene=" + qr_scene + ", qr_scene_str=" + qr_scene_str
				+ "]";
	}
}

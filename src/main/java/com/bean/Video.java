package com.bean;

/**
 * 视频文件对象
 * @author ws
 *
 */
public class Video {
	private int vId;  //视屏文件id
	private String vName; //视屏文件名字
	public Video() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Video(int vId, String vName) {
		super();
		this.vId = vId;
		this.vName = vName;
	}
	
	public int getvId() {
		return vId;
	}
	public void setvId(int vId) {
		this.vId = vId;
	}
	public String getvName() {
		return vName;
	}
	public void setvName(String vName) {
		this.vName = vName;
	}
	@Override
	public String toString() {
		return "Vidoe [vId=" + vId + ", vName=" + vName + "]";
	}

}

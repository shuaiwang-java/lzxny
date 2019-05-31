package com.bean;

import java.util.Date;

import com.utils.DataUtils;

/**
 * 移动端 发电数据实体类
 * @author ws
 *
 */
public class MobileData implements Cloneable {
	
	private Integer id;   //id

    private Date t;      //时间

    private Float f;	// 总管压力

    private Float h;   //甲烷

    private Float o;   //氧

    private Float dsum;  //总发电量

    private Float dsums;   //总上网电量

    private Float dsuml;  //发电总流量

	public MobileData() {
		super();
	}

	public MobileData(Integer id, Date t, Float f, Float h, Float o, Float dsum, Float dsums, Float dsuml) {
		super();
		this.id = id;
		this.t = t;
		this.f = f;
		this.h = h;
		this.o = o;
		this.dsum = dsum;
		this.dsums = dsums;
		this.dsuml = dsuml;
	}
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getT() {
		return t;
	}

	public void setT(Date t) {
		this.t = t;
	}

	public Float getF() {
		return f;
	}

	public void setF(Float f) {
		this.f = DataUtils.one(f);
	}

	public Float getH() {
		return h;
	}

	public void setH(Float h) {
		this.h = DataUtils.one(h);
	}

	public Float getO() {
		return o;
	}

	public void setO(Float o) {
		this.o = DataUtils.one(o);
	}

	public Float getDsum() {
		return dsum;
	}

	public void setDsum(Float dsum) {
		this.dsum = DataUtils.one(dsum);
	}

	public Float getDsums() {
		return dsums;
	}

	public void setDsums(Float dsums) {
		this.dsums = DataUtils.one(dsums);
	}

	public Float getDsuml() {
		return dsuml;
	}

	public void setDsuml(Float dsuml) {
		this.dsuml = DataUtils.one(dsuml);
	}
	
	@Override
	public MobileData clone() throws CloneNotSupportedException {
		return (MobileData) super.clone();
	}

	@Override
	public String toString() {
		return "MobileData [id=" + id + ", t=" + t + ", f=" + f + ", h=" + h + ", o=" + o + ", dsum=" + dsum
				+ ", dsums=" + dsums + ", dsuml=" + dsuml + "]";
	}
}

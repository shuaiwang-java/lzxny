package com.service;

import java.util.List;

import com.bean.WellKey;

public interface WellService {

	List<WellKey> getWellAll();
	
	//添加
	void addWell(String wname,String wRegion);
	
	//判断该井是否存在
	boolean getWellAll(String wname);
	
	//获取到所有的井和区域
	List<WellKey> getWellAndwRegion();

}

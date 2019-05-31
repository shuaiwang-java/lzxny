package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bean.Yj;
import com.bean.Yj1;

/**
 * 预计电量业务层
 * @author ws
 *
 */
public interface YjService {

	Yj getAll();
	
	//根据年月日获取到数据
	List<Yj> getBydDate1(String date);
	
	//查询一天的上网电量详情
	Yj1 getByswdl(String date);
	
	
	
}

package com.service;

import com.bean.Lzxny;

/**
 * 获取数据层
 * @author ws
 */
public interface DataService {

	Lzxny getdata()throws Exception;
	
	void deleteAllDate()throws Exception;
	
}

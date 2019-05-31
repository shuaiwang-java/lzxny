package com.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Lzxny;
import com.dao.LzxnyMapper;
import com.service.DataService;
@Service
@Transactional
public class DataServiceImpl implements DataService {
	
	@Autowired
	private LzxnyMapper dataMapper;
	
	public Lzxny getdata()throws Exception {
		return dataMapper.getch2();
	}

	public void deleteAllDate() throws Exception {
		dataMapper.deleteAll();
	}

}

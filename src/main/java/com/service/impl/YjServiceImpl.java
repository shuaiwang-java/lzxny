package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Yj;
import com.bean.Yj1;
import com.dao.Yj1Mapper;
import com.dao.YjMapper;
import com.service.YjService;


@Service
@Transactional
public class YjServiceImpl implements YjService {

	@Autowired
	YjMapper yjMapper;
	
	@Autowired
	Yj1Mapper yi1Mapper;
	
	public Yj getAll() {
		return yjMapper.selectByPrimaryKey(1027);
	}

	
	public List<Yj> getBydDate1(String date) {
		String string = date.replace("-", "/");
		return yjMapper.selectByDate1(string);
	}


	public Yj1 getByswdl(String date) {
		String string = date.replace("-", "/");
		return yi1Mapper.selectByswdl(string);
		
		 
	}
		
	
	
}

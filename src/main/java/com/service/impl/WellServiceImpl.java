package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.WellKey;
import com.dao.WellMapper;
import com.service.WellService;

@Service
@Transactional
public class WellServiceImpl implements WellService {
	
	@Autowired
	WellMapper wellMapper;
	
	
	public List<WellKey> getWellAll() {
		return wellMapper.selectByExample(null);
	}

	
	//添加
	public void addWell(String wname,String wRegion) {
		wellMapper.insertName(wname,wRegion);
	}

	/*
	 * 判断是否存在
	 * @see com.service.WellService#getWellAll(java.lang.String)
	 */
	public boolean getWellAll(String wname) {
		List<WellKey> list = wellMapper.selectByExample(null);
		
		for (WellKey wellKey : list) {
			
			if(wellKey.getWname().equals(wname) || wellKey.getWname() == wname) {
				return false;
			}
		}
		return true;
	}

	/*
	 * 获取到所有井
	 */
	public List<WellKey> getWellAndwRegion() {
		return wellMapper.selectWellKeyAndwRegion();
	}

}

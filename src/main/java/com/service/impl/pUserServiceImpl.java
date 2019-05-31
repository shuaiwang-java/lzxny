package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.User;
import com.bean.pValUser;
import com.dao.pSumUserMapper;
import com.dao.pValUserMapper;
import com.service.pUserService;

/**
 * 
 * @author ws
 *
 */
@Service
@Transactional
public class pUserServiceImpl implements pUserService {
	
	@Autowired
	private pValUserMapper  pvUserMapper;
	
	@Autowired
	private pSumUserMapper psUserMapper;

	public void deletepvUserById(int puserid) throws Exception {
		pvUserMapper.deleteUserById(puserid);
	}
	public void deletepsUserById(int puserid) throws Exception {
		psUserMapper.deleteUserById(puserid);
	}
}

package com.service;

import java.util.List;

import com.bean.User;

/**
 * 报警人员列表接口
 * @author ws
 *
 */
public interface pUserService {
	
	//通过id删除用户
	void deletepvUserById(int puserid)throws Exception;
	
	//通过id删除用户
	void deletepsUserById(int puserid)throws Exception;
}

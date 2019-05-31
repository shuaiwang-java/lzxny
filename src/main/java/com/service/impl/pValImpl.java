package com.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.User;
import com.bean.WXUser;
import com.bean.WXdata;
import com.bean.pSumKey;
import com.bean.pSumUser;
import com.bean.pVal;
import com.bean.pValUser;
import com.dao.UserMapper;
import com.dao.WXUserMapper;
import com.dao.WXdataMapper;
import com.dao.pSumMapper;
import com.dao.pSumUserMapper;
import com.dao.pValMapper;
import com.dao.pValUserMapper;
import com.service.pValService;

/**
 * 报警参数业务实现层
 * @author ws
 *
 */
@Service
@Transactional(rollbackFor=Exception.class)
public class pValImpl implements pValService {
	
	
	@Autowired
	private pValMapper  pvMapper;
	
	@Autowired
	private pSumMapper psMapper;
	
	@Autowired
	private pValUserMapper pvUserMapper;
	
	@Autowired
	private pSumUserMapper psUserMapper;
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private WXdataMapper wxDataMapper;
	
	@Autowired
	private WXUserMapper wxuserMapper;

	public pVal getpVal()throws Exception {
		
		return pvMapper.selectVal();
		
	}

	public pSumKey getpSum()throws Exception {
		return psMapper.selectPs();
	}

	public List<pValUser> getpvUser() throws Exception {
		return pvUserMapper.selectByExample(null);
	}

	public List<pSumUser> getpsUser() throws Exception {
		return psUserMapper.selectByExample(null);
	}

	public void updateDate(pVal pval) throws Exception {
		pvMapper.updateByPrimaryKey(pval);
	}
	
	/*
	 * 通过用户名查询到user添加到用户
	 * @see com.service.pValService#addpvUser(java.util.List)
	 */
	public void addpvUser(List<User> users)throws RuntimeException {
		if(users != null) {
			for (User user : users) {
				
				user.setRoleid(userMapper.selectRId(user.getUid()));
				//获取部门
				String roleNme =  userMapper.getroleName(user.getRoleid());
				//添加要推送的用户信息
				try {
					pvUserMapper.addpvUser(user.getUname(),user.getUphone(),roleNme);
				} catch (Exception e) {
					 new RuntimeException();
				}
			}
		}
	}

	public void addpvUser2(List<User> users)throws RuntimeException{
		if(users != null) {
			for (User user : users) {
				user.setRoleid(userMapper.selectRId(user.getUid()));
				//获取部门
				String roleNme =  userMapper.getroleName(user.getRoleid());
				//添加要推送的用户信息
				try {
					psUserMapper.addpvUser(user.getUname(),user.getUphone(),roleNme);
				} catch (Exception e) {
					 new RuntimeException();
				}
			}
		}
	}
	
	//返回一组电话号码
	public List<String> getUserPhone() {
		return pvMapper.getPhone();
	}

	public void addWXdata(WXdata wxdata) throws Exception {
		wxdata.setDatedata(new Date());  //
		wxDataMapper.insertSelective(wxdata);
	}

	public WXdata getWXData() throws Exception {
		
		return wxDataMapper.getDataLimit();
	}
	
	public void addWXUser(WXUser user) throws Exception {
		wxuserMapper.insertSelective(user);
	}

	public 	List<WXUser> getWXUserByAll() throws Exception {
		return wxuserMapper.selectByExample(null);
	}

	public void updatePusha(Integer id, String string) throws Exception {
		wxuserMapper.updateByIdAndPusha(id,string);
	}
	public void updatePushb(Integer id, String string) throws Exception {
		wxuserMapper.updateByIdAndPushb(id,string);
	}

	public void updatePushc(Integer id, String string) throws Exception {
		wxuserMapper.updateByIdAndPushc(id,string);
	}

	public List<String> getWXUserOpenid()throws Exception {
		
		List<WXUser> user = wxuserMapper.selectByPusha("true");
		
		List<String> list = new ArrayList<String>();
		for (WXUser wxUser : user) {
			list.add(wxUser.getOpenid());
		}
		
		return list;
	}

	public List<String> getWXUserOpenidAndB() throws Exception {
		List<WXUser> user = wxuserMapper.selectByPushb("true");
		
		List<String> list = new ArrayList<String>();
		for (WXUser wxUser : user) {
			list.add(wxUser.getOpenid());
		}
		
		return list;
	}
	
	

}

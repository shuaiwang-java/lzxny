package com.service;

import java.util.List;

import com.bean.User;
import com.bean.WXUser;
import com.bean.WXdata;
import com.bean.pSumKey;
import com.bean.pSumUser;
import com.bean.pVal;
import com.bean.pValUser;

/**
 * 参数业务接口
 * @author ws
 *
 */
public interface pValService {
	
	pVal getpVal()throws Exception; //获取报警参数值

	pSumKey getpSum()throws Exception;  //获取上网电量值

	List<pValUser> getpvUser()throws Exception;  //接收报警人员列表

	List<pSumUser> getpsUser()throws Exception;  //接收当日电量人员列表

	void updateDate(pVal pval)throws Exception; //更新警报值
	
	void addpvUser(List<User> users) throws Exception;  //添加用户

	void addpvUser2(List<User> users)throws Exception;

	List<String> getUserPhone();  //返回一组电话号码
	
	void addWXdata(WXdata wxdata)throws Exception;

	WXdata getWXData()throws Exception;  //获取微信推送的上网电量数据

	void addWXUser(WXUser user)throws Exception; //向数据库添加微信用户

	List<WXUser> getWXUserByAll()throws Exception;  //获取微信用户

	void updatePusha(Integer id, String string)throws Exception; //修改微信用户信息a

	void updatePushb(Integer id, String string)throws Exception;

	void updatePushc(Integer id, String string)throws Exception;

	List<String> getWXUserOpenid()throws Exception; //获取要推送的中控气质人员

	List<String> getWXUserOpenidAndB()throws Exception; //获取推送电量的openid
	
}

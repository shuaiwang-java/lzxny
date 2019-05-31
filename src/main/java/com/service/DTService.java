package com.service;

import java.util.List;
import java.util.Map;

import com.bean.MobileData;
import com.bean.SumInfo;
import com.bean.Suma;
import com.bean.jtable;
import com.bean.ytable;

/**
 * 报表接口
 * @author ws
 *
 */
public interface DTService {
	
	//通过日期查询所有的预处理数据
	List<ytable> getAllDT(String string)throws Exception;

	List<ytable> getAllData()throws Exception;
	
	//查询一天的机组数据
	List<jtable> getDayJTable(String string)throws Exception;

	List<jtable> getAllJData()throws Exception;
	
	//移动端 请求接口 返回发电数据
	List<MobileData> selectMobileData(String string)throws Exception;

	//微信端获每日发电详情
	SumInfo getSumData()throws Exception;
	//实时获取预处理甲烷等数据
	Suma getSumaData()throws Exception; 
	

}

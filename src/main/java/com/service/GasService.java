package com.service;

import java.util.List;
import java.util.Map;

import com.bean.Gas;

public interface GasService {
	
	//添加气质
	void insertAndGas(Gas gas)throws Exception;
	//获取到所有气质信息
	List<Gas> getGasAll();
	//通过时间获取到gas
	List<Gas> getGasByTime(String date);
	//通过名字查询到井的数据
	List<Gas> getGasBywName(String selectVal);
	//通过时间和井编号查询
	List<Gas> getGasByTimeAndWname(String dates, String selectVal);
	//查询前七天的时间到当前时间的方法
	List<Gas> getGasBywNameTimeWeek(String gname);
	//查询一个月的方法
	List<Gas> getGasBywNameTimeMonth(String gname);
	//返回主管的数据
	List<Gas> getfinally();
	//通过名字查询当个井的最后的数据
	Gas getGasBywNameReturnOne(String wname)throws Exception;
	//查询一个区的所有数据
	List<Gas> getGasZoneData(String string)throws Exception;

}

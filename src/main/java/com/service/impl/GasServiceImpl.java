package com.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Gas;
import com.dao.GasMapper;
import com.service.GasService;

@Service
@Transactional
public class GasServiceImpl implements GasService {
	
	@Autowired
	GasMapper gasMapper;
	
	public void insertAndGas(Gas gas)throws Exception {
		gasMapper.insert(gas);
	}
	/*
	 * 获取到所有气质信息
	 * @see com.service.GasService#getGasAll()
	 */
	public List<Gas> getGasAll() {
		return gasMapper.selectByExample(null);
	}
	/*
	 * 通过时间查询gas
	 * @see com.service.GasService#getGasByTime(java.lang.String)
	 */
	public List<Gas> getGasByTime(String date){
		List<Gas> gass = new ArrayList<Gas>();
		Map<String, Object> map = getTime(date);
		Long time1 =  (Long) map.get("time1");
		Long time2 =  (Long) map.get("time2");
		
		System.out.println("起止时间："+time1);
		System.out.println("结束时间"+time2);
		
		List<Gas> list = gasMapper.selectByExample(null);
		for (Gas gas : list) {
			Date gtime = gas.getGtime();
			long time = gtime.getTime();
			//当前时间
			if(time > time1 && time < time2) {
				System.out.println(gas);
				gass.add(gas);
			}
		}
		/*return gasMapper.selectGasByTime(time1,time2);*/
		return gass;
	}
	
	
	/*
	 * 时间格式转换
	 */
	public Map<String,Object> getTime(String date){
		HashMap<String, Object> map = new HashMap<String, Object>();
		String t = date;
		String a =t.replace(" ", "");
		String[] split = a.split("到");
		SimpleDateFormat simple = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
		Date date1,data2;
		try {
			date1 = simple.parse(split[0]);  //	Thu Nov 01 00:00:00 CST 2018
			data2 = simple.parse(split[1]);
			long l = date1.getTime();        //1541001600000
			long m = data2.getTime();
			map.put("time1", l);
			map.put("time2", m);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return map;
	}
	
	/*
	 * 通过名字查询
	 * @see com.service.GasService#getGasBywName(java.lang.String)
	 */
	public List<Gas> getGasBywName(String selectVal) {
		String[] val = selectVal.split(",");
		List<Gas> gass = new ArrayList<Gas>();
		for(int i=0; i<val.length;i++){
			  List<Gas> gas = gasMapper.selectByUname(val[i]);
			  for (Gas gas2 : gas) {
				  gass .add(gas2);
			}
		}
		return gass;
	}
	
	
	/*
	 *通过时间和井编号查询
	 * @see com.service.GasService#getGasByTimeAndWname(java.lang.String, java.lang.String)
	 */
	public List<Gas> getGasByTimeAndWname(String dates, String selectVal) {
		
		List<Gas> gass = new ArrayList<Gas>();
		
		Map<String, Object> map = getTime(dates);
		Long time1 =  (Long) map.get("time1");
		Long time2 =  (Long) map.get("time2");
		
		List<Gas> list = gasMapper.selectByExample(null);
		for (Gas gas : list) {
			Date gtime = gas.getGtime();
			long time = gtime.getTime();
			
			String[] val = selectVal.split(",");
			for(int i=0; i<val.length;i++) {
				//当前时间和名字
				if(time > time1 && time < time2 && gas.getWname().equals(val[i])) {
					gass.add(gas);
				}
			}
		}
		return gass;
	}
	
	/*	
	 * 获取到一周的数据
	 * @see com.service.GasService#getGasBywNameTimeWeek(java.lang.String)
	 */
	public List<Gas> getGasBywNameTimeWeek(String gname) {
		return gasMapper.getGasWeek(gname);
	}
	
	/*
	 * 获取到一个月
	 */
	public List<Gas> getGasBywNameTimeMonth(String gname) {
		return gasMapper.getGasMonth(gname);
	}
	
	//返回主管上各个测气点的气质
	public List<Gas> getfinally() {
		//循环查询630-1、630-2、AC315、E315-1、E315-2、E315-3、B315-1
		String arr[] = {"630-1","630-2","AC315","E315-1","E315-2","E315-3","B315-1"};
		
		List<Gas> gass = new ArrayList<Gas>();
		
		for (int i = 0; i < arr.length; i++) {
			String string = arr[i];
			//通过名字查询最后一条
			Gas gas = gasMapper.selectGasName(string);
			gass.add(gas);
		}
		return gass;
	}
	
	//通过名字查询当个井的最后的数据
	public Gas getGasBywNameReturnOne(String wname)throws Exception {
		return gasMapper.selectGasName(wname);
	}
	
	//查询一个区的所有单井数据
	public List<Gas> getGasZoneData(String string)throws Exception {
		return gasMapper.selectGasByZone(string);
	}
	
	

	
	
}

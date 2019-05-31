package com.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.bean.MobileData;
import com.bean.SumInfo;
import com.bean.Suma;
import com.bean.jtable;
import com.bean.ytable;
import com.dao.SumInfoMapper;
import com.dao.SumaMapper;
import com.dao.jtableMapper;
import com.dao.ytableMapper;
import com.service.DTService;

/**
 * 实现报表接口
 * @author ws
 * @param <V>
 */
@Service
@Transactional
public class DTServiceImpl<V> implements DTService {
	
	@Autowired
	ytableMapper ytMapper;
	
	@Autowired
	jtableMapper jtMapper;
	
	@Autowired 
	SumInfoMapper sumInfoMapper;
	
	@Autowired
	SumaMapper sumaMapper;
	
	public List<ytable> getAllDT(String string) throws Exception {
		//拆分从接口传来的值
		String[] split = string.split("-");
		return ytMapper.selectByYMD(split[0],split[1],split[2]);
	}
	
	public List<ytable> getAllData() throws Exception {
		return ytMapper.selectByExample(null);
	}
	
	public List<jtable> getDayJTable(String string) throws Exception {
		String[] split = string.split("-");
		return jtMapper.selectByDayJTable(split[0], split[1], split[2]);
	}

	public List<jtable> getAllJData() throws Exception {
		return jtMapper.selectByExample(null);
	}
	
	/*
	 * 查询出mobile(non-Javadoc)
	 * @see com.service.DTService#selectMobileData(java.lang.String)
	 */
	public List<MobileData> selectMobileData(String string)throws Exception {
		//拆分从接口传来的值
				 String[] split = string.split("-");
				 List<ytable> obj = ytMapper.selectMobileByYMD(split[0],split[1],split[2]);
				
				 ArrayList<MobileData> list = new ArrayList<MobileData>();
				 MobileData mobile = new MobileData();
				 
				 for(int i = 0; i < obj.size(); i++) {
					 MobileData mobile2 = mobile.clone();
					 
					 if( i != 0) {
						 mobile2.setDsum((obj.get(i).getDsum() - obj.get(i-1).getDsum())*1000);  
						 mobile2.setDsuml(obj.get(i).getDsuml());
						 mobile2.setDsums(obj.get(i).getDsums());
						 mobile2.setF(obj.get(i).getF());
						 mobile2.setH(obj.get(i).getH());
						 mobile2.setO(obj.get(i).getO());
						 mobile2.setT(obj.get(i).getT());
						 mobile2.setId(obj.get(i).getId());
						 list.add(mobile2);
					 }else if( i == 0){
						 ytable ytable = ytMapper.selectSumById(obj.get(i).getId()-1);
						 mobile2.setDsum((obj.get(i).getDsum() - ytable.getDsum())*1000);  
						 mobile2.setDsuml(obj.get(i).getDsuml());
						 mobile2.setDsums(obj.get(i).getDsums());
						 mobile2.setF(obj.get(i).getF());
						 mobile2.setH(obj.get(i).getH());
						 mobile2.setO(obj.get(i).getO());
						 mobile2.setT(obj.get(i).getT());
						 mobile2.setId(obj.get(i).getId());
						 list.add(mobile2);
					 }
				 }
				 return list;
	}

	public SumInfo getSumData() throws Exception {
		return sumInfoMapper.selectAll();
	}

	public Suma getSumaData() throws Exception {
		return sumaMapper.selectLimit();
	}
	
}

package com.dao;

import com.bean.Gas;
import com.bean.GasExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GasMapper {
    long countByExample(GasExample example);

    int deleteByExample(GasExample example);

    int deleteByPrimaryKey(Integer gid);

    int insert(Gas record)throws Exception;

    int insertSelective(Gas record);

    List<Gas> selectByExample(GasExample example);

    Gas selectByPrimaryKey(Integer gid);

    int updateByExampleSelective(@Param("record") Gas record, @Param("example") GasExample example);

    int updateByExample(@Param("record") Gas record, @Param("example") GasExample example);

    int updateByPrimaryKeySelective(Gas record);

    int updateByPrimaryKey(Gas record);
    //通过时间查询出结果
	List<Gas> selectGasByTime(String time1, String time2);
	//通过名字查询
	List<Gas> selectByUname(String val);
	//通过名字和时间来查询
	List<Gas> getGasWeek(String gname);
	//获取到一个月
	List<Gas> getGasMonth(String gname);
	//查询主管道的气质数据
	Gas selectGasName(String string);
	//通过名字查询单个气质
	Gas selectByWnameOne(String wname);
	//查询一个区域的数据
	List<Gas> selectGasByZone(String string);
}
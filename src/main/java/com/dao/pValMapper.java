package com.dao;

import com.bean.pVal;
import com.bean.pValExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface pValMapper {
    long countByExample(pValExample example);

    int deleteByExample(pValExample example);

    int deleteByPrimaryKey(Integer pushid);

    int insert(pVal record);

    int insertSelective(pVal record);

    List<pVal> selectByExample(pValExample example);

    pVal selectByPrimaryKey(Integer pushid);

    int updateByExampleSelective(@Param("record") pVal record, @Param("example") pValExample example);

    int updateByExample(@Param("record") pVal record, @Param("example") pValExample example);

    int updateByPrimaryKeySelective(pVal record);

    int updateByPrimaryKey(pVal record);

	pVal selectVal();  //查询报警参数数据

	void updatepVal(Float ch4, Float o2, Float kpa, Float hz);	//更新pavl
	
	//push添加user
	void addpvUser(String uname, String uphone, String deptName);

	List<String> getPhone();

}
package com.dao;

import com.bean.WellExample;
import com.bean.WellKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WellMapper {
    long countByExample(WellExample example);

    int deleteByExample(WellExample example);

    int deleteByPrimaryKey(WellKey key);

    int insert(WellKey record);

    int insertSelective(WellKey record);

    List<WellKey> selectByExample(WellExample example);

    int updateByExampleSelective(@Param("record") WellKey record, @Param("example") WellExample example);

    int updateByExample(@Param("record") WellKey record, @Param("example") WellExample example);
    
    //添加
	void insertName(String wname,String wRegion);
	
	//获取到所有的井及区域
	List<WellKey> selectWellKeyAndwRegion();
}
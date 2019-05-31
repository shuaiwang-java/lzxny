package com.dao;

import com.bean.jtable;
import com.bean.jtableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface jtableMapper {
    long countByExample(jtableExample example);

    int deleteByExample(jtableExample example);

    int insert(jtable record);

    int insertSelective(jtable record);

    List<jtable> selectByExample(jtableExample example);

    int updateByExampleSelective(@Param("record") jtable record, @Param("example") jtableExample example);

    int updateByExample(@Param("record") jtable record, @Param("example") jtableExample example);
    
    //查询机组一天的数据
	List<jtable> selectByDayJTable(String string, String string2, String string3);
}
package com.dao;

import com.bean.Yj;
import com.bean.YjExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YjMapper {
    long countByExample(YjExample example);

    int deleteByExample(YjExample example);

    int deleteByPrimaryKey(Integer yid);

    int insert(Yj record);

    int insertSelective(Yj record);

    List<Yj> selectByExample(YjExample example);

    Yj selectByPrimaryKey(Integer yid);

    int updateByExampleSelective(@Param("record") Yj record, @Param("example") YjExample example);

    int updateByExample(@Param("record") Yj record, @Param("example") YjExample example);

    int updateByPrimaryKeySelective(Yj record);

    int updateByPrimaryKey(Yj record);
    
	List<Yj> selectByDate1(String date);
}
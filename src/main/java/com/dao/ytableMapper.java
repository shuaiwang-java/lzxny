package com.dao;

import com.bean.MobileData;
import com.bean.ytable;
import com.bean.ytableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ytableMapper {
    long countByExample(ytableExample example);

    int deleteByExample(ytableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ytable record);

    int insertSelective(ytable record);

    List<ytable> selectByExample(ytableExample example);

    ytable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ytable record, @Param("example") ytableExample example);

    int updateByExample(@Param("record") ytable record, @Param("example") ytableExample example);

    int updateByPrimaryKeySelective(ytable record);

    int updateByPrimaryKey(ytable record);

	List<ytable> selectByYMD(String string, String string2, String string3);
	
	
	List<ytable> selectMobileByYMD(String string, String string2, String string3);
	
	ytable selectSumById(Integer id);
}
package com.dao;

import com.bean.WXdata;
import com.bean.WXdataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WXdataMapper {
    long countByExample(WXdataExample example);

    int deleteByExample(WXdataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WXdata record);

    int insertSelective(WXdata record);

    List<WXdata> selectByExample(WXdataExample example);

    WXdata selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WXdata record, @Param("example") WXdataExample example);

    int updateByExample(@Param("record") WXdata record, @Param("example") WXdataExample example);

    int updateByPrimaryKeySelective(WXdata record);

    int updateByPrimaryKey(WXdata record);

	WXdata getDataLimit();
} 
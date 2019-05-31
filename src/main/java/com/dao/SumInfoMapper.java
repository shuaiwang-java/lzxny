package com.dao;

import com.bean.SumInfo;
import com.bean.SumInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SumInfoMapper {
    long countByExample(SumInfoExample example);

    int deleteByExample(SumInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SumInfo record);

    int insertSelective(SumInfo record);

    List<SumInfo> selectByExample(SumInfoExample example);

    SumInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SumInfo record, @Param("example") SumInfoExample example);

    int updateByExample(@Param("record") SumInfo record, @Param("example") SumInfoExample example);

    int updateByPrimaryKeySelective(SumInfo record);

    int updateByPrimaryKey(SumInfo record);

	SumInfo selectAll();
}
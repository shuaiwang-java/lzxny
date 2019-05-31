package com.dao;

import com.bean.Yj2;
import com.bean.Yj2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Yj2Mapper {
    long countByExample(Yj2Example example);

    int deleteByExample(Yj2Example example);

    int deleteByPrimaryKey(Integer yj2Id);

    int insert(Yj2 record);

    int insertSelective(Yj2 record);

    List<Yj2> selectByExample(Yj2Example example);

    Yj2 selectByPrimaryKey(Integer yj2Id);

    int updateByExampleSelective(@Param("record") Yj2 record, @Param("example") Yj2Example example);

    int updateByExample(@Param("record") Yj2 record, @Param("example") Yj2Example example);

    int updateByPrimaryKeySelective(Yj2 record);

    int updateByPrimaryKey(Yj2 record);
}
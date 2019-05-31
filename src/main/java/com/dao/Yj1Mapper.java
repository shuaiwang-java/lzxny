package com.dao;

import com.bean.Yj1;
import com.bean.Yj1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Yj1Mapper {
    long countByExample(Yj1Example example);

    int deleteByExample(Yj1Example example);

    int deleteByPrimaryKey(Integer yj1Id);

    int insert(Yj1 record);

    int insertSelective(Yj1 record);

    List<Yj1> selectByExample(Yj1Example example);

    Yj1 selectByPrimaryKey(Integer yj1Id);

    int updateByExampleSelective(@Param("record") Yj1 record, @Param("example") Yj1Example example);

    int updateByExample(@Param("record") Yj1 record, @Param("example") Yj1Example example);

    int updateByPrimaryKeySelective(Yj1 record);

    int updateByPrimaryKey(Yj1 record);
    
    Yj1 selectByswdl(String string);
}
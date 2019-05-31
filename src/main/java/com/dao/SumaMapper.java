package com.dao;

import com.bean.Suma;
import com.bean.SumaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SumaMapper {
    long countByExample(SumaExample example);

    int deleteByExample(SumaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Suma record);

    int insertSelective(Suma record);

    List<Suma> selectByExample(SumaExample example);

    Suma selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Suma record, @Param("example") SumaExample example);

    int updateByExample(@Param("record") Suma record, @Param("example") SumaExample example);

    int updateByPrimaryKeySelective(Suma record);

    int updateByPrimaryKey(Suma record);

	Suma selectLimit(); //显示最后一条数据
}
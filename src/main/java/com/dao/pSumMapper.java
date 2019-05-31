package com.dao;

import com.bean.pSumExample;
import com.bean.pSumKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface pSumMapper {
    long countByExample(pSumExample example);

    int deleteByExample(pSumExample example);

    int deleteByPrimaryKey(pSumKey key);

    int insert(pSumKey record);

    int insertSelective(pSumKey record);

    List<pSumKey> selectByExample(pSumExample example);

    int updateByExampleSelective(@Param("record") pSumKey record, @Param("example") pSumExample example);

    int updateByExample(@Param("record") pSumKey record, @Param("example") pSumExample example);

	pSumKey selectPs();
}
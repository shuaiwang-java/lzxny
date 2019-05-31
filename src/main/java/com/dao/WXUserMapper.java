package com.dao;

import com.bean.WXUser;
import com.bean.WXUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WXUserMapper {
    long countByExample(WXUserExample example);

    int deleteByExample(WXUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WXUser record);

    int insertSelective(WXUser record);

    List<WXUser> selectByExample(WXUserExample example);

    WXUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WXUser record, @Param("example") WXUserExample example);

    int updateByExample(@Param("record") WXUser record, @Param("example") WXUserExample example);

    int updateByPrimaryKeySelective(WXUser record);

    int updateByPrimaryKey(WXUser record);

	void updateByIdAndPusha(Integer id, String string);

	void updateByIdAndPushb(Integer id, String string);

	void updateByIdAndPushc(Integer id, String string);

	List<WXUser> selectByPusha(String string);

	List<WXUser> selectByPushb(String string);
}
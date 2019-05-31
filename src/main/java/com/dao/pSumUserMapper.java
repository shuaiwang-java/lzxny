package com.dao;

import com.bean.pSumUser;
import com.bean.pSumUserExample;
import com.bean.pSumUserKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface pSumUserMapper {
    long countByExample(pSumUserExample example);

    int deleteByExample(pSumUserExample example);

    int deleteByPrimaryKey(pSumUserKey key);

    int insert(pSumUser record);

    int insertSelective(pSumUser record);

    List<pSumUser> selectByExample(pSumUserExample example);

    pSumUser selectByPrimaryKey(pSumUserKey key);

    int updateByExampleSelective(@Param("record") pSumUser record, @Param("example") pSumUserExample example);

    int updateByExample(@Param("record") pSumUser record, @Param("example") pSumUserExample example);

    int updateByPrimaryKeySelective(pSumUser record);

    int updateByPrimaryKey(pSumUser record);
    
	void deleteUserById(int puserid);
	
	void addpvUser(String uname, String uphone, String deptName);
}
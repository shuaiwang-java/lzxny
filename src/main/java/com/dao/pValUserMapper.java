package com.dao;

import com.bean.pValUser;
import com.bean.pValUserExample;
import com.bean.pValUserKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface pValUserMapper {
    long countByExample(pValUserExample example);

    int deleteByExample(pValUserExample example);

    int deleteByPrimaryKey(pValUserKey key);

    int insert(pValUser record);

    int insertSelective(pValUser record);

    List<pValUser> selectByExample(pValUserExample example);

    pValUser selectByPrimaryKey(pValUserKey key);

    int updateByExampleSelective(@Param("record") pValUser record, @Param("example") pValUserExample example);

    int updateByExample(@Param("record") pValUser record, @Param("example") pValUserExample example);

    int updateByPrimaryKeySelective(pValUser record);

    int updateByPrimaryKey(pValUser record);
    //通过id删除
	void deleteUserById(int puserid);

	void addpvUser(String uname, String uphone, String deptName)throws Exception;//添加用户
}
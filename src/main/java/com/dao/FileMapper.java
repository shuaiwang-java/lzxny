package com.dao;

import com.bean.FileClass;
import com.bean.FileClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FileMapper {
    long countByExample(FileClassExample example);

    int deleteByExample(FileClassExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(FileClass record);

    int insertSelective(FileClass record);

    List<FileClass> selectByExample(FileClassExample example);

    FileClass selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") FileClass record, @Param("example") FileClassExample example);

    int updateByExample(@Param("record") FileClass record, @Param("example") FileClassExample example);

    int updateByPrimaryKeySelective(FileClass record);

    int updateByPrimaryKey(FileClass record);
    
    //通过名字删除
	void deleteByfName(String fname);
	//获取共享文件
	List<FileClass> selectByShareFile();
	//获取所用个人文件
	List<FileClass> selectByfile();
}
package com.service;

import java.util.List;
import com.bean.FileClass;

/**
 * 文件逻辑层
 * @author ws
 *
 */
public interface FileService {
	
	//判断文件名是否重复
	Boolean BoolName(String filename);
	//保存文件
	void addFile(FileClass f);
	//获取到所有的文件
	List<FileClass> getAllFile();
	//删除文件
	void deleteFileByName(String fName);
	//共享文件的判断
	boolean BoolShareName(String fName);
	//获取共享文件
	List<FileClass> getShareAllFile();
	
	
	
	
	
}

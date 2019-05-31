package com.service.impl;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bean.FileClass;
import com.dao.FileMapper;
import com.service.FileService;

/**
 * 实现文件接口
 * @author ws
 */
@Service
@Transactional
public class FileServiceImpl implements FileService {
	
	@Autowired
	FileMapper filemapper;
	
	//判断文件名是否重复
	public Boolean BoolName(String filename) {

		List<FileClass> list = filemapper.selectByExample(null);
		for (FileClass file : list) {
			if(file.getFname().equals(filename)) {
				return true;
			}
		}
		return false;
	}
	
	//保存文件信息
	public void addFile(FileClass f) {
		filemapper.insert(f);
	}

	//获取所有的文件列表
	public List<FileClass> getAllFile() {
		return filemapper.selectByfile();
	}

	//删除文件的方法
	public void deleteFileByName(String fname) {

		filemapper.deleteByfName(fname);
	}

	//共享文件的判断
	public boolean BoolShareName(String fName) {
		
		List<FileClass> list = filemapper.selectByExample(null);
		for (FileClass file : list) {
			if(file.getFname().equals(fName) && file.getFstate().equals("1")) {
				return true;
			}
		}
		return false;
	}

	//获取共享文件
	public List<FileClass> getShareAllFile() {
		return filemapper.selectByShareFile();
	}
	
	
	
	
	
}

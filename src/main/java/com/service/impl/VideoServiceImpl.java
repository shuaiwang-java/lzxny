package com.service.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bean.Video;
import com.service.VideoService;

/**
 * 实现视屏文件的接口
 * @author ws
 */
@Service
public class VideoServiceImpl implements VideoService {
	
	
	
	/*
	 * 获取所有的文件名返回list集合
	 * @see com.service.VideoService#getName()
	 */
	public List<Video> getName()throws Exception {
		
		List<Video> list = new ArrayList<Video>();
		//File file = new File("//usr//local//apache-tomcat-8.5.34//webapps//Lzxny//video");  //TODO 部署到服务器上需要重新修改路径
		//File file = new File("D:\\ws\\eclipse_kj\\Lzxny\\src\\main\\webapp\\video");
		File file = new File("//app//webapps//ROOT//video");
		File[] files = file.listFiles();      
		
		for (int i = 0; i < files.length; i++) {
				 String path = files[i].getName();
				 //String remove = "//usr//local//apache-tomcat-8.5.34//webapps//Lzxny//video//";
				 String remove = "//app//webapps//ROOT//video";
				 //String remove = "D:\\ws\\eclipse_kj\\Lzxny\\src\\main\\webapp\\video\\";   http://lzxny.applinzi.com
				 String vi = path.replace(remove, "");  
				 Video video = new Video();
				 video.setvId(i);
				 video.setvName(vi);
				 list.add(video);
		}

		return list;
	}
	
}

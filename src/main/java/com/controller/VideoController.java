package com.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
/**
 * 视频文件控制层
 * @author ws
 *
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.Msg;
import com.bean.Video;
import com.service.VideoService;
@Controller
public class VideoController {
	
	@Autowired
	private VideoService videoService;
	
	@RequestMapping("video/getName")
	@ResponseBody
	public Msg  getVideo() {
		
		List<Video> videos;
		try {
			videos = videoService.getName();  //获取所有文件名
		} catch (Exception e) {
			return Msg.file();
		}
		
		return Msg.success().add("Video", videos);
		
	}
	
	
	
}

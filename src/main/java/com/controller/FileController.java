package com.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.io.FileUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import com.bean.FileClass;
import com.bean.Msg;
import com.bean.User;
import com.service.FileService;
import com.utils.MyFileUtils;

/*
 * 文件上传下载控制层
 */
@Controller
public class FileController {
	
	@Autowired
	FileService fileService;
	
	/*
	 * 跳转到文件jsp
	 */
	
	@RequestMapping("/file/privateFile")
	public String returnFileJsp(Model model) {
		return "file/privateFile";
	}
	
	/*
	 * 跳转共享页面
	 */
	@RequestMapping("/file/shareFile")
	public String returnFileShare() {
		return "file/shareFile";
	}
	
	
	
	/**
	 * 获取个人文件
	 * @return
	 */
	@RequestMapping("/get/fileListAll")
	@ResponseBody
	public Msg getFileListAll() {
		
		List<FileClass> file=null;
		try {
			file = fileService.getAllFile();
		} catch (Exception e) {
			return Msg.file();
		}
		return Msg.success().add("file", file);
	}
	
	
	
	/**
	 * 处理上传文件
	 */
	@RequestMapping(value="/file/upload",method=RequestMethod.POST)
	@ResponseBody
	public Msg uplaodFile(@RequestParam("file") MultipartFile file,HttpServletRequest res) {
		String filename;
		try {
			String path = res.getServletContext().getRealPath("/upload"); 
			filename = file.getOriginalFilename();
			int i = 0;
			String fName;
			do {
				fName =  newFname(i,filename);
				i++;
			} while (fileService.BoolName(fName));
			//获取到文件的大小
			String length = MyFileUtils.GetLength(file.getSize());
			//获取到用户
			Subject subject = SecurityUtils.getSubject();
	    	User user = (User) subject.getPrincipal();
			FileClass f = new FileClass();
			f.setFname(fName); //文件名
			f.setFsize(length); //文件大小
			f.setFtime(new Date()); //文件时间
			f.setFuser(user.getUname());  //上传文件的用户名
			f.setFstate("0");  // 0 表示不为共享文件
			//保存文件信息到数据库
			fileService.addFile(f);
			File newfile = new File(path+"/"+fName);   
			InputStream stream = file.getInputStream();
			FileUtils.copyInputStreamToFile(stream, newfile);
			if(stream != null) {
				stream.close();
			}
		} catch (Exception e) {
			return Msg.uploaMsgfileEnd();
		}
		return Msg.uploaMsg();
	}
	
	
	/*
	 * 解决文件上传重名的方法
	 */
	private String newFname(int i, String filename) {
		if(i==0) {
			return filename;
		}
		String fname = i+""+filename;
		return fname;
	}
	
	/*
	 * 文件下载的方法
	 */
	@RequestMapping("/file/download")
	public void  download(String fName,HttpServletRequest req, HttpServletResponse respon) throws IOException {
	
		String name = fName;
		
		//设置文件MIME类型
		respon.setContentType(req.getServletContext().getMimeType(fName));
		
		fName = URLEncoder.encode(fName,"UTF-8");
		
		//设置Content-Disposition
		respon.setHeader("Content-Disposition", "attachment;filename="+fName);
		//读取目标文件，通过response将目标文件写到客户端
		//获取目标文件的绝对路径
		String fullFileName = req.getServletContext().getRealPath("/upload/" + name);

		System.out.println(fullFileName);
		try {
			InputStream in = new FileInputStream(fullFileName);
			OutputStream out = respon.getOutputStream();
			//写文件
			int b;
			while((b=in.read())!= -1)
			{
				out.write(b);
			}
			in.close();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 删除文件的方法
	 */
	@RequestMapping("/file/deleteFile")
	@ResponseBody
	public Msg deleteFile(String fName,HttpServletRequest req) {
		try {
			//在数据库中删除文件的信息
			fileService.deleteFileByName(fName);
			File file=new File(req.getServletContext().getRealPath("/upload/" + fName));
	        if(file.exists()&&file.isFile()) {
	            file.delete();
	        }
		} catch (Exception e) {
			return Msg.file();
		}
		return Msg.success();
	}
	
	/*
	 * 共享文件上传
	 */
	@RequestMapping(value="/file/uploadShare",method=RequestMethod.POST)
	@ResponseBody
	public Msg uploadFileShare(@RequestParam("file") MultipartFile file,HttpServletRequest res) {
		String filename;
		try {
			String path = res.getServletContext().getRealPath("/share"); 
			filename = file.getOriginalFilename();
			int i = 0;
			String fName;
			do {
				fName =  newFname(i,filename);
				i++;
			} while (fileService.BoolShareName(fName));
			//获取到文件的大小
			String length = MyFileUtils.GetLength(file.getSize());
			//获取到用户
			Subject subject = SecurityUtils.getSubject();
	    	User user = (User) subject.getPrincipal();
			FileClass f = new FileClass();
			f.setFname(fName); //文件名
			f.setFsize(length); //文件大小
			f.setFtime(new Date()); //文件时间
			f.setFuser(user.getUname());  //上传文件的用户名
			f.setFstate("1");  // 1 表示为共享文件
			//保存文件信息到数据库
			fileService.addFile(f);
			File newfile = new File(path+"/"+fName);   
			InputStream stream = file.getInputStream();
			FileUtils.copyInputStreamToFile(stream, newfile);
			if(stream != null) {
				stream.close();
			}
		} catch (Exception e) {
			return Msg.uploaMsgfileEnd();
		}
		return Msg.uploaMsg();
	}
	
	/*
	 * 获取到全部的共享文件
	 */
	@RequestMapping("/get/shareFileListAll")
	@ResponseBody
	public Msg getShareFileListAll() {
			
			List<FileClass> file=null;
			try {
				file = fileService.getShareAllFile();
			} catch (Exception e) {
				return Msg.file();
			}
			return Msg.success().add("file", file);
	}
	
	/*
	 * 共享文件下载的方法
	 */
	@RequestMapping("/file/downloadShare")
	public void  downloadShare(String fName,HttpServletRequest req, HttpServletResponse respon) throws IOException {
	
		String name = fName;
		
		//设置文件MIME类型
		respon.setContentType(req.getServletContext().getMimeType(fName));
		
		fName = URLEncoder.encode(fName,"UTF-8");
		
		//设置Content-Disposition
		respon.setHeader("Content-Disposition", "attachment;filename="+fName);
		//读取目标文件，通过response将目标文件写到客户端
		//获取目标文件的绝对路径
		String fullFileName = req.getServletContext().getRealPath("/share/" + name);

		System.out.println(fullFileName);
		try {
			InputStream in = new FileInputStream(fullFileName);
			OutputStream out = respon.getOutputStream();
			//写文件
			int b;
			while((b=in.read())!= -1)
			{
				out.write(b);
			}
			in.close();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 删除共享文件的方法
	 */
	@RequestMapping("/file/deleteFileShare")
	@ResponseBody
	public Msg deleteFileShare(String fName,HttpServletRequest req) {
		try {
			//在数据库中删除文件的信息
			fileService.deleteFileByName(fName);
			File file=new File(req.getServletContext().getRealPath("/share/" + fName));
	        if(file.exists()&&file.isFile()) {
	            file.delete();
	        }
		} catch (Exception e) {
			return Msg.file();
		}
		return Msg.success();
	}
	
}

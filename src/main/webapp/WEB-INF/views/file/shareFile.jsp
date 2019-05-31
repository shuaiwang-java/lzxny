<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<!-- 获取当前项目路径 -->
<%
	pageContext.setAttribute("app_path", request.getContextPath());
%>
<title>共享文件</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
<link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/x-admin/css/font.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/x-admin/css/xadmin.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/jquery/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/x-admin/lib/layui/layui.js"
	charset="utf-8"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/x-admin/js/xadmin.js"></script>
<!-- bootstrap核心样式 -->
<link href="${app_path }/static/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<!-- bootstrap  js -->
<script src="${app_path }/static/bootstrap/js/bootstrap.min.js"></script>
<style>

	.a1{
		float: left;
		width: 850px;
		height: 100%;
		height:auto;
		margin-left: 30px;
		border: 1px solid #D4D4D4;
		background-color:#F5FFFA;
	}
	.but{
		width: 300px;
		height: 150px;
		float: left;
		margin-left: 20px;
		border: 1px solid #D4D4D4;
		background-color:#F5FFFA;
	}
	
</style>

</head>
<body style="width:100%; height:100%; background-color:#FFFFF3">
		
		
		<div class="page-header">
		  <h1>共享文件 <small>共享个人文件</small></h1>
		</div>
		
		<div class="a1">
			<table class="table" id="fileTable">
				<thead>
					<tr>
						<td><h4>文件名</h4></td>				
						<td><h4>文件大小</h4></td>				
						<td><h4>上传时间</h4></td>				
						<td><h4>上传用户</h4></td>				
						<td><h4>下载</h4></td>				
						<td><h4>操作</h4></td>				
					</tr>
				</thead>
				<tbody>
				</tbody>
			</table>
		</div>
		
		<div class="but">
			  <div style="margin-left: 10px;margin-top: 10px; ">
				<button type="button" class="layui-btn" id="test1" name="file">
				  <i class="layui-icon">&#xe67c;</i>上传文件
				</button>
			</div>  
			
			
			<div style="margin:30px">
					<p>支持上传的类型:文档、图片、视频等。</p>
					<p>文件大小限制、单个文件不能超过2G</p>
			</div>
		</div>
		
		<script>
			 layui.use('upload', function(){
			  var upload = layui.upload;
			  //执行实例
			  var uploadInst = upload.render({
			    elem: '#test1' //绑定元素
			    ,url: '${app_path}/file/uploadShare' //上传接口
			    ,done: function(res, index, upload){
			    	//上传成功后的提示
			    	layui.use('layer', function(){
			    		  var layer = layui.layer;
			    		  layer.msg('上传成功');
			    		});
			    	//一秒后执行	
			    	setTimeout(function(){
			    		location.reload();
			    	},600);
			    	
			    }
			    ,error: function(index, upload){
			    	//上传失败后的提示
			    	layui.use('layer', function(){
			    		  var layer = layui.layer;
			    		  layer.msg('上传失败');
			    		});
			      }
			    ,accept:'file'
			    ,size:'2147483648'  //上传大小限制
			    //,multiple:true //多文件上传
			  });
			});
		</script>
		
		<script type="text/javascript">
			//显示上传列表
			$(function(){
				//调用显示的方法
				get_FileList();
				
			});
			
			function get_FileList(){
				$.ajax({
					url:"${app_path}/get/shareFileListaticll",
					type:"POST",
					success:function(data){
						//把获取到的数据显示到页面
						show(data);
					}
				});
			};
			
			function show(data){
				//显示当前数据时先清空之前的数据
				$("#fileTable tbody").empty();
				
				//获取到所用的文件,进行遍历
				var files =  data.map.file;
				$.each(files,function(index,file){
					var fName = $("<td></td>").append(file.fname);
					var fSize = $("<td></td>").append(file.fsize);
					var fTime = $("<td></td>").append(getMyDate(file.ftime));  //调用时间转换的函数
					var uname = $("<td></td>").append(file.fuser);
					var i = $("<i></i>").addClass("layui-icon").append("&#xe601;");
					var a = $("<a></a>").append(i).append("下载").attr("onclick","download1('"+file.fname+"')");
					var download = $("<td></td>").append(a);
					var  del = $("<td></td>").append($("<a></a>").append($("<i></i>").addClass("layui-icon").append("&#xe640;")).append("删除").attr("onclick","deleteFile('"+file.fname+"')"));
					
					$("<tr></tr>").append(fName)
								  .append(fSize)
								  .append(fTime)
								  .append(uname)
								  .append(download)
								  .append(del)
								  .appendTo("#fileTable tbody")
				})
			};
			
			//时间转换的方法
	    	function getMyDate(str){
	            var oDate = new Date(str),
	            oYear = oDate.getFullYear(),
	            oMonth = oDate.getMonth()+1,
	            oDay = oDate.getDate(),
	            oHour = oDate.getHours(),
	            oMin = oDate.getMinutes(),
	            oSen = oDate.getSeconds(),
	            oTime = oYear +'-'+ getzf(oMonth) +'-'+ getzf(oDay) +' '+ getzf(oHour) +':'+
						getzf(oMin) +':'+getzf(oSen);//最后拼接时间
	            return oTime;
	        };
	        //补0操作
	      	function getzf(num){
	          if(parseInt(num) < 10){
	              num = '0'+num;
	        }
	          	return num;
	      	}
			
	        //下载的请求
	        function download1(fname){
	        	var form = $("<form>");   
	        	$('body').append(form);  
	                form.attr('style','display:none');   
	                form.attr('target','');
	                form.attr('method','post');
	                form.attr('action',"${app_path}/file/downloadShare");//下载文件的请求路径
	                var input1 = $('<input>'); 
	                input1.attr('type','hidden'); 
	                input1.attr('name','fName'); 
	                input1.attr('value',fname);
	                form.append(input1);  
	                form.submit();
	        }
			
	        function deleteFile(fname){
	        	$.ajax({
	        		url:"${app_path}/file/deleteFileShare",
	        		data:"fName="+fname,
	        		type:"POST",
	        		success:function(data){
	        			if(data.code == 0){
	    			    	layui.use('layer', function(){
	    			    		  var layer = layui.layer;
	    			    		  layer.msg('删除成功');
	    			    		});
	    			    	//一秒后执行	
	    			    	setTimeout(function(){
	    			    		location.reload();
	    			    	},600);
	        			}else{
	        				//上传失败后的提示
	    			    	layui.use('layer', function(){
	    			    		  var layer = layui.layer;
	    			    		  layer.msg('删除失败');
	    			    		});
	        			}
	        		}
	        	});
	        }
		</script>
</body>
</html>
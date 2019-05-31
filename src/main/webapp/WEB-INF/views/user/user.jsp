<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<!-- 获取当前项目路径 -->
	<% pageContext.setAttribute("app_path",request.getContextPath()); %>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/x-admin/css/font.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/x-admin/css/xadmin.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/jquery/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/x-admin/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/x-admin/js/xadmin.js"></script>
    <!-- bootstrap核心样式 -->
	<link href="${app_path }/static/bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<!-- bootstrap  js -->
	<script src="${app_path }/static/bootstrap/js/bootstrap.min.js"></script>
</head>		
<body>
	<div class="x-body">
	
	
        <form class="layui-form">
        
          <div class="layui-form-item">
              <label for="username" class="layui-form-label">
                  <span class="x-red"></span>登录名
              </label>
              <div class="layui-input-inline">
              		 <input readonly="readonly" type="text" id="username" name="username" required="" lay-verify="required"
                  		autocomplete="off" value=" ${user.uname}" class="layui-input">
              </div>
              <div class="layui-form-mid layui-word-aux">
                  <span class="x-red"></span>将会成为您唯一的登入名
              </div>
          </div>
          
          <div class="layui-form-item">
              <label for="username" class="layui-form-label">
                  <span class="x-red"></span>性别
              </label>
              <div class="layui-input-inline">
              		<input  readonly="readonly" type="text" value="${user.ugender}"  required="" lay-verify="phone"
                  autocomplete="off" class="layui-input">
              		
              </div>
          </div>
          
          <div class="layui-form-item">
              <label for="username" class="layui-form-label">
                  <span class="x-red"></span>年龄
              </label>
              <div class="layui-input-inline">
              		<input readonly="readonly" type="text" value="${user.uage}"  required="" lay-verify="phone"
                  autocomplete="off" class="layui-input">
              		
              </div>
          </div>
          
          
          <div class="layui-form-item">
              <label for="phone" class="layui-form-label">
                  <span class="x-red"></span>手机
              </label>
              <div class="layui-input-inline">
              			<input readonly="readonly" type="text" value="${user.uphone}"  required="" lay-verify="phone"
                  autocomplete="off" class="layui-input">
              		
	                   
              </div>
          </div>
          
          <!-- <div class="layui-form-item">
              <label class="layui-form-label"><span class="x-red"></span>注册时间</label>
              <div class="layui-input-block"  id="utime">
              		      	
              </div>
          </div> -->
          
          <input type="hidden" value="${user.utime}" id="gettime">
         
          <div class="layui-form-item">
              <label class="layui-form-label"><span class="x-red"></span>职位</label>
              <div class="layui-input-block">
                  <input readonly="readonly" type="checkbox" name="like1[write]" lay-skin="primary" title="${user.role.rname}" checked="">
              </div>
          </div>
      </form>
    </div>
    
    <script type="text/javascript">
    
    window.ss();
    
    	function ss(){
    		
    		var uname = $("#username").val();
    		
    		$.ajax({
    			
    			url:"${app_path}/user/getTiem",
    			data:"uName="+uname,
    			type:"GET",
    			success:function(data){
    				alert("===");
    				var time = getMyDate(data.map.user.utime);
    				alert(time);
    			}
    			
    		});
    	  		
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
    
    
    
    </script>
    
    
    
</body>
</html>
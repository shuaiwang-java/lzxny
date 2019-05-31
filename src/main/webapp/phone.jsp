<!DOCTYPE HTML>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<!-- 获取当前项目路径 -->
		<% pageContext.setAttribute("app_path", request.getContextPath());%>
		<meta name="renderer" content="webkit">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/x-admin/css/font.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/x-admin/css/xadmin.css">
		<script type="text/javascript" src="${pageContext.request.contextPath}/jquery/jquery-3.2.1.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/x-admin/lib/layui/layui.js" charset="utf-8"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/x-admin/js/xadmin.js"></script>
		<!-- bootstrap核心样式 -->
		<link href="${app_path }/sta/bootstrap/css/bootstrap.min.css" rel="stylesheet">
		<!-- bootstrap  js -->
		<script src="${app_path }/sta/bootstrap/js/bootstrap.min.js"></script>
	</head>
<body>
	
	<button type="button" onclick="s()">按钮</button>
	
	<script type="text/javascript">
		function s(){
			 var ch4 = 12;
	            var co2 = 23;
	            var o2 = 21;
	            var h2s = 23;
	            var bal = 23;
	            var l = 21;
	            var kpa = 12;
	            var wname = "A630-1";
			
			$.ajax({
		        url:"${app_path}/gas/phoneAddGas",
		        data:"wname="+wname+"&ch4="+ch4+"&co2="+co2+"&o2="+o2+"&h2s="+h2s+"&bal="+bal+"&l="+l+"&pressure="+kpa,
		        type:"post",
		        success:function(data){
					var d = data.code;
					alert(d);
		            if(data.code == 0){
		                //表示成功
		               alert("添加成功");    //jsp就可以 html就不行   //访问这个jsp
		            }else{
		                //表示失败
		                alert("添加失败");
		            }
		        }
		    });
		}
	</script>
	
	
</body>
</html>
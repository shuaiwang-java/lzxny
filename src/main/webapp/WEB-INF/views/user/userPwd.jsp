<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<div class="x-body"   >
		
	
        <form class="layui-form">
        <input type="hidden" value="${uName}" id="uName"> 
        
        <!-- 密码 -->
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                  <span class="x-red">*</span>旧密码
              </label>
              <div class="layui-input-inline">
                  <input type="password" id="L_passj" name="passj" onblur="pwdj()" required="" 
                  autocomplete="off" >
              </div>
          </div>
          
          
          <!-- 密码 -->
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                  <span class="x-red">*</span>新的密码
              </label>
              <div class="layui-input-inline">
                  <input type="password" id="L_pass" name="pass" onblur="pwd()" required="" 
                  autocomplete="off" >
              </div>
              <div class="layui-form-mid layui-word-aux">
                  6到16个字符
              </div>
          </div>
          
          <!-- 确认密码 -->
          <div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
                  <span class="x-red">*</span>确认密码
              </label>
              <div class="layui-input-inline">
                  <input type="password" id="L_repass" name="repass" required="" lay-verify="repass"
                  autocomplete="off" >
              </div>
          </div>
          
          <!-- 修改按钮 -->
          <div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
              </label>
              <button  class="layui-btn" lay-filter="add" lay-submit="">
                  	修改
              </button>
          </div>
          
      </form>
      
      
    </div>
    
    <script type="text/javascript">
    
    	//添加点击事件
    	$("#L_pass").click(function(){
    		$("#L_pass").attr("lay-verify","pass");
    	});
    	$("#L_passj").click(function(){
    		$("#L_passj").attr("lay-verify","pass");
    	});
    	//密码框失去焦点事件
    	function pwd(){
    		var password = $("#L_pass").val();
    		if(password == null){
    			document.getElementById("L_pass").lay-verify = "";  //根据id修改里面lay-verify元素的属性
    		}else{
    			$("#L_pass").attr("lay-verify","pass");
    		}
    		
    		var password = $("#L_passj").val();
    		if(password == null){
    			document.getElementById("L_passj").lay-verify = "";  //根据id修改里面lay-verify元素的属性
    		}else{
    			$("#L_passj").attr("lay-verify","pass");
    		}
    	}
    </script>
    
    
    
    <script>
        layui.use(['form','layer'], function(){
          $ = layui.jquery;
          var form = layui.form
          ,layer = layui.layer;
          //自定义验证规则
          form.verify({
            nikename: function(value){
              if(value.length < 5){
                return '昵称至少得5个字符啊';
              }
            }
            ,pass: [/(.+){6,12}$/, '密码必须6到12位']
            ,repass: function(value){
                if($('#L_pass').val()!=$('#L_repass').val()){
                    return '两次密码不一致';
                }
            }
          });

          //监听提交
          form.on('submit(add)', function(data){

			//获取到旧的密码
			var pwdj = $("#L_passj").val();
			
			//获取到新的密码
            var pwd = $("#L_pass").val();
        	  
			//获取当前用户名
			var uname = $("#uName").val();
			
			if(pwdj == "undefined" || pwdj == null || pwdj == "" || pwdj=="on"){
      		 alert("请输入旧密码");
      		 return;
      	  	}
			if(pwd == "undefined" || pwd == null || pwd == "" || pwd=="on"){
      		 alert("请输入新密码");
      		 return;
      	  	}
			
          	
          	
          	//发起ajax请求到后端
          	$.ajax({
          		 url:"${app_path}/user/setPwd",
          		 data:"uName="+uname+"&pwdj="+pwdj+"&pwd="+pwd,
          		 type:"POST",
          		 success:function(data){  //获取回来的数据
          			to_data(data);
          		 }
          	});
            
           function to_data(data){
        	   
        	   if(data.code == 0){
                   layer.alert("修改成功", {icon: 6},function () {
                       // 获得frame索引
                       var index = parent.layer.getFrameIndex(window.name);
                       //关闭当前frame
                       parent.layer.close(index);
                   }); 
 			 	}else{
 			 		alert("修改失败(旧密码错误/或其他异常)");
 			 	}
           }
          	
          	
            
            
           
            return false;
          });
          
          
        });
    </script>
    <script>var _hmt = _hmt || []; (function() {
        var hm = document.createElement("script");
        hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
        var s = document.getElementsByTagName("script")[0];
        s.parentNode.insertBefore(hm, s);
      })();</script>

</body>
</html>
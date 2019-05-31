<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <!-- 避免IE使用兼容模式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge, chrome=1">
    <meta name="renderer" content="webkit">
    <meta name="keywords" content='easyui,jui,jquery easyui,easyui demo,easyui中文'/>
    <meta name="description" content=''/>
    <title>用户登录</title>
    <script src="${pageContext.request.contextPath}/jquery/jquery-3.2.1.min.js"></script>
    
    <!-- 浏览器标签图片 -->
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/topjui/images/favicon.ico"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/plugins/font-awesome/css/font-awesome.min.css">
    
    
    <style type="text/css">
        html, body {
            height: 100%;
        }
		
        .box {
            background: url("${pageContext.request.contextPath}/topjui/images/loginBg.jpg") no-repeat center center;
            background-size: cover;

            margin: 0 auto;
            position: relative;
            width: 100%;
            height: 100%;
        }

        .login-box {
            width: 100%;
            max-width: 500px;
            height: 400px;
            position: absolute;
            top: 50%;

            margin-top: -200px;
            /*设置负值，为要定位子盒子的一半高度*/

        }

        @media screen and (min-width: 500px) {
            .login-box {
                left: 50%;
                /*设置负值，为要定位子盒子的一半宽度*/
                margin-left: -250px;
            }
        }

        .form {
            width: 100%;
            max-width: 500px;
            height: 275px;
            margin: 2px auto 0px auto;
        }

        .login-content {
            border-bottom-left-radius: 8px;
            border-bottom-right-radius: 8px;
            height: 250px;
            width: 100%;
            max-width: 500px;
            background-color: rgba(255, 250, 2550, .6);
            float: left;
        }

        .input-group {
            margin: 30px 0px 0px 0px !important;
        }

        .form-control,
        .input-group {
            height: 40px;
        }

        .form-actions {
            margin-top: 30px;
        }

        .form-group {
            margin-bottom: 0px !important;
        }

        .login-title {
            border-top-left-radius: 8px;
            border-top-right-radius: 8px;
            padding: 20px 10px;
            background-color: rgba(0, 0, 0, .6);
        }

        .login-title h1 {
            margin-top: 10px !important;
        }

        .login-title small {
            color: #fff;
        }

        .link p {
            line-height: 20px;
            margin-top: 30px;
        }

        .btn-sm {
            padding: 8px 24px !important;
            font-size: 16px !important;
        }

        .flag {
            position: absolute;
            top: 10px;
            right: 10px;
            color: #fff;
            font-weight: bold;
            font: 14px/normal "microsoft yahei", "Times New Roman", "宋体", Times, serif;
        }
    </style>
    
    
    <title>成都绿州</title>
</head>
<body>


	<div class="box">
    	<div class="login-box">
    	
      	  	<div class="login-title text-center">
	            <span class="flag"><i class="fa fa-user"></i> 用户登陆</span>
	            <h1>
	                <small>成都绿州</small>
	            </h1>
        	</div>
        	
	        <div class="login-content ">
	            <div class="form">
	                <form id="modifyPassword" class="form-horizontal" action="${pageContext.request.contextPath}/user/login" method="post">
	                    
	                    <div class="form-group" >
	                        <div class="col-xs-10 col-xs-offset-1">
	                            <div class="input-group">
	                                <span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
	                                <input type="text" id="uname" name="username" class="form-control" placeholder="用户名"
	                                       value="" autocomplete="off">
	                            </div>
	                        </div>
	                    </div>
	                    <div class="form-group">
	                        <div class="col-xs-10 col-xs-offset-1">
	                            <div class="input-group">
	                                <span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
	                                <input type="password" id="upassword" name="password" class="form-control"
	                                       placeholder="密码" value="">
	                            </div>
	                        </div>
	                    </div>
	                    
	                   <!-- 提示标签 --> 
	                    <div class="col-xs-10 col-xs-offset-1" style= "color:#F00; text-align:center" id="hint">
	                    	
						</div>
	                   
	                   
	                    
	                    <div class="form-group form-actions">
	                        <div class="col-xs-12 text-center">
	                            <button type="button" id="login" class="btn btn-sm btn-success">
	                                <span class="fa fa-check-circle"></span> 登录
	                            </button>
	                            <button type="button" id="reset" class="btn btn-sm btn-danger">
	                                <span class="fa fa-close"></span> 重置
	                            </button>
	                        </div>
	                    </div>
	                    
	                </form>
	            </div>
	        </div>
        
	    </div>
	</div>

	<script type="text/javascript">
		
		//#login是登录标签的id属性
		$("#login").click(function(){
				
			//根据id获取用户名和密码
			var username = $("#uname").val();
			var password = $("#upassword").val();
			
			//使用ajax
			$.ajax({
				url:"${pageContext.request.contextPath}/user/login",   //请求地址
				data:{"username":username,"password":password},  //请求的数据
				type:"POST",		//请求的方式
				success:function(data){		//请求成功后,data表示服务端返回的数据
					 //开始之前要去空格，用trim()
					  if(data == "2"){
						  window.location.href="${pageContext.request.contextPath}/user/index";
					  }else if(data == "1"){
						  hint();   //密码错误调用这个方法
					  }else{
						  hint1();  //用户密码为空
					  }
				}
			})
		})
		
		//重置按钮的方法
		$("#reset").click(function(){
			$("#uname").val("");
			$("#upassword").val("");
		})
		
		//提示密码错误
		function hint(){
			$("#hint").empty();
			var hintname = $("<b></b>").append("用户/密码错误请重新输入");
			hintname.appendTo("#hint");
		}
		
		function hint1(){
			$("#hint").empty();
			var hintname = $("<b></b>").append("账号/密码不能为空");
			hintname.appendTo("#hint");
		}
		
		//输入时清除提示
		$("#uname").click(function(){
			$("#hint").empty();
			$("#upassword").val("");
		})
		$("#upassword").click(function(){
			$("#hint").empty();
		})
		
		
	</script>
	
	


</body>
</html>
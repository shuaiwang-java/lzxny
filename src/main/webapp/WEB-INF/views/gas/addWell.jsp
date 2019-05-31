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


</head>
<body>

    <div class="x-body">
        <form class="layui-form">
          <div class="layui-form-item">
              <label for="username" class="layui-form-label">
                  		井编号
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="well" name="well" required="" lay-verify="required"
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          
          <div class="layui-form-item">
              <label for="username" class="layui-form-label">
                  		所属区域
              </label>
              <div class="layui-input-inline">
	          	  <select id="sId">
	          			<option value="A">A区</option>
	          			<option value="B">B区</option>
	          			<option value="C">C</option>
	          			<option value="AC">AC</option>
	          			<option value="D">D</option>
	          			<option value="E">E</option>
	           	  </select>
           	  </div>
          </div>
          
          
          
           <div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
              </label>
              <button  class="layui-btn" lay-filter="add" lay-submit="">
                  		新增
              </button>
          </div>
      </form>
    </div>
    <script>
        layui.use(['form','layer'], function(){
            $ = layui.jquery;
          var form = layui.form
          ,layer = layui.layer;
          //监听提交
          form.on('submit(add)', function(data){
			
			//获取到要添加的信息	
        	 var wname =   $("#well").val();
        	 var sId = $("#sId").val();
			
			$.ajax({
				url:"${app_path}/gas/addWellName",
				data:"wname="+wname+"&wRegion="+sId,
				type:"get",
				success:function(data){
					if(data.code == 0){
						 //发异步，把数据提交给php
			            layer.alert("增加成功", {icon: 6},function () {
			                // 获得frame索引
			                var index = parent.layer.getFrameIndex(window.name);
			                //关闭当前frame
			                parent.layer.close(index);
			                window.parent.location.reload();
			            });
					}else{
						alert("添加失败/井编号可能已存在");
					}
				}
			});
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
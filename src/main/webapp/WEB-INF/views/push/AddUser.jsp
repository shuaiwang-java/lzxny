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
        <link rel="stylesheet" href="${pageContext.request.contextPath}/x-admin/css/font.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/x-admin/css/xadmin.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/x-admin/lib/layui/css/layui.css"  media="all">
        <script type="text/javascript" src="${pageContext.request.contextPath}/jquery/jquery-3.2.1.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/x-admin/lib/layui/layui.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/x-admin/js/xadmin.js"></script>
        <!-- bootstrap核心样式 -->
        <link href="${pageContext.request.contextPath}/sta/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <!-- bootstrap  js -->
        <script src="${pageContext.request.contextPath}/sta/bootstrap/js/bootstrap.min.js"></script>
    </head>

    <body>
       <h2>选择要添加的用户</h2>
       <table class="layui-hide" id="test" lay-filter="test"></table>
       <!-- 点击添加按钮  -->
       <div style="text-align:right">
         <div class="layui-btn-group demoTable">
  		   <button class="layui-btn" data-type="getCheckData">确认添加</button>
	   	 </div>
       </div>
        
		<script>
		layui.use('table', function(){
		  var table = layui.table;
		  table.render({
		    elem: '#test'             //id
		    ,url:'${app_path}/user/getAdd'   //请求地址
    	    ,response: {
   		    	dataName: 'user'  //规定数据列表的字段名称，默认：data
   		     } 
		    ,cols: [[
		      {type:'checkbox'}
		      ,{field:'uname', align:"center", title: '用户名'}
		      ,{field:'uphone', align:"center", title: '电话'}
		    ]]
		  });
		   
		  var $ = layui.$, active = {
				    getCheckData: function(){ //获取选中数据
				      var checkStatus = table.checkStatus('test'),data = checkStatus.data;
				      //发起ajax
				      $.ajax({
				    	  url:"${app_path}/push/addUser",
				    	  data:JSON.stringify(data),
				    	  type:"POST",
				    	  dataType:"json",
				    	  contentType:"application/json;charsetset=UTF-8",
				    	  success:function(data){
				    		  if(data.code == 0){
				    			  layer.alert("修改成功", {icon: 6},function () {
				                       // 获得frame索引
				                       var index = parent.layer.getFrameIndex(window.name);
				                       //关闭当前frame
				                       parent.layer.close(index);
				                       window.parent.location.reload();
				                   }); 
				    		  }else{
					    		  layer.alert("添加失败/不能添加列表中已存在的姓名");
					    	  }
				    	  }
				      })
				    }
				  }; 
		  $('.demoTable .layui-btn').on('click', function(){
			    var type = $(this).data('type');
			    active[type] ? active[type].call(this) : '';
			  });
		});
		
		</script>
       
    </body>
</html>
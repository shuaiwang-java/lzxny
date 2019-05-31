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

	
    <div class="x-nav">
      <span class="layui-breadcrumb">
        <a>
          <cite>职位管理</cite></a>
      </span>
      <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" id="sx" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
    </div>
    
    <!-- 批量删除和添加 -->
      <xblock id="xb">
        	<button class="layui-btn" onclick="x_admin_show('添加','${app_path}/role/getPermission','900','500')">
        		<i class="layui-icon">新增</i>
        	</button>
      </xblock>
      <!-- 用户列表 -->
      <table class="layui-table" id="userTable">
        <thead>
           <tr>
	            <th>
	              <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">&#xe605;</i></div>
	            </th>
	            <th>职位ID</th>
	            <th>职位名称</th>
	            <th>职位拥有的权限</th>
	            <th>操作</th>
            </tr>
        </thead>
        
        
        <tbody>
        <%-- <c:forEach items="${roles}" var="role">
          <tr>
          
          
            <!-- <td>
              <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div>
            </td> -->
            
            
            <td>${role.rid}</td>
            
            <td>${role.rname}</td>
            
            <td>
	              <c:if test="${!empty role.permissions}">
	             	<c:forEach items="${role.permissions}" var="per">
	             		 ◆ ${per.pdescription}  
	            	 </c:forEach>
	              </c:if>
             <p>  </p>           
             </td>
          <!--    
            <td>
            	<button class="btn btn-success" type="button">修改</button>
            	<button class="btn btn-danger" type="button">删除</button>
            </td> -->
            
          </tr>  
          </c:forEach>--%>
          
          
        </tbody>
        
        
      </table>
      
      <!-- 分页页码信息 -->
      <div class="col-md-12" style="text-align:center" id="pageId">
      </div>
      
      
      
      <script type="text/javascript">
      /*用户-删除*/
      function member_del(obj,id){
          layer.confirm('确认要删除吗？',function(index){
        	  $(obj).parents("tr").remove();
    		  layer.msg('已删除!',{icon:1,time:1000});
              //发异步删除数据
        	  $.ajax({
            	  url:"${app_path}/role/deleteRole",
            	  data:"rid="+id,
            	  type:"POST",
            	  success:function(data){
            	  }
              });
             
              
          });
      }
      	$(function(){
      		getAllRole();
      	});
      	$("#sx").click(function(){
      		getAllRole(); 
	   	});
      	
      	function getAllRole(){
      		//异步请求
      		$.ajax({
      			url:"${app_path}/role/roleAdd",
      			data:"",
      			type:"GET",
      			success:function(data){
      				//显示当前数据时先清空之前的数据
      				$("#userTable tbody").empty();
      				
      				//获得返回来的数据
      				var roless = data.map.roles;
      			$.each(roless,function(index,roles){
      	            //第一个td
          				var i = $("<i></i>").addClass("layui-icon").append("&#xe605;");
          				var s = $("<div></div>").addClass("layui-unselect layui-form-checkbox").attr("lay-skin","primary").attr("data-id","2").append(i);
          				var is = $("<td></td>").append(s);
          				
          				//第二个td
          				var rid = $("<td></td>").append(roles.rid);   //===填获取到的rid
          				//第三个
          				var rname = $("<td></td>").append(roles.rname);  //===填获取到的rname
    	               
    	               //第四个td
    	               var td = $("<td></td>");
    	               if(roles.permissions != "undefined" || roles.permissions != null || roles.permissions != "" || roles.permissions != "on"){   //===获取到的所有的权限不等于null的情况下循环
    	            	   $.each(roles.permissions,function(index,data){     //循环第四个td的东西
    	            		   td.append(" ◆ "+data.pdescription);
    	            	   });
    	               }
          				
    	               //第五个td按钮的
    	               var buta = $("<button></button>").addClass("btn btn-success").attr("type","button").append("修改");
    	               var butb = $("<button></button>").addClass("btn btn-danger").attr("type","button").append("删除");
    	               var butad =$("<a></a>").attr("onclick","x_admin_show('编辑','${app_path}/role/getRoleby?rid="+roles.rid+"&rname="+roles.rname+"','900','500')").attr("hrer","javascript:;").append(buta);
    	               var butbd =$("<a></a>").attr("onclick","member_del(this,'"+roles.rid+"')").attr("hrer","javascript:;").append(butb);
    	               
          			   var  but = $("<td></td>").append(butad).append(butbd);
          				
          				//把所有td添加到tr
          				var tr = $("<tr></tr>").append(is).append(rid).append(rname).append(td).append(but);
          				 //在循环的添加到table 的body中
          				$.each(roles,function(index,data){
          					tr.appendTo("#userTable tbody");
          				});
      	                
      	                
      			});
      				
      			}
      		});
      	}
      </script>
      
      
      
  </body>
</html>
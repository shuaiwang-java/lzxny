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
	
	<div class="x-body">
        <form action="" method="post" class="layui-form layui-form-pane">
                <div class="layui-form-item">
                    <label for="name" class="layui-form-label">
                        <span class="x-red">*</span>职位名
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="name" name="name" required="" lay-verify="required"
                        autocomplete="off" class="layui-input"  value="${role.rname}" disabled="disabled"><input type="hidden" id="roleid" value="${role.rid}" />
                    </div>
                </div>
                <div class="layui-form-item layui-form-text">
                    <label class="layui-form-label">
                        拥有权限
                    </label>
                    <table  class="layui-table layui-input-block">
                        <tbody>
                        
                            <tr>
                                <td>
                                    <div class="layui-input-block">
                                    
                                    	<c:forEach items="${permission}" var="permission">
                                    		<c:if test="${permission.staticte eq '0' }">
                                    		<input name="id[]" lay-skin="primary" type="checkbox" value="${permission.pid}" title="${permission.pdescription}"  checked="checked">
                                    		</c:if>
                                    		<c:if test="${permission.staticte ne '0' }">
                                    		<input name="id[]" lay-skin="primary" type="checkbox" value="${permission.pid}" title="${permission.pdescription}" > 
                                    		</c:if>
	                                    </c:forEach> 
                                   			
                                    </div>
                                </td>
                            </tr>
                            
                        </tbody>
                    </table>
                </div>
                <div class="layui-form-item">
                <button class="layui-btn" lay-submit="" onclick="chk()" lay-filter="add">更新</button>
              </div>
            </form>
    </div>
    <script>
  			//获取复选框中值
    		check_val = [];
		  	function chk(){
		  		obj = document.getElementsByName("id[]");
		   	   
		   	    for(k in obj){
		   	        if(obj[k].checked)
		   	            check_val.push(obj[k].value);
		   	    }
		  	}
		  	
		  	
		    	
    
        layui.use(['form','layer'], function(){
            $ = layui.jquery;
          var form = layui.form ,layer = layui.layer;
        
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
        	  
        	  //获取到已经选择的permissions的pid
        	  //获取当前的职位id
        	  var rid = $("#roleid").val();
        	  
        	  //使用ajax方式提交异步请求
        	  $.ajax({
        		  url:"${app_path}/role/updateRole",
        		  data:"rid="+rid+"&pid="+check_val,
        		  type:"GET",
        		  success:function(data){
        			 
        		  }
        		  
        	  });
       	  layer.alert("更新成功", {icon: 6},function () {
                // 获得frame索引
                var index = parent.layer.getFrameIndex(window.name);
                //关闭当前frame
                parent.layer.close(index);
                window.parent.location.reload();
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
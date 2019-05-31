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
        <form action="" method="post" class="layui-form layui-form-pane">
        
                <div class="layui-form-item">
                    <label for="name" class="layui-form-label">
                        <span class="x-red">*</span>职位名称
                    </label>
                    <div class="layui-input-inline">
                        <input type="text" id="roleName" name="roleName" required="" lay-verify="required"
                        autocomplete="off" class="layui-input">
                    </div>
                </div>
                
                <div class="layui-form-item layui-form-text" >
                    <label class="layui-form-label">
                       	 拥有权限
                    </label>
                    <table  class="layui-table layui-input-block"  >
                        <tbody>
                            <tr>
                                <td>
                                <c:forEach items="${permissions}" var="permission" >
                                    <input type="checkbox" name="like1[write]"  lay-skin="primary" title="${permission.pdescription}" value="${permission.pid}">
                                </c:forEach>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
               <div class="layui-form-item">
                <button class="layui-btn" lay-submit="" lay-filter="add">增加</button>
              </div> 
         </form>
    </div>
    
    <script>
        layui.use(['form','layer'], function(){
            $ = layui.jquery;
          var form = layui.form,layer = layui.layer;
        
          //自定义验证规则
          form.verify({
            nikename: function(value){
              if(value.length < 5){
                return '昵称至少得5个字符啊';
              }
            }
            ,pass: [/^0$/, '至少选一项权限']
            ,repass: function(value){
                if($('#L_pass').val()!=$('#L_repass').val()){
                    return '两次密码不一致';
                }
            }	
          });
			
          //监听提交
          form.on('submit(add)', function(data){
        	 
        	  //获取职位的值
        	  var roleName = $("#roleName").val();
        	  obj = document.getElementsByName("like1[write]");
        	    check_val = [];
        	    for(k in obj){
        	        if(obj[k].checked)
        	            check_val.push(obj[k].value);
        	    }
        	    if(check_val == "undefined" || check_val == null || check_val == "" || check_val=="on"){
        	    	alert("对不起：权限至少要选一项");
        	    	return false;
        	    }
        	    
        	  $.ajax({
        		  url:"${app_path}/role/addRole",
        		  data:"rname="+roleName+"&pids="+check_val,
        		  type:"POST",
        		  success:function(data){
        			  insertRole(data);
        		  }
        	  });
        	  function insertRole(data){
        		  if(data.code == 0){
        			  layer.alert("增加成功", {icon: 6},function () {
        	                // 获得frame索引
        	                var index = parent.layer.getFrameIndex(window.name);
        	                //关闭当前frame
        	                parent.layer.close(index);
        	                window.parent.location.reload();
        	            });
        			  
        		  }else{
        			  alert("添加失败");
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
      })();
    </script>
</body>
</html>
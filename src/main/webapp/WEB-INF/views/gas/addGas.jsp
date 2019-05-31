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

	<div class="layui-row">
	
		<div class="panel panel-default">
	  <div class="panel-body">
	    	<b>气质录入</b>
	  </div>
	</div>
		
		<div class="layui-col-md10 layui-col-md-offset4">
			<div class="grid-demo grid-demo-bg1">
			<div class="layui-btn-group">
			  <button class="layui-btn layui-btn-xs layui-btn" onclick="x_admin_show('添加','${app_path}/gas/addWell','500','350')">
			   	点击添加新井编号	
			  </button>
			</div>
				<form class="layui-form layui-form-pane" action="">
					<div class="layui-form-item">
						<label class="layui-form-label">井编号</label>
						<div class="layui-input-inline">
							<select id="jh" lay-verify="jh">
								<option value="">请选择</option>
								<c:forEach items="${wells}" var="well">
								<option value="${well.wname }">${well.wname }</option>
								</c:forEach>
							</select>
						</div>
					</div>
					
					<div class="layui-form-item">
						<label class="layui-form-label">甲烷<sub>CH4</sub></label>
						<div class="layui-input-inline">
							<input type="text" id="CH4" name="" lay-verify="required"
								placeholder="请填写CH4" autocomplete="off" class="layui-input">
						</div>
					</div>
					<div class="layui-form-item">
						<label class="layui-form-label">二氧化碳<sub>CO2</sub></label>
						<div class="layui-input-inline">
							<input type="text" id="CO2" name="" lay-verify="required"
								placeholder="请填写CO2" autocomplete="off" class="layui-input">
						</div>
					</div>
					<div class="layui-form-item">
						<label class="layui-form-label">氧气<sub>O2</sub></label>
						<div class="layui-input-inline">
							<input type="text" id="O2" name="" lay-verify="required"
								placeholder="请填写O2" autocomplete="off" class="layui-input">
						</div>
					</div>
					<div class="layui-form-item">
						<label class="layui-form-label">H2S</label>
						<div class="layui-input-inline">
							<input type="text" id="H2S" name="" lay-verify="required"
								placeholder="请填写H2S" autocomplete="off" class="layui-input">
						</div>
					</div>
					<div class="layui-form-item">
						<label class="layui-form-label">流量</label>
						<div class="layui-input-inline">
							<input type="text" id="Bal" name="" lay-verify="required"
								placeholder="请填写流量" autocomplete="off" class="layui-input">
						</div>
					</div>
					<div class="layui-form-item">
						<label class="layui-form-label">压力<sub>Kpa</sub></label>
						<div class="layui-input-inline">
							<input type="text" id="Kpa" name="" lay-verify="required"
								placeholder="请填写压力Kpa" autocomplete="off" class="layui-input">
						</div>
					</div>
					<div style="width: 300px; margin: 100;">
					<div class="site-demo-button" id="layerDemo"
						style="margin-bottom: 0;">
						<button data-method="offset" data-type="auto" onclick="ss()"
						 id="but"	class="layui-btn layui-btn-fluid ">确认提交</button>
					</div>
				</div>
				</form>
			</div>
		</div>
	</div>


	
	<script type="text/javascript">
         //按钮点击事件
       function ss(){
				//获取到井编号的值
				var gName = document.getElementById("jh").value; // 选中值
				
				if(gName == "undefined" || gName == null || gName == "" || gName=="on"){
					alert("请选择井编号");
					return;
				}
				
        		var  CH4 = $("#CH4").val();
        		var  CO2 = $("#CO2").val();
        		var  O2 = $("#O2").val();
        		var  H2S = $("#H2S").val();
        		var  Bal = $("#Bal").val();
        		var  Kpa = $("#Kpa").val();
        		$.ajax({
        			url:"${app_path}/gas/insertGas",
        			data:"wname="+gName+"&ch4="+CH4+"&co2="+CO2+"&o2="+O2+"&h2s="+H2S+"&bal="+Bal+"&pressure="+Kpa,
        			type:"POST",
        			success:function(data){
						if(data.code == 0){
							alert("添加成功");
						}else{
							alert("添加失败请重新添加");
						}
        			}
        		});
        	  }
	</script> 
	
	
	
	
	
</body>
</html>
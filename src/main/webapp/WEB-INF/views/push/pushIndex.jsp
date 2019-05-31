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
        <script type="text/javascript" src="${pageContext.request.contextPath}/layer/layer.js"></script>
        <script src="${pageContext.request.contextPath}/static/custom/custom.js"></script>
        <!-- bootstrap核心样式 -->
        <link href="${pageContext.request.contextPath}/static/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <!-- bootstrap  js -->
        <script src="${pageContext.request.contextPath}/static/bootstrap/js/bootstrap.min.js"></script>
        <style>
            div.t1{
                margin:auto;
                margin-top: 30px;
                width:80%;
            }
            div.t2{
                margin:auto;
                width:70%;
            }
            div.but-1{
            	margin-left: 95%;
            }
        </style>
        <!--表单样式-->
        <style>
           td,th{
			    text-align:center;
			}
			div.d{
				background-color: rgb(255, 255, 255);
				padding: 10px 10px 1px 10px;
			}
			label{
				float: left;
			    display: block;
			    padding: 9px 15px;
			    width: 110px;
			    font-weight: 400;
			    line-height: 16px;
			    text-align: right;
			}
			div.l{
				float: left;
			}
			input[type="checkbox"]{
				margin-top: 15px;
				width: 22px;
				height: 22px;
			}
        </style>
    </head>

    <body style="background-color: #eeeeee">
    
    	<div style="padding-right: 5%;padding-left: 5%;padding-top: 1%">
    		<h2>微信公众号推送设置</h2>
    		<div style="width: 100%;height: 490px;background-color: #eeeeee;padding-right: 3%;padding-left: 3%;padding-top: 1%;margin-top: 3%">
    			<h4>中控气质数据</h4>
				<p></p>
				<button type="button" class="layui-btn layui-btn-normal" onclick="deleteStyle()">修改</button>
				<p></p>
				<div class="d">
				      <table class="table table-bordered">
				      	<tr style="background-color: #a7e7ff6b">
				      		<th>甲烷<sub>%</sub></th>
				      		<th>氧气<sub>%</sub></th>
				      		<th>总管压力<sub>Kpa</sub></th>
				      		<th>风机频率<sub>Hz</sub></th>
				      		<th>操作</th>
				      	</tr>
				      	<tr>
				      		<td><input id="t1" type="text" size="10" disabled='disabled' value="12"/><font style="color: red;"><b> < //小于当前值推送 </b></font></td>
				      		<td><input id="t2" type="text" size="10"  disabled='disabled'/><font style="color: red;"><b> > //大于当前值推送 </b></font></td>
				      		<td><input id="t3" type="text" size="10"  disabled='disabled'/><font style="color: red;"><b> > //大于当前值推送</b></font></td>
				      		<td><input id="t4" type="text" size="10"  disabled='disabled'/><font style="color: red;"><b> > //大于当前值推送</b></font></td>
				      		<td><button onclick="setStyle()">确认</button></td>
				      	</tr>
					  </table>
				</div>
				<hr>
			  <h4>生产电量数据</h4>
					  <div style="width:100%;text-align:right;margin-bottom: 5px;">
					      次日凌晨0点后填写提交数据！上次提交数据时间:<input type="text" id="spanDate" disabled="disabled">&nbsp;&nbsp;&nbsp;&nbsp;
							<div class="layui-btn-group">
						     	<button class="layui-btn" style="background-color: #1e9fff" onclick="submit1()">编辑</button>
						    	<button class="layui-btn" style="background-color: #1e9fff" onclick="submit2()">提交</button>
						    </div>
					  </div>
			  <div class="panel panel-default">
				  <div class="panel-heading" style="background-color: #1e9fff">日上网数据(单位:万度)</div>
				  <div class="panel-body">
				  	
					  <div class="l">
						    <label style="background-color: #a7e7ff6b">I期上网电量</label>
						    <input type="text" id="i1" style="height: 34px;width: 200px" disabled='disabled' >
					  </div>
					  
					  <div class="l" style="margin-left: 23px" >
						    <label style="background-color: #a7e7ff6b">II期上网电量</label>
						    <input type="text" id="i2" style="height: 34px;width: 200px" disabled='disabled' >
					  </div>
					  
					  <div class="l" style="margin-left: 23px" >
						    <label style="background-color: #a7e7ff6b">总上网电量</label>
						    <input type="text" id="i3" style="height: 34px;width: 200px" disabled='disabled' >
					  </div>

				  </div>
			  </div>
			  
			  <div class="panel panel-default">
				  <div class="panel-heading" style="background-color: #1e9fff">月上网数据(单位:万度)</div>
				  <div class="panel-body">
					  <div class="l">
						    <label style="background-color: #a7e7ff6b">I期上网电量</label>
						    <input type="text" id="i4" style="height: 34px;width: 200px" disabled='disabled' >
					  </div>
					  <div class="l" style="margin-left: 23px" >
						    <label style="background-color: #a7e7ff6b">II期上网电量</label>
						    <input type="text" id="i5" style="height: 34px;width: 200px" disabled='disabled' >
					  </div>
					  <div class="l" style="margin-left: 23px" >
						    <label style="background-color: #a7e7ff6b">总上网电量</label>
						    <input type="text" id="i6" style="height: 34px;width: 200px" disabled='disabled' >
					  </div>
					  <br>
					  <div class="l" style="margin-top: 10px;width: 100%" >
						    <label style="background-color: #a7e7ff6b">计划电量</label>
						    <input type="text" id="i7" style="height: 34px;width: 200px" disabled='disabled' ><font style="color: #1e9fff;"> *按照每日上网电量60万度计划,从计算第一日到今日的总计划值,公式(当月发电天数*60)</font>
					  </div>
					  <br>
					  <div class="l" style="margin-top: 10px" >
						    <label style="background-color: #a7e7ff6b">实际电量</label>
						    <input type="text" id="i8" style="height: 34px;width: 200px" disabled='disabled' >
					  </div>
					  <div class="l" style="margin-left: 23px;margin-top: 10px" >
						    <label style="background-color: #a7e7ff6b">差额电量</label>
						    <input type="text" id="i9" style="height: 34px;width: 200px" disabled='disabled' >
					  </div>
				  </div>
			  </div>
			  <hr>
			  <h4>用户管理</h4>
			  
			  <div class="d">
			  <p>在用户后面选择需要推送的内容<span style="color: #8d8d8d">(不选择内容不推送)</span></p>
			  	 <table class="table table-bordered">
			  	 	<thead>
				      	<tr style="background-color: #a7e7ff6b">
				      		<th style="width: 70%">全部用户</th>
				      		<th style="width: 10%">中控气质数据</th>
				      		<th style="width: 10%">生产电量数据</th>
				      		<th style="width: 10%">机组维护</th>
				      	</tr>
				    </thead>
				    <tbody id="UserTableId">
				     </tbody>
				 </table>
			  </div>
    		</div>
    	</div>
    	
    	<script type="text/javascript">
    		$(function(){
    			$.ajax({
        			url:"${app_path}/push/getStaticData",
        			type:"get",
        			success:function(data){
        				var d = data.map.data;
        				var obj1 = document.getElementById("t1");
        				var obj2 = document.getElementById("t2");
        				var obj3 = document.getElementById("t3");
        				var obj4 = document.getElementById("t4");
        				obj1.setAttribute('value', d.ch4);
        				obj2.setAttribute('value', d.o2);
        				obj3.setAttribute('value', d.kpa);
        				obj4.setAttribute('value', d.hz1);
        				setsetWXData();
        				setWXUser();
        			}
        		});
    		})
    		//初始化上网电量数据
    		function setsetWXData(){
    			$.ajax({
    				url:"${app_path}/push/getWXData",
    				type:"GET",
    				success:function(data){
    					if(data.code == 0){
    						var wxdata =  data.map.wxData;
    						$("#i1").val(wxdata.obja);
    						$("#i2").val(wxdata.objb);
    						$("#i3").val(wxdata.objc);
    						$("#i4").val(wxdata.objd);
    						$("#i5").val(wxdata.obje);
    						$("#i6").val(wxdata.objf);
    						$("#i7").val(wxdata.objg);
    						$("#i8").val(wxdata.objh);
    						$("#i9").val(wxdata.obji);
    						$("#spanDate").val(myJs.getMyDate(wxdata.datedata));
    					}
    				}
    			});
    		}
    		
    		//初始化微信用户列表
    		function setWXUser(){
    			$.ajax({
    				url:"${app_path}/push/getWXUserByAll",
    				type:"get",
    				success:function(data){
    					if(data.code == 0){
    						var Users = data.map.user;
	    						$.each(Users,function(index,user){
									var img =  $("<img>").attr("src",''+user.headimgurl+'').attr("height","48").attr("width","48");   							
	    							var span = $("<span></span>").append(user.nickname);
	    							var div = $("<div></div>").append(img).append(span);
	    							var td1 = $("<td></td>").append(div).attr("style","text-align:left");
	    							
	    							if(user.pusha == 'true'){
	    								var td2 = $("<td></td>").append($("<input></input>").attr("type","checkbox").attr("id",'che1'+user.id+'').attr("checked","true").attr("onclick",'checkbox1('+user.id+')'));
	    							}else{
	    								var td2 = $("<td></td>").append($("<input></input>").attr("type","checkbox").attr("id",'che1'+user.id+'').attr("onclick",'checkbox1('+user.id+')'));
	    							}
	    							
	    							if(user.pushb == 'true'){
	    								var td3 = $("<td></td>").append($("<input></input>").attr("type","checkbox").attr("id",'che2'+user.id+'').attr("checked","true").attr("onclick",'checkbox2('+user.id+')'));
	    							}else{
	    								var td3 = $("<td></td>").append($("<input></input>").attr("type","checkbox").attr("id",'che2'+user.id+'').attr("onclick",'checkbox2('+user.id+')'));
	    							}
	    							
	    							if(user.pushb == 'true'){
	    								var td4 = $("<td></td>").append($("<input></input>").attr("type","checkbox").attr("id",'che3'+user.id+'').attr("checked","true").attr("onclick",'checkbox3('+user.id+')'));
	    							}else{
	    								var td4 = $("<td></td>").append($("<input></input>").attr("type","checkbox").attr("id",'che3'+user.id+'').attr("onclick",'checkbox3('+user.id+')'));
	    							}
	    				      	    $("<tr></tr>").append(td1)
	    				      	    			  .append(td2)
	    				      	    			  .append(td3)
	    				      	    			  .append(td4)
	    				      	    			  .appendTo("#UserTableId");
	    						})
    					}
    				}
    			});
    		}
    		
    		function checkbox1(str){
    			if ($('#che1'+str+'')[0].checked) {
    			    isa(str,'true');
    			}else{
    				isa(str,'false');
    			}
    		}
    		function checkbox2(str){
    			if ($('#che2'+str+'')[0].checked) {
    			    isb(str,'true');
    			}else{
    				isb(str,'false');
    			}
    		}
    		function checkbox3(str){
    			if ($('#che3'+str+'')[0].checked) {
    			    isc(str,'true');
    			}else{
    				isc(str,'false');
    			}
    		}
    		
    		 //修改数据a
    	    function isa(str,bool){
    	    	$.ajax({
    	    		url:"${app_path}/puah/updatePusha",
    	    		data:"id="+str+"&string="+bool,
    	    		type:"POST",
    	    		success:function(data){
    	    		}
    	    	});
    	    }
    	    //修改数据b
    	    function isb(str,bool){
    	    	$.ajax({
    	    		url:"${app_path}/puah/updatePushb",
    	    		data:"id="+str+"&string="+bool,
    	    		type:"POST",
    	    		success:function(data){
    	    		}
    	    	});
    	    }
    	    //修改数据c
    	    function isc(str,bool){
    	    	$.ajax({
    	    		url:"${app_path}/puah/updatePushc",
    	    		data:"id="+str+"&string="+bool,
    	    		type:"POST",
    	    		success:function(data){
    	    		}
    	    	});
    	    }
    		
    		//修改
    		function deleteStyle(){
    			var obj1 = document.getElementById("t1");
    			obj1.removeAttribute('disabled');
    			obj1.setAttribute('style','border:2px solid #00b9ff');
    			
    			var obj2 = document.getElementById("t2");
    			obj2.removeAttribute('disabled');
    			obj2.setAttribute('style','border:2px solid #00b9ff');
    			
    			var obj3 = document.getElementById("t3");
    			obj3.removeAttribute('disabled');
    			obj3.setAttribute('style','border:2px solid #00b9ff');
    			
    			var obj4 = document.getElementById("t4");
    			obj4.removeAttribute('disabled');
    			obj4.setAttribute('style','border:2px solid #00b9ff');
    		}
    		//添加
    		function setStyle(){
    			var obj1 = document.getElementById("t1");
    			obj1.removeAttribute('style');
    			obj1.setAttribute('disabled','disabled');
    			
    			var obj2 = document.getElementById("t2");
    			obj2.removeAttribute('style');
    			obj2.setAttribute('disabled','disabled');
    			
    			var obj3 = document.getElementById("t3");
    			obj3.removeAttribute('style');
    			obj3.setAttribute('disabled','disabled');
    			
    			var obj4 = document.getElementById("t4");
    			obj4.removeAttribute('style');
    			obj4.setAttribute('disabled','disabled');
    			
    			var ch4 = document.getElementById("t1").value;
    			var  o2 = document.getElementById("t2").value;
    			var kpa = document.getElementById("t3").value;
    			var hz1 = document.getElementById("t4").value;
    			
    			$.ajax({
    				url:"${app_path}/push/setPushData",
    				data:"ch4="+ch4+"&o2="+o2+"&kpa="+kpa+"&hz1="+hz1,
    				type:"POST",
    				success:function(data){
    					if(data.code == 0){
    						layer.msg('修改成功');
        				}else{
        					layer.msg('修改失败!请重试');
        				}
    				}
    			});
    		}
    		
    		//编辑
    		function submit1(){
    			var obj1 = document.getElementById("i1");
    			var obj2 = document.getElementById("i2");
    			var obj4 = document.getElementById("i4");
    			var obj5 = document.getElementById("i5");
    			var obj7 = document.getElementById("i7");
    			
    			obj1.removeAttribute('disabled');
    			obj2.removeAttribute('disabled');
    			obj4.removeAttribute('disabled');
    			obj5.removeAttribute('disabled');
    			obj7.removeAttribute('disabled');
    			
    			//鼠标离开
    			obj1.setAttribute('onmouseout','myMouseLeave1()');
    			obj2.setAttribute('onmouseout','myMouseLeave1()');
    			obj4.setAttribute('onmouseout','myMouseLeave2()');
    			obj5.setAttribute('onmouseout','myMouseLeave2()');
    			obj7.setAttribute('onmouseout','myMouseLeave3()');
    			
    		}
    		
    		//提交
    		function submit2(){
    			var obja = document.getElementById("i1").value;
    			var objb = document.getElementById("i2").value;
    			var objd = document.getElementById("i4").value;
    			var obje = document.getElementById("i5").value;
    			var objg = document.getElementById("i7").value;
    			var objh = document.getElementById("i8").value;
    			
    			var sum = Number(obja) + Number(objb);
    			$("#i3").val(sum);
    			
    			var sum1 = Number(objd) + Number(obje);
    			$("#i6").val(sum1);
    			
    			
    			var sum2 = Number(objh) - Number(objg);
    			$("#i9").val(sum2);
    			
    			$.ajax({
    				url:"${app_path}/push/setWXData",
    				data:"obja="+obja+"&objb="+objb+"&objc="+sum+"&objd="+objd+"&obje="+obje+"&objf="+sum1+"&objg="+objg+"&objh="+sum1+"&obji="+sum2,
    				type:"POST",
    				success:function(data){
    					if(data.code == 0){
    						var d = data.map.data;
    						$("#spanDate").attr("value",''+d+'');
    						$("#i1").attr('disabled','disabled');
    						$("#i2").attr('disabled','disabled');
    						$("#i4").attr('disabled','disabled');
    						$("#i5").attr('disabled','disabled');
    						$("#i7").attr('disabled','disabled');
    						
    						layer.msg('提交成功');
    					}else{
    						layer.msg('提交失败！请重试');
    					}
    				}
    			});
    		}
    		function myMouseLeave1(){
    			var obj1 = document.getElementById("i1").value;
    			var obj2 = document.getElementById("i2").value;
    			var sum = Number(obj1) + Number(obj2);
    			$("#i3").val(sum);
    		}
    		function myMouseLeave2(){
    			var obj4 = document.getElementById("i4").value;
    			var obj5 = document.getElementById("i5").value;
    			var sum = Number(obj4) + Number(obj5);
    			$("#i6").val(sum);
    			$("#i8").val(sum);
    		}
    		function myMouseLeave3(){
    			var obj7 = document.getElementById("i7").value;
    			var obj8 = document.getElementById("i8").value;
    			var sum = Number(obj8) - Number(obj7);
    			$("#i9").val(sum);
    		}
    	</script>
    </body>
</html>
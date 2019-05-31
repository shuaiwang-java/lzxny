<!DOCTYPE HTML>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<% pageContext.setAttribute("app_path", request.getContextPath()); %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css"
	href="http://cdn.datatables.net/1.10.13/css/jquery.dataTables.css">
<link rel="stylesheet" type="text/css"
	href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css">
<link rel="stylesheet" type="text/css"
	href=" http://cdn.datatables.net/plug-ins/be7019ee387/integration/jqueryui/dataTables.jqueryui.css">
<!-- jQuery -->
<script type="text/javascript" charset="utf8"
	src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
<!-- DataTables -->
<script type="text/javascript" charset="utf8"
	src="http://cdn.datatables.net/1.10.13/js/jquery.dataTables.js"></script>
<!-- layui -->
<link rel="stylesheet"
	href="${app_path}/x-admin/lib/layui/css/layui.css">
<script type="text/javascript"
	src="${app_path}/x-admin/lib/layui/layui.js"></script>
<!-- bootstrap核心样式 -->
<link href="${app_path }/static/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<!-- bootstrap  js -->
<script src="${app_path }/static/bootstrap/js/bootstrap.min.js"></script>
<script src="${app_path }/static/bootstrap/js/echarts.js"></script>
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/fixedcolumns/3.2.5/css/fixedColumns.jqueryui.css"/>
 
<script type="text/javascript" src="https://cdn.datatables.net/fixedcolumns/3.2.5/js/dataTables.fixedColumns.js"></script>

<style>
.tableId {
	padding: 10px 2% 2%
} /*设置body内边距 */
</style>
<style type="text/css">
table>tbody>tr>td {
	text-align: center;
	white-space: nowrap;
}
table>thead>tr>th {
	text-align: center;
	white-space: nowrap;
}
</style>
</head>

<body>
	<div style="float: left; width: 100%; height: 100%;">
		<div class="tableId">
		<div>
			<p></p>
			<!-- Nav tabs -->
			<ul class="nav nav-pills" role="tablist">
				<li role="presentation" class="active"><a href="#home"
					aria-controls="home" role="tab" data-toggle="tab">小时报表</a></li>
				<li role="presentation"><a href="#profile"
					aria-controls="profile" role="tab" data-toggle="tab" onclick="echart()">小时图形</a></li>
				<li role="presentation"><a href="#messages"
					aria-controls="messages" role="tab" data-toggle="tab" onclick="getDateAll()">历史数据</a></li>
			</ul>
			<!-- Tab panes -->
			<div class="tab-content">
				<!-- 1 -->
				<div role="tabpanel" class="tab-pane active" id="home">
				<p></p>
						<div class="panel panel-default">
							<!-- Default panel contents -->
							<div class="panel-heading">
								选择日期：<input type="date" id="dateId" value="" />
								<button type="submit" onclick="g()">查询</button>
							</div>
							<!-- Table -->
							<div style="width: 100%;">
								<table id="example" class="display">
									<thead>
										<tr>
											<th  rowspan="2">时间</th>
											<c:forEach var="a" begin="1" end="20">
												<th colspan="4">${a}#机组</th>
											</c:forEach>									
										</tr>
										<tr>
											<c:forEach var="b" begin="1" end="20">
												<th>瞬时功率kw</th>
												<th>有功电量mwh</th>
												<th>机油温度°C</th>
												<th>运行时间h</th>
											</c:forEach>
										</tr>
										
									</thead>
								<tbody id="tableId">
									
								</tbody>
								</table>
							</div>
						</div>
				</div>
				<!-- 2 -->
				<div role="tabpanel" class="tab-pane" id="profile">
					<p></p>
					<div class="panel panel-default">
					  <!-- Default panel contents -->
					  <div class="panel-heading">
							当前日期：<input type="date" id="dateId1" value="" />
					  </div>
					  <div class="panel-body">
					 	     
					  </div>
					</div>
				</div>
				
				<!-- 3 -->
				<div role="tabpanel" class="tab-pane" id="messages">
					<p></p>
					<div class="panel panel-default">
							<!-- Default panel contents -->
							<div class="panel-heading">
								历史数据
							</div>
							<div style="width: 100%;">
								<table id="example1" class="display">
									<thead>
										<tr>
											<th  rowspan="2">时间</th>
											<c:forEach var="a" begin="1" end="20">
												<th colspan="4">${a}#机组</th>
											</c:forEach>									
										</tr>
										<tr>
											<c:forEach var="b" begin="1" end="20">
												<th>瞬时功率kw</th>
												<th>有功电量mwh</th>
												<th>机油温度°C</th>
												<th>运行时间h</th>
											</c:forEach>
										</tr>
										
									</thead>
								<tbody id="tableId1">
									
								</tbody>
								</table>
							</div>
				     </div>
				</div>
			</div>
		</div>
		</div>
	</div>
	
	<script type="text/javascript">
	/* 打开页面获取到当前时间 */
	$(function(){
		/* 把值设置给dateId */
		var  YMD = getDateYMD();
		$("#dateId").val(YMD);
	});
	
	
	$(document).ready(function() {
		var str1 = $("#dateId").val();
    	  $('#example').DataTable({
    		    "scrollX": true,//水平滚动条
	            "scrollY": 500,
	            "destroy": true,
	            "bAutoWidth":false,
	            "bFilter": false,  //搜索
	            "ordering": false,  //排序
	            "scrollCollapse": true,
	            "jQueryUI": true,
	            "paging": false,
	            "info": false,
	            fixedColumns : {//关键是这里了，需要第一列不滚动就设置1
                    leftColumns : 1
                },
	            "language":{
	            	"sProcessing": "处理中...",
	                "sZeroRecords": "没有匹配结果",
	                "sSearch": "搜索",
	                "sEmptyTable": "表中数据为空",
	                "sLoadingRecords": "载入中...",
	            },
	            "ajax":{
	            	url:'${app_path}/data/JData',
	            	method: 'POST',
	            	data:{string:str1}
	            },
    	  		"columns":[
    	  		    {"data":
    	  		    	function(obj){	
    	  		    		return getMyDate(obj.ti);
    	  		    	}
    	  		    },
    	  		    {"data":"a1"},
    	  		    {"data":"a2"},
    	  		    {"data":"a3"},
    	  		    {"data":"a4"},
    	  		    {"data":"b1"},
    	  		    {"data":"b2"},
    	  		    {"data":"b3"},
    	  		    {"data":"b4"},
    	  		    {"data":"c1"},
    	  		    {"data":"c2"},
    	  		    {"data":"c3"},
    	  		    {"data":"c4"},
    	  		    {"data":"d1"},
    	  		    {"data":"d2"},
    	  		    {"data":"d3"},
    	  		    {"data":"d4"},
    	  		    {"data":"e1"},
    	  		    {"data":"e2"},
    	  		    {"data":"e3"},
    	  		    {"data":"e4"},
    	  		    {"data":"f1"},
    	  		    {"data":"f2"},
    	  		    {"data":"f3"},
    	  		    {"data":"f4"},
    	  		    {"data":"g1"},
    	  		    {"data":"g2"},
    	  		    {"data":"g3"},
    	  		    {"data":"g4"},
    	  		    {"data":"h1"},
    	  		    {"data":"h2"},
    	  		    {"data":"h3"},
    	  		    {"data":"h4"},
    	  		    {"data":"i1"},
    	  		    {"data":"i2"},
    	  		    {"data":"i3"},
    	  		    {"data":"i4"},
    	  		    {"data":"j1"},
    	  		    {"data":"j2"},
    	  		    {"data":"j3"},
    	  		    {"data":"j4"},
    	  		    {"data":"k1"},
    	  		    {"data":"k2"},
    	  		    {"data":"k3"},
    	  		    {"data":"k4"},
    	  		    {"data":"l1"},
    	  		    {"data":"l2"},
    	  		    {"data":"l3"},
    	  		    {"data":"l4"},
    	  		    {"data":"m1"},
    	  		    {"data":"m2"},
    	  		    {"data":"m3"},
    	  		    {"data":"m4"},
    	  		    {"data":"n1"},
    	  		    {"data":"n2"},
    	  		    {"data":"n3"},
    	  		    {"data":"n4"},
    	  		    {"data":"o1"},
    	  		    {"data":"o2"},
    	  		    {"data":"o3"},
    	  		    {"data":"o4"},
    	  		    {"data":"p1"},
    	  		    {"data":"p2"},
    	  		    {"data":"p3"},
    	  		    {"data":"p4"},
    	  		    {"data":"q1"},
    	  		    {"data":"q2"},
    	  		    {"data":"q3"},
    	  		    {"data":"q4"},
    	  		    {"data":"r1"},
    	  		    {"data":"r2"},
    	  		    {"data":"r3"},
    	  		    {"data":"r4"},
    	  		    {"data":"s1"},
    	  		    {"data":"s2"},
    	  		    {"data":"s3"},
    	  		    {"data":"s4"},
    	  		    {"data":"t1"},
    	  		    {"data":"t2"},
    	  		    {"data":"t3"},
    	  		    {"data":"t4"},
    	  		]
	        });
	    });
	
	
	function g(){
		var str1 = $("#dateId").val();
		$("#dateId1").val(str1);
		$('#example').DataTable({
		    "scrollX": true,//水平滚动条
            "scrollY": 500,
            "destroy": true,
            "bAutoWidth":false,
            "bFilter": false,  //搜索
            "ordering": false,  //排序
            "scrollCollapse": true,
            "jQueryUI": true,
            "paging": false,
            "info": false,
            fixedColumns : {//关键是这里了，需要第一列不滚动就设置1
                leftColumns : 1
            },
            "language":{
            	"sProcessing": "处理中...",
                "sZeroRecords": "没有匹配结果",
                "sSearch": "搜索",
                "sEmptyTable": "表中数据为空",
                "sLoadingRecords": "载入中...",
            },
            "ajax":{
            	url:'${app_path}/data/JData',
            	method: 'POST',
            	data:{string:str1}
            },
	  		"columns":[
	  		    {"data":
	  		    	function(obj){	
	  		    		return getMyDate(obj.ti);
	  		    	}
	  		    },
	  		    {"data":"a1"},
	  		    {"data":"a2"},
	  		    {"data":"a3"},
	  		    {"data":"a4"},
	  		    {"data":"b1"},
	  		    {"data":"b2"},
	  		    {"data":"b3"},
	  		    {"data":"b4"},
	  		    {"data":"c1"},
	  		    {"data":"c2"},
	  		    {"data":"c3"},
	  		    {"data":"c4"},
	  		    {"data":"d1"},
	  		    {"data":"d2"},
	  		    {"data":"d3"},
	  		    {"data":"d4"},
	  		    {"data":"e1"},
	  		    {"data":"e2"},
	  		    {"data":"e3"},
	  		    {"data":"e4"},
	  		    {"data":"f1"},
	  		    {"data":"f2"},
	  		    {"data":"f3"},
	  		    {"data":"f4"},
	  		    {"data":"g1"},
	  		    {"data":"g2"},
	  		    {"data":"g3"},
	  		    {"data":"g4"},
	  		    {"data":"h1"},
	  		    {"data":"h2"},
	  		    {"data":"h3"},
	  		    {"data":"h4"},
	  		    {"data":"i1"},
	  		    {"data":"i2"},
	  		    {"data":"i3"},
	  		    {"data":"i4"},
	  		    {"data":"j1"},
	  		    {"data":"j2"},
	  		    {"data":"j3"},
	  		    {"data":"j4"},
	  		    {"data":"k1"},
	  		    {"data":"k2"},
	  		    {"data":"k3"},
	  		    {"data":"k4"},
	  		    {"data":"l1"},
	  		    {"data":"l2"},
	  		    {"data":"l3"},
	  		    {"data":"l4"},
	  		    {"data":"m1"},
	  		    {"data":"m2"},
	  		    {"data":"m3"},
	  		    {"data":"m4"},
	  		    {"data":"n1"},
	  		    {"data":"n2"},
	  		    {"data":"n3"},
	  		    {"data":"n4"},
	  		    {"data":"o1"},
	  		    {"data":"o2"},
	  		    {"data":"o3"},
	  		    {"data":"o4"},
	  		    {"data":"p1"},
	  		    {"data":"p2"},
	  		    {"data":"p3"},
	  		    {"data":"p4"},
	  		    {"data":"q1"},
	  		    {"data":"q2"},
	  		    {"data":"q3"},
	  		    {"data":"q4"},
	  		    {"data":"r1"},
	  		    {"data":"r2"},
	  		    {"data":"r3"},
	  		    {"data":"r4"},
	  		    {"data":"s1"},
	  		    {"data":"s2"},
	  		    {"data":"s3"},
	  		    {"data":"s4"},
	  		    {"data":"t1"},
	  		    {"data":"t2"},
	  		    {"data":"t3"},
	  		    {"data":"t4"},
	  		]
        });
	}
	
	/* 获取当前时间   年/月/日 */
	 function getDateYMD(){
		 var date = new Date();
		 var year = date.getFullYear();
		 var month = date.getMonth() + 1;
		 var day = date.getDate();
		 if (month < 10) {
		     month = "0" + month;
		 }
		 if (day < 10) {
		     day = "0" + day;
		 }
		 var nowDate = year + "-" + month + "-" + day;
		 return nowDate;
	 }
	//时间转换的方法
 	function getMyDate(str){
	         var oDate = new Date(str),
	         oYear = oDate.getFullYear(),
	         oMonth = oDate.getMonth()+1,
	         oDay = oDate.getDate(),
	         oHour = oDate.getHours(),
	         oMin = oDate.getMinutes(),
	         oSen = oDate.getSeconds(),
	         oTime = getzf(oHour) +':'+getzf(oMin)+':'+getzf(oSen);//小时
	         return oTime;
	     };
	 //补0操作
   	function getzf(sum){
       if(parseInt(sum) < 10){
           sum = '0'+sum;
      	}
       	return sum;
 	 }
	 
	//小时图形的onclick的方法
	function echart(){
		$("#dateId1").val($("#dateId").val());
	}
	 
	//历史数据
	function getDateAll(){
		$('#example1').DataTable({
		    "scrollX": true,//水平滚动条
            "scrollY": 500,
            "destroy": true,
            "bAutoWidth":false,
            "bFilter": false,  //搜索
            "ordering": true,  //排序
            "scrollCollapse": true,
            "jQueryUI": true,
            "paging": false,
            "info": false,
            fixedColumns : {//关键是这里了，需要第一列不滚动就设置1
                leftColumns : 1
            },
            "language":{
            	"sProcessing": "处理中...",
                "sZeroRecords": "没有匹配结果",
                "sSearch": "搜索",
                "sEmptyTable": "表中数据为空",
                "sLoadingRecords": "载入中...",
            },
            "ajax":{
            	url:'${app_path}/data/JDataAll',
            	method: 'POST',
            },
	  		"columns":[
	  		    {"data":
	  		    	function(obj){	
	  		    		return getMyDate1(obj.ti);
	  		    	}
	  		    },
	  		    {"data":"a1"},
	  		    {"data":"a2"},
	  		    {"data":"a3"},
	  		    {"data":"a4"},
	  		    {"data":"b1"},
	  		    {"data":"b2"},
	  		    {"data":"b3"},
	  		    {"data":"b4"},
	  		    {"data":"c1"},
	  		    {"data":"c2"},
	  		    {"data":"c3"},
	  		    {"data":"c4"},
	  		    {"data":"d1"},
	  		    {"data":"d2"},
	  		    {"data":"d3"},
	  		    {"data":"d4"},
	  		    {"data":"e1"},
	  		    {"data":"e2"},
	  		    {"data":"e3"},
	  		    {"data":"e4"},
	  		    {"data":"f1"},
	  		    {"data":"f2"},
	  		    {"data":"f3"},
	  		    {"data":"f4"},
	  		    {"data":"g1"},
	  		    {"data":"g2"},
	  		    {"data":"g3"},
	  		    {"data":"g4"},
	  		    {"data":"h1"},
	  		    {"data":"h2"},
	  		    {"data":"h3"},
	  		    {"data":"h4"},
	  		    {"data":"i1"},
	  		    {"data":"i2"},
	  		    {"data":"i3"},
	  		    {"data":"i4"},
	  		    {"data":"j1"},
	  		    {"data":"j2"},
	  		    {"data":"j3"},
	  		    {"data":"j4"},
	  		    {"data":"k1"},
	  		    {"data":"k2"},
	  		    {"data":"k3"},
	  		    {"data":"k4"},
	  		    {"data":"l1"},
	  		    {"data":"l2"},
	  		    {"data":"l3"},
	  		    {"data":"l4"},
	  		    {"data":"m1"},
	  		    {"data":"m2"},
	  		    {"data":"m3"},
	  		    {"data":"m4"},
	  		    {"data":"n1"},
	  		    {"data":"n2"},
	  		    {"data":"n3"},
	  		    {"data":"n4"},
	  		    {"data":"o1"},
	  		    {"data":"o2"},
	  		    {"data":"o3"},
	  		    {"data":"o4"},
	  		    {"data":"p1"},
	  		    {"data":"p2"},
	  		    {"data":"p3"},
	  		    {"data":"p4"},
	  		    {"data":"q1"},
	  		    {"data":"q2"},
	  		    {"data":"q3"},
	  		    {"data":"q4"},
	  		    {"data":"r1"},
	  		    {"data":"r2"},
	  		    {"data":"r3"},
	  		    {"data":"r4"},
	  		    {"data":"s1"},
	  		    {"data":"s2"},
	  		    {"data":"s3"},
	  		    {"data":"s4"},
	  		    {"data":"t1"},
	  		    {"data":"t2"},
	  		    {"data":"t3"},
	  		    {"data":"t4"},
	  		]
        });
	}
	//日期格式化
	function getMyDate1(str) {
		var oDate = new Date(str), oYear = oDate.getFullYear(), oMonth = oDate
				.getMonth() + 1, oDay = oDate.getDate(), oHour = oDate
				.getHours(), oMin = oDate.getMinutes(), oSen = oDate
				.getSeconds(), 
				oTime =oYear+'年'+getzf(oMonth)+'月'+getzf(oDay)+'日'+
				'(' + getzf(oHour)+':'+getzf(oMin)+':'+getzf(oSen)+')';
		return oTime;
	};
	
	</script>
	
	
</body>
</html>
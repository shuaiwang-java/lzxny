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
											<th rowspan="3">时间<sub>h</sub></th>
											<th rowspan="3">总管负压<sub>Kpa</sub></th>
											<th colspan="8">I号预处理<sub></sub></th>
											<th colspan="8">II号预处理<sub></sub></th>
											<th rowspan="2" colspan="2">气质</th>
										</tr>
										<tr>
											<th colspan="2">入口</th>
											<th colspan="3">风机频率<sub>hz</sub></th>
											<th colspan="3">出口</th>
											<!--  -->
											<th colspan="2">入口</th>
											<th colspan="3">风机频率<sub>hz</sub></th>
											<th colspan="3">出口</th>
											<!--  -->

										</tr>
										<tr>
											<th>温度</th>
											<th>压力</th>

											<th>1号</th>
											<th>2号</th>
											<th>3号</th>

											<th>温度</th>
											<th>压力</th>
											<th>流量</th>
											<!--  -->
											<th>温度</th>
											<th>压力</th>

											<th>1号</th>
											<th>2号</th>
											<th>3号</th>

											<th>温度</th>
											<th>压力</th>
											<th>流量</th>
											<!--  -->
											<th>甲烷<sub>%</sub></th>
											<th>氧气<sub>%</sub></th>
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
                                <h4>24小时总管压力图</h4>
                                <div id="ec" style="width: 800px;height: 284px;"></div>
                                
                                <h4>24小时气质图</h4>
                                <div id="main1" style="width: 800px;height: 284px"></div>
                                
                                <h4>预处理I And 预处理II风机频率</h4>
                                <div id="main2" style="width: 800px;height: 284px"></div>
                                
                                <h4>预处理I And 预处理II出口流量</h4>
                                <div id="main3" style="width: 800px;height: 284px"></div>
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
							<!-- Table -->
							<div style="width: 100%;">
								<table id="allId" class="display">
									<thead>
										<tr>
											<th rowspan="3">时间<sub>h</sub></th>
											<th rowspan="3">总管负压<sub>Kpa</sub></th>
											<th colspan="8">I号预处理<sub></sub></th>
											<th colspan="8">II号预处理<sub></sub></th>
											<th rowspan="2" colspan="2">气质</th>
										</tr>
										<tr>
											<th colspan="2">入口</th>
											<th colspan="3">风机频率<sub>hz</sub></th>
											<th colspan="3">出口</th>
											<!--  -->
											<th colspan="2">入口</th>
											<th colspan="3">风机频率<sub>hz</sub></th>
											<th colspan="3">出口</th>
											<!--  -->

										</tr>
										<tr>
											<th>温度</th>
											<th>压力</th>

											<th>1号</th>
											<th>2号</th>
											<th>3号</th>

											<th>温度</th>
											<th>压力</th>
											<th>流量</th>
											<!--  -->
											<th>温度</th>
											<th>压力</th>

											<th>1号</th>
											<th>2号</th>
											<th>3号</th>

											<th>温度</th>
											<th>压力</th>
											<th>流量</th>
											<!--  -->
											<th>甲烷<sub>%</sub></th>
											<th>氧气<sub>%</sub></th>
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
	//全部数据
	function getDateAll(){
		$(document).ready(function() {
	    	  $('#allId').DataTable({
	    		    "scrollX": true,//水平滚动条
		            "scrollY": 480,
		            "destroy": true,
		            "bAutoWidth":false,
		            "bFilter": false,  //搜索
		            "ordering": true,  //排序
		            "scrollCollapse": true,
		            "jQueryUI": true,
		            "paging": false,
		            "info": false,
		            "language":{
		            	"sProcessing": "处理中...",
		                "sZeroRecords": "没有匹配结果",
		                "sSearch": "搜索",
		                "sEmptyTable": "表中数据为空",
		                "sLoadingRecords": "载入中...",
		            },
		            "ajax":{
		            	url:'${app_path}/data/YDataAll',
		            	method: 'POST',
		            },
	    	  		"columns":[
	    	  		    {"data":
	    	  		    	function(obj){
	    	  		    		return getMyDate1(obj.t);
	    	  		    	}
						},
	    	  		    {"data":"f"},
	    	  		    {"data":"a1"},
	    	  		    {"data":"a2"},
	    	  		    {"data":"a3"},
	    	  		    {"data":"a4"},
	    	  		    {"data":"a5"},
	    	  		    {"data":"a6"},
	    	  		    {"data":"a7"},
	    	  		    {"data":"a8"},
	    	  		    {"data":"b1"},
	    	  		    {"data":"b2"},
	    	  		    {"data":"b3"},
	    	  		    {"data":"b4"},
	    	  		    {"data":"b5"},
	    	  		    {"data":"b6"},
	    	  		    {"data":"b7"},
	    	  		    {"data":"b8"},
	    	  		    {"data":"h"},
	    	  		    {"data":"o"},
	    	  		]
		        });
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
	//补0操作
	function getzf(sum) {
		if (parseInt(sum) < 10) {
			sum = '0' + sum;
		}
		return sum;
	}
	</script>

	<script>
			/* 打开页面获取到当前时间 */
			$(function(){
				/* 把值设置给dateId */
				var  YMD = getDateYMD();
				$("#dateId").val(YMD);
				$("#dateId1").val(YMD);
			});
			
			//定义全局变量
			var f = [];  //总管压力
			
			var h = [];   //氧
			
			var o = [];   //甲烷
			
			var a4 =[];  //一号分机频率
			
			var b4 = []; //二号风机频率
			
			var a8 = []; // 一号流量
			
			var b8 = []; // 二号流量
			
			var sum = []; //  流量和
			
			$(document).ready(function() {
				var str1 = $("#dateId").val();
		    	  $('#example').DataTable({
			            "scrollY": 380,
			            "destroy": true,
			            "bAutoWidth":false,
			            "bFilter": false,  //搜索
			            "ordering": false,  //排序
			            "scrollCollapse": true,
			            "jQueryUI": true,
			            "paging": false,
			            "info": false,
			            "language":{
			            	"sProcessing": "处理中...",
			                "sZeroRecords": "没有匹配结果",
			                "sSearch": "搜索",
			                "sEmptyTable": "表中数据为空",
			                "sLoadingRecords": "载入中...",
			            },
			            "ajax":{
			            	url:'${app_path}/data/YData',
			            	method: 'POST',
			            	data:{string:str1}
			            },
		    	  		"columns":[
		    	  		    {"data":
		    	  		    	function(obj){
		    	  		    		return getMyDate(obj.t);
		    	  		    	}
		    	  		    },
		    	  		    {"data":
		    	  		    	function(obj){
		    	  		    	f.push(obj.f);
		    	  		    	h.push(obj.h);
		    	  		    	o.push(obj.o);
		    	  		    	a4.push(obj.a4);
		    	  		    	b4.push(obj.b4);
		    	  		    	a8.push(obj.a8);
		    	  		    	b8.push(obj.b8);
		    	  		    	var sums = (obj.a8 + obj.b8);
		    	  		    	sum.push(sums);
	    	  		    		return obj.f;
	    	  		    		}
		    	  		    },
		    	  		    {"data":"a1"},
		    	  		    {"data":"a2"},
		    	  		    {"data":"a3"},
		    	  		    {"data":"a4"},
		    	  		    {"data":"a5"},
		    	  		    {"data":"a6"},
		    	  		    {"data":"a7"},
		    	  		    {"data":"a8"},
		    	  		    {"data":"b1"},
		    	  		    {"data":"b2"},
		    	  		    {"data":"b3"},
		    	  		    {"data":"b4"},
		    	  		    {"data":"b5"},
		    	  		    {"data":"b6"},
		    	  		    {"data":"b7"},
		    	  		    {"data":"b8"},
		    	  		    {"data":"h"},
		    	  		    {"data":"o"},
		    	  		]
			        });
			    });
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
			 /* 加载数据  */
			 function g(){
				 f = [];
				 h = [];
				 o = [];
				 a4 = [];
				 b4 = [];
				 a8 = [];
				 b8 = [];
				 sum = [];
				 var str = $("#dateId").val();
				 $("#dateId1").val(str);
		    	  $('table.display').DataTable({
			            "scrollY": 380,
			            "destroy": true,    //异步关键参数
			            "bAutoWidth":false,
			            "bFilter": false,  //搜索
			            "ordering": false,  //排序
			            "scrollCollapse": true,
			            "jQueryUI": true,
			            "paging": false,
			            "info": false,
			            "language":{
			            	"sProcessing": "处理中...",
			                "sZeroRecords": "没有匹配结果",
			                "sSearch": "搜索",
			                "sEmptyTable": "表中数据为空",
			                "sLoadingRecords": "载入中...",
			            },
			            "ajax":{
			            	url:'${app_path}/data/YData',
			            	method: 'POST',
			            	data:{string:str}
			            },
		    	  		"columns":[
		    	  		    {"data":
		    	  		    	function(obj){
		    	  		    		return getMyDate(obj.t);
		    	  		    	}
		    	  		    },
		    	  		  	{"data":
		    	  		    	function(obj){
		    	  		  		f.push(obj.f);
			    	  		  	h.push(obj.h);
		    	  		    	o.push(obj.o);
		    	  		    	a4.push(obj.a4);
		    	  		    	b4.push(obj.b4);
		    	  		    	a8.push(obj.a8);
		    	  		    	b8.push(obj.b8);
		    	  		    	var sums = (obj.a8 + obj.b8);
		    	  		    	sum.push(sums);
	    	  		    		return obj.f;
	    	  		    		}
		    	  		    },
		    	  		    {"data":"a1"},
		    	  		    {"data":"a2"},
		    	  		    {"data":"a3"},
		    	  		    {"data":"a4"},
		    	  		    {"data":"a5"},
		    	  		    {"data":"a6"},
		    	  		    {"data":"a7"},
		    	  		    {"data":"a8"},
		    	  		    {"data":"b1"},
		    	  		    {"data":"b2"},
		    	  		    {"data":"b3"},
		    	  		    {"data":"b4"},
		    	  		    {"data":"b5"},
		    	  		    {"data":"b6"},
		    	  		    {"data":"b7"},
		    	  		    {"data":"b8"},
		    	  		    {"data":"h"},
		    	  		    {"data":"o"},
		    	  		]
			        });
			 }
			 
			 /* 加载曲线图形 */
			function echart(){
				 /* 图形js */
				var myChart = echarts.init(document.getElementById('ec'));
	            option = {
	                tooltip : {
	                    "trigger": "axis"
	                },
	                legend: {
	                    orient:'vertical',
	                    x: 'right',
	                    y: 35,
	                    data:['总管负压']
	                },
	                grid:{
	                    x:65,
	                    y:35,
	                    x2:100
	                },
	                xAxis : [
	                    {
	                        "name":'小时/h',
	                        "type" : "category",
	                        "boundaryGap" : false,
	                        "data" : ["0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23"]
	                    }
	                ],
	                yAxis : [
	                    {
	                        "type" : "value"
	                    }
	                ],
	                series : [
	                    {
	                        "name":"总管负压",
	                        "type":"line",
	                        "data":[]
	                    }
	                ]
	            };
	            // 使用刚指定的配置项和数据显示图表。
	            myChart.setOption(option);
	            myChart.setOption({
	                series: [
	               	 	   {name: ['总管负压'],data: f},
			             	],
				 });
	            
	            
	            var myChart1 = echarts.init(document.getElementById('main1'));
	            option = {
	                "tooltip" : {
	                    "trigger": "axis"
	                },
	                "legend": {
	                    "orient":'vertical',
	                    "x": 'right',
	                    "y": 35,
	                    "data":["甲烷","氧"]
	                },
	                "grid":{
	                    x:65,
	                    y:35,
	                    x2:100
	                },
	                 "xAxis" : [
	                       {
	                       	"name":'小时/h',
	                        "type" : "category",
	                        "boundaryGap" : false,
	                        "data" : ["0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23"]
	                       }
	                   ],
	                "yAxis" : [
	                    {
	                        "type" : "value"
	                    }
	                ],
	                "series" : [
	                    {
	                        "name":"甲烷",
	                        "type":"line",
	                        "data":[]
	                    },
	                    {
	                        "name":"氧",
	                        "type":"line",
	                        "data":[]
	                    }
	                ]
	            };
	            myChart1.setOption(option);
	            myChart1.setOption({
	                series: [
	               	 	   {name: ['甲烷'],data: h},
	               	       {name: ['氧'],data: o},
			             	],
				 });
	            
	            
	            var myChart2 = echarts.init(document.getElementById('main2'));
	            option = {
	                "tooltip" : {
	                    "trigger": "axis"
	                },
	                "legend": {
	                    "orient":'vertical',
	                    "x": 'right',
	                    "y": 35,
	                    "data":["预处理I频率","预处理II频率"]
	                },
	                "grid":{
	                    x:65,
	                    y:35,
	                    x2:100
	                },
	                 "xAxis" : [
	                       {
	                       	"name":'小时/h',
	                        "type" : "category",
	                        "boundaryGap" : false,
	                        "data" : ["0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23"]
	                       }
	                   ],
	                "yAxis" : [
	                    {
	                        "type" : "value"
	                    }
	                ],
	                "series" : [
	                    {
	                        "name":"预处理I频率",
	                        "type":"line",
	                        "data":[]
	                    },
	                    {
	                        "name":"预处理II频率",
	                        "type":"line",
	                        "data":[]
	                    }
	                ]
	            };
	            myChart2.setOption(option);
	            myChart2.setOption({
	                series: [
	               	 	   {name: ['预处理I频率'],data: a4},
	               	       {name: ['预处理II频率'],data: b4},
			             	],
				 });
	            
	            var myChart3 = echarts.init(document.getElementById('main3'));
	            option = {
	                "tooltip" : {
	                    "trigger": "axis"
	                },
	                "legend": {
	                    "orient":'vertical',
	                    "x": 'right',
	                    "y": 35,
	                    "data":["预处理I流量","预处理II流量","总流量"]
	                },
	                "grid":{
	                    x:65,
	                    y:35,
	                    x2:100
	                },
	                 "xAxis" : [
	                       {
	                       	"name":'小时/h',
	                        "type" : "category",
	                        "boundaryGap" : false,
	                        "data" : ["0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23"]
	                       }
	                   ],
	                "yAxis" : [
	                    {
	                        "type" : "value"
	                    }
	                ],
	                "series" : [
	                    {
	                        "name":"预处理I流量",
	                        "type":"line",
	                        "data":[]
	                    },
	                    {
	                        "name":"预处理II流量",
	                        "type":"line",
	                        "data":[]
	                    },
	                    {
	                        "name":"总流量",
	                        "type":"line",
	                        "data":[]
	                    }
	                ]
	            };
	            myChart3.setOption(option);
	            myChart3.setOption({
	                series: [
	               	 	   {name: ['预处理I流量'],data: a8},
	               	       {name: ['预处理II流量'],data: b8},
	               	       {name: ['总流量'],data: sum},
			             	],
				 }); 
			}
		</script>
		
		<!--图形-->
        <script type="text/javascript">

            
        </script>
</body>
</html>
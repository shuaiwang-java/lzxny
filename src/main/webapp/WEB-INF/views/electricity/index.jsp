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
        <script type="text/javascript" src="${pageContext.request.contextPath}/x-admin/js/xadmin.js"></script>
        <!-- bootstrap核心样式 -->
        <link href="${pageContext.request.contextPath}/static/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <!-- bootstrap  js -->
        <script src="${pageContext.request.contextPath}/static/bootstrap/js/bootstrap.min.js"></script>
        <script src="${app_path }/static/bootstrap/js/echarts.js"></script>
        <style>
            div.t1{
                margin:auto;
                margin-top: 14px;
                width:96%;
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
            table tbody {
                display:block;
                height:195px;
                overflow-y:scroll;
            }
            table thead, tbody tr {
                display:table;
                width:100%;
                table-layout:fixed;
            }
            table thead {
                width: calc( 100%)
            }
            table thead th{ background:#fff;}
        </style>


    </head>

    <body>
        <div id="zong">
            <div class="t1">
                <div style="float: left; background-color: rgba(192, 192, 192, 0.73);">

                    <blockquote class="layui-elem-quote layui-text">选择日期：<input type="date" id="dateId" value="2018-10-26"/> <button type="submit" onclick="g()">查询</button>
                    </blockquote>

                    <div>
                        <div style="width: 49%; height: 861px; float: left;margin-left: 10px"> <!--background-color:rgba(217,213,219,0.22);-->
                            <table class="layui-table" lay-size="sm" id="tableId1">
                                <thead>
                                    <tr>
                                        <td  rowspan="2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;时间</td>
                                        <td  rowspan="2">环境温度/°C</td>
                                        <td  rowspan="2">气体用量/m<sup>3</sup></td>
                                        <td  colspan="2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;气体成分</td>
                                        <td  rowspan="2">每方产气量</td>
                                        <td  rowspan="2">每小时发电量</td>
                                    </tr>
                                    <tr>
                                        <td>甲烷/CH4</td>
                                        <td>氧气/O2</td>
                                    </tr>
                                </thead>
                                <tbody>
                                </tbody>
                            </table>

                            <div style="width: 100%;height: 250px; margin-left: 0px; margin-top: -4px; background-color:rgb(195, 186, 186);float: left;">
                                <h4>当日每小时气质曲线图</h4>
                                <div id="main" style="width: 100%;height: 100%; margin-left: 60px;left: -61px"></div>
                            </div>
                            <div style="width: 100%;height: 250px; margin-left: 0px; margin-top: 6px; background-color:rgb(196, 209, 203);float: left;">
                                <h4>当日每小时发电量曲线图</h4>
                                <div id="main1" style="width: 100%;height: 100%; margin-left: 60px;left: -61px"></div>
                            </div>
                        </div>

                        <div style="float: left; width: 49%;height: 97px; margin-left: 10px;"> <!--background-color:rgba(217,219,219,0.44);-->
                            <table class="layui-table" lay-size="sm" id="yj1">
                                <thead>
                                <tr>
                                    <td>一期(#1～#14)上网电量/Mwh</td>
                                    <td>二期(#15～#20)上网电量/Mwh</td>
                                    <td>总上网电量合计/Mwh</td>
                                </tr>
                                </thead>
                                <tbody style="display:contents">
                                </tbody>
                            </table>
                        </div>

                        <div style="float: left;left: 60px;margin-left: 30px;background-color: #7199bf">
                            <div style="width:62px;height: 0px;"><b>数据分析</b></div>
                            <div style="width: 573px;height: 658px;margin-left: 0px;margin-top: 20px; background-color: #d9e4e4">
                                <br>
                                <h5><u>24小时平均值</u></h5>
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>温度:</b> <span id="q1">16</span> <sub>°C</sub>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>气体用量:</b> <span id="q2">16</span> <sub>m3</sub>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>甲烷:</b> <span id="q3">42</span> <sub>CH4</sub>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>氧气:</b> <span id="q4">1.6</span> <sub>O2</sub><br>
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>每方产气量:</b> <span id="q5">1.91</span> <sub>kW·h</sub>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>发电量:</b> <span id="q6">20</span> <sub>mw</sub> 
                                <br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b style="color:#F00">当日总产气量:</b> <span id="q7"></span> <sub>m3</sub>
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b style="color:#F00">预计次日总产气量:</b> <span id="q8"></span> <sub>m3</sub><br>
                                <h5><u>预计次日上网情况</u></h5>
                                <div style="width: 497px;height: 111px;margin-left: 60px">
                                    <table class="layui-table" lay-size="sm" id="yj3">
                                        <thead>
                                        <tr>
                                            <td  colspan="2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;预计上网</td>
                                            <td  rowspan="2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;预计上网电量/Mwh</td>
                                        </tr>
                                        <tr>
                                            <td>一期(#1～#14)/Mwh</td>
                                            <td>二期(#15～#20)/Mwh</td>
                                        </tr>
                                        </thead>
                                        <tbody style="display:contents">
                                        </tbody>
                                    </table>
                                </div>
                                <p>因膜上施工或者温度等因素导致产气量变化时、请在下输入气体产量所受影响的量</p>
                                <p>次日机组停机维护所影响减少的发电量,没有机组维护不填写</p>
                                <form class="form-horizontal">
                                    <div class="form-group">
                                        <label  class="col-sm-3 control-label">扣除气体量：</label>
                                        <div class="col-sm-3">
                                            <input type="text" class="form-control" id="z2" placeholder="Nm3">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label  class="col-sm-3 control-label">机组扣除电量：</label>
                                        <div class="col-sm-3">
                                            <input type="text" class="form-control" id="z1" placeholder="MW">
                                        </div>
                                        <div class="col-sm-6"><button type="button" class="btn btn-primary">确认</button></div>
                                    </div>
                                </form>
                                <br>
                                <p><b>修正后预计次日上网电量</b></p>
                                <div style="width: 497px;height: 111px;margin-left: 60px">
                                    <table class="layui-table" lay-size="sm" id="yj2">
                                        <thead>
                                        <tr>
                                            <td  colspan="2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;预计上网</td>
                                            <td  rowspan="2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;预计上网电量/Mwh</td>
                                        </tr>
                                        <tr>
                                            <td>一期发电(#1～#14)/Mwh</td>
                                            <td>二期发电(#15～#20)/Mwh</td>
                                        </tr>
                                        </thead>
                                        <tbody style="display:contents">
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        <!---->
                    </div>
                </div>
            </div>
        </div>

        <!--图形-->
        <script type="text/javascript">

            var myChart = echarts.init(document.getElementById('main'));
            option = {
                tooltip : {
                    "trigger": "axis"
                },
                legend: {
                    orient:'vertical',
                    x: 'right',
                    y: 35,
                    data:['甲烷','氧气']
                },
                grid:{
                    x:65,
                    y:35,
                    x2:100
                },
                xAxis : [
                    {
                        "name":'h',
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
                        "name":"甲烷",
                        "type":"line",
                        "data":[]
                    },
                    {
                        "name":"氧气",
                        "type":"line",
                        "data":[]
                    }
                ]
            };
            // 使用刚指定的配置项和数据显示图表。
            myChart.setOption(option);
        </script>

        <!--曲线-->
        <script>
            var myChart1 = echarts.init(document.getElementById('main1'));
            option = {
                "tooltip" : {
                    "trigger": "axis"
                },
                "legend": {
                    "orient":'vertical',
                    "x": 'right',
                    "y": 35,
                    "data":["电量"]
                },
                "grid":{
                    x:65,
                    y:35,
                    x2:100
                },
                 "xAxis" : [
                       {
                       	"name":'h',
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
                        "name":"电量",
                        "type":"line",
                        "data":[]
                    }
                ]
            };
            myChart1.setOption(option);
        </script>
        </div>
        
        <script type="text/javascript">
        
        /* 打开获取时间查询数据 */
        $(function(){
        	var a=document.getElementById("dateId").value;
        	/* 调用ajax方法获取数据 */
        	getDate(a);
        })
        
        function g(){
        	var a=document.getElementById("dateId").value;
        	getDate(a);
        }
        
        function getDate(srt){
        	
        	//获取到数据
        	$.ajax({
        		url:"${app_path}/ele/getdata",
        		data:"date="+srt,
        		type:"get",
        		success:function(data){
        			/* 获取到数据 向表格中添加数据 */
        			var yjs = data.map.yj;
        			var yj1s = data.map.yj1;
        			setTableData(yjs);
        			setTableYj1(yj1s);
        		}
        	})
        };
        
        /* 渲染当日上网电量 */
        function setTableYj1(srt){
        	
        	$("#yj1 tbody").empty();
        	$("#yj2 tbody").empty();
        	$("#yj3 tbody").empty();
        	
        	var y = $("<td></td>").append(srt.iqS);
        	var e = $("<td></td>").append(srt.iiqS);
        	var num = $("<td></td>").append(srt.numY);
        	$("<tr></tr>").append(y)
        				  .append(e)
        				  .append(num)
        				  .appendTo("#yj1 tbody");
        	
        	var cnum = srt.numS;
        	
        	/* 预计二 */
        	var a = $("<td></td>").append(srt.iqY);
        	var b = $("<td></td>").append(srt.iiqY);
        	var c = $("<td></td>").append(cnum);
        	$("<tr></tr>").append(a)
        				  .append(b)
        				  .append(c)
        				  .appendTo("#yj2 tbody");
        	
        	/* 预计一 */
        	
        	var ran = randomNum(1,10);;
        	var ran1 = randomNum(1,5);
        	
        	var r1 =  srt.iqY+ran;
        	var r2 = srt.iiqY+ran1;
        	var rnum = r1+r2;
        	
        	var a1 = $("<td></td>").append(r1);
        	var b2 = $("<td></td>").append(r2);
        	var c3 = $("<td></td>").append(rnum);
        	$("<tr></tr>").append(a1)
        				  .append(b2)
        				  .append(c3)
        				  .appendTo("#yj3 tbody");
        	
        		var cha =  rnum - cnum;
        	
        	
        	
        	var cha1 = cha * 5440.54;
        	
        	$("#z2").val(cha1.toFixed(2));
        	
        	var d = randomNum(1500,4500);
        	
        	var tod = (srt.liuliang+d).toFixed(2);
        	
        	$("#q8").text(tod);
        	
        }
        
        /* 渲染页面的方法 */
        function setTableData(yjs){
        	$("#tableId1 tbody").empty();
        	var ch4 = [];  //甲烷
        	var O2 = [];  //氧气
        	var num = [];  //每小时总电量
        	var cd = [];   //温度
        	var qt1 = [];  //气体
        	var fq1 = [];  //方气
        	
        	$.each(yjs,function(index,yj){
        		ch4.push(yj.ch);
        		O2.push(yj.o2);
        		num.push(yj.a20);
        		cd.push(yj.c);
        		qt1.push(yj.qt);
        		fq1.push(yj.fq);
        		var date1 = $("<td></td>").append(yj.date1);
        		var time1 = $("<td></td>").append(yj.time1);
        		var c = $("<td></td>").append(yj.c);
        		var qt = $("<td></td>").append(yj.qt);
        		var ch = $("<td></td>").append(yj.ch);
        		var o2 = $("<td></td>").append(yj.o2);
        		var fq = $("<td></td>").append(yj.fq);
        		var a20 = $("<td></td>").append(yj.a20);
        		$("<tr></tr>").append(time1)
        					  .append(c)
        					  .append(qt)
        					  .append(ch)
        					  .append(o2)
        					  .append(fq)
        					  .append(a20)
        					  .appendTo("#tableId1 tbody");
        	});
        	/* 向图形表中添加数据 */
        	myChart.setOption({
                series: [
               	 	   {name: ['甲烷'],data: ch4},
               	       {name: ['氧气'],data: O2},
		             	],
			 });
        	myChart1.setOption({
                 series: [{name: ['电量'],data: num}],
        	});
        	
        	/* 渲染平均数据 */
        	$("#q1").text(sum(cd));
        	$("#q2").text(sum(qt1));
        	$("#q3").text(sum(ch4));
        	$("#q4").text(sum(O2));
        	$("#q5").text(sum(fq1));
        	$("#q6").text(sum(num));
        	$("#q7").text(sum1(qt1));
        };
        
        
        /*求出数组中的平均值*/
        function sum(arr) {
		    var s = 0;
		    for (var i=arr.length-1; i>=0; i--) {
		        s += arr[i];
		    }
		    return (s/24).toFixed(2);
		}
        function sum1(arr) {
		    var s = 0;
		    for (var i=arr.length-1; i>=0; i--) {
		        s += arr[i];
		    }
		    return (s).toFixed(2);
		}
        
        /* 生成随机数 */
        
        function randomNum(minNum,maxNum){ 
			    switch(arguments.length){ 
			        case 1: 
			            return parseInt(Math.random()*minNum+1,10); 
			        break; 
			        case 2: 
			            return parseInt(Math.random()*(maxNum-minNum+1)+minNum,10); 
			        break; 
			            default: 
			                return 0; 
			            break; 
			    } 
			}
        
        
        
        </script>
    </body>
</html>
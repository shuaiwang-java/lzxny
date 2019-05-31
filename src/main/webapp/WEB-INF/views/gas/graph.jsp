<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	content="width=device-width,user-scalable=no, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
<meta name="viewport" content="arget-densitydpi=1920,width=1080, initial-scale=1" />
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
<script src="${app_path }/static/bootstrap/js/echarts.js"></script>

<!-- select多选 -->
<link href="${app_path }/static/bootstrap/css/multiple-select.css" rel="stylesheet"/>
<script src="${app_path }/static/bootstrap/js/multiple-select.js"></script>

<style>
div.si{
margin:0px;
  width:1350px;
  min-width:1350px;
  max-width:100%;
  height:100%;
  background-color:#F0F0F0;
}
div.zoom {
	position:absolute;
	left:1px;
    z-index:9999;
}
#head{
  background-color:#FFFF00;
  width:1350px;
  height:45px;
  min-width:1350px;
}
#center{
  background-color:#00FFFF;
  width:600px;
  min-height:520px;
  position:relative;
  min-width:600px;
}
</style>

<style>

div.a1 {
	position:absolute;
	left:100px;
	top:150px;
	z-index:auto
	}

ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #ADADAD;
}

li {
    float: left;
}

li p {
    display: block;
    color: white;
    text-align: center;
    padding: 8px 10px;
    text-decoration: none;
}

</style>


</head>


<body>
	<div class="zoom">
	<p><button type="button" class="btn btn-primary" onclick="zoomout()"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span></button><button type="button" class="btn btn-primary" onclick="zoomin()"><span class="glyphicon glyphicon-minus" aria-hidden="true"></span></button></p>
	</div>
	<div id="sizeId">
	<div class="si">
	<div id="head">
		<ul>
		  <li><p>气质变化图</p></li>
		  <li>
				<div><p><span style="color:#ADADAD">
			  <select style="height: 30px; width: 170px; float:left" onchange="onSelect()">
			 	 <option value=" ">点击选择编号</option>
				 <c:forEach items="${wells}" var="well">
					<option value="${well.wname}">${well.wname}</option>
				 </c:forEach>
			   </select></span></p>
	   		</div>
			</li>
		</ul>
	</div>
	
	<!-- 曲线图型模块 -->
	<div id="center" style="width:50%; float:left; background-color:#FDF5E6">
		<div id="container" style="height: 260px; width: 100%"></div> <!-- 一周 -->
		<div id="my1" style="height: 260px; width: 100%"></div><!-- float:left -->
	</div>
	
	<div style="width:50%; float:left">
		<!-- 地图 -->
		<div style="width:100%; float:left; background-image:url(${app_path}/img/dx5.png); background-size:680px 550px">
			<div style="width: 100%; height: 520px"></div>
		</div>
	</div>
	
	<div><hr></div>
	
	<div>
		<ul>
		  <li><p>分区多选</p></li>
		</ul>
	</div>
	
	<!-- 图形模块 -->
	<div style="width:100%; float:left; background-color:#FDF5E6">
		<!-- 多选下拉列表div -->
		<div>
			<select multiple="multiple"  id="select2">
		        <optgroup label="A区">
		        	<c:forEach items="${wellsRegion}" var="well">
		       		<c:if test="${well.wRegion eq 'A'}">
		            <option value="${well.wname}">${well.wname}</option>
		            </c:if>
		            </c:forEach>
		        </optgroup>
		        <optgroup label="B区">
		        	<c:forEach items="${wellsRegion}" var="well">
		       		<c:if test="${well.wRegion eq 'B'}">
		            <option value="${well.wname}">${well.wname}</option>
		            </c:if>
		            </c:forEach>
		        </optgroup>
		        <optgroup label="C区">
		        	<c:forEach items="${wellsRegion}" var="well">
		       		<c:if test="${well.wRegion eq 'C'}">
		            <option value="${well.wname}">${well.wname}</option>
		            </c:if>
		            </c:forEach>
		        </optgroup>
		        <optgroup label="AC区">
		        	<c:forEach items="${wellsRegion}" var="well">
		       		<c:if test="${well.wRegion eq 'AC'}">
		            <option value="${well.wname}">${well.wname}</option>
		            </c:if>
		            </c:forEach>
		        </optgroup>
		        <optgroup label="D区">
		        	<c:forEach items="${wellsRegion}" var="well">
		       		<c:if test="${well.wRegion eq 'D'}">
		            <option value="${well.wname}">${well.wname}</option>
		            </c:if>
		            </c:forEach>
		        </optgroup>
		        <optgroup label="E区">
		        	<c:forEach items="${wellsRegion}" var="well">
		       		<c:if test="${well.wRegion eq 'E'}">
		            <option value="${well.wname}">${well.wname}</option>
		            </c:if>
		            </c:forEach>
		        </optgroup>
 			</select>
		</div>
		<hr>
		<!-- 这个区域显示曲线图形 -->
		<div style="height: 1080px; float:left; width: 100%" id="xs"><!-- float:left -->
			
		</div>
	</div>
	</div>
	</div>
	<script type="text/javascript">
	var dom1 = document.getElementById("my1");
	var myChart1 = echarts.init(dom1);
	option = {
		    title: {
		        text: '近月数据'
		    },
		    tooltip: {
		        trigger: 'axis'
		    },
		    legend: {
		        data:['甲烷','二氧化碳','氧气','H2S','BAL','压力']
		    },
		    grid: {
		        left: '3%',
		        right: '4%',
		        bottom: '3%',
		        containLabel: true
		    },
		    toolbox: {
		        feature: {
		            saveAsImage: {}
		        }
		    },
		    xAxis: {
		        type: 'category',
		        boundaryGap: false,
		        data: []
		    },
		    yAxis: {
		        type: 'value'
		    },
		    /*  */
		    series: [
		        {
		            name:'甲烷',
		            type:'line',
		            smooth: true,
		            data:[]
		        },
		        {
		            name:'二氧化碳',
		            type:'line',
		            smooth: true,
		            data:[]
		        },
		        {
		            name:'氧气',
		            type:'line',
		            smooth: true,
		            data:[]
		        },
		        {
		            name:'H2S',
		            type:'line',
		            smooth: true,
		            data:[]
		        },
		        {
		            name:'BAL',
		            type:'line',
		            smooth: true,
		            data:[]
		        },
		        {
		            name:'压力',
		            type:'line',
		            smooth: true,
		            data:[]
		        }
		    ]
		};
	;
	if (option && typeof option === "object") {
	    myChart1.setOption(option, true);
	}
	
	/* ------------------------------------------------------------------ */
	
		var dom = document.getElementById("container");
		var myChart = echarts.init(dom);
		var app = {};
		option = null;
		option = {
			    title: {
			        text: '近七天数据'
			    },
			    tooltip: {
			        trigger: 'axis'
			    },
			    legend: {
			        data:['甲烷','二氧化碳','氧气','H2S','BAL','压力']
			    },
			    grid: {
			        left: '3%',
			        right: '4%',
			        bottom: '3%',
			        containLabel: true
			    },
			    toolbox: {
			        feature: {
			            saveAsImage: {}
			        }
			    },
			    xAxis: {
			        type: 'category',
			        boundaryGap: false,
			        data: []
			    },
			    yAxis: {
			        type: 'value'
			    },
			    /*  */
			    series: [
			        {
			            name:'甲烷',
			            type:'line',
			            smooth: true,
			            data:[]
			        },
			        {
			            name:'二氧化碳',
			            type:'line',
			            smooth: true,
			            data:[]
			        },
			        {
			            name:'氧气',
			            type:'line',
			            smooth: true,
			            data:[]
			        },
			        {
			            name:'H2S',
			            type:'line',
			            smooth: true,
			            data:[]
			        },
			        {
			            name:'BAL',
			            type:'line',
			            smooth: true,
			            data:[]
			        },
			        {
			            name:'压力',
			            type:'line',
			            smooth: true,
			            data:[]
			        }
			    ]
			};
		;
		if (option && typeof option === "object") {
		    myChart.setOption(option, true);
		}
		function onSelect(){
			var vs = $('select  option:selected').val(); 
			$.ajax({
				url:"${app_path}/gas/getEchartsData",
				data:"gname="+vs,
				type:"POST",
				success:function(data){
					var time=[];  //得到所有的日期
					var ch4=[];
					var co2=[];
					var o2=[];
					var h2s=[];
					var bal=[];
					var pre=[];
					 var gass = data.map.pageInfo.list;  //获取到单个井的数据
					 $.each(gass,function(index,gas){	//遍历获取到单井气质的数据
						  time.push(gas.gtime);//获取到gas是时间
						  ch4.push(gas.ch4); //甲烷
						  co2.push(gas.co2); //二氧化碳
						  o2.push(gas.o2); //氧气
						  h2s.push(gas.h2s);
						  bal.push(gas.bal);
						  pre.push(gas.pressure); //压力
					 });
					 
					 function sequence(a,b){
						   return a - b;
					 }
					 time.sort(sequence);
					 var times=[];
					 //遍历获取到的时间
					 for ( var i = 0; i <time.length; i++){
						      times.push(getMyDate(time[i]));
						}
					 myChart.setOption({
						 xAxis: {
	                         data: times
	                     },
	                     series: [
	                    	 	   {name: ['甲烷'],data: ch4},
	                    	       {name: ['二氧化碳'],data: co2},
	                    	       {name: ['氧气'],data: o2},
				             	   {name: ['H2S'],data: h2s},
				             	   {name: ['BAL'],data: bal},
				             	   {name: ['压力'],data: pre}
				                 ],
					 });
					 //调用显示月数据的方法
					 ajax2(vs);
				},
			});		
		  }	
		//显示近月的数据
		function ajax2(vs){
			$.ajax({
				url:"${app_path}/gas/getEchartsDataMonth",  //
				data:"gname="+vs,
				type:"POST",
				success:function(data){
					var time=[];
					var ch4=[];
					var co2=[];
					var o2=[];
					var h2s=[];
					var bal=[];
					var pre=[];
					 var gass = data.map.pageInfo.list;
					 $.each(gass,function(index,gas){	//遍历获取到单井气质的数据
						  time.push( gas.gtime);//获取到gas是时间
						  ch4.push(gas.ch4); //甲烷
						  co2.push(gas.co2); //二氧化碳
						  o2.push(gas.o2); //氧气
						  h2s.push(gas.h2s);
						  bal.push(gas.bal);
						  pre.push(gas.pressure); //压力
					 });
					 function sequence(a,b){
						   return a - b;
					 }
					 time.sort(sequence);
					 var times=[];
					 //遍历获取到的时间
					 for ( var i = 0; i <time.length; i++){
						      times.push(getMyDate(time[i]));
						}
					 myChart1.setOption({
						 xAxis: {
	                         data: times
	                     },
	                     series: [
	                    	 	   {name: ['甲烷'],data: ch4},
	                    	       {name: ['二氧化碳'],data: co2},
	                    	       {name: ['氧气'],data: o2},
				             	   {name: ['H2S'],data: h2s},
				             	   {name: ['BAL'],data: bal},
				             	   {name: ['压力'],data: pre}
				                 ],
					 });
				},
			});	
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
            oTime = getzf(oDay) +'日';//最后拼接时间
            return oTime;
        };
        //补0操作
      	function getzf(num){
          if(parseInt(num) < 10){
              num = '0'+num;
        	}
          	return num;
      	}
       </script>
       
	<script type="text/javascript">
		$("#select2").multipleSelect({
	        multiple: true,
	        multipleWidth: 85,
	      /*   onClose:function(view){   下拉列表关闭执行
	                 alert("Selected texts: " + $("#select2").multipleSelect("getSelects", "text"));
	        }, */
	        onClick:function(view){ //点击后获取点击的值     用来实现点击一下发送一次ajax请求
	        	var name = view.label;		//view.label 用来获取点击后选中的值 
	        						// view.checked 用来判断是选中（true）还是未选中（false）
	        	if(view.checked){ //如果是选中状态进行ajax请求
	        		
	        		$("#xs").append("<div id='"+name+"' style='height: 230px; width: 33%;float:left'></div>");
	        		
	        		//增加
	        		//alert(name);
	        		var dom = document.getElementById(name);
	        		var myChart1 = echarts.init(dom);
	        		var app = {};
	        		option = null;
	        		option = {
	        			    title: {
	        			        text: name   //获取井编号名
	        			    },
	        			    tooltip: {
	        			        trigger: 'axis'
	        			    },
	        			    legend: {
	        			        data:['甲烷','氧气','流量']
	        			    },
	        			    grid: {
	        			        left: '3%',
	        			        right: '4%',
	        			        bottom: '3%',
	        			        containLabel: true
	        			    },
	        			    toolbox: {
	        			        feature: {
	        			            saveAsImage: {}
	        			        }
	        			    },
	        			    xAxis: {
	        			        type: 'category',
	        			        boundaryGap: false,
	        			        data: []
	        			    },
	        			    yAxis: {
	        			        type: 'value'
	        			    },
	        			    /*  */
	        			    series: [
	        			        {
	        			            name:'甲烷',
	        			            type:'line',
	        			            smooth: true,
	        			            data:[]
	        			        },
	        			        {
	        			            name:'氧气',
	        			            type:'line',
	        			            smooth: true,
	        			            data:[]
	        			        },
	        			        {
	        			            name:'流量',
	        			            type:'line',
	        			            smooth: true,
	        			            data:[]
	        			        }
	        			    ]
	        			};
	        		;
	        		if (option && typeof option === "object") {
	        			myChart1.setOption(option, true);
	        		}
	        		 
        			$.ajax({
        				url:"${app_path}/gas/getEchartsDataMonth",
        				data:"gname="+name,
        				type:"POST",
        				success:function(data){
        					var time=[];  //得到所有的日期
        					var ch4=[];
        					var o2=[];
        					 var gass = data.map.pageInfo.list;  //获取到单个井的数据
        					 $.each(gass,function(index,gas){	//遍历获取到单井气质的数据
        						  time.push(gas.gtime);//获取到gas是时间
        						  ch4.push(gas.ch4); //甲烷
        						  o2.push(gas.o2); //氧气
        					 });
        					 
        					 function sequence(a,b){
        						   return a - b;
        					 }
        					 time.sort(sequence);
        					 var times=[];
        					 //遍历获取到的时间
        					 for ( var i = 0; i <time.length; i++){
        						      times.push(getMyDate(time[i]));
        						}
        					 myChart1.setOption({
        						 xAxis: {
        		                        data: times
        		                    },
        		                    series: [
        		                   	 	   {name: ['甲烷'],data: ch4},
        		                   	       {name: ['氧气'],data: o2},
        				                 ],
        					 });
        				},
        			});		
	        	}else{

	        		var box = document.getElementById(name);
	        		box.parentNode.removeChild(box);
	        		
	        		/* alert(name);
	        		//清除类容
	        		$('#"'+name+'"').empty(); */
	        	}
	        	
	        	
	        }
	    });		
    </script>
     
     <!--缩放  -->
	<script type="text/javascript">
	    var size = 1.0;
	    function zoomout() {
	        size = size + 0.1;
	        set();
	    }
	    function zoomin() {
	        size = size - 0.1;
	        set();
	    }
	    function set() {
	        document.getElementById("sizeId").style.zoom = size;
	        document.getElementById("sizeId").style.cssText += '; -moz-transform: scale(' + size + ');-moz-transform-origin: 0 0; ';     //
	    }
	</script>
     
     
</body>

</html>
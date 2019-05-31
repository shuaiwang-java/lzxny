<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<!-- 获取当前项目路径 -->
<%	pageContext.setAttribute("app_path", request.getContextPath()); %>
<title>实时气质数据</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
<link rel="stylesheet"	href="${app_path}/x-admin/css/font.css">
<link rel="stylesheet"	href="${app_path}/x-admin/css/xadmin.css">
<script type="text/javascript"	src="${app_path}/jquery/jquery-3.2.1.min.js"></script>
<script type="text/javascript"	src="${app_path}/x-admin/lib/layui/layui.js"	charset="utf-8"></script>
<script type="text/javascript"	src="${app_path}/x-admin/js/xadmin.js"></script>
<!-- bootstrap核心样式 -->
<link href="${app_path }/static/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<!-- bootstrap  js -->
<script src="${app_path }/static/bootstrap/js/bootstrap.min.js"></script>
</head>
<style>
div.b1 {
	border-radius: 13px; /* 边框弧度 */ 
    position: absolute;
    left: 636px;
    top: 77px;
    border: 1px solid #5ae015;
	
}
div.b4 {
	border-radius: 13px; /* 边框弧度 */ 
    position: absolute;
    left: 934px;
    top: 561px;
    border: 1px solid #5ae015;
	
}
div.b5 {
	border-radius: 13px; /* 边框弧度 */ 
    position: absolute;
    left: 585px;
    top: 594px;
    border: 1px solid #5ae015;
	
}
div.b7 {
	border-radius: 13px; /* 边框弧度 */ 
    position: absolute;
    left: 375px;
    top: 705px;
    border: 1px solid #5ae015;
}
div.zoom {
	position:absolute;
	left:1px;
    z-index:9999;
}
div.a1 {
	background-color:#07000038;
	position:absolute;   /* 固 */
	left: 515px;		 /* 定*/
	top: 58px;			 /* 位置*/
	color: #a2c1fa;
	
	/*border: 1px solid #73AD21;   div边框 */
}
div.a2 {
	background-color:#07000038;
	position:absolute;   /* 固 */
	left: 1116px;		 /* 定*/
	top: 338px;			 /* 位置*/
	color: #a2c1fa;
	
	/*border: 1px solid #73AD21;   div边框 */
}
div.a3 {
	background-color:#07000038;
	position:absolute;   /* 固 */
	left: 1059px;		 /* 定*/
	top: 550px;			 /* 位置*/
	color: #a2c1fa;
	
	/*border: 1px solid #73AD21;   div边框 */
}
div.a4 {
	background-color:#07000038;
	position:absolute;   /* 固 */
	left: 878px;
	top: 596px;
	color: #a2c1fa;
	
	/*border: 1px solid #73AD21;   div边框 */
}
div.a5 {
	background-color:#07000091;
	position:absolute;   /* 固 */
	left: 590px;		 /* 定*/
	top: 629px;			 /* 位置*/
	color: #a2c1fa;
	
	/*border: 1px solid #73AD21;   div边框 */
}
div.a6 {
	background-color:#07000091;
	position:absolute;   /* 固 */
	left: 491px;		 /* 定*/
	top: 732px;			 /* 位置*/
	color: #a2c1fa;
	
	/*border: 1px solid #73AD21;   div边框 */
}
div.a7 {
	background-color:#07000091;
	position:absolute;   /* 固 */
	left: 256px;
	top: 695px;
	color: #a2c1fa;
	
	/*border: 1px solid #73AD21;   div边框 */
}
body{
 	text-align:center;  
}
table
  {
  border-collapse:collapse;
  }
table, td, th
  {
  border:1px solid #f36560;
  height:23px;
  width:120px;
  text-align:center;
  }
</style>
<body>
	<div id="sizeId">
	<div style="position:absolute;left:15px;top:0px; background:url('${app_path}/img/a2.png'); min-width:1290px;" class="img-thumbnail" alt="Responsive image">
		<div style="width:1290px; height: 860px"></div>
	</div>
	<div class="a1">
		<table>	
			<thead>
				<tr>
					<td colSpan="4" id="a1Td"></td>
				</tr>
				<tr>
					<th>甲烷</th>
					<th>氧气</th>
					<th>流量</th>
					<th>压力</th>
				</tr>
			</thead>
			<tbody id="a1"></tbody>
		</table>
	</div>
	 <div class="a2">
		<table>	
			<thead>
				<tr>
					<td colSpan="4" id="a2Td"></td>
				</tr>
				<tr>
					<th>甲烷</th>
					<th>氧气</th>
					<th>流量</th>
					<th>压力</th>
				</tr>
			</thead>
			<tbody id="a2"></tbody>
		</table>
	</div>
	<div class="a3">
		<table>	
			<thead>
				<tr>
				<td colSpan="4" id="a3Td"></td>
				</tr>
				<tr>
					<th>甲烷</th>
					<th>氧气</th>
					<th>流量</th>
					<th>压力</th>
				</tr>
			</thead>
			<tbody id="a3"></tbody>
		</table>
	</div> 
	<div class="a4">
		<table>	
			<thead>
				<tr>
				<td colSpan="4" id="a4Td"></td>
				</tr>
				<tr>
					<th>甲烷</th>
					<th>氧气</th>
					<th>流量</th>
					<th>压力</th>
				</tr>
			</thead>
			<tbody id="a4"></tbody>
		</table>
	</div>
	 <div class="a5">
		<table>	
			<thead>
				<tr>
				<td colSpan="4" id="a5Td"></td>
				</tr>
				<tr>
					<th>甲烷</th>
					<th>氧气</th>
					<th>流量</th>
					<th>压力</th>
				</tr>
			</thead>
			<tbody id="a5"></tbody>
		</table>
	</div>
	<div class="a6">
		<table>	
			<thead>
				<tr>
				<td colSpan="4" id="a6Td"></td>
				</tr>
				<tr>
					<th>甲烷</th>
					<th>氧气</th>
					<th>流量</th>
					<th>压力</th>
				</tr>
			</thead>
			<tbody id="a6"></tbody>
		</table>
	</div> 
	<div class="a7">
		<table>	
			<thead>
				<tr>
				<td colSpan="4" id="a7Td"></td>
				</tr>
				<tr>
					<th>甲烷</th>
					<th>氧气</th>
					<th>流量</th>
					<th>压力</th>
				</tr>
			</thead>
			<tbody id="a7"></tbody>
		</table>
	</div>
	 
	<div class="b1" title="点击获取该区域数据">   <!-- title 鼠标停留在div是显示提示信息 -->
		<a class="btn btn-default"  onclick="pop('B315-1')" role="button" style="opacity: -0.3;"> 12345 </a>
	</div>
	<div class="b4" title="点击获取该区域数据">   <!-- title 鼠标停留在div是显示提示信息 -->
		<a class="btn btn-default"  onclick="pop('E315-1')" role="button" style="opacity: -0.3;"> 12345 </a>
	</div>
	 <div class="b5" title="点击获取该区域数据">   
		<a class="btn btn-default"  onclick="pop('AC315')" role="button" style="opacity: -0.3;"> 12345 </a>
	</div>
	<div class="b7" title="点击获取该区域数据">   <!-- title 鼠标停留在div是显示提示信息 -->
		<a class="btn btn-default"  onclick="pop('630-1')" role="button" style="opacity: -0.3;"> 12345 </a>
	</div>
	</div>
	
	<div class="zoom">
	<p><button type="button" class="btn btn-primary" onclick="zoomout()"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span></button></p>
	<p><button type="button" class="btn btn-primary" onclick="zoomin()"><span class="glyphicon glyphicon-minus" aria-hidden="true"></span></button></p>
	</div>
	
	<script>
	//这是弹出层的js
	function pop(e){
		
		if(e == 'B315-1'){
		//加载弹出按钮
		layui.use('layer', function(){
			  var layer = layui.layer; //获取弹出按钮对象
			  layer.open({
				  							/* skin: 'demo-class'   带确认按钮的*/   
				  title:false, 				//title:''+e+'区的数据',
				  area: ['1010px', '583px'],   //页面高宽
				  shade: [0.8, '#393D49'],    //背景元素
				  shadeClose:true,            //点击页面区域外关闭弹窗
				  type: 2,					//弹框类型
				  //maxmin: true,                //是否显示最大化按钮
				  moveOut: true, 				//窗口拖动到外面
				  closeBtn:0,					//不显示关闭按钮
				  scrollbar:false,				//是否出现滚动条
				  content: ['${app_path}/gas/b1','no']
				  })
			}); 
		}else if(e == '630-1'){
			//加载弹出按钮
			layui.use('layer', function(){
				  var layer = layui.layer; //获取弹出按钮对象
				  layer.open({
					  title:false, 				//title:''+e+'区的数据',
					  area: ['1010px', '583px'],   //页面高宽
					  shade: [0.8, '#393D49'],    //背景元素
					  shadeClose:true,            //点击页面区域外关闭弹窗
					  type: 2,					//弹框类型
					  //maxmin: true,                //是否显示最大化按钮
					  moveOut: true, 				//窗口拖动到外面
					  closeBtn:0,					//不显示关闭按钮
					  scrollbar:false,				//是否出现滚动条
					  content: ['${app_path}/gas/a','no']
					  })
				}); 
		}else if(e == 'AC315'){
			//加载弹出按钮
			layui.use('layer', function(){
				  var layer = layui.layer; //获取弹出按钮对象
				  layer.open({
					  title:false, 				//title:''+e+'区的数据',
					  area: ['1010px', '583px'],   //页面高宽
					  shade: [0.8, '#393D49'],    //背景元素
					  shadeClose:true,            //点击页面区域外关闭弹窗
					  type: 2,					//弹框类型
					  //maxmin: true,                //是否显示最大化按钮
					  moveOut: true, 				//窗口拖动到外面
					  closeBtn:0,					//不显示关闭按钮
					  scrollbar:false,				//是否出现滚动条
					  content: ['${app_path}/gas/ac','no']
					  })
				}); 
		}else if(e == 'E315-1'){
			//加载弹出按钮
			layui.use('layer', function(){
				  var layer = layui.layer; //获取弹出按钮对象
				  layer.open({
					  title:false, 				//title:''+e+'区的数据',
					  area: ['1010px', '583px'],   //页面高宽
					  shade: [0.8, '#393D49'],    //背景元素
					  shadeClose:true,            //点击页面区域外关闭弹窗
					  type: 2,					//弹框类型
					  //maxmin: true,                //是否显示最大化按钮
					  moveOut: true, 				//窗口拖动到外面
					  closeBtn:0,					//不显示关闭按钮
					  scrollbar:false,				//是否出现滚动条
					  content: ['${app_path}/gas/e','no']
					  })
				}); 
		}
 	}
	</script>
	
	<script>
	
 	//编写动态的向表单中插入数据
	 $(function(){
		
		//获取a1的数据
		//getA1(43,23,0);
		//setInterval("",2000);
		getA1();
	}); 
	
	
	//局部刷新的ajax方法
	function getA1(){
		$.ajax({
			url:"${app_path}/gas/getTimeDate",
			type:"get",
			success:function(data){
				
				//获取到数据
				a1(data.map.list[6]);
				a2(data.map.list[5]);
				a3(data.map.list[4]);
				a4(data.map.list[3]);
				a5(data.map.list[2]);
				a6(data.map.list[1]);
				a7(data.map.list[0]);
			}
		});
	}
	
	function a1(r){
		var t = r.gtime;
		$("#a1Td").html(getMyDate(t));
		$("#a1").empty(); //添加内容前先删除之前添加的类容
		var H = $("<td></td>").append(r.ch4);  // 甲烷
		var C = $("<td></td>").append(r.o2);	//氧气
		var L = $("<td></td>").append(r.l);	//流量
		var y = $("<td></td>").append(r.pressure);
		var tr = $("<tr></tr>").append(H).append(C).append(L).append(y);
		tr.appendTo("#a1");
	}
	function a2(r){
		var t = r.gtime;
		$("#a2Td").html(getMyDate(t));
		$("#a2").empty(); //添加内容前先删除之前添加的类容
		var H = $("<td></td>").append(r.ch4);
		var C = $("<td></td>").append(r.o2);
		var L = $("<td></td>").append(r.l);
		var y = $("<td></td>").append(r.pressure);
		var tr = $("<tr></tr>").append(H).append(C).append(L).append(y);
		tr.appendTo("#a2");
	}
	function a3(r){
		var t = r.gtime;
		$("#a3Td").html(getMyDate(t));
		$("#a3").empty(); //添加内容前先删除之前添加的类容
		var H = $("<td></td>").append(r.ch4);
		var C = $("<td></td>").append(r.o2);
		var L = $("<td></td>").append(r.l);
		var y = $("<td></td>").append(r.pressure);
		var tr = $("<tr></tr>").append(H).append(C).append(L).append(y);
		tr.appendTo("#a3");
	}
	function a4(r){
		var t = r.gtime;
		$("#a4Td").html(getMyDate(t));
		$("#a4").empty(); //添加内容前先删除之前添加的类容
		var H = $("<td></td>").append(r.ch4);
		var C = $("<td></td>").append(r.o2);
		var L = $("<td></td>").append(r.l);
		var y = $("<td></td>").append(r.pressure);
		var tr = $("<tr></tr>").append(H).append(C).append(L).append(y);
		tr.appendTo("#a4");
	}
	function a5(r){
		var t = r.gtime;
		$("#a5Td").html(getMyDate(t));
		$("#a5").empty(); //添加内容前先删除之前添加的类容
		var H = $("<td></td>").append(r.ch4);
		var C = $("<td></td>").append(r.o2);
		var L = $("<td></td>").append(r.l);
		var y = $("<td></td>").append(r.pressure);
		var tr = $("<tr></tr>").append(H).append(C).append(L).append(y);
		tr.appendTo("#a5");
	}
	function a6(r){
		var t = r.gtime;
		$("#a6Td").html(getMyDate(t));
		$("#a6").empty(); //添加内容前先删除之前添加的类容
		var H = $("<td></td>").append(r.ch4);
		var C = $("<td></td>").append(r.o2);
		var L = $("<td></td>").append(r.l);
		var y = $("<td></td>").append(r.pressure);
		var tr = $("<tr></tr>").append(H).append(C).append(L).append(y);
		tr.appendTo("#a6");
	}
	function a7(r){
		var t = r.gtime;
		$("#a7Td").html(getMyDate(t));
		$("#a7").empty(); //添加内容前先删除之前添加的类容
		var H = $("<td></td>").append(r.ch4);
		var C = $("<td></td>").append(r.o2);
		var L = $("<td></td>").append(r.l);
		var y = $("<td></td>").append(r.pressure);
		var tr = $("<tr></tr>").append(H).append(C).append(L).append(y);
		tr.appendTo("#a7");
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
        oTime = getzf(oMonth)+'-'+getzf(oDay)+'('+getzf(oHour) +':'+
				getzf(oMin) +':'+getzf(oSen)+')';//最后拼接时间
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
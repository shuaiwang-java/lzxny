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
<link rel="stylesheet" type="text/css" href="${app_path}/my/css/myCss.css">
<!-- select多选 -->
<script src="${app_path }/static/bootstrap/js/multiple-select.js"></script>
	<style type="text/css">
		body{
	 	 background:#fff url(${app_path}/img/e.png) no-repeat left top;
	 	 background-size:100%;
		}	
		a{
		position: absolute;
		color:red;
		}
		#div1{
            width: 0;
            height: 0;
            position: absolute;
            left: 0;
            top: 0;
            z-index:999;
            display:none;
        }
        table{
        	border-collapse:separate;
		  }
		table, td, th{
			border:0px;
		  	text-align:center;
		  }
	</style>
	<script>
        document.onmousemove=function(e){
            var div=document.getElementById("div1");
            div.style.left=(e.clientX+5)+"px";
            div.style.top=(e.clientY+5)+"px";
            
            var div1 = $("#div2"),div2 = $("#div1");
            var div1Width = div1.width(),
                div2Width = div2.width(),
                div1Height = div1.height(),
                div2Height = div2.height(),
                div1Left = div1.offset().left,
                div2Left = div2.offset().left,
                div1Top = div1.offset().top,
                div2Top = div2.offset().top,
                div1Right = div1Left+div1Width,
                div2Right = div2Left+div2Width,
                div1Bottom = div1Top+div1Height,
                div2Bottom = div2Top+div2Height;
            if(div2Right>div1Right){
            	div.style.left=((e.clientX+10)-237)+"px";
                div.style.top=(e.clientY+10)+"px";
            }
            if(div2Bottom>div1Bottom){
            	div.style.left=(e.clientX+10)+"px";
                div.style.top=((e.clientY+10)-163)+"px";
            }
            if(div2Right>div1Right && div2Bottom>div1Bottom){
            	div.style.left=((e.clientX-10)-237)+"px";
            	div.style.top=((e.clientY-10)-163)+"px";
            }
        }
    </script>	
</head>
<body>

	 <div id="div2" style="width:1010px;height:561px">
	 	<h3 style="color:#ffffff;margin-left:397px">E区气质情况</h3>
	 		<div style="width:306px">
		 	  	<button type="button" class="btn btn-default" onclick="pop()">查看所有数据</button>
			    <div class="input-group" style="width:54%;float:right;left: -22px">
			      <input type="text" class="form-control"  id="inputId" placeholder="查询编号位置">
			      <span class="input-group-btn">
			        <button class="btn btn-default" type="button" onclick="query()">查询</button>
			      </span>
			    </div>
	 		</div>
	 	<div class="layui-card" style="width:237px;height:161px" id="div1">
		  <div class="layui-card-header">编号: <span id="idName"></span>  </div>
			  <div class="layui-card-body">
			  	 <p><b>录入时间:</b><span id="dateId"></span> </p>
				 		<table class="table">
				 			<thead>
					 			<tr>
					 				<th>甲烷</th>
					 				<th>氧气</th>
					 				<th>流量</th>
					 				<th>压力</th>
					 			</tr>
				 			</thead>
				 			<tbody id="tbodyId"></tbody>    <!-- 格式 <tr> <td></td><td></td><td></td><td></td> </tr> -->
				 		</table>
			  </div>
		</div>                                     
	 	<a style="left:428px;top:308px" id="F1">&#927;</a>
	 	<a style="left:381px;top:303px" id="F2">&#927;</a>
	 	<a style="left:389px;top:379px" id="F3">&#927;</a>
	 	<a style="left:361px;top:362px" id="F4">&#927;</a>
	 	<a style="left:364px;top:398px" id="F5">&#927;</a>
	 	<a style="left:329px;top:398px" id="F6">&#927;</a>
	 	<a style="left:288px;top:382px" id="F7">&#927;</a>
	 	<a style="left:284px;top:410px" id="F8">&#927;</a>
	 	<a style="left:249px;top:406px" id="F9">&#927;</a>
	 	<a style="left:338px;top:447px" id="F12">&#927;</a>
	 	<a style="left:377px;top:467px" id="F13">&#927;</a>
	 	<a style="left:417px;top:409px" id="F14">&#927;</a>
	 	<a style="left:431px;top:446px" id="F15">&#927;</a>
	 	<a style="left:450px;top:404px" id="F16">&#927;</a>
	 	<a style="left:413px;top:343px" id="F250-2">&#927;</a>
	 	<a style="left:540px;top:212px" id="E160-1">&#927;</a>
	 	<a style="left:570px;top:186px" id="E23">&#927;</a>
	 	<a style="left:605px;top:173px" id="E21">&#927;</a>
	 	<a style="left:589px;top:203px" id="E22">&#927;</a>
	 	<a style="left:762px;top:185px" id="E9">&#927;</a>
	 	<a style="left:780px;top:217px" id="E10">&#927;</a>
	 	<a style="left:764px;top:228px" id="E250-4">&#927;</a>
	 	<a style="left:764px;top:241px" id="E250-3">&#927;</a>
	 	<a style="left:747px;top:247px" id="E11">&#927;</a>
	 	<a style="left:736px;top:293px" id="E12">&#927;</a>
	 	<a style="left:706px;top:279px" id="E13">&#927;</a>
	 	<a style="left:688px;top:337px" id="E15">&#927;</a>
	 	<a style="left:676px;top:309px" id="E14">&#927;</a>
	 	<a style="left:641px;top:351px" id="E20">&#927;</a>
	 	<a style="left:662px;top:410px" id="E19">&#927;</a>
	 	<a style="left:686px;top:419px" id="E17">&#927;</a>
	 	<a style="left:706px;top:423px" id="E16">&#927;</a>
	 	<a style="left:675px;top:443px" id="E18">&#927;</a>
	 	<a style="left:724px;top:371px" id="E8">&#927;</a>
	 	<a style="left:745px;top:382px" id="E7">&#927;</a>
	 	<a style="left:759px;top:327px" id="E6">&#927;</a>
	 	<a style="left:781px;top:341px" id="E5">&#927;</a>
	 	<a style="left:799px;top:281px" id="E4">&#927;</a>
	 	<a style="left:829px;top:261px" id="E250-1">&#927;</a>
	 	<a style="left:831px;top:250px" id="E250-2">&#927;</a>
	 	<a style="left:842px;top:255px" id="E3">&#927;</a>
	 	<a style="left:822px;top:237px" id="E2">&#927;</a>
	 	<a style="left:845px;top:206px" id="E1">&#927;</a>
	 	<a style="left:861px;top:265px" id="E315-3">&#927;</a>
	 	<a style="left:758px;top:451px" id="E315-2">&#927;</a>
	 	<a style="left:700px;top:541px" id="E315-1">&#927;</a>
	 </div>
	 
	 <script type="text/javascript">
	 
	 
	 $("#F1,#F2,#F3,#F4,#F5,#F6,#F7,#F8,#F9,#F12,#F13,#F14,#F15,#F16,#F250-2,#E160-1,#E23,#E21,#E22,#E9,#E10,#E250-4,#E250-3,#E11,#E12,#E13,#E15,#E14,#E20,#E19,#E17,#E16,#E18,#E8,#E7,#E6,#E5,#E4,#E250-1,#E250-2,#E3,#E2,#E1,#E315-3,#E315-2,#E315-1").hover(
			 
	    function(){
	    	var s =  $(this).attr("id");
      		document.getElementById("div1").style.display="inline-block";
      		$("#idName").text(s);
      		
      		//动态请求数据
      		$.ajax({
      			url:"${app_path}/gas/getGasByName",
      			data:"wname="+s,
      			type:"GET",
      			success:function(data){
      				var Gas = data.map.Gas;
      				if(data.code == 0 ){
      					//将时间转换
	      				var date =  getMyDate(Gas.gtime);  
	      				//渲染时间
	      				$("#dateId").text(date);
	      				//获取到数据将数据渲染到表格中
	      				var td1 = $("<td></td>").append(Gas.ch4);   
	      				var td2 = $("<td></td>").append(Gas.o2);   
	      				var td3 = $("<td></td>").append(Gas.l);   
	      				var td4 = $("<td></td>").append(Gas.pressure); 
	      				
	      				$("<tr></tr>").append(td1)
	      							  .append(td2)
	      							  .append(td3)
									  .append(td4)
									  .appendTo("#tbodyId");
      				}else{
      					$("#dateId").text("数据获取失败！");
      				}
      				
      			}
      		})
		},function(){
			document.getElementById("div1").style.display="none";
			$("#tbodyId").empty();
			$("#dateId").empty();
			
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
	         oTime = oYear +'-'+ getzf(oMonth) +'-'+ getzf(oDay) +' '+ getzf(oHour) +':'+
						getzf(oMin) +':'+getzf(oSen);//最后拼接时间
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
	 
	 <script>
		//这是弹出层的js
		function pop(){
			//加载弹出按钮
			layui.use('layer', function(){
				  var layer = layui.layer; //获取弹出按钮对象
				  layer.open({
					  title:'E区数据', 				//页面标题,
					  area: ['800px', '483px'],   //页面高宽
					  shade: [0],    //遮罩
					  shadeClose:true,            //点击页面区域外关闭弹窗
					  type: 2,					//弹框类型
					  maxmin: true,               
					  moveOut: true, 				//窗口拖动到外面
					  closeBtn:1,					//不显示关闭按钮
					  scrollbar:true,				//是否出现滚动条
					  content: ['${app_path}/gas/eTable','no']   //跳转到表格
					  })
				}); 
	 	}
		
		function  query(){
			var id = $("#inputId").val();
			var div = document.getElementById(id);
			if(div == null){
				layui.use('layer', function(){
					  var layer = layui.layer;
					  layer.msg('没找到编号,请重新输入。');
					});
			}else{
			var img = "<img src='${app_path}/img/bj.png'>";
			$(div).append(img);
			}
		}		
	 </script>
</body>
</html>
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
	 	 background:#fff url(${app_path}/img/ac-1.png) no-repeat left top;
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
	 	<h3 style="color:#ffffff;margin-left:397px">AC区气质情况</h3>
	 	
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
	 	<a style="left:417px;top:529px" id="AC315">&#927;</a>
	 	<a style="left:440px;top:544px" id="F250-1">&#927;</a>
	 	<a style="left:651px;top:455px" id="F21">&#927;</a>
	 	<a style="left:696px;top:460px" id="F20">&#927;</a>
	 	<a style="left:747px;top:457px" id="F19">&#927;</a>
	 	<a style="left:793px;top:457px" id="F18">&#927;</a>
	 	<a style="left:841px;top:458px" id="F17">&#927;</a>
	 	<a style="left:701px;top:377px" id="F11">&#927;</a>
	 	<a style="left:689px;top:348px" id="F10">&#927;</a>
	 	<a style="left:568px;top:345px" id="AC160-5">&#927;</a>
	 	<a style="left:502px;top:355px" id="AC160-4">&#927;</a>
	 	<a style="left:425px;top:351px" id="AC160-3">&#927;</a>
	 	<a style="left:375px;top:351px" id="AC160-2">&#927;</a>
	 	<a style="left:333px;top:360px" id="AC160-1">&#927;</a>
	 	<a style="left:352px;top:377px" id="AC1">&#927;</a>
	 	<a style="left:335px;top:331px" id="AC2">&#927;</a>
	 	<a style="left:325px;top:298px" id="AC3">&#927;</a>
	 	<a style="left:301px;top:229px" id="AC4">&#927;</a>
	 	<a style="left:283px;top:177px" id="AC5">&#927;</a>
	 	<a style="left:345px;top:146px" id="AC9">&#927;</a>
	 	<a style="left:358px;top:189px" id="AC8">&#927;</a>
	 	<a style="left:373px;top:234px" id="AC7">&#927;</a>
	 	<a style="left:387px;top:287px" id="AC6">&#927;</a>
	 	<a style="left:441px;top:282px" id="AC10">&#927;</a>
	 	<a style="left:432px;top:241px" id="AC11">&#927;</a>
	 	<a style="left:423px;top:198px" id="AC12">&#927;</a>
	 	<a style="left:418px;top:166px" id="AC13">&#927;</a>
	 	<a style="left:413px;top:121px" id="AC14">&#927;</a>
	 	<a style="left:538px;top:169px" id="AC18">&#927;</a>
	 	<a style="left:534px;top:217px" id="AC17">&#927;</a>
	 	<a style="left:534px;top:270px" id="AC16">&#927;</a>
	 	<a style="left:537px;top:316px" id="AC15">&#927;</a>
	 	<a style="left:594px;top:310px" id="AC19">&#927;</a>
	 	<a style="left:596px;top:279px" id="AC20">&#927;</a>
	 	<a style="left:603px;top:196px" id="AC21">&#927;</a>
	 	<a style="left:606px;top:173px" id="AC22">&#927;</a>
	 </div>
	 
	 <script type="text/javascript">
	 
	 
	 $("#AC315,#F250-1,#F21,#F20,#F19,#F18,#F17,#F11,#F10,#AC160-5,#AC160-4,#AC160-3,#AC160-2,#AC160-1,#AC1,#AC2,#AC3,#AC4,#AC5,#AC9,#AC8,#AC7,#AC6,#AC10,#AC11,#AC12,#AC13,#AC14,#AC18,#AC17,#AC16,#AC15,#AC19,#AC20,#AC21,#AC22").hover(
			 
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
					  title:'A区数据', 				//页面标题,
					  area: ['800px', '483px'],   //页面高宽
					  shade: [0],    //遮罩
					  shadeClose:true,            //点击页面区域外关闭弹窗
					  type: 2,					//弹框类型
					  maxmin: true,               
					  moveOut: true, 				//窗口拖动到外面
					  closeBtn:1,					//不显示关闭按钮
					  scrollbar:true,				//是否出现滚动条
					  content: ['${app_path}/gas/acTable','no']   //跳转到表格
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
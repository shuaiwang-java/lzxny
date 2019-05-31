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
	 	 background:#fff url(${app_path}/img/b-3.png) no-repeat left top;
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
            	div.style.left=((e.clientX+5)-237)+"px";
                div.style.top=(e.clientY+5)+"px";
            }
            if(div2Bottom>div1Bottom){
            	div.style.left=(e.clientX+5)+"px";
                div.style.top=((e.clientY+5)-163)+"px";
            }
            
        }
    </script>	
</head>
<body>

	 <div id="div2" style="width:1010px;height:561px">
	 	<h3 style="color:#ffffff;text-align:center">B区气质情况</h3>
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
	 	
	 	
	 	<a style="left:62px;top:281px" id="B160-1">&#927;</a>
	 	<a style="left:51px;top:347px" id="BP21">&#927;</a>
	 	<a style="left:115px;top:344px" id="BP22">&#927;</a>
	 	<a style="left:127px;top:317px" id="B31">&#927;</a>
	 	<a style="left:149px;top:363px" id="B30">&#927;</a>
	 	<a style="left:126px;top:429px" id="BP23">&#927;</a>
	 	<a style="left:168px;top:407px" id="BP24">&#927;</a>
	 	<a style="left:205px;top:384px" id="BP25">&#927;</a>
	 	<a style="left:245px;top:362px" id="BP26">&#927;</a>
	 	<a style="left:290px;top:244px" id="B160-2">&#927;</a>
	 	<a style="left:284px;top:341px" id="BP27">&#927;</a>
	 	<a style="left:312px;top:326px" id="BP28">&#927;</a>
	 	<a style="left:339px;top:361px" id="BP33">&#927;</a>
	 	<a style="left:297px;top:388px" id="BP32">&#927;</a>
	 	<a style="left:259px;top:410px" id="BP31">&#927;</a>
	 	<a style="left:221px;top:437px" id="BP30">&#927;</a>
	 	<a style="left:182px;top:460px" id="BP29">&#927;</a>
	 	<a style="left:192px;top:501px" id="BP35">&#927;</a>
	 	<a style="left:257px;top:459px" id="BP36">&#927;</a>
	 	<a style="left:325px;top:421px" id="BP37">&#927;</a>
	 	<a style="left:389px;top:387px" id="BP38">&#927;</a>
	 	<a style="left:377px;top:338px" id="BP34">&#927;</a>
	 	<a style="left:369px;top:325px" id="B250-1">&#927;</a>
	 	<a style="left:522px;top:229px" id="B160-3">&#927;</a>
	 	<a style="left:488px;top:245px" id="BP42">&#927;</a>
	 	<a style="left:501px;top:271px" id="BP41">&#927;</a>
	 	<a style="left:501px;top:307px" id="BP40">&#927;</a>
	 	<a style="left:459px;top:337px" id="BP39">&#927;</a>
	 	<a style="left:545px;top:214px" id="B250-2">&#927;</a>
	 	<a style="left:574px;top:219px" id="B160-4">&#927;</a>
	 	<a style="left:637px;top:197px" id="B160-5">&#927;</a>
	 	<a style="left:731px;top:167px" id="B160-6">&#927;</a>
	 	<a style="left:825px;top:122px" id="B160-7">&#927;</a>
	 	<a style="left:821px;top:159px" id="B160-7-4">&#927;</a>
	 	<a style="left:850px;top:146px" id="B160-7-3">&#927;</a>
	 	<a style="left:856px;top:114px" id="B160-7-2">&#927;</a>
	 	<a style="left:875px;top:94px" id="B56">&#927;</a>
	 	<a style="left:810px;top:128px" id="B160-7-1">&#927;</a>
	 	<a style="left:766px;top:189px" id="B160-6-3">&#927;</a>
	 	<a style="left:729px;top:214px" id="B160-6-4">&#927;</a>
	 	<a style="left:707px;top:189px" id="B160-6-2">&#927;</a>
	 	<a style="left:714px;top:162px" id="B160-6-1">&#927;</a>
	 	<a style="left:624px;top:187px" id="B160-5-1">&#927;</a>
	 	<a style="left:665px;top:217px" id="B160-5-2">&#927;</a>
	 	<a style="left:690px;top:237px" id="B160-5-3">&#927;</a>
	 	<a style="left:651px;top:261px" id="B160-5-4">&#927;</a>
	 	<a style="left:616px;top:261px" id="B160-4-2">&#927;</a>
	 	<a style="left:569px;top:274px" id="B160-4-1">&#927;</a>
	 	<a style="left:572px;top:304px" id="B160-4-3">&#927;</a>
	 	<a style="left:613px;top:281px" id="B160-4-4">&#927;</a>
	 	<a style="left:421px;top:393px" id="B16">&#927;</a>
	 	<a style="left:447px;top:381px" id="B17">&#927;</a>
	 	<a style="left:481px;top:367px" id="B18">&#927;</a>
	 	<a style="left:509px;top:353px" id="B19">&#927;</a>
	 	<a style="left:548px;top:335px" id="B20">&#927;</a>
	 	<a style="left:584px;top:318px" id="B21">&#927;</a>
	 	<a style="left:620px;top:302px" id="B22">&#927;</a>
	 	<a style="left:666px;top:281px" id="B23">&#927;</a>
	 	<a style="left:704px;top:263px" id="B24">&#927;</a>
	 	<a style="left:701px;top:277px" id="B160-8">&#927;</a>
	 	<a style="left:737px;top:246px" id="B25">&#927;</a>
	 	<a style="left:775px;top:229px" id="B26">&#927;</a>
	 	<a style="left:808px;top:212px" id="B27">&#927;</a>
	 	<a style="left:843px;top:196px" id="B28">&#927;</a>
	 	<a style="left:877px;top:183px" id="B29">&#927;</a>
	 	<a style="left:902px;top:209px" id="B15">&#927;</a>
	 	<a style="left:927px;top:188px" id="BP20">&#927;</a>
	 	<a style="left:857px;top:209px" id="BP19">&#927;</a>
	 	<a style="left:804px;top:235px" id="BP18">&#927;</a>
	 	<a style="left:865px;top:223px" id="B14">&#927;</a>
	 	<a style="left:829px;top:243px" id="B13">&#927;</a>
	 	<a style="left:787px;top:260px" id="B12">&#927;</a>
	 	<a style="left:751px;top:260px" id="BP17">&#927;</a>
	 	<a style="left:685px;top:291px" id="BP16">&#927;</a>
	 	<a style="left:630px;top:317px" id="BP15">&#927;</a>
	 	<a style="left:573px;top:343px" id="BP14">&#927;</a>
	 	<a style="left:517px;top:370px" id="BP13">&#927;</a>
	 	<a style="left:462px;top:396px" id="BP12">&#927;</a>
	 	<a style="left:433px;top:424px" id="B1">&#927;</a>
	 	<a style="left:462px;top:414px" id="B2">&#927;</a>
	 	<a style="left:502px;top:393px" id="B3">&#927;</a>
	 	<a style="left:531px;top:380px" id="B4">&#927;</a>
	 	<a style="left:564px;top:368px" id="B5">&#927;</a>
	 	<a style="left:544px;top:399px" id="BP2">&#927;</a>
	 	<a style="left:562px;top:381px" id="B160-10">&#927;</a>
	 	<a style="left:595px;top:351px" id="B6">&#927;</a>
	 	<a style="left:602px;top:368px" id="BP3">&#927;</a>
	 	<a style="left:829px;top:265px" id="BP8">&#927;</a>
	 	<a style="left:854px;top:265px" id="BP9">&#927;</a>
	 	<a style="left:874px;top:255px" id="BP10">&#927;</a>
	 	<a style="left:919px;top:244px" id="BP11">&#927;</a>
	 	<a style="left:760px;top:289px" id="BP6">&#927;</a>
	 	<a style="left:724px;top:294px" id="B10">&#927;</a>
	 	<a style="left:712px;top:306px" id="BP5">&#927;</a>
	 	<a style="left:687px;top:306px" id="B9">&#927;</a>
	 	<a style="left:656px;top:321px" id="B8">&#927;</a>
	 	<a style="left:652px;top:332px" id="BP4">&#927;</a>
	 	<a style="left:627px;top:334px" id="B7">&#927;</a>
	 	<a style="left:493px;top:405px" id="B160-9">&#927;</a>
	 	<a style="left:490px;top:423px" id="BP1">&#927;</a>
	 	<a style="left:548px;top:498px" id="CP3">&#927;</a>
	 	<a style="left:499px;top:513px" id="CP1">&#927;</a>
	 	<a style="left:507px;top:554px" id="CP2">&#927;</a>
	 	<a style="left:561px;top:540px" id="CP4">&#927;</a>
	 	<a style="left:622px;top:520px" id="CP5">&#927;</a>
	 	<a style="left:601px;top:466px" id="CP6">&#927;</a>
	 	<a style="left:639px;top:443px" id="CP7">&#927;</a>
	 	<a style="left:659px;top:482px" id="CP8">&#927;</a>
	 	<a style="left:684px;top:521px" id="CP9">&#927;</a>
	 </div>
	 
	 <script type="text/javascript">
	 
	 
	 $("#B160-1,#BP21,#B160-1,#BP21,#BP22,#B31,#B30,#BP23,#BP24,#BP25,#BP26,#B160-2,#BP27,#BP28,#BP33,#BP32,#BP31,#BP30,#BP29,#BP35,#BP36,#BP37,#BP38,#BP34,#B250-1,#B160-3,#BP42,#BP41,#BP40,#BP39,#B250-2,#B160-4,#B160-5,#B160-6,#B160-7,#B160-7-4,#B160-7-3,#B160-7-2,#B56,#B160-7-1,#B160-6-3,#B160-6-4,#B160-6-2,#B160-6-1,#B160-5-1,#B160-5-2,#B160-5-3,#B160-5-4,#B160-4-2,#B160-4-1,#B160-4-3,#B160-4-4,#B16,#B17,#B18,#B19,#B20,#B21,#B22,#B23,#B24,#B160-8,#B25,#B26,#B27,#B28,#B29,#B15,#BP20,#BP19,#BP18,#B14,#B13,#B12,#BP17,#BP16,#BP15,#BP14,#BP13,#BP12,#B1,#B2,#B3,#B4,#B5,#BP2,#B160-10,#B6,#BP3,#BP8,#BP9,#BP10,#BP11,#BP6,#B10,#BP5,#B9,#B8,#BP4,#B7,#B160-9,#BP1,#CP3,#CP1,#CP2,#CP4,#CP5,#CP6,#CP7,#CP8,#CP9").hover(
			 
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
					  title:'B区数据', 				//页面标题,
					  area: ['800px', '483px'],   //页面高宽
					  shade: [0],    //遮罩
					  shadeClose:true,            //点击页面区域外关闭弹窗
					  type: 2,					//弹框类型
					  maxmin: true,               
					  moveOut: true, 				//窗口拖动到外面
					  closeBtn:1,					//不显示关闭按钮
					  scrollbar:true,				//是否出现滚动条
					  content: ['${app_path}/gas/b1table','no']   //跳转到表格
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
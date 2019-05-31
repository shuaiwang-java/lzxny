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
	 	 background:#fff url(${app_path}/img/a1-3.png) no-repeat left top;
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
	 	<h3 style="color:#ffffff;margin-left:397px">A区气质情况</h3>
	 	
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
	 	<a style="left:783px;top:488px" id="A3">&#927;</a>
	 	<a style="left:808px;top:461px" id="A6">&#927;</a>
	 	<a style="left:828px;top:440px" id="A10">&#927;</a>
	 	<a style="left:857px;top:411px" id="A14">&#927;</a>
	 	<a style="left:885px;top:388px" id="A17">&#927;</a>
	 	<a style="left:856px;top:364px" id="A18">&#927;</a>
	 	<a style="left:834px;top:385px" id="A15">&#927;</a>
	 	<a style="left:809px;top:409px" id="A12">&#927;</a>
	 	<a style="left:785px;top:435px" id="A8">&#927;</a>
	 	<a style="left:760px;top:461px" id="A5">&#927;</a>
	 	<a style="left:734px;top:487px" id="A2">&#927;</a>
	 	<a style="left:689px;top:488px" id="A1">&#927;</a>
	 	<a style="left:714px;top:462px" id="A4">&#927;</a>
	 	<a style="left:737px;top:438px" id="A7">&#927;</a>
	 	<a style="left:756px;top:417px" id="A9">&#927;</a>
	 	<a style="left:774px;top:400px" id="A11">&#927;</a>
	 	<a style="left:790px;top:384px" id="A13">&#927;</a>
	 	<a style="left:811px;top:363px" id="A16">&#927;</a>
	 	<a style="left:789px;top:333px" id="A32">&#927;</a>
	 	<a style="left:767px;top:356px" id="A30">&#927;</a>
	 	<a style="left:737px;top:391px" id="A28">&#927;</a>
	 	<a style="left:713px;top:416px" id="A26">&#927;</a>
	 	<a style="left:691px;top:440px" id="A24">&#927;</a>
	 	<a style="left:671px;top:461px" id="A22">&#927;</a>
	 	<a style="left:649px;top:484px" id="A20">&#927;</a>
	 	<a style="left:609px;top:479px" id="A19">&#927;</a>
	 	<a style="left:624px;top:462px" id="A21">&#927;</a>
	 	<a style="left:632px;top:439px" id="A23">&#927;</a>
	 	<a style="left:667px;top:418px" id="A25">&#927;</a>
	 	<a style="left:690px;top:393px" id="A27">&#927;</a>
	 	<a style="left:719px;top:368px" id="A29">&#927;</a>
	 	<a style="left:752px;top:333px" id="A31">&#927;</a>
	 	<a style="left:768px;top:312px" id="A33">&#927;</a>
	 	<a style="left:843px;top:237px" id="A34">&#927;</a>
	 	<a style="left:863px;top:223px" id="A35">&#927;</a>
	 	<a style="left:837px;top:206px" id="A45">&#927;</a>
	 	<a style="left:814px;top:221px" id="A43">&#927;</a>
	 	<a style="left:738px;top:306px" id="A39">&#927;</a>
	 	<a style="left:725px;top:322px" id="A38">&#927;</a>
	 	<a style="left:697px;top:345px" id="A37">&#927;</a>
	 	<a style="left:673px;top:369px" id="A36">&#927;</a>
	 	<a style="left:701px;top:297px" id="A40">&#927;</a>
	 	<a style="left:719px;top:282px" id="A41">&#927;</a>
	 	<a style="left:788px;top:206px" id="A42">&#927;</a>
	 	<a style="left:807px;top:190px" id="A44">&#927;</a>
	 	<a style="left:782px;top:171px" id="A67">&#927;</a>
	 	<a style="left:759px;top:190px" id="A65">&#927;</a>
	 	<a style="left:694px;top:264px" id="A63">&#927;</a>
	 	<a style="left:671px;top:288px" id="A61">&#927;</a>
	 	<a style="left:668px;top:310px" id="A59">&#927;</a>
	 	<a style="left:657px;top:332px" id="A57">&#927;</a>
	 	<a style="left:645px;top:355px" id="A55">&#927;</a>
	 	<a style="left:634px;top:377px" id="A53">&#927;</a>
	 	<a style="left:621px;top:400px" id="A51">&#927;</a>
	 	<a style="left:612px;top:421px" id="A49">&#927;</a>
	 	<a style="left:596px;top:440px" id="A47">&#927;</a>
	 	<a style="left:583px;top:460px" id="A46">&#927;</a>
	 	<a style="left:577px;top:426px" id="A48">&#927;</a>
	 	<a style="left:583px;top:404px" id="A50">&#927;</a>
	 	<a style="left:598px;top:381px" id="A52">&#927;</a>
	 	<a style="left:609px;top:359px" id="A54">&#927;</a>
	 	<a style="left:617px;top:336px" id="A56">&#927;</a>
	 	<a style="left:636px;top:317px" id="A58">&#927;</a>
	 	<a style="left:634px;top:289px" id="A60">&#927;</a>
	 	<a style="left:648px;top:265px" id="A62">&#927;</a>
	 	<a style="left:732px;top:174px" id="A64">&#927;</a>
	 	<a style="left:760px;top:155px" id="A66">&#927;</a>
	 	<a style="left:460px;top:415px" id="A68">&#927;</a>
	 	<a style="left:468px;top:394px" id="A70">&#927;</a>
	 	<a style="left:484px;top:375px" id="A72">&#927;</a>
	 	<a style="left:512px;top:308px" id="A75">&#927;</a>
	 	<a style="left:526px;top:286px" id="A77">&#927;</a>
	 	<a style="left:543px;top:265px" id="A79">&#927;</a>
	 	<a style="left:556px;top:243px" id="A81">&#927;</a>
	 	<a style="left:568px;top:222px" id="A83">&#927;</a>
	 	<a style="left:589px;top:205px" id="A85">&#927;</a>
	 	<a style="left:612px;top:189px" id="A87">&#927;</a>
	 	<a style="left:633px;top:173px" id="A89">&#927;</a>
	 	<a style="left:662px;top:151px" id="A91">&#927;</a>
	 	<a style="left:702px;top:158px" id="A93">&#927;</a>
	 	<a style="left:687px;top:135px" id="A94">&#927;</a>
	 	<a style="left:730px;top:139px" id="A95">&#927;</a>
	 	<a style="left:708px;top:117px" id="A96">&#927;</a>
	 	<a style="left:732px;top:100px" id="A98">&#927;</a>
	 	<a style="left:700px;top:88px " id="A99">&#927;</a>
	 	<a style="left:672px;top:109px" id="A97">&#927;</a>
	 	<a style="left:641px;top:129px" id="A92">&#927;</a>
	 	<a style="left:603px;top:158px" id="A90">&#927;</a>
	 	<a style="left:581px;top:175px" id="A88">&#927;</a>
	 	<a style="left:562px;top:190px" id="A86">&#927;</a>
	 	<a style="left:540px;top:208px" id="A84">&#927;</a>
	 	<a style="left:524px;top:230px" id="A82">&#927;</a>
	 	<a style="left:510px;top:251px" id="A80">&#927;</a>
	 	<a style="left:494px;top:274px" id="A78">&#927;</a>
	 	<a style="left:481px;top:295px" id="A76">&#927;</a>
	 	<a style="left:475px;top:338px" id="A74">&#927;</a>
	 	<a style="left:445px;top:358px" id="A73">&#927;</a>
	 	<a style="left:437px;top:380px" id="A71">&#927;</a>
	 	<a style="left:432px;top:401px" id="A69">&#927;</a>
	 	<a style="left:383px;top:372px" id="A101">&#927;</a>
	 	<a style="left:416px;top:346px" id="A103">&#927;</a>
	 	<a style="left:447px;top:323px" id="A104">&#927;</a>
	 	<a style="left:419px;top:310px" id="A105">&#927;</a>
	 	<a style="left:388px;top:336px" id="A102">&#927;</a>
	 	<a style="left:359px;top:357px" id="A100">&#927;</a>
	 	<a style="left:335px;top:340px" id="A107">&#927;</a>
	 	<a style="left:356px;top:323px" id="A109">&#927;</a>
	 	<a style="left:387px;top:298px" id="A111">&#927;</a>
	 	<a style="left:442px;top:275px" id="A113">&#927;</a>
	 	<a style="left:460px;top:253px" id="A115">&#927;</a>
	 	<a style="left:488px;top:227px" id="A117">&#927;</a>
	 	<a style="left:499px;top:208px" id="A118">&#927;</a>
	 	<a style="left:518px;top:188px" id="A120">&#927;</a>
	 	<a style="left:546px;top:171px" id="A122">&#927;</a>
	 	<a style="left:558px;top:157px" id="A125">&#927;</a>
	 	<a style="left:572px;top:141px" id="A127">&#927;</a>
	 	<a style="left:615px;top:112px" id="A131">&#927;</a>
	 	<a style="left:640px;top:96px"  id="A133">&#927;</a>
	 	<a style="left:661px;top:81px"  id="A135">&#927;</a>
	 	<a style="left:681px;top:65px"  id="A137">&#927;</a>
	 	<a style="left:652px;top:49px"  id="A136">&#927;</a>
	 	<a style="left:629px;top:63px"  id="A134">&#927;</a>
	 	<a style="left:611px;top:78px"  id="A132">&#927;</a>
	 	<a style="left:590px;top:97px"  id="A130">&#927;</a>
	 	<a style="left:549px;top:124px" id="A129">&#927;</a>
	 	<a style="left:520px;top:130px" id="A128">&#927;</a>
	 	<a style="left:536px;top:142px" id="A126">&#927;</a>
	 	<a style="left:508px;top:147px" id="A124">&#927;</a>
	 	<a style="left:526px;top:158px" id="A123">&#927;</a>
	 	<a style="left:492px;top:170px" id="A121">&#927;</a>
	 	<a style="left:471px;top:190px" id="A119">&#927;</a>
	 	<a style="left:451px;top:208px" id="A116">&#927;</a>
	 	<a style="left:426px;top:235px" id="A114">&#927;</a>
	 	<a style="left:407px;top:260px" id="A112">&#927;</a>
	 	<a style="left:364px;top:286px" id="A110">&#927;</a>
	 	<a style="left:335px;top:311px" id="A108">&#927;</a>
	 	<a style="left:312px;top:328px" id="A106">&#927;</a>
	 	<a style="left:269px;top:328px" id="A139">&#927;</a>
	 	<a style="left:290px;top:313px" id="A140">&#927;</a>
	 	<a style="left:310px;top:297px" id="A143">&#927;</a>
	 	<a style="left:373px;top:241px" id="A145">&#927;</a>
	 	<a style="left:394px;top:220px" id="A146">&#927;</a>
	 	<a style="left:421px;top:193px" id="A147">&#927;</a>
	 	<a style="left:443px;top:174px" id="A148">&#927;</a>
	 	<a style="left:465px;top:154px" id="A149">&#927;</a>
	 	<a style="left:487px;top:135px" id="A150">&#927;</a>
	 	<a style="left:502px;top:120px" id="A151">&#927;</a>
	 	<a style="left:524px;top:105px" id="A152">&#927;</a>
	 	<a style="left:561px;top:79px"  id="A155">&#927;</a>
	 	<a style="left:579px;top:64px"  id="A157">&#927;</a>
	 	<a style="left:601px;top:49px"  id="A159">&#927;</a>
	 	<a style="left:618px;top:33px"  id="A160">&#927;</a>
	 	<a style="left:585px;top:21px"  id="A161">&#927;</a>
	 	<a style="left:564px;top:38px"  id="A158">&#927;</a>
	 	<a style="left:542px;top:54px"  id="A156">&#927;</a>
	 	<a style="left:520px;top:71px"  id="A154">&#927;</a>
	 	<a style="left:495px;top:89px"  id="A153">&#927;</a>
	 	<a style="left:285px;top:282px" id="A144">&#927;</a>
	 	<a style="left:263px;top:299px" id="A142">&#927;</a>
	 	<a style="left:242px;top:317px" id="A138">&#927;</a>
	 	<a style="left:235px;top:288px" id="A161">&#927;</a>
	 	<a style="left:257px;top:271px" id="A162">&#927;</a>
	 	<a style="left:228px;top:256px" id="A163">&#927;</a>
	 	<a style="left:215px;top:268px" id="A164">&#927;</a>
	 	<a style="left:206px;top:285px" id="A165">&#927;</a>
	 	<a style="left:216px;top:304px" id="A250-9">&#927;</a>
	 	<a style="left:252px;top:329px" id="A250-8">&#927;</a>
	 	<a style="left:291px;top:348px" id="A250-7">&#927;</a>
	 	<a style="left:336px;top:369px" id="A250-6">&#927;</a>
	 	<a style="left:442px;top:431px" id="A250-5">&#927;</a>
	 	<a style="left:535px;top:508px" id="A250-4">&#927;</a>
	 	<a style="left:566px;top:512px" id="A250-3">&#927;</a>
	 	<a style="left:602px;top:517px" id="A250-2">&#927;</a>
	 	<a style="left:690px;top:530px" id="A250-1">&#927;</a>
	 </div>
	 
	 <script type="text/javascript">
	 
	 
	 $("#A3,#A6,#A10,#A14,#A17,#A18,#A15,#A12,#A8,#A5,#A2,#A1,#A4,#A7,#A9,#A11,#A13,#A16,#A32,#A30,#A28,#A26,#A24,#A22,#A20,#A19,#A21,#A23,#A25,#A27,#A29,#A31,#A33,#A34,#A35,#A45,#A43,#A39,#A38,#A37,#A36,#A40,#A41,#A42,#A44,#A67,#A65,#A63,#A61,#A59,#A57,#A55,#A53,#A51,#A49,#A47,#A46,#A48,#A50,#A52,#A54,#A56,#A58,#A60,#A62,#A64,#A66,#A68,#A70,#A72,#A75,#A77,#A79,#A81,#A83,#A85,#A87,#A89,#A91,#A93,#A94,#A95,#A96,#A98,#A99,#A97,#A92,#A90,#A88,#A86,#A84,#A82,#A80,#A78,#A76,#A74,#A73,#A71,#A69,#A101,#A103,#A104,#A105,#A102,#A100,#A107,#A109,#A111,#A113,#A115,#A117,#A118,#A120,#A122,#A125,#A127,#A131,#A133,#A135,#A137,#A136,#A134,#A132,#A130,#A129,#A128,#A126,#A124,#A123,#A121,#A119,#A116,#A114,#A112,#A110,#A108,#A106,#A139,#A140,#A143,#A145,#A146,#A147,#A148,#A149,#A150,#A151,#A152,#A155,#A157,#A159,#A160,#A161,#A158,#A156,#A154,#A153,#A144,#A142,#A138,#A161,#A162,#A163,#A164,#A165,#A250-9,#A250-8,#A250-7,#A250-6,#A250-5,#A250-4,#A250-3,#A250-2,#A250-1").hover(
			 
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
					  content: ['${app_path}/gas/aTable','no']   //跳转到表格
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
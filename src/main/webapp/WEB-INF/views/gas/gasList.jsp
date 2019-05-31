<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
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

<!-- select多选 -->
<link href="${app_path }/static/bootstrap/css/multiple-select.css" rel="stylesheet"/>
<script src="${app_path }/static/bootstrap/js/multiple-select.js"></script>


</head>
<body>

	<div class="x-body">
		<div class="container-fluid">
			<div class="row">
				<div class="col-xs-12 col-md-12">
					请选择要查询的时间段:
					<div class="layui-input-inline">
						<input type="text" class="layui-input" id="test16"
							placeholder="开始 到 结束">
					</div>
						请选择井编号:
					<select multiple="multiple">
						<c:forEach items="${wells}" var="well">
						<option value="${well.wname}">${well.wname}</option>
						</c:forEach>
				    </select>
				          <!--   请选择排序方式:
				    <label>
		                <input type="radio" name="type" id="adviceRadio1" value="1"  />
		                <span class="radio-name">甲烷</span>
		            </label>
		            <label>
		                <input type="radio" name="type" id="adviceRadio2" value="2" />
		                <span class="radio-name">二氧化碳</span>
		            </label> -->
				    
					<div class="layui-inline">
						<button class="layui-btn" onclick="seek()">确认</button>
					</div>
				</div>
			</div>

			<table class="layui-table" lay-skin="line" lay-even="" id="gastaticble">
				<colgroup>
					<col width="90">
					<col width="120">
					<col width="100">
					<col width="100">
					<col width="100">
					<col width="100">
					<col width="100">
					<col width="100">
					<col width="200">
					<col width="100">
				</colgroup>
				<thead>
					<tr>
						<th>Id</th>
						<th>井编号</th>
						<th>甲烷CH4<sub>%</sub></th>
						<th>二氧化碳CO2<sub>%</sub></th>
						<th>氧气O2<sub>%</sub></th>
						<th>H2S<sub>ppm</sub></th>
						<th>BAL<sub>%</sub></th>
						<th>压力<sub>Kpa</sub></th>
						<th>录入时间</th>
						<th>录入人员</th>
					</tr>
				</thead>
				<tbody>
				</tbody>
			</table>
			<!-- 分页页码信息 -->
			<div class="col-md-12" style="text-align: center" id="pageId"></div>
		</div>
	</div>
	
	<script>
        $("select").multipleSelect({
            width: 300,
            multiple: true,
            multipleWidth: 80
        });
    </script> 	
	
	<script type="text/javascript">
		$(function() {
			//分页查询(参数页码)
			to_page(1);
		});
		//ajax请求数据(获取查询的数据)
		function to_page(pn) {
			$.ajax({
				url : "${app_path}/gas/getGasList",
				data : "pn=" + pn,
				type : "get",
				success : function(data) {
					//调用展示全部数据的方法
					to_gas(data);
					//调用分页的方法
					to_pn(data);
				}
			});
		}
		//得到数据进行展示数据
		function to_gas(data) {
			//显示当前数据时先清空之前的数据
			$("#gastaticble tbody").empty();
			//获取到数据
			var gass = data.map.pageInfo.list;
			$.each(gass, function(index, gas) {
				//添加td标签
				var gasId = $("<td></td>").append(gas.gid);
				var gasName = $("<td></td>").append(gas.wname);
				var gasCH4 = $("<td></td>").append(gas.ch4);
				var gasCO2 = $("<td></td>").append(gas.co2);
				var gasO2 = $("<td></td>").append(gas.o2);
				var gasH2S = $("<td></td>").append(gas.h2s);
				var gasBAL = $("<td></td>").append(gas.bal);
				var gasPressure = $("<td></td>").append(gas.pressure);
				var gasTime = $("<td></td>").append(getMyDate(gas.gtime));
				var uName = $("<td></td>").append(gas.uname);
				$("<tr></tr>").append(gasId).append(gasName).append(gasCH4)
						.append(gasCO2).append(gasO2).append(gasH2S).append(
								gasBAL).append(gasPressure).append(gasTime)
						.append(uName).appendTo("#gastaticble tbody");
			})
			//日期格式化
			function getMyDate(str) {
				var oDate = new Date(str), oYear = oDate.getFullYear(), oMonth = oDate
						.getMonth() + 1, oDay = oDate.getDate(), oHour = oDate
						.getHours(), oMin = oDate.getMinutes(), oSen = oDate
						.getSeconds(), oTime = '(' + getzf(oHour) + ':'
						+ getzf(oMin) + ':' + getzf(oSen) + ')' + oYear + '年'
						+ getzf(oMonth) + '月' + getzf(oDay) + '日';//最后拼接时间
				return oTime;
			}
			;
			//补0操作
			function getzf(num) {
				if (parseInt(num) < 10) {
					num = '0' + num;
				}
				return num;
			}
		}
		//分页的方法
		function to_pn(data) {
			//显示当前数据时先清空之前的数据
			$("#pageId").empty();
			//得到分页条的数据
			//定义的ul
			var ul = $("<ul></ul>").addClass("pagination").append();
			//首页
			var pagesy = $("<li></li>").append(
					$("<a></a>").attr("href", "#").append("首页"));
			//上一页
			var pagela = $("<li></li>").append(
					$("<a></a>").attr("href", "#").append(
							$("<span></span>").append("&laquo;")));
			//判断是否有上一页，如果没有给li标签加上禁止点击的属性
			if (data.map.pageInfo.hasPreviousPage == false) {
				pagesy.addClass("disabled");
				pagela.addClass("disabled");
			} else {
				//给首页li标签添加点击事件和上一页添加点击事件
				pagesy.click(function() {
					to_page(1); //调用ajax方法并传入页码数
				});
				//上一页
				pagela.click(function() {
					to_page(data.map.pageInfo.pageNum - 1);
				});
			}
			//下一页
			var pagere = $("<li></li>").append(
					$("<a></a>").attr("href", "#").append(
							$("<span></span>").append("&raquo;")));
			//末页
			var pagemy = $("<li></li>").append(
					$("<a></a>").attr("href", "#").append("末页"));
			//判断是否有下一页，如果没有给li标签加上禁止点击的属性
			if (data.map.pageInfo.hasNextPage == false) {
				pagere.addClass("disabled");
				pagemy.addClass("disabled");
			} else {
				//给末页li标签添加点击事件和下一页添加点击事件
				pagere.click(function() {
					to_page(data.map.pageInfo.pageNum + 1);
				});
				pagemy.click(function() {
					to_page(data.map.pageInfo.pages);
				});
			}
			//ul中添加首页和上一页
			ul.append(pagesy).append(pagela);
			//数字页码
			$.each(data.map.pageInfo.navigatepageNums, function(index, item) {
				var pagesz = $("<li></li>").append(
						$("<a></a>").attr("href", "#").append(item));
				//判断是否为当前页
				if (data.map.pageInfo.pageNum == item) {
					pagesz.addClass("active");
				}
				//给pagesz  li标签添加一个点击事件,点击后请求to_page ajax请求方法
				pagesz.click(function() {
					to_page(item);
				});
				//ul中添加每页的数字
				ul.append(pagesz);
			});
			//ul中添加下一页和末页的数据
			ul.append(pagere).append(pagemy);
			var pagenav = $("<nav></nav>").append(ul); //把ul标签添加到nav标签中
			pagenav.appendTo("#pageId"); //把pagenav添加到id是page_nav的标签中
		}

		//点击确认按钮后通过时间查询的方法
		function seek() {
			$("#pageId").empty();
			
			//获取到时间的
			var dates = $("#test16").val();
			//获取到已经选择了的井编号
			var selectVal = $('select').multipleSelect('getSelects');
			//通过时间查询
			$.ajax({
				url : "${app_path}/gas/TimeGas",
				data : "pn=" + 1 + "&dates=" + dates +"&selectVal="+selectVal,
				type : "get",
				success : function(data) {    
					//调用展示全部数据的方法
					to_gas(data);
					$("#pageId").empty();
				}
			});
		}
	</script>
	<script>
		//时间选择框
		layui.use('laydate', function() {
			var laydate = layui.laydate;
			laydate.render({
				elem : '#test16',
				type : 'datetime',
				range : '到',
				format : 'yyyy年MM月dd日HH时mm分ss秒'
			});
		});
	</script>

</body>
</html>
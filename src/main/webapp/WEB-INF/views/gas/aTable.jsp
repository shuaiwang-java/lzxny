<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%	pageContext.setAttribute("app_path", request.getContextPath()); %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="http://cdn.datatables.net/1.10.13/css/jquery.dataTables.css">
<link rel="stylesheet" type="text/css" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css">
<link rel="stylesheet" type="text/css" href=" http://cdn.datatables.net/plug-ins/be7019ee387/integration/jqueryui/dataTables.jqueryui.css">
<!-- jQuery -->
<script type="text/javascript" charset="utf8" src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
<!-- DataTables -->
<script type="text/javascript" charset="utf8" src="http://cdn.datatables.net/1.10.13/js/jquery.dataTables.js"></script>
<style type="text/css">
	table>tbody>tr>td{
	        text-align:center;
	}
</style>
</head>
<body>
	<div style="width: 785px; height: 500px">
        <table id="example" class="display">
            <thead>
            <tr>
            	<th>编号</th>
                <th>甲烷</th>
                <th>氧气</th>
                <th>流量</th>
                <th>压力</th>
                <th>录入时间</th>
            </tr>
            </thead>
            <tbody id="tableId">
            </tbody>
        </table>
    </div>
	<!--初始化代码-->
	<script>
	    $(document).ready(function() {
	    	  $('#example').DataTable({
		            "scrollY": 330,
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
		            	url:'${app_path}/gas/getTableData',
		            	method: 'POST',
		            	data:{string:"A"}
		            },
	    	  		"columns":[
	    	  			{"data":"wname"},
	    	  		    {"data":"ch4"},
	    	  		    {"data":"o2"},
	    	  		    {"data":"l"},
	    	  		    {"data":"pressure"},
	    	  		    {"data":
	    	  		    	function(obj){
	    	  		    		return getMyDate(obj.gtime);
	    	  		    	}
	    	  		    }
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
</body>
</html>
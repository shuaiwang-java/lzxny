<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
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
</head>
<body>

        <script>

            window.onload = function(){

                selAll = document.getElementById("selAll");

                hobbys = document.getElementsByName("hobby");

                fx = document.getElementById("fx");

                 

                //全选事件

                selAll.onclick = function(){

                    //全选

                    if(selAll.checked == true){

                        for (var i=0;i<hobbys.length;i++) {

                            hobbys[i].checked = true;

                        }

                    }else{

                        for (var i=0;i<hobbys.length;i++) {

                            hobbys[i].checked = false;

                        }

                    }

                }

                 

                 

                //反选

                fx.onclick = function(){

                     

                    for (var i=0;i<hobbys.length;i++) {

                            var b = hobbys[i];

                            if(b.checked == true){

                                b.checked = false;

                            }else{

                                b.checked = true;

                            }

                        }

                }

                 

            }

             

             

             

        </script>

    </head>

    <body>

        <input type="checkbox" name="" id="selAll" />全选

        <button id="fx">反选</button>

        <br>

        <input type="checkbox" name="hobby" />篮球

        <input type="checkbox" name="hobby" />足球

        <input type="checkbox" name="hobby" />乒乓球

        <input type="checkbox" name="hobby" />羽毛球

    </body>

</html>

</body>
</html>
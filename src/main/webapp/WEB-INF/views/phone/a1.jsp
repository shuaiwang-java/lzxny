<!DOCTYPE HTML>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<html lang="zh-CN">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <!-- 获取当前项目路径 -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/jquery/jquery-3.2.1.min.js"></script>
    <!-- bootstrap核心样式 -->
    <link href="${pageContext.request.contextPath}/static/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- bootstrap  js -->
    <script src="${pageContext.request.contextPath}/static/bootstrap/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/custom/custom.js" ></script>
    <!-- 网页不能进行缩放 -->
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
</head>

<body  style="background-color: #FAFAFA">

    <div class="container">
        <div class="row">
            <div class="col-xs-12 col-md-12"><h1 class="text-center">气质录入</h1></div>
            <div class="col-xs-12 col-md-12">
                <form class="form-inline">
                    <div class="form-group">
                        <label for="a1">甲烷</label>
                        <input type="number" class="form-control" id="a1" placeholder="请输入甲烷值/CH4">
                    </div>
                    <div class="form-group">
                        <label for="a2">二氧化碳</label>
                        <input type="number" class="form-control" id="a2" placeholder="请输入二氧化碳/CO2">
                    </div>
                    <div class="form-group">
                        <label for="a3">氧气</label>
                        <input type="number" class="form-control" id="a3" placeholder="请输入氧气值/O2">
                    </div>
                    <div class="form-group">
                        <label for="a4">硫化氢</label>
                        <input type="number" class="form-control" id="a4" placeholder="请输入硫化氢/H2S">
                    </div>
                    <div class="form-group">
                        <label for="a5">Bal</label>
                        <input type="number" class="form-control" id="a5" placeholder="请输入Bal/Bal">
                    </div>
                    <div class="form-group">
                        <label for="a6">流量</label>
                        <input type="number" class="form-control" id="a6" placeholder="请输入流量值">
                    </div>
                    <div class="form-group">
                        <label for="a7">压力</label>
                        <input type="number" class="form-control" id="a7" placeholder="请输入压力值">
                    </div>
                    <p class="text-center"><button type="button" class="btn btn-primary btn-lg" onclick="but()">确定添加</button></p>
                </form>
            </div>
        </div>
    </div>

    <script>
        //点击确认按钮后
        function but(){

            //获取到值
            var ch4 = $("#a1").val();
            var co2 = $("#a2").val();
            var o2 = $("#a3").val();
            var h2s = $("#a4").val();
            var bal = $("#a5").val();
            var l = $("#a6").val();
            var kpa = $("#a7").val();
			
            var wname = '${name}';

            if(myJs.isnull(wname)){   //判断wname是否为空,为空返回true
                alert("录入数据失败,请重新扫码录入");
            }else if (myJs.isnull(ch4) || myJs.isnull(co2) || myJs.isnull(o2) || myJs.isnull(h2s) || myJs.isnull(bal) || myJs.isnull(l) || myJs.isnull(kpa)) {
                alert("请填写完整的数据");
            }else{
                //发送ajax请求
                $.ajax({
                    url:"${pageContext.request.contextPath}/gas/phoneAddGas",
                    data:"wname="+wname+"&ch4="+ch4+"&co2="+co2+"&o2="+o2+"&h2s="+h2s+"&bal="+bal+"&l="+l+"&pressure="+kpa,
                    type:"post",
                    success:function(data){
                        if(data.code == 0){
                        	alert("添加成功");
                        }else{
                            //表示失败
                            alert("添加失败!请重试");
                        }
                    }
                })
            }
        }
    </script>



</body>

</html>
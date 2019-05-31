<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<html>
<head>
	<meta charset="UTF-8">
	<title>成都绿州</title>
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=no, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
	<meta name="viewport" content="arget-densitydpi=1920,width=1080, initial-scale=1" />
    <link rel="icon" href="${pageContext.request.contextPath}/topjui/images/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/x-admin/css/font.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/x-admin/css/xadmin.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/jquery/jquery-3.2.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/x-admin/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/x-admin/js/xadmin.js"></script>
</head>

<body>

	<!-- 顶部开始 -->
    <div class="container">
        <div class="logo"><a href="#">绿州在线平台</a></div>
        <div class="left_open">
            <i title="展开关闭菜单" class="iconfont">&#xe699;</i>
        </div>
        <!-- 新增按钮 -->
        <ul class="layui-nav left fast-add" lay-filter="">
          <li class="layui-nav-item">
            <dl class="layui-nav-child"> <!-- 二级菜单 -->
              <dd><a onclick="x_admin_show('资讯','http://www.baidu.com')"><i class="iconfont">&#xe6a2;</i>资讯</a></dd>
              <dd><a onclick="x_admin_show('图片','http://www.baidu.com')"><i class="iconfont">&#xe6a8;</i>图片</a></dd>
               <dd><a onclick="x_admin_show('用户','http://www.baidu.com')"><i class="iconfont">&#xe6b8;</i>用户</a></dd>
            </dl>
          </li>
        </ul>
        <ul class="layui-nav right" lay-filter="">
          <li class="layui-nav-item">
            <a href="javascript:;">当前用户：${userName.uname}</a>
            <dl class="layui-nav-child"> <!-- 二级菜单 -->
              <dd><a onclick="x_admin_show('个人信息','${pageContext.request.contextPath}/user/getUser?uName=${userName.uname}','550','450')">个人信息</a></dd>
              <dd><a onclick="x_admin_show('密码修改','${pageContext.request.contextPath}/user/upatePwd?uName=${userName.uname}','550','450')">修改密码</a></dd>
              <dd><a href="${pageContext.request.contextPath}/login.jsp">退出</a></dd>
            </dl>
          </li>
          <li class="layui-nav-item to-index"><a href="http://chengdulvzhou.cn/lzxny.html">中控数据</a></li>
        </ul>
    </div>

    <!-- 顶部结束 -->
    <!-- 中部开始 -->
     <!-- 左侧菜单开始 -->
    <div class="left-nav">
      <div id="side-nav">
        <ul id="nav">
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6a2;</i>
                    <cite>成都数据表单</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${pageContext.request.contextPath}/data/yTable">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>预处理报表</cite>
                            
                        </a>
                    </li >
                    <li>
                        <a _href="${pageContext.request.contextPath}/data/jTable">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>发电机报表</cite>
                            
                        </a>
                    </li>
                </ul>
            </li>
 <!--            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6a2;</i>
                    <cite>重庆数据表单</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="order-list.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>预处理报表</cite>
                        </a>
                    </li >
                </ul>
                <ul class="sub-menu">
                    <li>
                        <a _href="order-list.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>发电机报表</cite>
                        </a>
                    </li >
                </ul>
            </li> -->
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6fc;</i>
                    <cite>气质数据</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
              <%--   
                <ul class="sub-menu">
                    <li>
                    <a href="${pageContext.request.contextPath}/gas/getGasPhoto">
                        <i class="iconfont">&#xe6a7;</i>
                         <cite>实时数据</cite>
                    </a>
                    </li >
                </ul> --%>
                
                <ul class="sub-menu">
                    <li>
                        <a _href="${pageContext.request.contextPath}/gas/getGasPhoto">
                            <i class="iconfont">&#xe6a7;</i>
                         <cite>实时数据</cite>
                        </a>
                    </li >
                </ul>
                
                
                <ul class="sub-menu">
                    <li>
                        <a _href="${pageContext.request.contextPath}/gas/getinsertGas">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>气质录入</cite>
                        </a>
                    </li >
                </ul>
                
                 <ul class="sub-menu">
                    <li>
                        <a _href="${pageContext.request.contextPath}/gas/gasList">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>历史气质数据</cite>
                        </a>
                    </li >
                </ul>
                
                 <ul class="sub-menu">
                    <li>
                        <a _href="${pageContext.request.contextPath}/gas/gasGraph">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>数据图形</cite>
                        </a>
                    </li >
                </ul>
                
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe820;</i>
                    <cite>视频系统</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${pageContext.request.contextPath}/vi/outVi">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>厂区户外视屏</cite>
                        </a>
                    </li >
                </ul>
                <ul class="sub-menu">
                    <li>
                        <a _href="${pageContext.request.contextPath}/vi/getDgi">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>无人机直播</cite>
                        </a>
                    </li >
                </ul>
                <ul class="sub-menu">
                    <li>
                        <a _href="${pageContext.request.contextPath}/find2.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>库区视屏</cite>
                        </a>
                    </li >
                </ul>
            </li>
            
             <!-- 电量预算  -->
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6ce;</i>
                    <cite>电量预算</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${pageContext.request.contextPath}/electricity/index">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>电量预算</cite>
                        </a>
                    </li >
                </ul>
            </li>
            
            <!-- 推送消息  -->
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe713;</i>
                    <cite>警报</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${pageContext.request.contextPath}/push/pushIndex">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>设置推送参数</cite>
                        </a>
                    </li >
                </ul>
            </li>
            
            <%-- <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe757;</i>
                    <cite>图形报表</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${pageContext.request.contextPath}/find2.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>气质图形</cite>
                        </a>
                    </li >
                </ul>
                <ul class="sub-menu">
                    <li>
                        <a _href="${pageContext.request.contextPath}/find2.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>预处理图形</cite>
                        </a>
                    </li >
                </ul>
                <ul class="sub-menu">
                    <li>
                        <a _href="${pageContext.request.contextPath}/find2.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>机组图形</cite>
                        </a>
                    </li >
                </ul>
            </li> --%>
            
             <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6f4;</i>
                    <cite>机组维护</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${pageContext.request.contextPath}/find2.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>机组维护录入</cite>
                        </a>
                    </li >
                </ul>
                <ul class="sub-menu">
                    <li>
                        <a _href="${pageContext.request.contextPath}/find2.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>机组维护报表</cite>
                        </a>
                    </li >
                </ul>
            </li>
            
             <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe83c;</i>
                    <cite>文件上传下载</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${pageContext.request.contextPath}/file/shareFile">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>共享文件</cite>
                        </a>
                    </li >
                </ul>
                <ul class="sub-menu">
                    <li>
                        <a _href="${pageContext.request.contextPath}/file/privateFile">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>个人文件</cite>
                        </a>
                    </li >
                </ul>
            </li>
            
            
            
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe726;</i>
                    <cite>账号管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${pageContext.request.contextPath}/user/list">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>账号列表</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="${pageContext.request.contextPath}/role/roleIndex1">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>职位管理</cite>
                        </a>
                    </li >
                   <%--  <li>
                        <a _href="${pageContext.request.contextPath}/per/perIndex">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>权限管理</cite>
                        </a>
                    </li > --%>
                </ul>
            </li>
            
            
            
           <%--  <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6ce;</i>
                    <cite>系统统计</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${pageContext.request.contextPath}/find2.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>拆线图</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="${pageContext.request.contextPath}/find2.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>柱状图</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="${pageContext.request.contextPath}/find2.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>地图</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="${pageContext.request.contextPath}/find2.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>饼图</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="${pageContext.request.contextPath}/find2.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>雷达图</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="${pageContext.request.contextPath}/find2.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>k线图</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="${pageContext.request.contextPath}/find2.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>热力图</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="${pageContext.request.contextPath}/find2.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>仪表图</cite>
                        </a>
                    </li>
                </ul>
            </li> --%>
           <%--  <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6b4;</i>
                    <cite>图标字体</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${pageContext.request.contextPath}/find2.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>图标对应字体</cite>
                        </a>
                    </li>
                </ul>
            </li> --%>
        </ul>
      </div>
    </div>
    <!-- <div class="x-slide_left"></div> -->
    <!-- 左侧菜单结束 -->
    <!-- 右侧主体开始 -->
    <div class="page-content">
        <div class="layui-tab tab" lay-filter="xbs_tab" lay-allowclose="false">
          <ul class="layui-tab-title">
            <li class="home"><i class="layui-icon">&#xe68e;</i>我的桌面</li>
          </ul>
          <div class="layui-tab-content">
            <div class="layui-tab-item layui-show">
                <iframe src='${pageContext.request.contextPath}/index/getIndex' frameborder="0" scrolling="yes" class="x-iframe"></iframe>
            </div>
          </div>
        </div>
    </div>
     <div class="page-content-bg"></div> 
</body>
</html>
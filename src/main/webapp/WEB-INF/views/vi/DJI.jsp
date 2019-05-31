<!DOCTYPE HTML>
<%@ page language="java" contentType="text/html; charset=utf-8"	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<% pageContext.setAttribute("app_path", request.getContextPath());%>
	<script src="http://cdn.jsdelivr.net/npm/xgplayer/browser/index.js" charset="utf-8"></script>
    <script src="http://cdn.jsdelivr.net/npm/xgplayer-flv.js/browser/index.js" charset="utf-8"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/jquery/jquery-3.2.1.min.js"></script>
    <style>
        div.mse{
            float: left;
            margin-left: 20px;
            margin-top: 20px;
        }
        div.mse1{
            border-style: groove; /*显示边框*/
            position:absolute;
            left: 929px;
            top: 824px;
            float: left;
            width: 355px;
            height: 445px;
            overflow:auto;    /*出现滚动条 */
        }
    </style>
</head>
<body>

	<iframe   src="http://slive.applinzi.com/?channel=a10a28153046f94a071c19cc1e1f5079#/live/play" width="1080px" height="550px" frameborder="0" scrolling="no">   
	</iframe>
	
	<hr>
	<h1>无人机直播使用教程</h1>
	<p>1.DJI GO连接好无人机后在直播平台里面选择rtmp自定义直播</p>
	<p>2.复制<u>rtmp://live1.sinacloud.com/publish/a10a28153046f94a071c19cc1e1f5079</u>地址到rtmp自定义，开始直播。<font size="2" color="red">观看直播时需要打开游览器的Flash。</font></p>
	<hr>
		
	<h2><b>历史飞行记录</b></h2>
    <div style="height: 600px;">
    <!--这是播放器-->
        <div id="mse" class="mse"></div>
        <div class="mse1" align="center" id="mse1">
             <!-- <p><u><a href="javascript:void(0)" onclick="d1()"><li>2018-11-12 视屏</li></a></u></p> -->
        </div>
    </div>

    <script type="text/javascript">
      //页面加载时刷新历史播放记录列表
	 	$(function(){
	 		//发起ajax请求查询数据
    		$.ajax({
    			url:"${app_path}/video/getName",
    			type:"get",
    			success:function(data){
    				//调用向页面添加内容的方法
    				t_appData(data);
    			}
    		});
		}); 
    	//后端数据添加到页面
    	function t_appData(data){
    		//请求成功时
    		if(data.code == 0){
    			//获取到数据集合
    			var videos = data.map.Video;
    			//遍历数据
    			$.each(videos,function(index,video){
    				var name = video.vName;
    				//-30-Nov-18-17_12_51.flv
    				var s = name.replace('-','');
    				//30-Nov-18-17_12_51.flv
    				var r = s.replace("-","日");
    				//30日Nov-18-17_12_51.flv
    				var y = r.replace("-","月");
    				//30日Nov月18-17_12_51.flv
    				var n = y.replace("-","年");
    				//30日Nov月18年17_12_51.flv
    				var str = n.substring(n.indexOf('日')+1,n.indexOf('月'));
    				var yName;
    				switch (str) 
    				{ 
    				  case 'Jan':
    					  yName="1"; 
    				  	  break; 
    				  case 'Feb':
    					  yName="2"; 
    				      break; 
    				  case 'Mar':
    					  yName="3"; 
    				  	  break; 
    				  case 'Apr':
    					  yName="4"; 
    				      break; 
    				  case 'May':
    					  yName="5"; 
    				  	  break; 
    				  case 'Jun':
    					  yName="6"; 
    				      break; 
    				  case 'Jul':
    					  yName="7"; 
    				  	  break; 
    				  case 'Aug':
    					  yName="8"; 
    				      break; 
    				  case 'Sept':
    					  yName="9"; 
    				  	  break; 
    				  case 'Oct':
    					  yName="10"; 
    				      break; 
    				  case 'Nov':
    					  yName="11"; 
    				      break; 
    				  case 'Dec':
    					  yName="12"; 
    				      break; 
    				}
    				
    				var finalName =  n.replace(str,yName);
    				var li = $("<li></li>").append(finalName);
    				var a = $("<a></a>").attr("href","javascript:void(0)").attr("onclick","d1('"+name+"')").append(li);
    				var u = $("<u></u>").append(a);
    				var p = $("<p></p>").append(u);
    				p.appendTo("#mse1");
    			})
    		}
    	}
    	
    	//点击时间后播放视屏
    	function d1(src){
    		$("#mse").empty();
    		new window.FlvJsPlayer({
                id: 'mse',
                isLive: false,
                playsinline: true,
               // url: '${app_path}/video/'+src,   //要播放文件的路径
                url: 'http://cdlv-video.stor.sinaapp.com/'+src,
                autoplay: true,
                height: 450,
                width: 900
            });
    	}
    	
    	//打开页面的播放器不播放任何内容
    	new window.FlvJsPlayer({
    		id: 'mse',
            isLive: false,
            playsinline: true,
            //url: '${app_path}/video/-13-Feb-19-17_12_54.swf',   //要播放文件的路径
            url: 'http://cdlv-video.stor.sinaapp.com/-14-Feb-19-17_12_54.flv',
            autoplay: false,
            height: 450,
            width: 900
        });
    </script>

</body>
</html>
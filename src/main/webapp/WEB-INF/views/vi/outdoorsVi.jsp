<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" >
    <meta name="renderer" content="webkit">
    <title>户外视屏</title>
    <style>
        body{margin:10;text-align: center;}
        video{max-width: 90%;width: 90%;}
    </style>
</head>
<body onunload="goodbye()">
<script src="https://open.ys7.com/sdk/js/1.3/ezuikit.js"></script>

<video id="myPlayer" poster="" controls playsInline webkit-playsinline autoplay>
    <source src="rtmp://rtmp.open.ys7.com/openlive/563b923d415a4326bfad8e92a30b79e6" type="" />
    <source src="http://hls.open.ys7.com/openlive/563b923d415a4326bfad8e92a30b79e6.m3u8" type="application/x-mpegURL" />
</video>

<script>
	
    var player = new EZUIPlayer('myPlayer');
    player.on('error', function(){
        console.log('error');
    });
    player.on('play', function(){
        console.log('play');
    });
    player.on('pause', function(){
        console.log('pause');
    });
</script>

</body>
</html>

<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<!-- 获取当前项目路径 -->
	<% pageContext.setAttribute("app_path",request.getContextPath()); %>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/x-admin/css/font.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/x-admin/css/xadmin.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/jquery/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/x-admin/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/x-admin/js/xadmin.js"></script>
    <!-- bootstrap核心样式 -->
	<link href="${app_path }/static/bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<!-- bootstrap  js -->
	<script src="${app_path }/static/bootstrap/js/bootstrap.min.js"></script>
</head>		
<body>
		<div class="x-body">
		
		
        <form class="layui-form">
        
          <div class="layui-form-item">
              <label for="username" class="layui-form-label">
                  <span class="x-red">*</span>姓名
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="username" name="username" required="" lay-verify="required"
                  autocomplete="off" class="layui-input">
              </div>
              <div class="layui-form-mid layui-word-aux">
                  <span class="x-red">*</span>将会成为您唯一的登入名
              </div>
          </div>
          
          
          <div class="layui-form-item">
              <label for="phone" class="layui-form-label">
                  <span class="x-red">*</span>电话
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="phone" name="phone" required="" lay-verify="phone"
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          
          <div class="layui-form-item">
              <label for="L_email" class="layui-form-label">
                  <span class="x-red">*</span>性别
              </label>
              <div class="layui-input-block" id="gerderId">
                <input type="radio" id="gerder" name="ll" value="男"  title="男" checked="checked">
                <input type="radio" id="gerder" name="ll" value="女"  title="女">
              </div>
          </div>
          
          <div class="layui-form-item">
              <label for="L_email" class="layui-form-label">
                  <span class="x-red">*</span>年龄
              </label>
              <div class="layui-input-inline" id="nl">
              	<select id="nl">
					  <option value="18">18</option>
					  <option value="19">19</option>
					  <option value="20">20</option>
					  <option value="21">21</option>
					  <option value="22">22</option>
					  <option value="23">23</option>
					  <option value="24">24</option>
					  <option value="25">25</option>
					  <option value="26">26</option>
					  <option value="27">27</option>
					  <option value="28">28</option>
					  <option value="29">29</option>
					  <option value="30">30</option>
					  <option value="31">31</option>
					  <option value="32">32</option>
					  <option value="33">33</option>
					  <option value="34">34</option>
					  <option value="35">35</option>
					  <option value="36">36</option>
					  <option value="37">37</option>
					  <option value="38">38</option>
					  <option value="39">39</option>
					  <option value="30">30</option>
					  <option value="41">41</option>
					  <option value="42">42</option>
					  <option value="43">43</option>
					  <option value="44">44</option>
					  <option value="45">45</option>
					  <option value="46">46</option>
					  <option value="47">47</option>
					  <option value="48">48</option>
					  <option value="49">49</option>
					  <option value="40">40</option>
					  <option value="51">51</option>
					  <option value="52">52</option>
					  <option value="53">53</option>
					  <option value="54">54</option>
					  <option value="55">55</option>
					  
				</select>
              </div>
          </div>
          
          <div class="layui-form-item">
              <label class="layui-form-label"><span class="x-red">*</span>职位</label>
              <div class="layui-input-block">
              <c:forEach items="${roles}" var="role">
                <input type="radio" id="rid" name="like1[write]" value="${role.rid}"  title="${role.rname}">
              </c:forEach>
              </div>
          </div>
          
          <div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                  <span class="x-red">*</span>密码
              </label>
              <div class="layui-input-inline">
                  <input type="password" id="L_pass" name="pass" required="" lay-verify="pass"
                  autocomplete="off" class="layui-input">
              </div>
              <div class="layui-form-mid layui-word-aux">
                  6到16个字符
              </div>
          </div>
          
          <div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
                  <span class="x-red">*</span>确认密码
              </label>
              <div class="layui-input-inline">
                  <input type="password" id="L_repass" name="repass" required="" lay-verify="repass"
                  autocomplete="off" class="layui-input">
              </div>
          </div>
          
          <div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
              </label>
              <button  class="layui-btn" lay-filter="add" lay-submit="">添加</button>
          </div>
          
      </form>
    </div>
    <script>
        layui.use(['form','layer'], function(){
           
        	$ = layui.jquery;
          var form = layui.form,layer = layui.layer;
        
          //自定义验证规则
          form.verify({
            nikename: function(value){
              if(value.length < 5){
                return '昵称至少得5个字符啊';
              }
            }
            ,pass: [/(.+){6,12}$/, '密码必须6到12位']
            ,repass: function(value){
                if($('#L_pass').val()!=$('#L_repass').val()){
                    return '两次密码不一致';
                }
            }
          });

          //监听提交
          form.on('submit(add)', function(data){
        	  
        	  //获取姓名
        	  var name = $("#username").val();
        	  //获取电话
        	  var phone = $("#phone").val();
        	  //获取性别
        	  var ugender = $("input[id='gerder']:checked").val();
        	  //获取年龄
        	  var age = $("#nl option:selected").val();
        	  //获取职位
        	  var roleId = $("input[id='rid']:checked").val();
        	  //获取密码
        	  var pwd = $("#L_pass").val();
        	  
        	  
        	  if(ugender == "undefined" || ugender == null || ugender == "" || ugender=="on"){
        		  ugender = "男";
        	  }
        	//使用ajax添加数据到数据库中
        	$.ajax({
        		url:"${app_path}/user/insert",
        		data:"uname="+name+"&uphone="+phone+"&ugender="+ugender+"&uage="+age+"&roleid="+roleId+"&upassword="+pwd,
        		type:"POST",
        		success:function(data){
        		     to_insertIn(data);
        		}
        	});
        	function to_insertIn(data){
        		if(data.code == 0){
        			layer.alert("增加成功", {icon: 6},function () {
                        // 获得frame索引
                        var index = parent.layer.getFrameIndex(window.name);
                        //关闭当前frame
                        parent.layer.close(index);
                        window.parent.location.reload();
                    });
        		}else{
        			alert("姓名已经存在添加失败/或者其它异常");
        		}
        	}
        	return false;
          });
          
          
        });
    </script>
    <script>var _hmt = _hmt || []; (function() {
        var hm = document.createElement("script");
        hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
        var s = document.getElementsByTagName("script")[0];
        s.parentNode.insertBefore(hm, s);
      })();</script>
</body>
</html>
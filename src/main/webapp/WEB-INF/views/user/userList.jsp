<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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


    <div class="x-nav">
      <span class="layui-breadcrumb">
        <a>
          <cite>用户信息管理</cite></a>
      </span>
      <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" id="sx" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
    </div>
    
    
    <!-- 内容 -->
    <div class="x-body">
    
   	<!-- 	搜索框 
      <div class="layui-row"  id="ssk">
       	 <form class="layui-form layui-col-md12 x-so">
        	<b>快速搜索:  </b>
         		 <input type="text" name="username"  placeholder="请输入用户名" autocomplete="off" class="layui-input" id="sskinput" />
          		 <button class="layui-btn"  lay-submit="" lay-filter="sreach" id="sskbut"><i class="layui-icon">&#xe615;</i></button>
        </form>
      </div>  -->
      
      <!-- 批量删除和添加 -->
      <xblock id="xb">
        
      </xblock>
      
      <!-- 用户列表 -->
      <table class="layui-table" id="userTable">
        <thead>
          <tr>
            <th>
              <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">&#xe605;</i></div>
            </th>
            <th>ID</th>
            <th>姓名</th>
            <th>性别</th>
            <th>电话</th>
            <th>注册时间</th>
            <th>年龄</th>
            <th>操作</th>
        </thead>
        
        <tbody>
         <!--  <tr>
            <td>
              <div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id='2'><i class="layui-icon">&#xe605;</i></div>
            </td>
            
            <td>1</td>
            <td>李四</td>
            <td>男</td>
            <td>13513424567</td>
            <td>2017-01-01 11:11:42</td>
            <td>23</td>
            
            <td class="td-status">
              <span class="layui-btn layui-btn-normal layui-btn-mini">已启用</span></td>
            <td class="td-manage">
            
              <a title="编辑"  onclick="x_admin_show('编辑','admin-edit.html')" href="javascript:;">
                <i class="layui-icon">&#xe642;</i>
              </a>
              
              <a title="删除" onclick="member_del(this,'要删除的id')" href="javascript:;">
                <i class="layui-icon">&#xe640;</i>
              </a>
              
            </td>
          </tr> -->
        </tbody>
      </table>
      
      <!-- 分页页码信息 -->
      <div class="col-md-12" style="text-align:center" id="pageId">
      </div>

    </div>
    
    <script type="text/javascript">
	    	 //页面加载时发起请求
	    	$(function(){
	    		//创建查询分页信息的方法 ，参数1表示默认页码
	    		to_page(1); 
	    	}); 
	   
	   	$("#sx").click(function(){
	   		to_page(1); 
	   	});
	    	 
	    	 
    	
    	//发起ajax请求
    	function to_page(pn){
    		$.ajax({
    			url:"${app_path}/user/lists",
    			data:"pn="+pn,
    			type:"get",
    			success:function(data){
    				getUser(data);  //获取用户
    				page_pn(data);  //获取分页
    				to_pages(data);  //获取总数据
    			}
    		});
    	}
    	
    	//搜索发起ajax请求
		$("#sskbut").click(function(){
			//获取input输入的值
			var text =  $("#sskinput").val();
			if(text.length == 0){
				return	alert("请输入用户名");
			}else{
	    		//发起ajax请求
	    		ssk(text);
	    		return;
			}
		});
    	
    	//搜索的方法
    	function ssk(text){
    		$.ajax({
    			url:"${app_path}/user/byUname",
    			data:"pn=1&uName="+text,
    			type:"POST",
    			success:function(data){
    				getUser(data);
    			}
    		});
    	}
    	
    	
    	//展示用户信息的方法
    	function getUser(data){
    		//显示当前数据时先清空之前的数据
			$("#userTable tbody").empty();
    		//得到用户数据
    		var users = data.map.pageInfo.list;
    		$.each(users,function(index,user){
    			//id选择框
    			var idki = $("<i></i>").addClass("layui-icon").append("&#xe605;");
                var idk = $("<div></div>").addClass("layui-unselect layui-form-checkbox").attr("lay-skin","primary").attr("data-id",user.uid).append(idki);
    			var idk_td = $("<td></td>").append(idk);
    			
    			var userId = $("<td></td>").append(user.uid);  //id
    			var userName = $("<td></td>").append(user.uname); //名字
    			var userGender = $("<td></td>").append(user.ugender); //性别
    			var userPhone = $("<td></td>").append(user.uphone);  //电话
    			var userTime = $("<td></td>").append(getMyDate(user.utime));   //时间
    			var userAge = $("<td></td>").append(user.uage);   //年龄
    			//var userDept = $("<td></td>").append(user.)    //部门
    															//职位
    			
    			//编辑和删除图标
    			var but_a = $("<button></button>").addClass("btn btn-success").attr("type","button").append("修改");
    			var but_b = $("<button></button>").addClass("btn btn-danger").attr("type","button").append("删除");
              
    		 	var but_a1 = $("<a></a>").attr("onclick","x_admin_show('编辑','${app_path}/user/update?uName="+user.uname+"&uid="+user.uid+"','900','500')").attr("hrer","javascript:;").append(but_a);
              	var but_b1 = $("<a></a>").attr("onclick","member_del(this,'"+user.uid+"')").attr("hrer","javascript:;").append(but_b);
    			
              $("<tr></tr>").append(idk_td)
              				.append(userId)
              				.append(userName)
              				.append(userGender)
              				.append(userPhone)
              				.append(userTime)
              				.append(userAge)
              				.append(but_a1)
              				.append(but_b1)
              				.appendTo("#userTable tbody");
    		})
    	}
    	
    	//分页信息
    	function page_pn(data){
    		//显示当前数据时先清空之前的数据
			$("#pageId").empty();		
			
			//得到分页条的数据
			//定义的ul
			var ul = $("<ul></ul>").addClass("pagination").append();
			
			//首页
			var pagesy = $("<li></li>").append($("<a></a>").attr("href","#").append("首页"));
			//上一页
			var pagela = $("<li></li>").append($("<a></a>").attr("href","#").append($("<span></span>").append("&laquo;")));
			//判断是否有上一页，如果没有给li标签加上禁止点击的属性
			if(data.map.pageInfo.hasPreviousPage == false){
				pagesy.addClass("disabled");
				pagela.addClass("disabled");
			}else{
				//给首页li标签添加点击事件和上一页添加点击事件
				pagesy.click(function(){
					to_page(1);   //调用ajax方法并传入页码数
				});
				//上一页
				pagela.click(function(){
					to_page(data.map.pageInfo.pageNum  -1);
				});
			}
			
			//下一页
			var pagere = $("<li></li>").append($("<a></a>").attr("href","#").append($("<span></span>").append("&raquo;")));
			
			//末页
			var pagemy = $("<li></li>").append($("<a></a>").attr("href","#").append("末页"));
			
			//判断是否有下一页，如果没有给li标签加上禁止点击的属性
			if(data.map.pageInfo.hasNextPage == false){
				pagere.addClass("disabled");
				pagemy.addClass("disabled");
			}else{
				//给末页li标签添加点击事件和下一页添加点击事件
				pagere.click(function(){
					to_page(data.map.pageInfo.pageNum +1);
				});
				pagemy.click(function(){
					to_page(data.map.pageInfo.pages);
				});
			}
			
			//ul中添加首页和上一页
			ul.append(pagesy).append(pagela);
			//数字页码
			$.each(data.map.pageInfo.navigatepageNums,function(index,item){
				var pagesz = $("<li></li>").append($("<a></a>").attr("href","#").append(item));
				//判断是否为当前页
				if(data.map.pageInfo.pageNum == item){
					pagesz.addClass("active");
				}
				//给pagesz  li标签添加一个点击事件,点击后请求to_page ajax请求方法
				pagesz.click(function(){
					to_page(item);
				});
				//ul中添加每页的数字
				ul.append(pagesz);
			});
			//ul中添加下一页和末页的数据
			ul.append(pagere).append(pagemy);
			
			var pagenav = $("<nav></nav>").append(ul);   //把ul标签添加到nav标签中
			
			pagenav.appendTo("#pageId");   //把pagenav添加到id是page_nav的标签中
    	}
    	
    	//用户条数的方法(批量删除)
    	function to_pages(data){
    		$("#xb").empty();
    		/* <button class="layui-btn layui-btn-danger" onclick="delAll()"><i class="layui-icon"></i>批量删除</button>
            <button class="layui-btn" onclick="x_admin_show('添加用户','./admin-add.html')"><i class="layui-icon"></i>添加</button> */
            /* var but_ai = $("<i></i>").addClass("layui-icon").append("批量删除");
            var but_a = $("<button></button>").addClass("layui-btn layui-btn-danger").attr("onclick","delAll()").append(but_ai);  */
            var btu_bi = $("<i></i>").addClass("layui-icon").append("添加");
            var but_b = $("<button></button>").addClass("layui-btn").attr("onclick","x_admin_show('添加','${app_path}/user/userAdd','900','500')").append(btu_bi);
    		//共有多条数据的显示
         	var pages_num = $("<span></span>").addClass("x-right").attr("style","line-height:40px").append("共有数据: "+data.map.pageInfo.total+" 条");
            $("<div></div>").append(but_b)
            				.append(pages_num)
            				.appendTo("#xb");
    	}
    	
    	
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
      layui.use('laydate', function(){
        var laydate = layui.laydate;
        
        //执行一个laydate实例
        laydate.render({
          elem: '#start' //指定元素
        });

        //执行一个laydate实例
        laydate.render({
          elem: '#end' //指定元素
        });
      });
      

       /*用户-停用*/
      function member_stop(obj,id){
          layer.confirm('确认要停用吗？',function(index){

              if($(obj).attr('title')=='启用'){

                //发异步把用户状态进行更改
                $(obj).attr('title','停用')
                $(obj).find('i').html('&#xe62f;');

                $(obj).parents("tr").find(".td-status").find('span').addClass('layui-btn-disabled').html('已停用');
                layer.msg('已停用!',{icon: 5,time:1000});

              }else{
                $(obj).attr('title','启用')
                $(obj).find('i').html('&#xe601;');

                $(obj).parents("tr").find(".td-status").find('span').removeClass('layui-btn-disabled').html('已启用');
                layer.msg('已启用!',{icon: 5,time:1000});
              }
              
          });
      }

      /*用户-删除*/
      function member_del(obj,id){
          layer.confirm('确认要删除吗？',function(index){
        	  $(obj).parents("tr").remove();
    		  layer.msg('已删除!',{icon:1,time:1000});
              //发异步删除数据
        	  $.ajax({
            	  url:"${app_path}/user/delete",
            	  data:"uid="+id,
            	  type:"POST",
            	  success:function(data){
            	  }
              });
             
              
          });
      }



      function delAll (argument) {

        var data = tableCheck.getData();
  
        layer.confirm('确认要删除吗？'+data,function(index){
            //捉到所有被选中的，发异步进行删除
            layer.msg('删除成功', {icon: 1});
            $(".layui-form-checked").not('.header').parents('tr').remove();
            window.parent.location.reload();
        });
      }
    </script>
    <script>var _hmt = _hmt || []; (function() {
        var hm = document.createElement("script");
        hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
        var s = document.getElementsByTagName("script")[0];
        s.parentNode.insertBefore(hm, s);
      })();</script>
  </body>
</html>
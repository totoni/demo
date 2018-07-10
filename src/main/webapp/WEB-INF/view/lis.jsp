<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'list.jsp' starting page</title>
 <link rel="stylesheet"
	href="<%=request.getContextPath()%>/effect/css/index.css" type="text/css"></link>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/effect/js/jquery-1.8.2.min.js"></script>
  <script type="text/javascript">
 	$(function(){
 	 	
 		//查看
  		  $(".look").click( function(){
   		     var id=$(this).next().val();
   		         location.href="<%=request.getContextPath()%>/tolook?aid="+aid;  
   		    });
 
 		//添加
 		$("#insert").click( function(){
   		     
   		         location.href="<%=request.getContextPath()%>/toinsert";  
   		    });
 		//全选
 		$("#qx").click( function(){
   		     $(".ck").each(function(){
   		       this.checked=true;	 
   		     });
   		         
   		    });
 	   //批量删除
 		$("#plsc").click(function(){
  		   $(".ck").each(function(){
  		    var ids = $(".ck:checked").map(function (){return $(this).val();}).get().join(",");
  		   $.ajax({
  		            url:"<%=request.getContextPath()%>/plsc",
  		            data:{ids:ids},
  		            datetype:"text",
  		            type:"post",
  		            success:function(obj){
  		            if(obj=="true"){
  		            location.reload();
  		            }
  		            }
  		      });
  		});
 		});

 	});
  </script>
  </head>
  
  <body>
  <input type="button" value="添加" id="insert"/>
    <table>
    	<tr>
    	    <td><input type="checkbox" value="" id="qx"/>全选</td>
    		<td>编号</td>
    		<td>动物名称</td>
    		<td>分布范围</td>
    		<td>体重</td>
    		<td>操作
    			
    		</td>
    	</tr>
    	
    	<c:forEach items="${list}" var="a">
        	<tr>
        	<td><input type="checkbox" value="${a.aid }" class="ck"/></td>        	
        	<td>${a.aid }</td>
    		<td>${a.aname }</td>
    		<td>${a.weight }</td>
    		<td>${a.rnames }</td>   		
    		<td>
    			<input type="button" value="查看" class="look"/>
    			<input type="hidden" value="${a.aid }" />    			
    		</td>
    		</tr>	
    	</c:forEach>
    	<tr>
    		<td colspan="6">    当前${pageUtil.currentPage}/${pageUtil.lastPage}页，共${pageUtil.count}条记录
    				<a href="<%=request.getContextPath()%>/list?page=1">首页</a>
    				<a href="<%=request.getContextPath()%>/list?page=${pageUtil.prevPage}">上一页</a>
    				<a href="<%=request.getContextPath()%>/list?page=${pageUtil.nextPage}">下一页</a>
    				<a href="<%=request.getContextPath()%>/list?page=${pageUtil.lastPage}">尾页</a>
    	</td>
    	</tr>
    </table>        
    	<input type="button" value="批量删除" id="plsc"/>
  </body>
</html>

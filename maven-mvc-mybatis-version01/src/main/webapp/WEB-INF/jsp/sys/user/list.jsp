<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	request.setAttribute("webPath", request.getContextPath());
%>
<!-- jquery引入必须在head下面 -->
<script type="text/javascript" src ="${webPath}/resources/jquery-1.7.2.min.js"></script>

<center>
<form action="" method="post" id = "form">
<!-- 隐藏用于删除时候获取id -->
<input type="text" value="${user.id}" name = "id">
<table>
    <tr>
    <td>
      姓名:<input type="text" name="name"/>
    </td>
    <td>
      年龄:<input type="text" name="age">
    </td>
    <td>
    <input type="button" value="查询" onclick="selectAll();"/>
   </td>
    </tr>
   </table>
   <table  bordercolor="red" border="1px">
 <!-- thead部分 -->
      <tr>
       <td>序号</td>
       <td>姓名</td>
       <td>年龄</td>
       <td><center>操作</center></td>
      </tr>
  <!--tbody  --> 
  <c:forEach items="${users}" var="user" varStatus="status"> 
     <tr>
       <td>${status.count}</td>
       <td>${user.name}</td>
       <td>${user.age}</td>
       <td>
         <input type="button" value="详情 " onclick="to_detail('${user.id}');"/>
         <input type="button" value="删除" onclick="dele('${user.id}');"/>
         <input type="button" value="修改" onclick="to_update('${user.id}');"/>
       </td>
      </tr>
  </c:forEach>
   </table>
  <!-- 操作按钮 --> 
      <input type="button" value = "新增" onclick="to_insert();">
   </form>

</center>

<script type="text/javascript">
  //纯粹表单提交获取数据---javascript表单提交
   function to_detail(id){
	 //请求路径
	   $("#form").attr("action","${webPath}/user/to_detail.do?id="+id);
	   //提交表单 
	   $("#form").submit();
   }
   //jquery提交 
   function dele(id){
	   //请求路径
	   $("#form").attr("action","${webPath}/user/delete.do?id="+id);
	   //提交表单 
	   $("#form").submit();
   }
 //jquery提交 
   function to_update(id){
	   //请求路径
	   $("#form").attr("action","${webPath}/user/to_update.do?id="+id);
	   //提交表单 
	   $("#form").submit();
   }
 function to_insert(){
	//请求路径
	   $("#form").attr("action","${webPath}/user/to_insert.do");
	   //提交表单 
	   $("#form").submit();
 }
 function selectAll(){
	//请求路径
	   $("#form").attr("action","${webPath}/user/select.do");
	   //提交表单 
	   $("#form").submit();
 }
</script>



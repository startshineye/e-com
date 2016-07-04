<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	request.setAttribute("webPath", request.getContextPath());
%>
<script type="text/javascript" src = "${webPath}/jQuery/jquery-1.7.2.min.js"></script>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<form action="${webPath}/user/list.do" method="post" id = "form">
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
         <input type="button" value="增加" onclick="to_add();"/>
         <input type="button" value="删除" onclick="delete();"/>
         <input type="button" value="修改" onclick="update();"/>
       </td>
      </tr>
  </c:forEach>
   </table>
  <!-- 操作按钮 --> 
   <table>
    <tr>
        <input type="button" value="查询" onclick="select();"/>
    </tr>
   </table>
   </form>
</body>
</center>
</html>
<script type="text/javascript">
  //纯粹表单提交获取数据---javascript表单提交
  function select(){
	 var formElt = document.getElementById("form");
	 formElt.submit();
  }
   //表单提交,并跳转到增加页面 ---jQuery提交表单
   function to_add(){
	   //获取表单对象
	    var userForm = document.getElementById("form");
	    //设置form的action
	    userForm.action = "${webPath}/user/toinsert.do";
	    //设置form的提交方式
	    userForm.method = "GET";
	    //调用方法提交
	    userForm.submit();
   }
</script>



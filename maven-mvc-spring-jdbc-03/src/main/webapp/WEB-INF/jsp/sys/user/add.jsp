<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%
	request.setAttribute("webPath", request.getContextPath());
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- 放在head下 -->
<script type="text/javascript" src = "jQuery/jquery-1.7.2.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<!-- 基本表单提交 -->
<form:form action="" method="post" modelAttribute="user" id="form">
<table>
	<tr>
	     <td>姓名:
	      <form:input path="name"/>
	     </td>
	</tr>
	<tr>
	     <td>年龄:
	    <form:input path="age"/>
	     </td>
	 </tr>
	 <tr>
	 <td><input type="submit"  value="新增"> </td>
	    <td><input type="button" value = "返回" onclick = "window.history.go(-1)"></td>
	 </tr>
</table>
</form:form>
</body>
</center>
</html>




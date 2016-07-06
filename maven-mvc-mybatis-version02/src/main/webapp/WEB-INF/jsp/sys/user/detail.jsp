<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	request.setAttribute("webPath", request.getContextPath());
%>
<script type="text/javascript" src = "jQuery/jquery-1.7.2.min.js"></script>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<table>
     <tr>
	     <td>id:<input type="text" name = "id" value = "${user.id}"/></td>
	 </tr>
	<tr>
	     <td>姓名:<input type="text" name = "name" value = "${user.name}"/></td>
	</tr>
	<tr>
	     <td>年龄:<input type="text" name = "age" value = "${user.age}"/></td>
	 </tr>
	 <tr>
	    <td><input type="button" value = "返回" onclick = "window.history.go(-1)"></td>
	 </tr>
</table>
</body>
</center>
</html>




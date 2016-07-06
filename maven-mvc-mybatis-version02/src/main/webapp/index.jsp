<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
 request.setAttribute("webPath",request.getContextPath());
%>
<html>
<body>
<center>
<h2>欢迎进入cms系统 </h2>
</center>
<a href="${webPath}/user/list.do">点击我进入操作页面</a>
</body>
</html>

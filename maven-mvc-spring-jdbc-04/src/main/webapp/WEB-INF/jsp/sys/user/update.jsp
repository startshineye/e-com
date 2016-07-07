<%@ page language="java" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/common/include.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
	<form:form id="form1" action="" method="post" modelAttribute="user">
	<form:input path="id"/>
		<table border="1px">
			<tr>
				<td>姓名</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>年龄</td>
				<td><form:input path="age" /></td>
			</tr>
		</table>
		<input type="button" value="保存" onclick="toAction('${webPath}/user/update');">
	</form:form>
</center>
</body>
</html>
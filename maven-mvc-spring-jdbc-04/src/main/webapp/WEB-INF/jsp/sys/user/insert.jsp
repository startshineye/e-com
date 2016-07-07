<%@ page language="java" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/common/include.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<center>
<body>
	<form:form id="form1" action="" method="post"	modelAttribute="user" enctype="multipart/form-data" >
		<table border="1px">
			<tr>
				<td>姓名</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>年龄</td>
				<td><form:input path="age" /></td>
			</tr>
			<tr>
				<td>文件</td>
				<td><input type="file" name="img" /></td>
			</tr>
		</table>
		<input type="button" value="保存" onclick="toAction('${webPath}/user/insert');">
	</form:form>
</body>
</center>
</html>
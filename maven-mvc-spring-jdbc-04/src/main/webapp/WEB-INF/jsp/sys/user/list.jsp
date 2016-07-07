<%@ page language="java" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/common/include.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<center>
<body>
	<!-- modelAttribute配合方法里的注解：从request中取出user放到页面上 -->
	<form:form id="form1" action="" method="post"	modelAttribute="cond">
		<table>
			<tr>
				<td>姓名</td>
				<!-- path被解析成name和id -->
				<td><form:input path="name" /></td>
				<td>年龄</td>
				<td><form:input path="age" /></td>
				<td>主键</td>
				<td><form:input path="id" /></td>
				<td><input type="button" onclick="toAction('${webPath}/user/list');" value="查询"></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
		</table>
		<table border="1px" bordercolor="red">
			<tr>
				<td>主键</td>
				<td>姓名</td>
				<td>年龄</td>
				<td>删除</td>
				<td>修改</td>
				<td>详细</td>
			</tr>
			<c:forEach items="${userList}" var="user">
				<tr>
					<td>${user.id}</td>
					<td>${user.name}</td>
					<td>${user.age}</td>
					<td><input type="button" value="删除" onclick="toAction('${webPath}/user/delete?id=${user.id}');"></td>
					<td><input type="button" value="修改" onclick="toAction('${webPath}/user/toupdate?id=${user.id}');"></td>
					<td><input type="button" value="详细" onclick="toAction('${webPath}/user/detail?id=${user.id}');"></td>
				</tr>
			</c:forEach>
		</table>
				<input type="button" value="新增" onclick="toAction('${webPath}/user/toinsert');">
		<!-- 引入分页页面 -->
		<jsp:include page="/WEB-INF/jsp/common/page.jsp"/>
	</form:form>
</body>
</center>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	request.setAttribute("webPath", request.getContextPath());
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src ="${webPath}/resources/jquery-1.7.2.min.js"></script>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<form action="" method = "post" id = "userForm">
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
	     <td>
	      <input type = "button" value="修改" onclick="update();"/>
	     </td>
	 </tr>
  </table>
</form>
</body>
</center>
</html>
<script type="text/javascript">
	function update(){
	 $("#userForm").attr("action","${webPath}/user/update.do");
	 $("#userForm").submit();
	}
</script>




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
<form action="" method="" id = "userForm">
<table>
	<tr>
	    <td>姓名:<input type="text" name = "name"/></td>
	</tr>
	<tr>
	    <td>年龄:<input type="text" name = "age"/></td>
	 </tr>
</table>
<table>
  <tr>
  <input type="button" value = "添加" onclick="add();"/>
  </tr>
</table>
 </form>
</body>
</center>
</html>
<script type="text/javascript">
//javascript提交表单----javascruot
function add(){
	 //获取表单对象
    var userForm = document.getElementById("userForm");
    //设置form的action
    userForm.action = "${webPath}/user/insert.do";
    //设置form的提交方式
    userForm.method = "GET";
    //调用方法提交
    userForm.submit();
}
</script>



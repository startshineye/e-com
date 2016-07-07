<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- 导入spring提供的表单提交 -->
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%
	request.setAttribute("webPath", request.getContextPath());
%>
<!-- jquery引入必须在head下面 -->
<script type="text/javascript" src ="${webPath}/resources/jquery-1.7.2.min.js"></script>

<center>

   <!-- modelAttribute配合方法里的注解：从request中取出user放到页面上 -->
	<form:form id="form" action="${webPath}/user/list" method="post"	modelAttribute="userCondition">
		 	<table>
			<tr>
			<!-- path被解析成name和id -->
				<td>姓名:<form:input path="name" />
				</td>
				<td>年龄:<form:input path="age" />
				</td>
				<td><input type="button" value="查询" onclick="selectAll();" /></td>
			</tr>
		</table>
		<table bordercolor="red" border="1px">
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
					<td><input type="button" value="详情 "
						onclick="to_detail('${user.id}');" /> <input type="button"
						value="删除" onclick="dele('${user.id}');" /> <input type="button"
						value="修改" onclick="to_update('${user.id}');" /></td>
				</tr>
			</c:forEach>
		</table>
		<!-- 操作按钮 -->
		<table>
			<tr>
				<td>总条数:${con.rowCount}</td>
				<td>页数：${con.pageCount}</td>
				<td>页大小:${con.pageSize}</td>
				<td>当前页:${con.curPage} 跳转页面:<input type="text" id="curPage"
					name="curPage" onkeydown="skip();" />
				</td>
				<td><input type="button" value="新增" onclick="to_insert();" /></td>
			</tr>
		</table>
	</form:form>
</center>

<script type="text/javascript">
	//页面跳转
	function skip() {
		$(window).keydown(function(event) {
			if (event.keyCode == 13) {
				//请求路径
				$("#form").attr("action", "${webPath}/user/list.do");
				//提交表单 
				$("#form").submit();
			}
		});

	}
	//纯粹表单提交获取数据---javascript表单提交
	function to_detail(id) {
		//请求路径
		$("#form").attr("action", "${webPath}/user/to_detail.do?id=" + id);
		//提交表单 
		$("#form").submit();
	}
	//jquery提交 
	function dele(id) {
		//请求路径
		$("#form").attr("action", "${webPath}/user/delete.do?id=" + id);
		//提交表单 
		$("#form").submit();
	}
	//jquery提交 
	function to_update(id) {
		//请求路径
		$("#form").attr("action", "${webPath}/user/to_update.do?id=" + id);
		//提交表单 
		$("#form").submit();
	}
	function to_insert() {
		//请求路径
		$("#form").attr("action", "${webPath}/user/to_insert.do");
		//提交表单 
		$("#form").submit();
	}
	function selectAll() {
		//请求路径
		$("#form").attr("action", "${webPath}/user/select.do?curPage=" + 1);
		//提交表单 
		$("#form").submit();
	}
</script>



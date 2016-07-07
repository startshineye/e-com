<%@ page language="java"   pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/common/include.jsp" %>
    <div>
   		行数：${cond.rowCount}<br>
		页数：${cond.pageCount}<br>
		当前页：<form:input path="curPage"/> <br>
		页大小：<form:input path="pageSize"/> <br> 
</div>

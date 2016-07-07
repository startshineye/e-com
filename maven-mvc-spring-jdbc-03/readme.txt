
version-03:
重构:maven-mvc-mybatis为Spring+SpringMVC+spring-jdbc

一:为了以后一些方法可以在dao层通用,需要把dao中一些变量和方法封装到一个baseDao中
	   1.把每个DAO中可能用到成员变量放到basedao中
	   2.统计计录个数的方法放到basedao中
	   3.把分页过程也放到basedao中
	   
	   4.抽取basecond
	   
二:将一般的表单提交变成spring提供的表单提交
  <form:form id="form1" action="${webPath}/user/list" method="post"	modelAttribute="cond">
   </form:form>
   
三:修改controller中的参数,添加相应的注解
   
 
   
   






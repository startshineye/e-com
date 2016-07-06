version-01:
重构maven-mvc-mybatis为Spring+SpringMVC+spring-jdbc
说明:导入此工程需要提前搭建maven的web环境:
运用maven-mvc-spring-jdbc模式开发一个:
     实现增删查改操作功能(ssm)运用Spring+SpringMVC+spring-jdbc
     
在maven-mvc-mybatis基础上修改 
  1.去掉pom.xml中mybatis依赖
  2.删掉resources里面的mybatis-config.xml
  3.修改spring-servlet.xml文件(去掉配置文件中mybatis相关,注入spring-jdbc模板(IoC))
  4.新建一个dao实现类,并添加repository注解(用在dao中)
  
  5.实际开发(修改userDaoImp)
  













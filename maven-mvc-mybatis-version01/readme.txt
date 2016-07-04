version-01:
说明:1.导入此工程需要提前搭建maven的web环境:
     2.下载后删除除了src和pom.xml文件,然后再导入工程中;

运用maven-mvc-mybatis模式开发一个:
     实现增删查改操作功能(ssm)运用Spring+SpringMVC+Mybatis
  
  *.新建目录:在java下创建系统的目录结构
          规则:公司域名倒写+系统名称
             系统名称下面分为:多个模块:这里是page,sys
         page下面是表明[三层结构:action(也叫controller),dao层,service层,model(bean)]
         sys功能下分为:两张表dept,user(每一张表又分为4个层次)
   *.导入ssm所依赖xml文件
   *.webapp-->WEB-INF下面又分为jsp->sys-->user[各种页面]
   *.首先定义user类[id,name,age]
   *.前端页面的提交方式运用表单+jquery提交
       例如:  //jquery提交 
        function dele(id){
	   //请求路径
	   $("#form").attr("action","${webPath}/user/delete.do?id="+id);
	   //提交表单 
	   $("#form").submit();
        }
   
   步骤:
   1.先将数据库数据查出来在前端显示
   2.在显示数据后面做增删改
   
   












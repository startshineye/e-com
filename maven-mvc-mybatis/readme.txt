
version-01
运用mvc-mybatis模式开发一个:
     实现增删查改操作功能(ssm)
  
  *.新建目录:在java下创建系统的目录结构
          规则:公司域名倒写+系统名称
             系统名称下面分为:多个模块:这里是page,sys
         page下面是表明[三层结构:action(也叫controller),dao层,service层,model(bean)]
         sys功能下分为:两张表dept,user(每一张表又分为4个层次)
   *.导入ssm所依赖xml文件
   *.webapp-->WEB-INF下面又分为jsp->sys-->user[各种页面]
   *.首先定义user类[id,name,age]
   
   
   步骤:
   1.先将数据库数据查出来在前端显示
   2.做出基本的增删查改
   
   












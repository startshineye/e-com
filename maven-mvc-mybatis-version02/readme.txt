
运用:maven+spring+springmvc+mybatis
在以上版本上实现分页查询:(mysql实现分页查询)
  1.分页查询需要以下字段:
   curPage    //当前页码
   pageSize   //每页条数(页大小)
   pageCount  //页个数
   rowCount   //总记录数
   startLine  //起始行
   
   2.把以上字段加上表中字段封装成一个类UserCondition(以往是把分页查询有关变量作为单独参数,此时封装到一个类中)
   3.修改getList方法.并且加上getCount方法.
   
   4.分页查询sql语句
     select * from 表   条件  limt 起始行 结束行
      
      
   
   
   












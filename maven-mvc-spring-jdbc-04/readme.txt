version04:
重构:maven-mvc-mybatis为Spring+SpringMVC+spring-jdbc
主要实现:
  1.把basedao改成通用
  2.jsp公共资源封装
  3.分页抽取
  4.封装js公共方法

  5.下拉列表
  
  6.文件上传
      前端:jsp
    *.表单协议:<form:form id="form1" action="" method="post"	modelAttribute="user" enctype="multipart/form-data" >
	*.文件标签:<td><input type="file" name="img" />
	
  controller:(参数MultipartFile用于指定之前文件)
    public String insert(User user, MultipartFile img) {
		service.insert(user, img);
		// 重定向到本类的list,requestmapping
		return "redirect:list";
	}

*********************************************************************
   service:重点(img是传过来的参数)[将获取的图片保存到指定硬盘上,将用户信息保存到数据库]
	  i.取出文件扩展名:
	     .获取文件原始名称  :fileName = img.getOriginalFilename() //上传文件为:title.ppt,则获取的的名称同
	     .获取文件扩展名:extName = fileName.substring(fileName.lastIndexOf("."));
	  ii:文件名字不重复:
	             时间是时刻变化的,可以用时间代替不重复的文件名
	      .获取随机名称:String randName = new Date().getTime()+"";
	      .在磁盘上新建文件并保存:img.transferTo(new File("d:/"+randName+extName));
	
*********************************************************************	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
   
package com.yxm.cms.sys.user.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService; 
     
	 @RequestMapping("/list")
	 public String list(Model model){
		 List<User> users = userService.getAllUsers();
		 model.addAttribute("users",users);
		 return "sys/user/list";
	 }
	 
	 //跳转到插入user页面
	 @RequestMapping("/toinsert")
	 public String toinsert(String id){
		 return "sys/user/insert";
	 }
	 //插入user
	 @RequestMapping("/insert")
	 public String list(User user){
		 System.out.println("insert执行");
		 userService.insert(user);
		 return "sys/user/insert";
	 }
}

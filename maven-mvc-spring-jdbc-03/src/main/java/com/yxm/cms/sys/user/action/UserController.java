 package com.yxm.cms.sys.user.action;



import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yxm.cms.sys.user.beans.User;
import com.yxm.cms.sys.user.beans.UserCondition;
import com.yxm.cms.sys.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService; 
     
	@RequestMapping("/list")
	// map相关于request
    // @ModelAttribute把数据放到request中
	 public String list(@ModelAttribute("userCondition") UserCondition userCondition, Map<String, Object> map){
		System.out.print("前");System.out.println(userCondition);
		 List<User> users = userService.getList(userCondition);
		 System.err.println(users.size());
		 System.out.print("后");System.out.println(userCondition);
		 map.put("users",users);
		 map.put("con",userCondition);
		return "sys/user/list";
	 }
	 
	 //跳转到插入user页面
	 @RequestMapping("/to_detail")
	 public String to_detail(int id,Model model){
		 User user = userService.finById(id);
		 model.addAttribute("user",user);
		 return "sys/user/detail";
	 }
	 
	 //跳转到插入user页面
	 @RequestMapping("/to_update")
	 public String to_update(int id,Model model){
		 
		 User user = userService.finById(id);
		 model.addAttribute("user",user);
		 return "sys/user/update";
	 }
	 //跳转到插入user页面
	 @RequestMapping("/update")
	 public String update(User user){
		 System.out.println("更新执行");
		 System.out.println(user.getId());
		 userService.update(user);
		 return "redirect:list";
	 }
	 
	   //跳转到插入user
		 @RequestMapping("/to_insert")
		 public String to_insert(@ModelAttribute("user") User user){
			 System.out.println("to_insert执行");
			 return "sys/user/add";
		 }
	 //插入user
	 @RequestMapping("/insert")
	 public String insert(User user){
		 System.out.println("insert执行");
		 userService.insert(user);
		 return "redirect:list";
	 }
	 
	 //插入user
	 @RequestMapping("/delete")
	 public String delete(int id){
		 System.out.println("delete");
		 userService.delete(id);
		 //重定向到list,重新显示
		 return "redirect:list";
	 }
	 
	 //插入user
	 @RequestMapping("/select")
	 public String select(UserCondition userCondition,Model model){
		 System.out.print("前");System.out.println(userCondition);
		 List<User> users = userService.getList(userCondition);
		 System.out.print("后");System.out.println(userCondition);
		 model.addAttribute("users",users);
		 model.addAttribute("con",userCondition);
		return "sys/user/list";
	 }
}

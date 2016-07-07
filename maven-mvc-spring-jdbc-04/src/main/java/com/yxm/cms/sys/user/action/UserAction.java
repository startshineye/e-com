package com.yxm.cms.sys.user.action;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.yxm.cms.sys.user.model.User;
import com.yxm.cms.sys.user.model.UserCond;
import com.yxm.cms.sys.user.service.IUserService;

@Controller
@RequestMapping("user")
public class UserAction {
	private Log logger = LogFactory.getLog(this.getClass());
	@Autowired
	private IUserService service;

	@RequestMapping("list")
	// map相关于request
	// @ModelAttribute把数据放到request中
	public String list(@ModelAttribute("cond") UserCond cond, Map<String, Object> map) {
		map.put("userList", service.queryList(cond));
		return "sys/user/list";
	}

	/// 跳转到新增页面
	@RequestMapping("toinsert")
	public String toinsert(@ModelAttribute("user") User user) {
		return "sys/user/insert";
	}

	/// 增
	@RequestMapping("insert")
	// MultipartFile img变量名要与页面file框name致
	// 如果需要上传多个文件要使用数组类变量，同时使用注解@RequestParam
	public String insert(User user, MultipartFile img) {
		service.insert(user, img);
		// 重定向到本类的list,requestmapping
		return "redirect:list";
	}

	/// 删除
	@RequestMapping("delete")
	public String delete(int id) {
		logger.info(id);
		service.delete(id);
		return "redirect:list";
	}

	/// 跳转到修改页面
	@RequestMapping("toupdate")
	public String toupdate(int id, Map<String, Object> map) {
		map.put("user", service.findById(id));
		return "sys/user/update";
	}

	/// 改
	@RequestMapping("update")
	public String update(User user) {
		service.update(user);
		return "redirect:list";
	}

	/// 详细
	@RequestMapping("detail")
	public String detail(int id, Map<String, Object> map) {
		map.put("user", service.findById(id));
		return "sys/user/detail";
	}
}

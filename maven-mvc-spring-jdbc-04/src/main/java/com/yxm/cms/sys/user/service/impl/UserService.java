package com.yxm.cms.sys.user.service.impl;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.yxm.cms.sys.user.dao.IUserDao;
import com.yxm.cms.sys.user.model.User;
import com.yxm.cms.sys.user.model.UserCond;
import com.yxm.cms.sys.user.service.IUserService;

@Service
public class UserService implements IUserService {
	private Log logger = LogFactory.getLog(this.getClass());
	@Autowired
	private IUserDao dao;

	@Override
	public int insert(User user, MultipartFile img) {
		System.err.println(img);
		// 作业：
		// 1.取出文件扩展名
		// 2.保证文件存磁盘上名字不重复
		try {
			String extName = img.getOriginalFilename().substring(img.getOriginalFilename().lastIndexOf("."));
			System.err.println(img.getOriginalFilename());
			logger.info(extName);
			// 获取随机名称
			String longTime = new Date().getTime() + "";
			// 获取文件全名
			String fullName = longTime + extName;
			logger.info(fullName);
			img.transferTo(new File("d:/" + fullName));
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} //
		return dao.insert(user);
	}

	@Override
	public int delete(int id) {
		return dao.delete(id);
	}

	@Override
	public int update(User user) {
		return dao.update(user);
	}

	@Override
	public User findById(int id) {
		return dao.findById(id);
	}

	@Override
	public List<User> queryList(UserCond cond) {
		return dao.queryList(cond);
	}

}

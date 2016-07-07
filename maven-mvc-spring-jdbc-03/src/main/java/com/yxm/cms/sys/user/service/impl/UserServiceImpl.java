package com.yxm.cms.sys.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxm.cms.sys.user.beans.User;
import com.yxm.cms.sys.user.beans.UserCondition;
import com.yxm.cms.sys.user.dao.UserDao;
import com.yxm.cms.sys.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;

	/**
	 * 注意:userCondtion每当执行完一次操作后必须初始化,不然会对子查询造成影响
	 */
	public List<User> getList(UserCondition userCondtion) {
		return userDao.getList(userCondtion);
	}

	public int insert(User user) {
		return userDao.insert(user);
	}

	public int delete(int id) {
		userDao.delete(id);
		return 0;
	}

	public int update(User user) {
		userDao.update(user);
		return 0;
	}

	public User finById(int id) {
		return userDao.finById(id);
	}

}

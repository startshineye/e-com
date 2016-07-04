package com.yxm.cms.sys.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxm.cms.sys.user.beans.User;
import com.yxm.cms.sys.user.dao.UserDao;
import com.yxm.cms.sys.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
	private UserDao userDao;

	public List<User> getList(User user) {
		return  userDao.getList(user);
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

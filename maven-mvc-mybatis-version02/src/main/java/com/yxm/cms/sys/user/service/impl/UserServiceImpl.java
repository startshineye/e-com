package com.yxm.cms.sys.user.service.impl;

import java.util.ArrayList;
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
		
		System.out.println("===================");System.err.println(userCondtion);
		//到数据库表中去查询记录个数
		userCondtion.setRowCount(userDao.getCount(userCondtion));
		//计算页数
		userCondtion.setPageCount(userCondtion.getRowCount() % userCondtion.getPageSize() == 0 ? userCondtion.getRowCount() / userCondtion.getPageSize()
				: userCondtion.getRowCount() / userCondtion.getPageSize() + 1);
		//计算起始行
		System.err.println(userCondtion);
		userCondtion.setStartLine((userCondtion.getCurPage() - 1) * userCondtion.getPageSize());
		System.out.print("实现类中");System.out.println(userCondtion);
		System.out.println("=========================");
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

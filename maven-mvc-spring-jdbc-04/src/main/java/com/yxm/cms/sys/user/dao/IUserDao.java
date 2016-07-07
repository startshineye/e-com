package com.yxm.cms.sys.user.dao;
import java.util.List;

import com.yxm.cms.sys.user.model.User;
import com.yxm.cms.sys.user.model.UserCond;

public interface IUserDao {

	int insert(User user);

	int delete(int id);

	int update(User user);

	User findById(int id);

	List<User> queryList(UserCond cond);

}

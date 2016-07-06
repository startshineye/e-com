package com.yxm.cms.sys.user.service;

import java.util.List;
import com.yxm.cms.sys.user.beans.User;
import com.yxm.cms.sys.user.beans.UserCondition;

public interface UserService {
    /**
     * 获取所有的User
     * @return
     */
	public List<User> getList(UserCondition userCondtion);
	/**
	 * 插入user
	 * @param user
	 * @return
	 */
	int insert(User user);
	/**
	 * 删除user
	 * @param id
	 * @return
	 */
	int delete(int id);
	/**
	 * 更新user
	 * @param user
	 * @return
	 */
	int update(User user);
	/**
	 * 更具id查询用户
	 * @param id
	 * @return
	 */
	User finById(int id);
	 
}

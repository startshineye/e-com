package com.yxm.cms.sys.user.dao;

import java.util.List;

import com.yxm.cms.sys.user.beans.User;
public interface UserDao {
  /**
   * 向表中插入user
   * @param user
   * @return
   */
  int insert(User user);
  /**
   * 根据id删除user
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
   * 根据id获取user
   * @param id
   * @return
   */
  User finById(int id);
  /**
   * 根据用户信息查询用户集合
   * @param user
   * @return
   */
  List<User> getList(User user);
}

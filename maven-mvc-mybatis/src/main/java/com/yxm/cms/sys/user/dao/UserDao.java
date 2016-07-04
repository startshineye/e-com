package com.yxm.cms.sys.user.dao;

import java.util.List;

import com.yxm.cms.sys.user.beans.User;
public interface UserDao {
  int insert(User user);
  int delete(int id);
  int update(User user);
  User finById(int id);
  List<User> getAllUsers();
  
}

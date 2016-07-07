package com.yxm.cms.sys.user.dao.imp;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.common.basedao.BaseDao;
import com.yxm.cms.sys.user.beans.User;
import com.yxm.cms.sys.user.beans.UserCondition;
import com.yxm.cms.sys.user.dao.UserDao;


@Repository
public class UserDaoImp extends BaseDao implements UserDao{
   
	@Override
	public int insert(User user) {
		String sql = "insert into user(name,age) values(?,?)";
		Object[] obj = new Object[]{user.getName(),user.getAge()};
		return jdbcTemplate.update(sql,obj);
	}
	@Override
	public int delete(int id) {
		String sql = "delete from user where id = ?";
		Object[] obj = new Object[]{id};
		return jdbcTemplate.update(sql,obj);
	}
	@Override
	public int update(User user) {
		String sql = "update user set name = ?,set age = ? where id = ?";
		Object[] obj = new Object[]{user.getName(),user.getAge(),user.getId()};
		return jdbcTemplate.update(sql,obj);
	}
	@Override
	public User finById(int id) {
		String sql = "select * from user where id = ?";
		Object[] obj = new Object[]{id};
		return jdbcTemplate.queryForObject(sql,obj,new BeanPropertyRowMapper<>(User.class));
	}
	@Override
	public List<User> getList(UserCondition userCondition) {
		// TODO Auto-generated method stub
		return null;
	}
		
	
}

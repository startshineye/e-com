package com.yxm.cms.sys.user.dao.imp;

import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.yxm.cms.sys.user.beans.User;
import com.yxm.cms.sys.user.beans.UserCondition;
import com.yxm.cms.sys.user.dao.UserDao;

@Repository
public class UserDaoImp implements UserDao{
   //属性注入
	@Autowired
	private JdbcTemplate jdbcTemplate;
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
		StringBuffer sb = new StringBuffer();
		sb.append("select name,age,id from user where 1=1 ");
		sb.append(userCondition.getCondition());//拼接条件
		sb.append(" limit "+userCondition.getStartLine()+","+userCondition.getPageSize()+" ");
		System.err.println(userCondition.getArray().length);
		// 再把list转成array
		return jdbcTemplate.query(sb.toString(), userCondition.getArray(), new BeanPropertyRowMapper<>(User.class));
	}

	@Override
	public int getCount(UserCondition userCondition) {
		StringBuffer sb = new StringBuffer();
		sb.append("select count(1) from user where 1=1 ");
		sb.append(userCondition.getCondition());//拼接条件
		return jdbcTemplate.queryForObject(sb.toString(), userCondition.getArray(),Integer.class);

	}
}

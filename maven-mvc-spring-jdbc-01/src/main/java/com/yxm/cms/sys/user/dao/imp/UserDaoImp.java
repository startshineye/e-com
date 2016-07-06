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
		List<Object> params = new ArrayList<>();// 用一个变长集合收集参数
		if (userCondition.getName() != null && !userCondition.getName().equals("")) {
			sb.append(" and name=?");
			params.add(userCondition.getName());
		}
		if (userCondition.getAge() != null) {
			sb.append(" and age=?");
			params.add(userCondition.getAge());
		}
		if (userCondition.getId() != null) {
			sb.append(" and id=?");
			params.add(userCondition.getId());
		}
		sb.append(" limit ?,? ");
		params.add(userCondition.getStartLine());
		params.add(userCondition.getPageSize());
		// 再把list转成array
		return jdbcTemplate.query(sb.toString(), params.toArray(), new BeanPropertyRowMapper<>(User.class));

	}

	@Override
	public int getCount(UserCondition userCondition) {
		StringBuffer sb = new StringBuffer();
		sb.append("select count(1) from user where 1=1 ");
		List<Object> params = new ArrayList<>();// 用一个变长集合收集参数
		if (userCondition.getName() != null && !userCondition.getName().equals("")) {
			sb.append(" and name=?");
			params.add(userCondition.getName());
		}
		if (userCondition.getAge() != null) {
			sb.append(" and age=?");
			params.add(userCondition.getAge());
		}
		if (userCondition.getId() != null) {
			sb.append(" and id=?");
			params.add(userCondition.getId());
		}
		return jdbcTemplate.queryForObject(sb.toString(), params.toArray(), Integer.class);

	}
}

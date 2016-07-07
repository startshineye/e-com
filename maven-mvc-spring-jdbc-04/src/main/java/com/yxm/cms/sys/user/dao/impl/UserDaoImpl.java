package com.yxm.cms.sys.user.dao.impl;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;


import com.common.basedao.BaseDao;
import com.yxm.cms.sys.user.dao.IUserDao;
import com.yxm.cms.sys.user.model.User;
import com.yxm.cms.sys.user.model.UserCond;

@Repository
public class UserDaoImpl extends BaseDao<User> implements IUserDao {

	@Override
	public int insert(User user) {
		String sql = "INSERT INTO user (name,age) VALUES(?,?)";
		Object[] obj = new Object[] { user.getName(), user.getAge() };
		return jdbcTemplate.update(sql, obj);
	}

	@Override
	public int delete(int id) {
		String sql = "DELETE FROM user WHERE id=?";
		Object[] obj = new Object[] { id };
		return jdbcTemplate.update(sql, obj);
	}

	@Override
	public int update(User user) {
		String sql = "UPDATE user SET name=?,age=? WHERE id=?";
		Object[] obj = new Object[] { user.getName(), user.getAge(), user.getId() };
		return jdbcTemplate.update(sql, obj);
	}

	@Override
	public User findById(int id) {
		String sql = "SELECT name,age,id FROM user WHERE id=?";
		Object[] obj = new Object[] { id };
		return jdbcTemplate.queryForObject(sql, obj, new BeanPropertyRowMapper<>(User.class));
	}

	@Override
	public List<User> queryList(UserCond cond) {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT name,age,id FROM user WHERE 1=1 ");
		sb.append(cond.getCondtion());// 拼条件
		// logger.info("cond=" + cond.getCondtion());
		return queryPage(sb.toString(), cond, User.class);
	}

}

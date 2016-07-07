package com.common.basedao;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.yxm.cms.sys.user.beans.User;
import com.yxm.cms.sys.user.beans.UserCondition;


public class BaseDao {
	protected Log logger = LogFactory.getLog(getClass());		
	@Autowired
	protected JdbcTemplate jdbcTemplate;
	@Autowired
	protected NamedParameterJdbcTemplate namedjdbcTemplate;

	//专给分页用的查询记录个数,查询中运用到数据库,则我们需要再加入一个参数
	protected int getCount(UserCondition userCondition,String sqlList) {
		StringBuffer sb = new StringBuffer();
		sb.append("select count(1) from ("+sqlList+") where 1=1 ");
		logger.info(sb.toString());
		return jdbcTemplate.queryForObject(sb.toString(), userCondition.getArray(),Integer.class);
	}
    /**
     * 注意:userCondtion每当执行完一次操作后必须初始化,不然会对子查询造成影响
     */
	protected List<User> getList(String sql,UserCondition userCondtion) {
		//到数据库表中去查询记录个数
		userCondtion.setRowCount(getCount(userCondtion,sql));
		//计算页数
		userCondtion.setPageCount(userCondtion.getRowCount() % userCondtion.getPageSize() == 0 ? userCondtion.getRowCount() / userCondtion.getPageSize()
				: userCondtion.getRowCount() / userCondtion.getPageSize() + 1);
		//计算起始行
		userCondtion.setStartLine((userCondtion.getCurPage() - 1) * userCondtion.getPageSize());
		sql = sql + " limit " + userCondtion.getStartLine() + "," + userCondtion.getPageSize();
		logger.info(sql);
		return jdbcTemplate.query(sql, userCondtion.getArray(), new BeanPropertyRowMapper<>(User.class));
		}
}

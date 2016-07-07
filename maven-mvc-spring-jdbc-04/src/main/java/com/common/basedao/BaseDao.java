package com.common.basedao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import com.common.condtion.BaseCond;

public class BaseDao<T> {

	protected Log logger = LogFactory.getLog(this.getClass());
	@Autowired
	protected JdbcTemplate jdbcTemplate;

	@Autowired
	protected NamedParameterJdbcTemplate namedjdbcTemplate;

	// 专给分页用的查询记录个数
	protected int queryCount(BaseCond cond, String sqlList) {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT COUNT(1) FROM (" + sqlList + ") t WHERE 1=1 ");
		logger.info(sb.toString());
		return jdbcTemplate.queryForObject(sb.toString(), cond.getArray(), Integer.class);
	}

	protected List<T> queryPage(String sql, BaseCond cond, Class<T> clazz) {
		// 到数据库表中去查询记录个数
		cond.setRowCount(queryCount(cond, sql));
		// 计算页数
		int rowCount = cond.getRowCount();
		int pageSize = cond.getPageSize();
		cond.setPageCount(rowCount % pageSize == 0 ? rowCount / pageSize : rowCount / pageSize + 1);
		// 计算起始行
		cond.setStart((cond.getCurPage() - 1) * cond.getPageSize());
		sql = sql + " limit " + cond.getStart() + "," + cond.getPageSize();
		logger.info(sql);
		return jdbcTemplate.query(sql, cond.getArray(), new BeanPropertyRowMapper<T>(clazz));
	}
}

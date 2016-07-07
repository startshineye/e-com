package com.common.basecond;

import java.util.ArrayList;
import java.util.List;

/**
 * 查询条件基础类
 */
public abstract class BaseCond {
	// 对表进行操作的辅助字段
	private Integer curPage = 1; // 当前页码
	private Integer pageSize = 3; // 每页条数(页大小)
	private Integer pageCount; // 页个数
	private Integer rowCount; // 总记录数
	private Integer startLine = 0; // 起始行

	protected List<Object> params = new ArrayList<>();// 用一个变长集合收集参数
	protected StringBuffer sqlCond = new StringBuffer();// sql条件字符串
	// 返回拼接后的sql(字符串)

	public String getCondtion() {
		params.clear();// 清空参数
		sqlCond.setLength(0);// 条件清空
		addCondtion();
		return sqlCond.toString();
	}

	public abstract void addCondtion();

	/// 拼加的是String类型的参数
	protected void add(String param, String sql) {
		if (param != null && !param.equals("") && sql != null && !sql.equals("")) {
			sqlCond.append(sql);
			params.add(param);
		}
	}

	/// 拼加的是int类型的参数
	protected void add(Integer param, String sql) {
		if (param != null && sql != null && !sql.equals("")) {
			sqlCond.append(sql);
			params.add(param);
		}
	}

	/// 拼加的是Long类型的参数
	protected void add(Long param, String sql) {
		if (param != null && sql != null && !sql.equals("")) {
			sqlCond.append(sql);
			params.add(param);
		}
	}

	/// 拼加的是Double类型的参数
	protected void add(Double param, String sql) {
		if (param != null && sql != null && !sql.equals("")) {
			sqlCond.append(sql);
			params.add(param);
		}
	}

	// 获取参数数组
	public Object[] getArray() {

		return params.toArray();
	}

	public Integer getCurPage() {
		return curPage;
	}

	public void setCurPage(Integer curPage) {
		this.curPage = curPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public Integer getRowCount() {
		return rowCount;
	}

	public void setRowCount(Integer rowCount) {
		this.rowCount = rowCount;
	}

	public Integer getStartLine() {
		return startLine;
	}

	public void setStartLine(Integer startLine) {
		this.startLine = startLine;
	}

	public List<Object> getParams() {
		return params;
	}

	public void setParams(List<Object> params) {
		this.params = params;
	}

	public StringBuffer getSqlCond() {
		return sqlCond;
	}

	public void setSqlCond(StringBuffer sqlCond) {
		this.sqlCond = sqlCond;
	}
	  
}

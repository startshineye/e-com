package com.common.condtion;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 查询条件基础类
 */
public abstract class BaseCond {

	protected Integer curPage = 1;// 当前页

	protected Integer pageSize = 5;// 页大小

	protected Integer pageCount;// 页数

	protected Integer rowCount;// 行数

	protected Integer start;// 起始行

	protected List<Object> params = new ArrayList<>();// 用一个变长集合收集参数
	protected StringBuffer sqlCond = new StringBuffer();// sql条件字符串

	// 返回拼接后的sql(字符串)
	public String getCondtion() {
		params.clear();// 清空参数
		sqlCond.setLength(0);// 条件清空
		addCondtion();
		return sqlCond.toString();
	}

	// 模板方法设计模式：定义拼条件的方法，在子类实现
	public abstract void addCondtion();

	/// 拼加的是String类型的参数
	protected void add(String param, String sql) {
		if (param != null && !param.equals("") && sql != null && !sql.equals("")) {
			sqlCond.append(" " + sql);
			params.add(param);
		}
	}

	// 模糊查询条件拼加
	protected void add(String param, String sql, int pos) {
		if (param != null && !param.equals("") && sql != null && !sql.equals("")) {
			sqlCond.append(" " + sql);
			if (pos == 1) {
				params.add("%" + param);
			}
			if (pos == 2) {
				params.add(param + "%");
			}
			if (pos == 3) {
				params.add("%" + param + "%");
			}

		}
	}

	/// 拼加的是int类型的参数
	protected void add(Integer param, String sql) {
		if (param != null && sql != null && !sql.equals("")) {
			sqlCond.append(" " + sql);
			params.add(param);
		}
	}

	/// 拼加的是Long类型的参数
	protected void add(Long param, String sql) {
		if (param != null && sql != null && !sql.equals("")) {
			sqlCond.append(" " + sql);
			params.add(param);
		}
	}

	/// 拼加的是Double类型的参数
	protected void add(Double param, String sql) {
		if (param != null && sql != null && !sql.equals("")) {
			sqlCond.append(" " + sql);
			params.add(param);
		}
	}

	/// 拼加的是Date类型的参数
	protected void add(Date param, String sql) {
		if (param != null && sql != null && !sql.equals("")) {
			sqlCond.append(" " + sql);
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

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

}

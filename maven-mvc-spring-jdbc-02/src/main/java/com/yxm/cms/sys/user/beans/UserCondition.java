package com.yxm.cms.sys.user.beans;

import java.util.ArrayList;
import java.util.List;

public class UserCondition {
   //基本表字段
   private Integer id;
   private Integer age;
   private String  name;
   //对表进行操作的辅助字段
   private Integer curPage = 1;    //当前页码
   private Integer pageSize = 3;  //每页条数(页大小)
   private Integer pageCount;  //页个数
   private Integer  rowCount;   //总记录数
   private Integer  startLine=0;  //起始行
   private List<Object> params = new ArrayList<>();// 用一个变长集合收集参数
   
   
   //返回拼接后的条件sql
	public String getCondition() {
		params.clear();
		StringBuffer sb = new StringBuffer();
		if (name != null && !name.equals("")) {
			sb.append(" and name=?");
			params.add(name);
		}
		if (age != null) {
			sb.append(" and age=?");
			params.add(age);
		}
		if (id != null) {
			sb.append(" and id=?");
			params.add(id);
		}
		return sb.toString();
	}

	// 获取参数数组
	public Object[] getArray() {
		return params.toArray();
	}

   //getter.setter
	public Integer getId(){
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	@Override
	public String toString() {
		return "UserCondtion [id=" + id + ", age=" + age + ", name=" + name + ", curPage=" + curPage + ", pageSize="
				+ pageSize + ", pageCount=" + pageCount + ", rowCount=" + rowCount + ", startLine=" + startLine + "]";
	}
}

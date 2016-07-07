package com.yxm.cms.sys.user.beans;

import com.common.basecond.BaseCond;

public class UserCondition extends BaseCond{
   //基本表字段
   private Integer id;
   private Integer age;
   private String  name;
   
   // 拼加条件
	@Override
	public void addCondtion() {
		add(name, " and name=?");
		add(age, " and age=?");
		add(id, " and id=?");
	}
  //getter.setter
	public Integer getId() {
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
 
}

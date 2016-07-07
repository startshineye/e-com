package com.yxm.cms.sys.user.model;
import com.common.condtion.BaseCond;

public class UserCond extends BaseCond {

	private Integer id;

	private Integer age;

	private String name;

	// 拼加条件
	@Override
	public void addCondtion() {
		//add(name, "and name=?");
		add(name, "and name like ?",3);
		add(age, "and age=?");
		add(id, "and id=?");
	}

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

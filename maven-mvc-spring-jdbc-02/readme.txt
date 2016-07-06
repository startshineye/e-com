version-02:
重构maven-mvc-mybatis为Spring+SpringMVC+spring-jdbc
 
 
 1.把拼条件过程拿到条件类中
    DaoImp理应更加简洁,应当把共有的比较冗余的代码封装到条件类(userCondition)中
        * 将sql语句条件封装成getCondition()中
        * 将返回的数组封装到 getArra()中
        
   注意:在 返回拼接后的条件sql方法中,需要每次清除params,不然会出异常:
     " SQL [select name,age,id from user where 1=1  and name=? limit 0,3 ]; Parameter index out of range"
	
	public String getCondition() {
		params.clear();//每次清除params
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
   













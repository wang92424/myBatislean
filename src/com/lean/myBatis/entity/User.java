package com.lean.myBatis.entity;
/****
 * 
 * Title:User
 * Description: 实体类
 * Company: 
 * @author MrWang
 * @date 2018年3月17日 下午5:16:57
 */
public class User {

	private int id;
	
	private String name;
	
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "User [id="+id+",name="+name+",age="+age+"]";
	}
	
}

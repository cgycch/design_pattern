package com.cch.filter.example.bean;

import java.util.Date;

public class BaseBean {
	
	private String name;
	private String pass;
	private String phone;
	private int age;
	private Date birthday;
	private double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "BaseBean [name=" + name + ", pass=" + pass + ", phone=" + phone + ", age=" + age + ", birthday="
				+ birthday + ", salary=" + salary + "]";
	}
	
	

}

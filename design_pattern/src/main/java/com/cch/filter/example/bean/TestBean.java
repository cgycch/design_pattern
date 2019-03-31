package com.cch.filter.example.bean;

import java.util.Date;

public class TestBean {

	private String name;
	private int age;
	private Date birthday;
	private double salary;

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
		return "TestBean [name=" + name + ", age=" + age + ", birthday=" + birthday + ", salary=" + salary + "]";
	}

}

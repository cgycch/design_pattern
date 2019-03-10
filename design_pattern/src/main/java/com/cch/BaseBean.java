package com.cch;

public class BaseBean implements Cloneable {
	private String id;
	protected String phone;
	public String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	protected BaseBean clone() throws CloneNotSupportedException {
		System.out.println("BaseBean::clone()");
		return (BaseBean)super.clone();
	}

}

package com.cch.prototype;

import com.cch.prototype.abs.Shape;

public class Circle extends Shape {

	public Circle() {
		type = "Circle";
	}

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}

}

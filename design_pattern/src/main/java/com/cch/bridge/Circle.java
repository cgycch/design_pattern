package com.cch.bridge;

import com.cch.bridge.abs.DrawAPI;
import com.cch.bridge.abs.Shape;

public class Circle extends Shape {

	private int x, y, radius;

	public Circle(int x, int y, int radius, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public void draw() {
		drawAPI.drawCircle(radius, x, y);
	}

}

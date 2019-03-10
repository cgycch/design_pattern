package com.cch.bridge;

import com.cch.bridge.abs.Shape;
/**
 * 桥接（Bridge）是用于把抽象化与实现化解耦，使得二者可以独立变化
 * @author Administrator
 *
 */
public class ADemo {
	
	public static void main(String[] args) {
		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

		redCircle.draw();
		greenCircle.draw();
	}
}

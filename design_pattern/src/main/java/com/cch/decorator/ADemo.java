package com.cch.decorator;

import com.cch.decorator.interf.Shape;

/**
 * 允许向一个现有的对象添加新的功能，同时又不改变其结构
 * @author Administrator
 *
 */
public class ADemo {

	public static void main(String[] args) {
		Shape circle = new Circle();

		Shape redCircle = new RedShapeDecorator(new Circle());

		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		
		System.out.println("Circle with normal border");
		circle.draw();

		System.out.println("\nCircle of red border");
		redCircle.draw();

		System.out.println("\nRectangle of red border");
		redRectangle.draw();
	}

}

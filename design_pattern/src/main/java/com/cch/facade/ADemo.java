package com.cch.facade;
/**
 * 隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接口
 * @author Administrator
 *
 */
public class ADemo {

	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}

}

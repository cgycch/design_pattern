package com.cch.prototype;

import com.cch.prototype.abs.Shape;

public class ADemo {
	/**
	 * 用于创建重复的对象，同时又能保证性能.
	 * 这种模式是实现了一个原型接口(clone)，该接口用于创建当前对象的克隆。当直接创建对象的代价比较大时，则采用这种模式
	 * @param args
	 */
	public static void main(String[] args) {
		ShapeCache.loadCache();

		Shape clonedShape = ShapeCache.getShape("1");
		System.out.println("Shape : " + clonedShape.getType());

		Shape clonedShape2 = ShapeCache.getShape("2");
		System.out.println("Shape : " + clonedShape2.getType());

		Shape clonedShape3 = ShapeCache.getShape("3");
		System.out.println("Shape : " + clonedShape3.getType());
		clonedShape3.setId("4");
		
		Shape clonedShape4 = ShapeCache.getShape("3");
		System.out.println("Shape : " + clonedShape4.getId());
	}

}

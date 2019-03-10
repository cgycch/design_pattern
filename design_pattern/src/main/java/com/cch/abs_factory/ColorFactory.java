package com.cch.abs_factory;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		if (color == null) {
			return null;
		}
		if (color.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();
		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		} else {
			System.out.println("default color is blue");
			return new Blue();
		}
	}

	@Override
	public Shape getShape(String shape) {
		throw new RuntimeException("sorry, I am not have this ability!");
	}

}

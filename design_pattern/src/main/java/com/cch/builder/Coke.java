package com.cch.builder;

import com.cch.builder.abs.ColdDrink;

public class Coke extends ColdDrink {

	public String name() {
		return "Coke";
	}

	public float price() {
		return 30.0f;
	}

}

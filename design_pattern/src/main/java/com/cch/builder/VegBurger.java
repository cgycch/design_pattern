package com.cch.builder;

import com.cch.builder.abs.Burger;

public class VegBurger extends Burger {

	public String name() {
		return "Veg Burger";
	}

	public float price() {
		 return 25.0f;
	}

}

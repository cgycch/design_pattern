package com.cch.builder;

import com.cch.builder.abs.Burger;

public class ChickenBurger extends Burger {

	public String name() {
		return "Chicken Burger";
	}

	public float price() {
		return 50.5f;
	}

}

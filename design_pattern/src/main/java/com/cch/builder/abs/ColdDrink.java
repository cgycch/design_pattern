package com.cch.builder.abs;

import com.cch.builder.Bottle;
import com.cch.builder.interf.Item;
import com.cch.builder.interf.Packing;

public abstract class ColdDrink implements Item{

	public Packing packing() {
		return new Bottle();
	}

}

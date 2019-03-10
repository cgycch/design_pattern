package com.cch.builder.abs;

import com.cch.builder.Wrapper;
import com.cch.builder.interf.Item;
import com.cch.builder.interf.Packing;

public abstract class Burger implements Item{

	public Packing packing() {
		return new Wrapper();
	}

}

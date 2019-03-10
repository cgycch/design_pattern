package com.cch.bridge;

import com.cch.bridge.abs.DrawAPI;

public class GreenCircle implements DrawAPI {

	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color: green, radius: "
		         + radius +", x: " +x+", "+ y +"]");
	}

}

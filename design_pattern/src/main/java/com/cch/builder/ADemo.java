package com.cch.builder;

public class ADemo {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();

		System.out.println("Veg Meal");
		Meal vegMeal = mealBuilder.prepareVegMeal();
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());

		System.out.println("\n\nNon-Veg Meal");
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		nonVegMeal.showItems();
		System.out.println("Total Cost: " + nonVegMeal.getCost());
	}

}

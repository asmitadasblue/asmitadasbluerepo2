package com.builder.pattern;

public class BuilderDemo {
public static void main(String args[]) {
	MealBuilder mb = new MealBuilder();
	Meal veg = mb.prepareVegMeal();
	Meal nonveg = mb.prepareNonVegMeal();
	veg.showItems();
	System.out.println(veg.getCost());
	nonveg.showItems();
	System.out.println(nonveg.getCost());
}
}

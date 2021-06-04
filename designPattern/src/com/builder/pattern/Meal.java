package com.builder.pattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {
public List<Item> items = new ArrayList<Item>();

public void addItem(Item item) {
	items.add(item);
}
public float getCost() {
	float totalCost = 0.0f;
	for (Item item:items) {
		totalCost += item.price();
	}
	return totalCost;
	
}

public void showItems() {
	for(Item item:items) {
		System.out.println("Item: = "+item.name());
		System.out.println("packing = "+item.packing().pack());
		System.out.println("price == "+item.price());
	}
}

}


package com.builder.pattern;

public abstract class Colddrink implements Item{
public Packing packing() {
	return new Bottle();
}
public abstract float price();
}

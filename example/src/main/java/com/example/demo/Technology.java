package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Technology {
private int techId;
private String techName;
public int getTechId() {
	return techId;
}
public String getTechName() {
	return techName;
}
public void setTechId(int techId) {
	this.techId = techId;
}
public void setTechName(String techName) {
	this.techName = techName;
}

public void tech() {
	//say i want to call this method in customer class
	//without having to create an object of this class and then call the method
	// how can we wire the Custoemr and this class together so that we dont need
	// to modify the Customer class.
	System.out.println("Technology");
}
}

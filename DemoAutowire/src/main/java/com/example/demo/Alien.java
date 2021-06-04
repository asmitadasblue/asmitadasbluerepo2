package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class Alien {
private int aid;
private String aName;
private String tech;

@Autowired
@Qualifier("lap1")
private Laptop laptop;
public Laptop getLaptop() {
	return laptop;
}
public void setLaptop(Laptop laptop) {
	this.laptop = laptop;
}
public int getAid() {
	return aid;
}
public String getaName() {
	return aName;
}
public String getTech() {
	return tech;
}
public void setAid(int aid) {
	this.aid = aid;
}
public void setaName(String aName) {
	this.aName = aName;
}
public void setTech(String tech) {
	this.tech = tech;
}
public void  show() {
	System.out.println("show alien");
	laptop.compile();
}
}

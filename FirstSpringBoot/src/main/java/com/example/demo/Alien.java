package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype") //by mentioning this we are asking spring container to make dffrent instances
//as and when required . and not the default singleton object creation of spring
public class Alien {

	private int aid;
	private String aname;
	private String tech;
	
	@Autowired
	@Qualifier("lap1")
	private Laptop laptop; //Alien class is dependant on laptop class now
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public int getAid() {
		return aid;
	}
	public String getAname() {
		return aname;
	}
	public String getTech() {
		return tech;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	public void show() {
		System.out.println("inside the Alien show method");
		laptop.compile();
	}
	
}

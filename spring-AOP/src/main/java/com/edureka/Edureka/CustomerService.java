package com.edureka.Edureka;

public class CustomerService {
	private String name;
	private String url;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void printName() {
		System.out.println(" Name is " + this.name);
	}
	public void printURL() {
		System.out.println("CUstomer website "+this.url);
	}
	public void printThrowException() {
		// TODO Auto-generated method stub
		
	}
	
	
}

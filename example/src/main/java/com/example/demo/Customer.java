package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	private int custid;
	private String custname;
	private String coursename;
	
	@Autowired
	private Technology techDetail;
	public Technology getTechDetail() {
		return techDetail;
	}
	public void setTechDetail(Technology techDetail) {
		this.techDetail = techDetail;
	}
	public int getCustid() {
		return custid;
	}
	public String getCustname() {
		return custname;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public void display() {
		
		System.out.println("Customer name " + this.custname);
		techDetail.tech();
	}

}

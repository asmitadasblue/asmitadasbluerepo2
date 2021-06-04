package com.telusko.DemoHib;

import javax.persistence.Entity;
import javax.persistence.Id;

//POJO bean

@Entity
public class Alien {
	
@Id
private int aid;
private String aname;
private String color;
public int getAid() {
	return aid;
}
public String getAname() {
	return aname;
}
public String getColor() {
	return color;
}
public void setAid(int aid) {
	this.aid = aid;
}
public void setAname(String aname) {
	this.aname = aname;
}
public void setColor(String color) {
	this.color = color;
}

}


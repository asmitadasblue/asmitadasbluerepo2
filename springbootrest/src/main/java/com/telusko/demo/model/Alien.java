package com.telusko.demo.model;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;


@Entity
@XmlRootElement
public class Alien {
	
	public int getAid() {
		return aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", points=" + points + ", aname=" + aname + "]";
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	
	@Id
	private int aid;
	private int points;
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	private String aname;

}


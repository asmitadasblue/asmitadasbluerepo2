package com.telusko.demo.model;

public class Alien {
	private int aid;
	private String aname;
	private String lang;
	public int getAid() {
		return aid;
	}
	public String getAname() {
		return aname;
	}
	public String getLang() {
		return lang;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", lang=" + lang + "]";
	}
	

}

package com.student.manage;

public class Student {
 
	 private int stid;
	 private String stname;
	 private String stph;
	 private String stcity;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String stname, String stph, String stcity) {
		super();
		this.stname = stname;
		this.stph = stph;
		this.stcity = stcity;
	}
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public String getStph() {
		return stph;
	}
	public void setStph(String stph) {
		this.stph = stph;
	}
	public String getStcity() {
		return stcity;
	}
	public void setStcity(String stcity) {
		this.stcity = stcity;
	}
	@Override
	public String toString() {
		return "Student [stid=" + stid + ", stname=" + stname + ", stph=" + stph + ", stcity=" + stcity + "]";
	}
	 
	 
	 
}

package com.oops;

public class Student {
	private int stid;
	private String sname;
	private String branch;
	private int yop;

	public int getstid() {
		return stid;
	}
	public  void setstid(int stid) {
		this.stid=stid;
	}
	public String getsname() {
		return sname;
	}
	public void setsname(String sname) {
		this.sname=sname;
	}
	public String getbranch() {
		return branch;
	}
	public void setbranch(String branch) {
		this.branch=branch;
	}
	public int getyop() {
		return yop;
	}
	public void setyop(int yop) {
		this.yop=yop;
	}
	
}
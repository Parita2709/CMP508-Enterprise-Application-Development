package com.springcore.CI;

public class Person {
	
	private int pid;
	private String pname;
	private Address add;

	public Person(int pid, String pname,Address add) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.add= add;
	}
	@Override
	public String toString() {
		return "person id=" + this.pid + ", person name=" + this.pname+",   Address is:"+this.add.area+"   "+this.add.pin;
	}
	

}

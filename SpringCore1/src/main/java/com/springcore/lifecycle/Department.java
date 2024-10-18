package com.springcore.lifecycle;

public class Department {
	
	private String dname;

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		System.out.println("setting property");
		this.dname = dname;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Department [dname=" + dname + "]";
	}
	
	public void init()
	{
		System.out.println("inside init method");
	}

	public void destroy()
	{
		System.out.println("inside destroy method");
	}
	
}

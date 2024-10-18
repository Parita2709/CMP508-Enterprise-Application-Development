package com.score.standalone.collection1;

import java.util.List;

public class Employee {
	private List<String> Ename;

	public List<String> getEname() {
		return Ename;
	}

	public void setEname(List<String> ename) {
		Ename = ename;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(List<String> ename) {
		super();
		Ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [Ename=" + Ename + "]";
	}
	

}

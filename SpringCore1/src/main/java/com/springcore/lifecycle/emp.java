package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class emp  implements InitializingBean,DisposableBean{

	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "emp [salary=" + salary + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		//work as init()
		System.out.println("init salary");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		//work as destroy();
		System.out.println("destroy salary");
	}
	
}

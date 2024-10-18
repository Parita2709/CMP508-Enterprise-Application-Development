package com.springcore.CI;


public class Address {
	
	String area;
	int pin;
	
	public Address(String area, int pin) {
		super();
		this.area = area;
		this.pin = pin;
	}
	@Override
	public String toString() {
		return this.area +","+ this.pin ;
	}
	

}

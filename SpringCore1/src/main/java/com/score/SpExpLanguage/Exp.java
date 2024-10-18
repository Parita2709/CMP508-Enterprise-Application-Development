package com.score.SpExpLanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Exp
{
	@Value("#{1+2}")
	private int x;
	
	@Value("#{5+2}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(25)}")//static object with method
	private int z;
	

	@Value("#{New java.lang.String('Darshana Makani')}")//static object with SpEL language
	private String ename;
	
	
	
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Exp(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Exp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Exp [x=" + x + ", y=" + y + ", z=" + z + ", ename=" + ename + "]";
	}
	


}

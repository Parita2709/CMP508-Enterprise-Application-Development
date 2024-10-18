package com.score.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test 
{
	
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/score/standalone/collection/config1.xml");
        Employee p1=(Employee)context.getBean("emp");
        System.out.println(p1.getEname());
        
	}

}

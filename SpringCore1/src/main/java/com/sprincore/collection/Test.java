package com.sprincore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test 
{

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/sprincore/collection/config1.xml");
        Employee p1=(Employee)context.getBean("emp");
        System.out.println(p1.getName());
        System.out.println(p1.getPhone());
        System.out.println(p1.getAddress());
        System.out.println(p1.getCourses());
	}

}

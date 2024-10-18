package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test 
{

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/springcore/autowire/auto_config.xml");
        Question q1=(Question)context.getBean("question1");
        System.out.println(q1);
	}

}
